package com.sanbhu.school.dashboard.database.dao;

public class NoticeInfo {
	private String time;
	private String subject;
	private String moreDetail;
	private String timelineIcon;
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getMoreDetail() {
		return moreDetail;
	}
	
	public void setMoreDetail(String moreDetail) {
		this.moreDetail = moreDetail;
	}
	
	public String getTimelineIcon() {
		return timelineIcon;
	}
	
	public void setTimelineIcon(String timelineIcon) {
		this.timelineIcon = timelineIcon;
	}
}
