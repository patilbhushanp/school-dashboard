package com.sanbhu.school.dashboard.html.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanbhu.school.dashboard.controller.BaseHtmlController;

@Controller
public class EnquiryController extends BaseHtmlController {

	@RequestMapping("/enquiry")
	public String showEnquiryForm(Map<String, Object> model) {
		return "enquiry/enquiryForm";
	}
}
