package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the WF_ACTIVITY_INSTANCE database table.
 * 
 */
@Entity
@Table(name="WF_ACTIVITY_INSTANCE")
@NamedQuery(name="WfActivityInstance.findAll", query="SELECT w FROM WfActivityInstance w")
public class WfActivityInstance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="WF_ACTIVITY_INSTANCE_ID")
	private String wfActivityInstanceId;

	@Column(name="ACTIVITY_ID")
	private String activityId;

	@Column(name="APPLICATION_STATUS")
	private String applicationStatus;

	@Column(name="CHECK_OUT_STATUS")
	private String checkOutStatus;

	@Column(name="CHECK_OUT_USER")
	private String checkOutUser;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="MERGE_STATUS")
	private String mergeStatus;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	@Column(name="WF_ACTIVITY_INSTANCE_ID_PREV")
	private String wfActivityInstanceIdPrev;

	@Column(name="WF_ACTIVITY_INSTANCE_OWNER_ROLE")
	private String wfActivityInstanceOwnerRole;

	@Column(name="WF_ACTIVITY_INSTANCE_OWNER_USER")
	private String wfActivityInstanceOwnerUser;

	@Column(name="WF_ACTIVITY_INSTANCE_STATUS")
	private String wfActivityInstanceStatus;

	@Column(name="WFPI_ID")
	private String wfpiId;

	//bi-directional many-to-one association to WfActivityLog
	@OneToMany(mappedBy="wfActivityInstance")
	private List<WfActivityLog> wfActivityLogs;

	public WfActivityInstance() {
	}

	public String getWfActivityInstanceId() {
		return this.wfActivityInstanceId;
	}

	public void setWfActivityInstanceId(String wfActivityInstanceId) {
		this.wfActivityInstanceId = wfActivityInstanceId;
	}

	public String getActivityId() {
		return this.activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getApplicationStatus() {
		return this.applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getCheckOutStatus() {
		return this.checkOutStatus;
	}

	public void setCheckOutStatus(String checkOutStatus) {
		this.checkOutStatus = checkOutStatus;
	}

	public String getCheckOutUser() {
		return this.checkOutUser;
	}

	public void setCheckOutUser(String checkOutUser) {
		this.checkOutUser = checkOutUser;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getMergeStatus() {
		return this.mergeStatus;
	}

	public void setMergeStatus(String mergeStatus) {
		this.mergeStatus = mergeStatus;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getWfActivityInstanceIdPrev() {
		return this.wfActivityInstanceIdPrev;
	}

	public void setWfActivityInstanceIdPrev(String wfActivityInstanceIdPrev) {
		this.wfActivityInstanceIdPrev = wfActivityInstanceIdPrev;
	}

	public String getWfActivityInstanceOwnerRole() {
		return this.wfActivityInstanceOwnerRole;
	}

	public void setWfActivityInstanceOwnerRole(String wfActivityInstanceOwnerRole) {
		this.wfActivityInstanceOwnerRole = wfActivityInstanceOwnerRole;
	}

	public String getWfActivityInstanceOwnerUser() {
		return this.wfActivityInstanceOwnerUser;
	}

	public void setWfActivityInstanceOwnerUser(String wfActivityInstanceOwnerUser) {
		this.wfActivityInstanceOwnerUser = wfActivityInstanceOwnerUser;
	}

	public String getWfActivityInstanceStatus() {
		return this.wfActivityInstanceStatus;
	}

	public void setWfActivityInstanceStatus(String wfActivityInstanceStatus) {
		this.wfActivityInstanceStatus = wfActivityInstanceStatus;
	}

	public String getWfpiId() {
		return this.wfpiId;
	}

	public void setWfpiId(String wfpiId) {
		this.wfpiId = wfpiId;
	}

	public List<WfActivityLog> getWfActivityLogs() {
		return this.wfActivityLogs;
	}

	public void setWfActivityLogs(List<WfActivityLog> wfActivityLogs) {
		this.wfActivityLogs = wfActivityLogs;
	}

	public WfActivityLog addWfActivityLog(WfActivityLog wfActivityLog) {
		getWfActivityLogs().add(wfActivityLog);
		wfActivityLog.setWfActivityInstance(this);

		return wfActivityLog;
	}

	public WfActivityLog removeWfActivityLog(WfActivityLog wfActivityLog) {
		getWfActivityLogs().remove(wfActivityLog);
		wfActivityLog.setWfActivityInstance(null);

		return wfActivityLog;
	}

}