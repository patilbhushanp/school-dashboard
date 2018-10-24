/**
 * @#DashboardController.java October 24, 2018
 */
package com.sanbhu.school.dashboard.html.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanbhu.school.dashboard.controller.BaseHtmlController;

/**
 * Class used for dashboard operation.
 *
 * @author Bhushan Patil
 */
@Controller
public class DashboardController extends BaseHtmlController {

	/**
	 * Method used to show dashobard page.
	 *
	 * @param model Map instance.
	 * @return String instance.
	 */
	@RequestMapping("/")
	public String showDashboard(Map<String, Object> model) {
		return "dashboard/dashboard";
	}

}