/**
 * @#NoticeRestController.java October 24, 2018
 */
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

/**
 * Class used to fetch notice details.
 *
 * @author Bhushan Patil
 */
@RestController
public class NoticeRestController extends BaseRestController {

	/** noticeView NoticeView instance */
	@Autowired
	private NoticeView noticeView;

	/**
	 * Method to fetch Notice List.
	 *
	 * @return Map instance
	 */
	@RequestMapping("/getNoticeList")
	public Map<String, List<Notice>> getNoticeList() {
		final Map<String, List<Notice>> dataResult = new ConcurrentHashMap<String, List<Notice>>();
		dataResult.put("data", noticeView.getAllNotice());
		return dataResult;
	}

	/**
	 * Method to fetch Notice details with the help of given notice id.
	 *
	 * @param noticeId String instance.
	 * @return List instance.
	 */
	@RequestMapping("/getNotice")
	public List<Notice> getNotice(@RequestParam(value="noticeId", defaultValue="-1") final String noticeId) {
		return noticeView.getNoticeDetail(noticeId);
	}

}
