package com.sanbhu.school.dashboard.database.dao;

import java.sql.Timestamp;
import java.util.Map;

public class NoticeDetail {
	private Notice notice;
	private Map<Timestamp, NoticeInfo> noticeInfo;
	
	public Notice getNotice() {
		return notice;
	}

	public void setNotice(Notice notice) {
		this.notice = notice;
	}

	public Map<Timestamp, NoticeInfo> getNoticeInfo() {
		return noticeInfo;
	}

	public void setNoticeInfo(Map<Timestamp, NoticeInfo> noticeInfo) {
		this.noticeInfo = noticeInfo;
	}

}