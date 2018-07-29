package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_user_log database table.
 * 
 */
@Entity
@Table(name="vms_user_log")
@NamedQuery(name="VmsUserLog.findAll", query="SELECT v FROM VmsUserLog v")
public class VmsUserLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="user_email_id")
	private String userEmailId;

	@Column(name="user_id")
	private int userId;

	@Lob
	@Column(name="user_ip")
	private String userIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="user_login_date_time")
	private Date userLoginDateTime;

	@Column(name="user_type")
	private String userType;

	public VmsUserLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserEmailId() {
		return this.userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserIp() {
		return this.userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public Date getUserLoginDateTime() {
		return this.userLoginDateTime;
	}

	public void setUserLoginDateTime(Date userLoginDateTime) {
		this.userLoginDateTime = userLoginDateTime;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}