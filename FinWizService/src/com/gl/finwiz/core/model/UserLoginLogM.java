package com.gl.finwiz.core.model;

import java.io.Serializable;
import java.util.Date;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("userLoginLogM")
public class UserLoginLogM extends FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;

	private String userLoginLogId;

	private Date logInTime;

	private Date logOutTime;

	private String userId;

	public UserLoginLogM() {
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