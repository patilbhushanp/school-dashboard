/**
 * @#AchievementController.java October 24, 2018
 */
package com.sanbhu.school.dashboard.html.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanbhu.school.dashboard.controller.BaseHtmlController;

/**
 * Class used for achievement page operation.
 *
 * @author Bhushan Patil
 */
@Controller
public class AchievementController extends BaseHtmlController  {

	/**
	 * Method used to show achievements page.
	 *
	 * @param model Map instance.
	 * @return String instance.
	 */
	@RequestMapping("/achievements")
	public String showGallery(Map<String, Object> model) {
		return "achievement/showAchievements";
	}
}
