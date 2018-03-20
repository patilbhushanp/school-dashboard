package com.sanbhu.school.dashboard.html.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanbhu.school.dashboard.controller.BaseHtmlController;

@Controller
public class DashboardController extends BaseHtmlController {

	@RequestMapping("/")
	public String showDashboard(Map<String, Object> model) {
		return "dashboard/dashboard";
	}

}