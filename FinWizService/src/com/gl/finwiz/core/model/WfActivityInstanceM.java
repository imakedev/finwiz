package com.gl.finwiz.core.model;

import java.io.Serializable;
import java.util.Date;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("wfActivityInstanceM")
public class WfActivityInstanceM extends FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String wfActivityInstanceId;

	private String activityId;
	private String applicationStatus;

	private String checkOutStatus;

	private String checkOutUser;

	private String createdBy;

	private Date createdDate;

	private String mergeStatus;

	private String updatedBy;

	private Date updatedDate;

	private String wfActivityInstanceIdPrev;

	private String wfActivityInstanceOwnerRole;

	private String wfActivityInstanceOwnerUser;

	private String wfActivityInstanceStatus;

	private String wfpiId;


	public WfActivityInstanceM() {
	}


	public String getWfActivityInstanceId() {
		return wfActivityInstanceId;
	}


	public void setWfActivityInstanceId(String wfActivityInstanceId) {
		this.wfActivityInstanceId = wfActivityInstanceId;
	}


	public String getActivityId() {
		return activityId;
	}


	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}


	public String getApplicationStatus() {
		return applicationStatus;
	}


	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}


	public String getCheckOutStatus() {
		return checkOutStatus;
	}


	public void setCheckOutStatus(String checkOutStatus) {
		this.checkOutStatus = checkOutStatus;
	}


	public String getCheckOutUser() {
		return checkOutUser;
	}


	public void setCheckOutUser(String checkOutUser) {
		this.checkOutUser = checkOutUser;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public String getMergeStatus() {
		return mergeStatus;
	}


	public void setMergeStatus(String mergeStatus) {
		this.mergeStatus = mergeStatus;
	}


	public String getUpdatedBy() {
		return updatedBy;
	}


	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	public Date getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}


	public String getWfActivityInstanceIdPrev() {
		return wfActivityInstanceIdPrev;
	}


	public void setWfActivityInstanceIdPrev(String wfActivityInstanceIdPrev) {
		this.wfActivityInstanceIdPrev = wfActivityInstanceIdPrev;
	}


	public String getWfActivityInstanceOwnerRole() {
		return wfActivityInstanceOwnerRole;
	}


	public void setWfActivityInstanceOwnerRole(String wfActivityInstanceOwnerRole) {
		this.wfActivityInstanceOwnerRole = wfActivityInstanceOwnerRole;
	}


	public String getWfActivityInstanceOwnerUser() {
		return wfActivityInstanceOwnerUser;
	}


	public void setWfActivityInstanceOwnerUser(String wfActivityInstanceOwnerUser) {
		this.wfActivityInstanceOwnerUser = wfActivityInstanceOwnerUser;
	}


	public String getWfActivityInstanceStatus() {
		return wfActivityInstanceStatus;
	}


	public void setWfActivityInstanceStatus(String wfActivityInstanceStatus) {
		this.wfActivityInstanceStatus = wfActivityInstanceStatus;
	}


	public String getWfpiId() {
		return wfpiId;
	}


	public void setWfpiId(String wfpiId) {
		this.wfpiId = wfpiId;
	}



}