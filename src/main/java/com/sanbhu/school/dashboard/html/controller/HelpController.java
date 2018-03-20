package com.sanbhu.school.dashboard.html.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanbhu.school.dashboard.controller.BaseHtmlController;

@Controller
public class HelpController extends BaseHtmlController {

	@RequestMapping("/about")
	public String showNoticeBoard(Map<String, Object> model) {
		return "about/about";
	}
}
