package com.sanbhu.school.dashboard.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sanbhu.school.dashboard.database.dao.Notice;

@Transactional
@Repository
public class NoticeView {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Notice> getAllNotice() {
		final String sqlQuery = "select uid, subject, date(meeting_date), contact_person, attendance_count, meeting_accepted_count, meeting_audience "
								+ "from school_notice_list "
								+ "order by meeting_date desc";
		List<Notice> result = jdbcTemplate.query(sqlQuery, new NoticeListRowMapper());
		return result;

	}

	public List<Notice> getNoticeDetail(final Integer noticeId) {
		final String sqlQuery = "select * from school_notice_detail where noticeId = " + noticeId + " order by uid asc";
		List<Notice> result = jdbcTemplate.query(sqlQuery, new NoticeDetailRowMapper());
		return result;

	}

	private class NoticeListRowMapper implements RowMapper<Notice> {
		@Override
		public Notice mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
			Notice notice = new Notice();
			notice.setUid(resultSet.getInt(1));
			notice.setSubject(resultSet.getString(2));
			notice.setMeetingDate(resultSet.getString(3));
			notice.setContactPerson(resultSet.getString(4));
			notice.setAttendanceCount(resultSet.getInt(5));
			notice.setMeetingAcceptedCount(resultSet.getInt(6));
			notice.setMeetingAudience(resultSet.getString(7));
			return notice;
		}

	}

	private class NoticeDetailRowMapper implements RowMapper<Notice> {
		@Override
		public Notice mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
			Notice notice = new Notice();
			return notice;
		}

	}
}