package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the USER_LOGIN_LOG database table.
 * 
 */
@Entity
@Table(name="USER_LOGIN_LOG")
public class UserLoginLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_LOGIN_LOG_ID")
	private String userLoginLogId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LOG_IN_TIME")
	private Date logInTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LOG_OUT_TIME")
	private Date logOutTime;

	@Column(name="USER_ID")
	private String userId;

	public UserLoginLog() {
	}

	public String getUserLoginLogId() {
		return this.userLoginLogId;
	}

	public void setUserLoginLogId(String userLoginLogId) {
		this.userLoginLogId = userLoginLogId;
	}

	public Date getLogInTime() {
		return this.logInTime;
	}

	public void setLogInTime(Date logInTime) {
		this.logInTime = logInTime;
	}

	public Date getLogOutTime() {
		return this.logOutTime;
	}

	public void setLogOutTime(Date logOutTime) {
		this.logOutTime = logOutTime;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}