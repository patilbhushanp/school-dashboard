package com.sanbhu.school.dashboard.rest.controller;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanbhu.school.dashboard.controller.BaseRestController;
import com.sanbhu.school.dashboard.database.NoticeView;
import com.sanbhu.school.dashboard.database.dao.Notice;

@RestController
public class NoticeRestController extends BaseRestController {
	@Autowired
	private NoticeView noticeView;

	@RequestMapping("/getNoticeList")
	public Map<String, List<Notice>> getNoticeList() {
		final Map<String, List<Notice>> dataResult = new ConcurrentHashMap<String, List<Notice>>();
		dataResult.put("data", noticeView.getAllNotice());
		return dataResult;
	}

	@RequestMapping("/getNotice")
	public List<Notice> getNotice(@RequestParam(value="noticeId", defaultValue="-1") Integer noticeId) {
		return noticeView.getNoticeDetail(noticeId);
	}
}
