/**
 * @#NoticeInfo.java October 24, 2018
 */
package com.sanbhu.school.dashboard.database.dao;

/**
 * Class used to populate notice info object.
 *
 * @author Bhushan Patil
 */
public class NoticeInfo {

	/**	time. */
	private String time;

	/**	subject. */
	private String subject;

	/**	moreDetail. */
	private String moreDetail;

	/**	timelineIcon. */
	private String timelineIcon;

	/**
	 * Getter method for time.
	 *
	 * @return the time instance.
	 */
	public String getTime() {
		return time;
	}

	/**
	 * Setter method for time.
	 *
	 * @param time String instance.
	 */
	public void setTime(final String time) {
		this.time = time;
	}

	/**
	 * Getter method for subject.
	 *
	 * @return the subject instance.
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Setter method for subject.
	 *
	 * @param subject String instance.
	 */
	public void setSubject(final String subject) {
		this.subject = subject;
	}

	/**
	 * Getter method for moreDetail.
	 *
	 * @return the moreDetail instance.
	 */
	public String getMoreDetail() {
		return moreDetail;
	}

	/**
	 * Setter method for moreDetail.
	 *
	 * @param moreDetail String instance.
	 */
	public void setMoreDetail(final String moreDetail) {
		this.moreDetail = moreDetail;
	}

	/**
	 * Getter method for timelineIcon.
	 *
	 * @return the timelineIcon instance.
	 */
	public String getTimelineIcon() {
		return timelineIcon;
	}

	/**
	 * Setter method for timelineIcon.
	 *
	 * @param timelineIcon String instance.
	 */
	public void setTimelineIcon(final String timelineIcon) {
		this.timelineIcon = timelineIcon;
	}
}
