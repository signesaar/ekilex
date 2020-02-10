package eki.ekilex.web.controller;

import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import eki.common.constant.DbConstant;
import eki.ekilex.constant.WebConstant;
import eki.ekilex.data.EkiUser;
import eki.ekilex.data.EkiUserApplication;
import eki.ekilex.data.EkiUserProfile;

@ConditionalOnWebApplication
@Controller
@SessionAttributes(WebConstant.SESSION_BEAN)
public class UserProfileController extends AbstractPageController implements DbConstant {

	private static Logger logger = LoggerFactory.getLogger(UserProfileController.class);

	@GetMapping(USER_PROFILE_URI)
	public String userProfile(Model model) {

		Long userId = userService.getAuthenticatedUser().getId();
		List<EkiUserApplication> userApplications = userService.getUserApplications(userId);
		EkiUserProfile userProfile = userProfileService.getUserProfile(userId);

		List<String> meaningRelationWordLangs = userProfile.getPreferredMeaningRelationWordLangs();
		if (CollectionUtils.isEmpty(meaningRelationWordLangs)) {
			meaningRelationWordLangs = Collections.singletonList(LANGUAGE_CODE_EST);
			userProfileService.updateUserPreferredMeaningRelationWordLangs(meaningRelationWordLangs, userId);
			userProfile.setPreferredMeaningRelationWordLangs(meaningRelationWordLangs);
		}

		model.addAttribute("userProfile", userProfile);
		model.addAttribute("userApplications", userApplications);

		return USER_PROFILE_PAGE;
	}

	@PostMapping(REAPPLY_URI)
	public String reapply(
			@RequestParam(value = "selectedDatasets", required = false) List<String> selectedDatasets,
			@RequestParam(value = "applicationComment", required = false) String applicationComment) {

		EkiUser user = userService.getAuthenticatedUser();
		userService.submitAdditionalUserApplication(user, selectedDatasets, applicationComment);
		return "redirect:" + USER_PROFILE_URI;
	}

	@PostMapping(UPDATE_MEANING_REL_PREFS_URI)
	public String updateMeaningRelPrefs(
			@RequestParam("meaningRelationWordLanguages") List<String> meaningRelationWordLanguages,
			@RequestParam(value = "showLexMeaningRelationSourceLangWords", required = false) boolean showLexMeaningRelationSourceLangWords,
			@RequestParam(value = "showMeaningRelationFirstWordOnly", required = false) boolean showMeaningRelationFirstWordOnly,
			@RequestParam(value = "showMeaningRelationMeaningId", required = false) boolean showMeaningRelationMeaningId,
			@RequestParam(value = "showMeaningRelationWordDatasets", required = false) boolean showMeaningRelationWordDatasets) {

		logger.debug("updateMeaningRelPrefs start");

		Long userId = userService.getAuthenticatedUser().getId();
		logger.debug("userId: " + userId);
		EkiUserProfile userProfile = userProfileService.getUserProfile(userId);
		logger.debug("userProfile is null: " + (userProfile == null));
		userProfile.setPreferredMeaningRelationWordLangs(meaningRelationWordLanguages);
		userProfile.setShowLexMeaningRelationSourceLangWords(showLexMeaningRelationSourceLangWords);
		userProfile.setShowMeaningRelationFirstWordOnly(showMeaningRelationFirstWordOnly);
		userProfile.setShowMeaningRelationMeaningId(showMeaningRelationMeaningId);
		userProfile.setShowMeaningRelationWordDatasets(showMeaningRelationWordDatasets);
		userProfileService.updateUserProfile(userProfile);
		logger.debug("updateMeaningRelPrefs end");
		return "redirect:" + USER_PROFILE_URI;
	}
}
