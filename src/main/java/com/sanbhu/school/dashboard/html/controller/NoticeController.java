package com.sanbhu.school.dashboard.html.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanbhu.school.dashboard.controller.BaseHtmlController;

@Controller
public class NoticeController extends BaseHtmlController {

	@RequestMapping("/noticeBoard")
	public String showNoticeBoard(Map<String, Object> model) {
		return "notice/noticeList";
	}

	@RequestMapping("/noticeDetails")
	public String showNoticeDetails(Map<String, Object> model) {
		return "notice/noticeDetails";
	}
}
