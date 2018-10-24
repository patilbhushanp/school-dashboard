/**
 * @#EnquiryController.java October 24, 2018
 */
package com.sanbhu.school.dashboard.html.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanbhu.school.dashboard.controller.BaseHtmlController;

/**
 * Class used for enquire related operation.
 *
 * @author Bhushan Patil
 */
@Controller
public class EnquiryController extends BaseHtmlController {

	/**
	 * Method used to show enquire page.
	 *
	 * @param model Map instance.
	 * @return String instance.
	 */
	@RequestMapping("/enquiry")
	public String showEnquiryForm(Map<String, Object> model) {
		return "enquiry/enquiryForm";
	}
}
