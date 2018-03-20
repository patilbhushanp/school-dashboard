package com.sanbhu.school.dashboard.database.dao;

public class Notice {
	private Integer uid;
	private String subject;
	private String meetingDate;
	private String contactPerson;
	private Integer attendanceCount;
	private Integer meetingAcceptedCount;
	private String meetingAudience;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getAttendanceCount() {
		return attendanceCount;
	}

	public void setAttendanceCount(Integer attendanceCount) {
		this.attendanceCount = attendanceCount;
	}

	public Integer getMeetingAcceptedCount() {
		return meetingAcceptedCount;
	}

	public void setMeetingAcceptedCount(Integer meetingAcceptedCount) {
		this.meetingAcceptedCount = meetingAcceptedCount;
	}

	public String getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(String meetingDate) {
		this.meetingDate = meetingDate;
	}
	
	public String getMeetingAudience() {
		return meetingAudience;
	}

	public void setMeetingAudience(String meetingAudience) {
		this.meetingAudience = meetingAudience;
	}
	
	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	@Override
	public String toString() {
		return this.uid + "\t" + this.subject + "\t" + this.meetingDate + "\t" + this.contactPerson + "\t"
				+ this.attendanceCount + "\t" + this.meetingAcceptedCount;
	}
}
