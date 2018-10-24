/**
 * @#Notice.java October 24, 2018
 */
package com.sanbhu.school.dashboard.database.dao;

/**
 * Class used to populate notice object.
 *
 * @author Bhushan Patil
 */
public class Notice {
	/** UID. */
	private Integer uid;

	/** subject. */
	private String subject;

	/** meetingDate. */
	private String meetingDate;

	/** contactPerson. */
	private String contactPerson;

	/** attendanceCount. */
	private Integer attendanceCount;

	/** meetingAcceptedCount. */
	private Integer meetingAcceptedCount;

	/** meetingAudience. */
	private String meetingAudience;

	/**
	 * Getter method for UID.
	 *
	 * @return the uid instance.
	 */
	public Integer getUid() {
		return uid;
	}

	/**
	 * Setter method for UID.
	 *
	 * @param uid Integer instance.
	 */
	public void setUid(final Integer uid) {
		this.uid = uid;
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
	 * Getter method for meetingDate.
	 *
	 * @return the meetingDate instance.
	 */
	public String getMeetingDate() {
		return meetingDate;
	}

	/**
	 * Setter method for meetingDate.
	 *
	 * @param meetingDate String instance.
	 */
	public void setMeetingDate(final String meetingDate) {
		this.meetingDate = meetingDate;
	}

	/**
	 * Getter method for contactPerson.
	 *
	 * @return the contactPerson instance.
	 */
	public String getContactPerson() {
		return contactPerson;
	}

	/**
	 * Setter method for contactPerson.
	 *
	 * @param contactPerson String instance.
	 */
	public void setContactPerson(final String contactPerson) {
		this.contactPerson = contactPerson;
	}

	/**
	 * Getter method for attendanceCount.
	 *
	 * @return the attendanceCount instance.
	 */
	public Integer getAttendanceCount() {
		return attendanceCount;
	}

	/**
	 * Setter method for attendanceCount.
	 *
	 * @param attendanceCount Integer instance.
	 */
	public void setAttendanceCount(final Integer attendanceCount) {
		this.attendanceCount = attendanceCount;
	}

	/**
	 * Getter method for meetingAcceptedCount.
	 *
	 * @return the meetingAcceptedCount instance.
	 */
	public Integer getMeetingAcceptedCount() {
		return meetingAcceptedCount;
	}

	/**
	 * Setter method for meetingAcceptedCount.
	 *
	 * @param meetingAcceptedCount Integer instance.
	 */
	public void setMeetingAcceptedCount(final Integer meetingAcceptedCount) {
		this.meetingAcceptedCount = meetingAcceptedCount;
	}

	/**
	 * Getter method for meetingAudience.
	 *
	 * @return the meetingAudience instance.
	 */
	public String getMeetingAudience() {
		return meetingAudience;
	}

	/**
	 * Setter method for meetingAudience.
	 *
	 * @param meetingAudience String instance.
	 */
	public void setMeetingAudience(final String meetingAudience) {
		this.meetingAudience = meetingAudience;
	}

	/**
	 * Method to return String of Object representation.
	 *
	 * @return string instance.
	 */
	@Override
	public String toString() {
		return this.uid + "\t" + this.subject + "\t" + this.meetingDate + "\t" + this.contactPerson + "\t"
				+ this.attendanceCount + "\t" + this.meetingAcceptedCount;
	}
}
