package com.sanbhu.school.dashboard.html.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanbhu.school.dashboard.controller.BaseHtmlController;

@Controller
public class AchievementController extends BaseHtmlController  {
	
	@RequestMapping("/achievements")
	public String showGallery(Map<String, Object> model) {
		return "achievement/showAchievements";
	}
}
