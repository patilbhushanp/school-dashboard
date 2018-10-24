/**
 * @#NoticeDetail.java October 24, 2018
 */
package com.sanbhu.school.dashboard.database.dao;

import java.sql.Timestamp;
import java.util.Map;

/**
 * Class used to populate notice details.
 *
 * @author Bhushan Patil
 */
public class NoticeDetail {
	/** notice. */
	private Notice notice;

	/** noticeInfo. */
	private Map<Timestamp, NoticeInfo> noticeInfo;

	/**
	 * Getter method for notice.
	 *
	 * @return the notice instance.
	 */
	public Notice getNotice() {
		return notice;
	}

	/**
	 * Setter method for notice.
	 *
	 * @param notice Notice instance.
	 */
	public void setNotice(final Notice notice) {
		this.notice = notice;
	}

	/**
	 * Getter method for noticeInfo.
	 *
	 * @return the noticeInfo instance.
	 */
	public Map<Timestamp, NoticeInfo> getNoticeInfo() {
		return noticeInfo;
	}

	/**
	 * Setter method for noticeInfo.
	 *
	 * @param noticeInfo Map<Timestamp,NoticeInfo> instance.
	 */
	public void setNoticeInfo(final Map<Timestamp, NoticeInfo> noticeInfo) {
		this.noticeInfo = noticeInfo;
	}
}