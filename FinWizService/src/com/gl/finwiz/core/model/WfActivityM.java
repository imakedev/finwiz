package com.gl.finwiz.core.model;

import java.io.Serializable;
import java.util.Date;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("wfActivityM")
public class WfActivityM extends FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;

	private String activityId;

	private String wfpId;

	private String activityDesc;

	private String activityName;

	private String activityOwner;

	private String activityType;

	private String createdBy;

	private Date createdTime;

	private String javaActivityImpl;
	private String javaPreConImpl;

	private String requireMerge;

	private String updatedBy;

	private Date updatedTime;
	private String isstart;
	//bi-directional many-to-one association to WfProcess

	public String getIsstart() {
		return isstart;
	}

	public void setIsstart(String isstart) {
		this.isstart = isstart;
	}

	private WfProcessM wfProcess;

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getWfpId() {
		return wfpId;
	}

	public void setWfpId(String wfpId) {
		this.wfpId = wfpId;
	}

	public String getActivityDesc() {
		return activityDesc;
	}

	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityOwner() {
		return activityOwner;
	}

	public void setActivityOwner(String activityOwner) {
		this.activityOwner = activityOwner;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getJavaActivityImpl() {
		return javaActivityImpl;
	}

	public void setJavaActivityImpl(String javaActivityImpl) {
		this.javaActivityImpl = javaActivityImpl;
	}

	public String getJavaPreConImpl() {
		return javaPreConImpl;
	}

	public void setJavaPreConImpl(String javaPreConImpl) {
		this.javaPreConImpl = javaPreConImpl;
	}

	public String getRequireMerge() {
		return requireMerge;
	}

	public void setRequireMerge(String requireMerge) {
		this.requireMerge = requireMerge;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public WfProcessM getWfProcess() {
		return wfProcess;
	}

	public void setWfProcess(WfProcessM wfProcess) {
		this.wfProcess = wfProcess;
	}

	public WfActivityM() {
	}

}