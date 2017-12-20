package eki.ekilex.runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import eki.common.data.Count;
import eki.ekilex.data.transform.Form;
import eki.ekilex.data.transform.Paradigm;

import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

@Component
public class MabLoaderRunner extends AbstractLoaderRunner {

	private static Logger logger = LoggerFactory.getLogger(MabLoaderRunner.class);

	@Override
	void initialise() {
	}

	@Transactional
	public Map<String, List<Paradigm>> execute(String dataXmlFilePath, String dataLang) throws Exception {

		logger.debug("Loading MAB...");

		final String articleHeaderExp = "x:P";
		final String wordGroupExp = "x:mg";
		final String wordExp = "x:m";
		final String articleBodyExp = "x:S";
		final String rootBaseExp = "x:lemp/x:mtg";
		final String formGroupExp = "x:pdgp/x:mvg";
		final String morphValueExp = "x:vk";
		final String formExp = "x:parg/x:mv";
		final String inflectionTypeNrExp = "x:mt";
		final String homonymNrAttr = "i";

		final String wordCleanupChars = ".+'`()¤:_";//probably () only
		final String formCleanupChars = "`´[]#";

		long t1, t2;
		t1 = System.currentTimeMillis();

		// morph value to code conversion map
		Map<String, String> morphValueCodeMap = composeMorphValueCodeMap(dataLang);

		Document dataDoc = xmlReader.readDocument(dataXmlFilePath);

		Element rootElement = dataDoc.getRootElement();

		long articleCount = rootElement.content().stream().filter(node -> node instanceof Element).count();
		List<Element> articleNodes = (List<Element>) rootElement.content().stream().filter(node -> node instanceof Element).collect(toList());
		logger.debug("Extracted {} articles", articleCount);

		Map<String, List<Paradigm>> wordParadigmsMap = new HashMap<>();

		Element headerNode, contentNode, wordGroupNode, wordNode, morphValueNode, inflectionTypeNrNode;
		List<Element> rootBaseNodes, formGroupNodes, formNodes;
		List<Paradigm> paradigms, newParadigms;
		List<Form> forms;
		List<String> formValues;
		Paradigm paradigmObj;
		Form formObj;
		String word, sourceMorphCode, destinMorphCode, form, inflectionTypeNr;

		Count uncleanWordCount = new Count();

		long articleCounter = 0;
		long progressIndicator = articleCount / Math.min(articleCount, 100);

		for (Element articleNode : articleNodes) {

			contentNode = (Element) articleNode.selectSingleNode(articleBodyExp);
			if (contentNode == null) {
				continue;
			}

			headerNode = (Element) articleNode.selectSingleNode(articleHeaderExp);
			wordGroupNode = (Element) headerNode.selectSingleNode(wordGroupExp);
			wordNode = (Element) wordGroupNode.selectSingleNode(wordExp);
			word = wordNode.getTextTrim();

			Integer homonymNr = null;
			String homonymNrAsString = wordNode.attributeValue(homonymNrAttr);
			if (isNotEmpty(homonymNrAsString)) {
				homonymNr = Integer.parseInt(homonymNrAsString);
			}

			if (StringUtils.containsAny(word, wordCleanupChars)) {
				uncleanWordCount.increment();
			}

			rootBaseNodes = contentNode.selectNodes(rootBaseExp);

			newParadigms = new ArrayList<>();

			for (Element rootBaseNode : rootBaseNodes) {

				formGroupNodes = rootBaseNode.selectNodes(formGroupExp);
				inflectionTypeNrNode = (Element) rootBaseNode.selectSingleNode(inflectionTypeNrExp);
				inflectionTypeNr = inflectionTypeNrNode.getTextTrim();
				if (inflectionTypeNr.startsWith("0")) {
					inflectionTypeNr = String.valueOf(Integer.parseInt(inflectionTypeNr));
				}

				forms = new ArrayList<>();
				formValues = new ArrayList<>();
				boolean isWord = true;

				for (Element formGroupNode : formGroupNodes) {

					morphValueNode = (Element) formGroupNode.selectSingleNode(morphValueExp);
					sourceMorphCode = morphValueNode.getTextTrim();
					destinMorphCode = morphValueCodeMap.get(sourceMorphCode);

					formNodes = formGroupNode.selectNodes(formExp);

					for (Element formNode : formNodes) {

						form = formNode.getTextTrim();
						form = StringUtils.replaceChars(form, formCleanupChars, "");

						if (StringUtils.isBlank(form)) {
							continue;
						}

						//TODO add display form
						formObj = new Form();
						formObj.setMorphCode(destinMorphCode);
						formObj.setValue(form);
						formObj.setWord(isWord);

						forms.add(formObj);
						formValues.add(form);
					}
					if (isWord) {
						isWord = false;
					}
				}

				paradigmObj = new Paradigm();
				paradigmObj.setWord(word);
				paradigmObj.setForms(forms);
				paradigmObj.setFormValues(formValues);
				paradigmObj.setInflectionTypeNr(inflectionTypeNr);
				paradigmObj.setHomonymNr(homonymNr);

				newParadigms.add(paradigmObj);
			}

			paradigms = wordParadigmsMap.get(word);
			if (paradigms == null) {
				paradigms = new ArrayList<>();
				wordParadigmsMap.put(word, paradigms);
			}
			paradigms.addAll(newParadigms);

			// progress
			articleCounter++;
			if (articleCounter % progressIndicator == 0) {
				long progressPercent = articleCounter / progressIndicator;
				logger.debug("{}% - {} articles iterated", progressPercent, articleCounter);
			}
		}

		logger.debug("Found {} unclean words", uncleanWordCount.getValue());
		logger.debug("Found {} words", wordParadigmsMap.size());

		t2 = System.currentTimeMillis();
		logger.debug("Done loading in {} ms", (t2 - t1));

		return wordParadigmsMap;
	}

	private Map<String, String> composeMorphValueCodeMap(String morphLang) throws Exception {

		final String morphType = "ekimorfo";

		String morphSqlScript =
				"select "
				+ "ml.value \"key\","
				+ "ml.code \"value\" "
				+ "from " + MORPH_LABEL + " ml "
				+ "where "
				+ "ml.lang = :morphLang "
				+ "and ml.type = :morphType";
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("morphLang", morphLang);
		paramMap.put("morphType", morphType);
		Map<String, String> morphValueCodeMap = basicDbService.queryListAsMap(morphSqlScript, paramMap);

		if (MapUtils.isEmpty(morphValueCodeMap)) {
			throw new Exception("No morph classifiers are available with that criteria");
		}
		return morphValueCodeMap;
	}
}
