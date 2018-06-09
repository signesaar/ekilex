package eki.ekilex.service.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.stereotype.Component;

import eki.ekilex.data.Classifier;
import eki.ekilex.data.CollocMember;
import eki.ekilex.data.Collocation;
import eki.ekilex.data.CollocationPosGroup;
import eki.ekilex.data.CollocationRelGroup;
import eki.ekilex.data.CollocationTuple;
import eki.ekilex.data.Definition;
import eki.ekilex.data.DefinitionRefTuple;
import eki.ekilex.data.Form;
import eki.ekilex.data.FormRelation;
import eki.ekilex.data.Paradigm;
import eki.ekilex.data.ParadigmFormTuple;
import eki.ekilex.data.RefLink;
import eki.ekilex.data.TermMeaning;
import eki.ekilex.data.Usage;
import eki.ekilex.data.UsageDefinition;
import eki.ekilex.data.UsageTranslation;
import eki.ekilex.data.UsageTranslationDefinitionTuple;
import eki.ekilex.data.WordTuple;

@Component
public class ConversionUtil {

	private static final Logger logger = LoggerFactory.getLogger(ConversionUtil.class);

	public List<TermMeaning> convert(Map<Long, List<WordTuple>> termMeaningsMap) {
		List<TermMeaning> termMeanings = termMeaningsMap.entrySet().stream()
				.map(meaningMapEntry -> {
					TermMeaning termMeaning = new TermMeaning();
					termMeaning.setMeaningId(meaningMapEntry.getKey());
					termMeaning.setWordTuples(meaningMapEntry.getValue());
					return termMeaning;
				}).sorted(Comparator.comparing(TermMeaning::getMeaningId))
				.collect(Collectors.toList());
		return termMeanings;
	}

	public Classifier classifierFromIdString(String idString) {
		JsonParser jsonParser = JsonParserFactory.getJsonParser();
		Map<String, Object>  memberMap = jsonParser.parseMap(idString);
		Classifier classifier = new Classifier();
		classifier.setCode((String) memberMap.get("code"));
		classifier.setOrigin((String) memberMap.get("origin"));
		return classifier;
	}

	public List<Paradigm> composeParadigms(List<ParadigmFormTuple> paradigmFormTuples, List<FormRelation> wordFormRelations) {

		List<Paradigm> paradigms = new ArrayList<>();

		Map<Long, Paradigm> paradigmsMap = new HashMap<>();
		List<Form> forms;
		List<FormRelation> formRelations; 

		for (ParadigmFormTuple tuple : paradigmFormTuples) {

			Long paradigmId = tuple.getParadigmId();

			Paradigm paradigm = paradigmsMap.get(paradigmId);
			if (paradigm == null) {
				forms = new ArrayList<>();
				formRelations = new ArrayList<>();
				paradigm = new Paradigm();
				paradigm.setParadigmId(paradigmId);
				paradigm.setInflectionTypeNr(tuple.getInflectionTypeNr());
				paradigm.setForms(forms);
				paradigm.setFormRelations(formRelations);
				paradigmsMap.put(paradigmId, paradigm);
				paradigms.add(paradigm);
			} else {
				forms = paradigm.getForms();
			}
			Form form = new Form();
			form.setId(tuple.getFormId());
			form.setValue(tuple.getForm());
			form.setWord(tuple.isWord());
			form.setComponents(tuple.getComponents());
			form.setDisplayForm(tuple.getDisplayForm());
			form.setVocalForm(tuple.getVocalForm());
			form.setMorphCode(tuple.getMorphCode());
			form.setMorphValue(tuple.getMorphValue());
			forms.add(form);
		}
		composeParadigmTitles(paradigms);
		flagFormMorphCodes(paradigms);
		flagFormsExist(paradigms);

		for (FormRelation formRelation : wordFormRelations) {

			Long paradigmId = formRelation.getParadigmId();

			Paradigm paradigm = paradigmsMap.get(paradigmId);
			formRelations = paradigm.getFormRelations();
			formRelations.add(formRelation);
		}

		return paradigms;
	}

	private void composeParadigmTitles(List<Paradigm> paradigms) {

		if (CollectionUtils.isEmpty(paradigms)) {
			return;
		}
		if (paradigms.size() == 1) {
			Paradigm paradigm = paradigms.get(0);
			String title = getFirstAvailableTitle(paradigm, false);
			if (StringUtils.isBlank(title)) {
				title = getFirstAvailableTitle(paradigm, true);
			}
			String inflectionTypeNr = paradigm.getInflectionTypeNr();
			if (StringUtils.isNotBlank(inflectionTypeNr)) {
				title = title + " " + inflectionTypeNr;				
			}
			paradigm.setTitle(title);
		} else {
			for (Paradigm paradigm : paradigms) {
				String title = getFirstDifferentTitle(paradigm, paradigms);
				if (StringUtils.isBlank(title)) {
					logger.warn("Could not compose paradigm title. Fix this!");
				}
				String inflectionTypeNr = paradigm.getInflectionTypeNr();
				if (StringUtils.isNotBlank(inflectionTypeNr)) {
					title = title + " " + inflectionTypeNr;				
				}
				paradigm.setTitle(title);
			}
		}
	}

	private String getFirstAvailableTitle(Paradigm paradigm, boolean isWord) {

		List<Form> forms = paradigm.getForms();
		for (Form form : forms) {
			if (form.isWord() == isWord) {
				String title = form.getDisplayForm();
				if (StringUtils.isBlank(title)) {
					title = form.getValue();
				}
				return title;
			}
		}
		return null;
	}

	private String getFirstDifferentTitle(Paradigm paradigm, List<Paradigm> paradigms) {

		List<Form> forms = paradigm.getForms();
		Long paradigmId = paradigm.getParadigmId();
		for (Form form : forms) {
			String thisMorphCode = form.getMorphCode();
			String titleCandidate = form.getDisplayForm();
			if (StringUtils.isBlank(titleCandidate)) {
				titleCandidate = form.getValue();
			}
			boolean isDifferentTitle = isDifferentTitle(paradigms, paradigmId, thisMorphCode, titleCandidate);
			if (isDifferentTitle) {
				return titleCandidate;
			}
		}
		return null;
	}

	private boolean isDifferentTitle(List<Paradigm> paradigms, Long currentParadigmId, String currentMorphCode, String currentTitle) {

		for (Paradigm otherParadigm : paradigms) {
			if (currentParadigmId.equals(otherParadigm.getParadigmId())) {
				continue;
			}
			List<Form> otherForms = otherParadigm.getForms();
			for (Form otherForm : otherForms) {
				String otherMorphCode = otherForm.getMorphCode();
				if (!StringUtils.equals(currentMorphCode, otherMorphCode)) {
					continue;
				}
				String otherTitle = otherForm.getDisplayForm();
				if (StringUtils.isBlank(otherTitle)) {
					otherTitle = otherForm.getValue();
				}
				if (StringUtils.equals(currentTitle, otherTitle)) {
					return false;
				} else {
					return true;
				}
			}
		}
		return false;
	}

	private void flagFormMorphCodes(List<Paradigm> paradigms) {

		for (Paradigm paradigm : paradigms) {
			List<Form> forms = paradigm.getForms();
			String previousFormMorphCode = null;
			for (Form form : forms) {
				boolean displayMorphCode = !StringUtils.equals(previousFormMorphCode, form.getMorphCode());
				form.setDisplayMorphCode(displayMorphCode);
				previousFormMorphCode = form.getMorphCode();
			}
		}
	}

	private void flagFormsExist(List<Paradigm> paradigms) {

		for (Paradigm paradigm : paradigms) {
			List<Form> forms = paradigm.getForms();
			boolean formsExist = CollectionUtils.isNotEmpty(forms);
			paradigm.setFormsExist(formsExist);
		}
	}

	public List<Usage> composeUsages(List<UsageTranslationDefinitionTuple> usageTranslationDefinitionTuples) {

		List<Usage> usages = new ArrayList<>();

		Map<Long, Usage> usageMap = new HashMap<>();
		Map<Long, RefLink> usageSourceMap = new HashMap<>();
		Map<Long, UsageTranslation> usageTranslationMap = new HashMap<>();
		Map<Long, UsageDefinition> usageDefinitionMap = new HashMap<>();

		for (UsageTranslationDefinitionTuple tuple : usageTranslationDefinitionTuples) {

			Long usageId = tuple.getUsageId();
			Long usageTranslationId = tuple.getUsageTranslationId();
			Long usageDefinitionId = tuple.getUsageDefinitionId();
			Long usageSourceRefLinkId = tuple.getUsageSourceRefLinkId();

			Usage usage = usageMap.get(usageId);
			if (usage == null) {
				usage = new Usage();
				usage.setId(usageId);
				usage.setValue(tuple.getUsageValue());
				usage.setLang(tuple.getUsageLang());
				usage.setTypeCode(tuple.getUsageTypeCode());
				usage.setTypeValue(tuple.getUsageTypeValue());
				usage.setAuthor(tuple.getUsageAuthor());
				usage.setTranslator(tuple.getUsageTranslator());
				usage.setTranslations(new ArrayList<>());
				usage.setDefinitions(new ArrayList<>());
				usage.setRefLinks(new ArrayList<>());
				usageMap.put(usageId, usage);
				usages.add(usage);
			}
			if (usageSourceRefLinkId != null) {
				RefLink usageSource = usageSourceMap.get(usageSourceRefLinkId);
				if (usageSource == null) {
					usageSource = new RefLink();
					usageSource.setId(tuple.getUsageSourceRefLinkId());
					usageSource.setName(tuple.getUsageSourceRefLinkName());
					usageSource.setValue(tuple.getUsageSourceRefLinkValue());
					usageSourceMap.put(usageSourceRefLinkId, usageSource);
					usage.getRefLinks().add(usageSource);
				}
			}
			if (usageTranslationId != null) {
				UsageTranslation usageTranslation = usageTranslationMap.get(usageTranslationId);
				if (usageTranslation == null) {
					usageTranslation = new UsageTranslation();
					usageTranslation.setId(usageTranslationId);
					usageTranslation.setValue(tuple.getUsageTranslationValue());
					usageTranslation.setLang(tuple.getUsageTranslationLang());
					usageTranslationMap.put(usageTranslationId, usageTranslation);
					usage.getTranslations().add(usageTranslation);
				}
			}
			if (usageDefinitionId != null) {
				UsageDefinition usageDefinition = usageDefinitionMap.get(usageDefinitionId);
				if (usageDefinition == null) {
					usageDefinition = new UsageDefinition();
					usageDefinition.setId(usageDefinitionId);
					usageDefinition.setValue(tuple.getUsageDefinitionValue());
					usageDefinition.setLang(tuple.getUsageDefinitionLang());
					usageDefinitionMap.put(usageDefinitionId, usageDefinition);
					usage.getDefinitions().add(usageDefinition);
				}
			}
		}
		return usages;
	}

	public List<Definition> composeMeaningDefinitions(List<DefinitionRefTuple> definitionRefTuples, List<String> langCodeOrder) {

		List<Definition> definitions = new ArrayList<>();
		Map<Long, Definition> definitionMap = new HashMap<>();

		for (DefinitionRefTuple definitionRefTuple : definitionRefTuples) {

			Long definitionId = definitionRefTuple.getDefinitionId();
			Long refLinkId = definitionRefTuple.getRefLinkId();
			Definition definition = definitionMap.get(definitionId);
			if (definition == null) {
				String definitionValue = definitionRefTuple.getDefinitionValue();
				String definitionLang = definitionRefTuple.getDefinitionLang();
				Long definitionOrderBy = definitionRefTuple.getDefinitionOrderBy();
				definition = new Definition();
				definition.setId(definitionId);
				definition.setValue(definitionValue);
				definition.setLang(definitionLang);
				definition.setOrderBy(definitionOrderBy);
				definition.setRefLinks(new ArrayList<>());
				definitionMap.put(definitionId, definition);
				definitions.add(definition);
			}
			if (refLinkId != null) {
				String refLinkName = definitionRefTuple.getRefLinkName();
				String refLinkValue = definitionRefTuple.getRefLinkValue();
				RefLink refLink = new RefLink();
				refLink.setId(refLinkId);
				refLink.setName(refLinkName);
				refLink.setValue(refLinkValue);
				definition.getRefLinks().add(refLink);
			}
		}

		definitions.sort((Definition definition1, Definition definition2) -> {
			String definition1LangCode = definition1.getLang();
			String definition2LangCode = definition2.getLang();
			if (CollectionUtils.isEmpty(langCodeOrder)) {
				return StringUtils.compare(definition1LangCode, definition2LangCode);
			}
			int definition1LangOrder = langCodeOrder.indexOf(definition1LangCode);
			int definition2LangOrder = langCodeOrder.indexOf(definition2LangCode);
			return definition1LangOrder - definition2LangOrder;
		});

		return definitions;
	}

	public List<CollocationPosGroup> composeCollocPosGroups(List<CollocationTuple> collocTuples) {

		List<CollocationPosGroup> collocationPosGroups = new ArrayList<>();
		Map<Long, CollocationPosGroup> collocPosGroupMap = new HashMap<>();
		Map<Long, CollocationRelGroup> collocRelGroupMap = new HashMap<>();
		Map<Long, Collocation> collocMap = new HashMap<>();

		for (CollocationTuple collocTuple : collocTuples) {

			Long collocPosGroupId = collocTuple.getPosGroupId();
			Long collocRelGroupId = collocTuple.getRelGroupId();
			CollocationPosGroup collocPosGroup = collocPosGroupMap.get(collocPosGroupId);
			if (collocPosGroup == null) {
				collocPosGroup = new CollocationPosGroup();
				collocPosGroup.setCode(collocTuple.getPosGroupCode());
				collocPosGroup.setRelationGroups(new ArrayList<>());
				collocPosGroupMap.put(collocPosGroupId, collocPosGroup);
				collocationPosGroups.add(collocPosGroup);
			}
			CollocationRelGroup collocRelGroup = collocRelGroupMap.get(collocRelGroupId);
			if (collocRelGroup == null) {
				collocRelGroup = new CollocationRelGroup();
				collocRelGroup.setName(collocTuple.getRelGroupName());
				collocRelGroup.setFrequency(collocTuple.getRelGroupFrequency());
				collocRelGroup.setScore(collocTuple.getRelGroupScore());
				collocRelGroup.setCollocations(new ArrayList<>());
				collocRelGroupMap.put(collocRelGroupId, collocRelGroup);
				collocPosGroup.getRelationGroups().add(collocRelGroup);
			}
			Collocation collocation = addCollocation(collocMap, collocTuple, collocRelGroup.getCollocations());
			addCollocMember(collocTuple, collocation);
		}
		return collocationPosGroups;
	}

	public List<Collocation> composeCollocations(List<CollocationTuple> collocTuples) {

		List<Collocation> collocations = new ArrayList<>();
		Map<Long, Collocation> collocMap = new HashMap<>();

		for (CollocationTuple collocTuple : collocTuples) {

			Collocation collocation = addCollocation(collocMap, collocTuple, collocations);
			addCollocMember(collocTuple, collocation);
		}
		return collocations;
	}

	private Collocation addCollocation(Map<Long, Collocation> collocMap, CollocationTuple collocTuple, List<Collocation> collocations) {

		Long collocId = collocTuple.getCollocId();
		Collocation collocation = collocMap.get(collocId);
		if (collocation == null) {
			collocation = new Collocation();
			collocation.setValue(collocTuple.getCollocValue());
			collocation.setDefinition(collocTuple.getCollocDefinition());
			collocation.setFrequency(collocTuple.getCollocFrequency());
			collocation.setScore(collocTuple.getCollocScore());
			collocation.setCollocUsages(collocTuple.getCollocUsages());
			collocation.setCollocMembers(new ArrayList<>());
			collocMap.put(collocId, collocation);
			collocations.add(collocation);
		}
		return collocation;
	}

	private void addCollocMember(CollocationTuple collocTuple, Collocation collocation) {

		CollocMember collocMember = new CollocMember();
		collocMember.setWordId(collocTuple.getCollocMemberWordId());
		collocMember.setWord(collocTuple.getCollocMemberWord());
		collocMember.setWeight(collocTuple.getCollocMemberWeight());
		collocation.getCollocMembers().add(collocMember);
	}
}
