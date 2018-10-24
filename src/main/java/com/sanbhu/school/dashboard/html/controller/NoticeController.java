/**
 * @#NoticeController.java October 24, 2018
 */
package com.sanbhu.school.dashboard.html.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanbhu.school.dashboard.controller.BaseHtmlController;

/**
 * Class used to show notice page.
 *
 * @author Bhushan Patil
 */
@Controller
public class NoticeController extends BaseHtmlController {

	/**
	 * Method used to show Notice Board page.
	 *
	 * @param model Map instance.
	 * @return String instance.
	 */
	@RequestMapping("/noticeBoard")
	public String showNoticeBoard(Map<String, Object> model) {
		return "notice/noticeList";
	}

	/**
	 * Method used to show notice detail page.
	 *
	 * @param model Map instance.
	 * @return String instance.
	 */
	@RequestMapping("/noticeDetails")
	public String showNoticeDetails(Map<String, Object> model) {
		return "notice/noticeDetails";
	}
}
