package eki.wordweb.web.controller;

import java.util.Locale;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import eki.wordweb.constant.WebConstant;

@ConditionalOnWebApplication
@Controller
@SessionAttributes(WebConstant.SESSION_BEAN)
public class PagesController extends AbstractController {

	@GetMapping(LEARN_URI)
	public String learn(Model model) {
		populateCommonModel(model);
		return LEARN_PAGE;
	}

	@GetMapping(GAMES_URI)
	public String games(Model model) {
		populateCommonModel(model);
		return GAMES_PAGE;
	}

	@GetMapping(CONTACTS_URI)
	public String contacts(Model model) {
		populateCommonModel(model);
		return CONTACTS_PAGE;
	}

	@GetMapping(COLLECTIONS_URI)
	public String collections(Model model) {
		populateCommonModel(model);
		return COLLECTIONS_PAGE;
	}

	@GetMapping(ABOUT_URI)
	public String about(Model model, Locale locale) {
		populateCommonModel(model);
		return ABOUT_PAGE + "_" + locale.getLanguage();
	}

	@GetMapping(REGULATIONS_URI)
	public String regulations(Model model) {
		populateCommonModel(model);
		return REGULATIONS_PAGE;
	}

	@GetMapping(CONDITIONS_URI)
	public String conditions(Model model) {
		populateCommonModel(model);
		return CONDITIONS_PAGE;
	}

}