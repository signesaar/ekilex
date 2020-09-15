package eki.ekilex.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eki.common.constant.ActivityEntity;
import eki.common.constant.FreeformType;
import eki.common.constant.LifecycleEntity;
import eki.common.constant.LifecycleEventType;
import eki.common.constant.LifecycleLogOwner;
import eki.common.constant.LifecycleProperty;
import eki.common.constant.SourceType;
import eki.common.exception.OperationDeniedException;
import eki.ekilex.data.ActivityLogData;
import eki.ekilex.data.ActivityLogOwnerEntityDescr;
import eki.ekilex.data.DatasetPermission;
import eki.ekilex.data.LogData;
import eki.ekilex.data.SearchFilter;
import eki.ekilex.data.Source;
import eki.ekilex.data.SourceProperty;
import eki.ekilex.data.SourcePropertyTuple;
import eki.ekilex.service.db.SourceDbService;
import eki.ekilex.service.util.PermCalculator;

@Component
public class SourceService extends AbstractService {

	private static final Logger logger = LoggerFactory.getLogger(SourceService.class);

	@Autowired
	private SourceDbService sourceDbService;

	@Autowired
	private PermCalculator permCalculator;

	@Transactional
	public Source getSource(Long sourceId) {
		return getSource(sourceId, null);
	}

	@Transactional
	public Source getSource(Long sourceId, DatasetPermission userRole) {

		List<SourcePropertyTuple> sourcePropertyTuples = sourceDbService.getSource(sourceId);
		if (CollectionUtils.isEmpty(sourcePropertyTuples)) {
			logger.warn("No source found for id {}", sourceId);
			return null;
		}
		List<Source> sources = conversionUtil.composeSources(sourcePropertyTuples);
		permCalculator.applyCrud(userRole, sources);
		if (sources.size() > 1) {
			logger.error("Single source query for id {} returned several. Fix this!", sourceId);
		}
		Source source = sources.get(0);

		return source;
	}

	@Transactional
	public Long getSourceId(Long sourcePropertyId) {
		return sourceDbService.getSourceId(sourcePropertyId);
	}

	@Transactional
	public SourceProperty getSourceProperty(Long sourcePropertyId) {
		return sourceDbService.getSourceProperty(sourcePropertyId);
	}

	@Transactional
	public String getSourceNameValue(Long sourceId) {
		return sourceDbService.getSourceNameValue(sourceId);
	}

	@Transactional
	public List<Source> getSources(String searchFilter) {
		return getSources(searchFilter, null, null);
	}

	@Transactional
	public List<Source> getSources(String searchFilter, DatasetPermission userRole) {
		return getSources(searchFilter, null, userRole);
	}

	@Transactional
	public List<Source> getSources(String searchFilter, SourceType sourceType) {
		return getSources(searchFilter, sourceType, null);
	}

	@Transactional
	public List<Source> getSources(String searchFilter, SourceType sourceType, DatasetPermission userRole) {

		if (StringUtils.isBlank(searchFilter)) {
			return new ArrayList<>();
		}
		List<SourcePropertyTuple> sourcePropertyTuples = sourceDbService.getSources(searchFilter, sourceType);
		List<Source> sources = conversionUtil.composeSources(sourcePropertyTuples);
		permCalculator.applyCrud(userRole, sources);

		return sources;
	}

	@Transactional
	public List<Source> getSourcesExcludingOne(String searchFilter, Source excludedSource, DatasetPermission userRole) {

		if (StringUtils.isBlank(searchFilter)) {
			return new ArrayList<>();
		}
		SourceType sourceType = excludedSource.getType();
		Long excludedSourceId = excludedSource.getId();
		List<SourcePropertyTuple> sourcePropertyTuples = sourceDbService.getSources(searchFilter, sourceType, excludedSourceId);
		List<Source> sources = conversionUtil.composeSources(sourcePropertyTuples);
		permCalculator.applyCrud(userRole, sources);

		return sources;
	}

	@Transactional
	public List<Source> getSources(SearchFilter searchFilter, DatasetPermission userRole) throws Exception {

		if (CollectionUtils.isEmpty(searchFilter.getCriteriaGroups())) {
			return new ArrayList<>();
		}
		List<SourcePropertyTuple> sourcePropertyTuples = sourceDbService.getSources(searchFilter);
		List<Source> sources = conversionUtil.composeSources(sourcePropertyTuples);
		permCalculator.applyCrud(userRole, sources);

		return sources;
	}

	@Transactional
	public List<String> getSourceNames(String nameSearchFilter, int limit) {

		if (StringUtils.isBlank(nameSearchFilter)) {
			return Collections.emptyList();
		}
		return sourceDbService.getSourceNames(nameSearchFilter, limit);
	}

	@Transactional
	public Long createSource(SourceType sourceType, List<SourceProperty> sourceProperties) throws Exception {

		Long sourceId = sourceDbService.createSource(sourceType, sourceProperties);
		LogData sourceValueLogData = new LogData(LifecycleEventType.CREATE, LifecycleEntity.SOURCE, LifecycleProperty.VALUE, sourceId);
		createLifecycleLog(sourceValueLogData);
		LogData sourceTypeLogData = new LogData(LifecycleEventType.CREATE, LifecycleEntity.SOURCE, LifecycleProperty.SOURCE_TYPE, sourceId, sourceType.name());
		createLifecycleLog(sourceTypeLogData);
		for (SourceProperty sourceProperty : sourceProperties) {
			LifecycleProperty lifecycleProperty = LifecycleProperty.valueOf(sourceProperty.getType().name());
			LogData logData = new LogData(LifecycleEventType.CREATE, LifecycleEntity.SOURCE, lifecycleProperty, sourceId, sourceProperty.getValueText());
			createLifecycleLog(logData);
		}
		activityLogService.createActivityLog("createSource", sourceId, LifecycleLogOwner.SOURCE);
		return sourceId;
	}

	@Transactional
	public void createSourceProperty(Long sourceId, FreeformType freeformType, String valueText) throws Exception {

		LifecycleProperty lifecycleProperty = LifecycleProperty.valueOf(freeformType.name());
		LogData logData = new LogData(LifecycleEventType.CREATE, LifecycleEntity.SOURCE, lifecycleProperty, sourceId, valueText);
		createLifecycleLog(logData);
		ActivityLogData activityLog = activityLogService.prepareActivityLog("createSourceProperty", sourceId, LifecycleLogOwner.SOURCE);
		Long sourcePropertyId = sourceDbService.createSourceProperty(sourceId, freeformType, valueText);
		activityLogService.createActivityLog(activityLog, sourcePropertyId, freeformType);
	}

	@Transactional
	public void updateSourceProperty(Long sourcePropertyId, String valueText) throws Exception {

		SourceProperty sourceProperty = sourceDbService.getSourceProperty(sourcePropertyId);
		if (sourceProperty == null) {
			throw new OperationDeniedException();
		}
		FreeformType type = sourceProperty.getType();
		LifecycleProperty lifecycleProperty = LifecycleProperty.valueOf(type.name());
		LogData logData = new LogData(LifecycleEventType.UPDATE, LifecycleEntity.SOURCE, lifecycleProperty, sourcePropertyId, valueText);
		createLifecycleLog(logData);
		ActivityLogOwnerEntityDescr freeformOwnerDescr = activityLogService.getFreeformOwnerDescr(sourcePropertyId);
		ActivityLogData activityLog = activityLogService.prepareActivityLog("updateSourceProperty", freeformOwnerDescr.getOwnerId(), freeformOwnerDescr.getOwnerName());
		sourceDbService.updateSourceProperty(sourcePropertyId, valueText);
		activityLogService.createActivityLog(activityLog, sourcePropertyId, freeformOwnerDescr.getEntityName());
	}

	@Transactional
	public void deleteSourceProperty(Long sourcePropertyId) throws Exception {

		SourceProperty sourceProperty = sourceDbService.getSourceProperty(sourcePropertyId);
		if (sourceProperty == null) {
			throw new OperationDeniedException();
		}
		FreeformType type = sourceProperty.getType();
		LifecycleProperty lifecycleProperty = LifecycleProperty.valueOf(type.name());
		LogData logData = new LogData(LifecycleEventType.DELETE, LifecycleEntity.SOURCE, lifecycleProperty, sourcePropertyId);
		createLifecycleLog(logData);
		ActivityLogOwnerEntityDescr freeformOwnerDescr = activityLogService.getFreeformOwnerDescr(sourcePropertyId);
		ActivityLogData activityLog = activityLogService.prepareActivityLog("deleteSourceProperty", freeformOwnerDescr.getOwnerId(), freeformOwnerDescr.getOwnerName());
		sourceDbService.deleteSourceProperty(sourcePropertyId);
		activityLogService.createActivityLog(activityLog, sourcePropertyId, freeformOwnerDescr.getEntityName());
	}

	@Transactional
	public void updateSource(Long sourceId, SourceType type) throws Exception {

		LogData logData = new LogData(LifecycleEventType.UPDATE, LifecycleEntity.SOURCE, LifecycleProperty.SOURCE_TYPE, sourceId, type.name());
		createLifecycleLog(logData);
		ActivityLogData activityLog = activityLogService.prepareActivityLog("updateSource", sourceId, LifecycleLogOwner.SOURCE);
		sourceDbService.updateSourceType(sourceId, type);
		activityLogService.createActivityLog(activityLog, sourceId, ActivityEntity.SOURCE);
	}

	@Transactional
	public boolean validateSourceDelete(Long sourceId) {
		return sourceDbService.validateSourceDelete(sourceId);
	}

	@Transactional
	public void deleteSource(Long sourceId) throws Exception {

		LogData logData = new LogData(LifecycleEventType.DELETE, LifecycleEntity.SOURCE, LifecycleProperty.VALUE, sourceId);
		createLifecycleLog(logData);
		activityLogService.createActivityLog("deleteSource", sourceId, LifecycleLogOwner.SOURCE);
		sourceDbService.deleteSource(sourceId);
	}

	@Transactional
	public void joinSources(Long targetSourceId, Long originSourceId) throws Exception {

		String targetSourceNames = joinSourceNames(targetSourceId);
		String originSourceNames = joinSourceNames(originSourceId);
		LogData logData = new LogData(
				LifecycleEventType.JOIN, LifecycleEntity.SOURCE, LifecycleProperty.VALUE, targetSourceId, originSourceNames, targetSourceNames);
		createLifecycleLog(logData);

		ActivityLogData activityLog1 = activityLogService.prepareActivityLog("joinMeanings", originSourceId, LifecycleLogOwner.SOURCE);
		ActivityLogData activityLog2 = activityLogService.prepareActivityLog("joinMeanings", targetSourceId, LifecycleLogOwner.SOURCE);

		sourceDbService.joinSources(targetSourceId, originSourceId);

		activityLogService.createActivityLog(activityLog1, originSourceId, ActivityEntity.SOURCE);
		activityLogService.createActivityLog(activityLog2, targetSourceId, ActivityEntity.SOURCE);
	}

	private String joinSourceNames(Long sourceId) {

		List<String> names = sourceDbService.getSourceAttributesByType(sourceId, FreeformType.SOURCE_NAME);
		String joinedNames = StringUtils.join(names, "; ");
		return joinedNames;
	}

}
