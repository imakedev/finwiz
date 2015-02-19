package com.gl.finwiz.core.model;

import java.io.Serializable;
import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("WfActivityConditionM")
public class WfActivityConditionM  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String activityConditionCode;
	
	private String activityId;
	
	private String activityConditionDesc;
	
	private Date createdDate;
	
	private String createdBy;
	
	private Date updatedDate;
	
	private String updatedBy;
	
	private String javaPostConImpl;
	
	private String nextActivityId;
	
	private String objectStatusId;

	public String getActivityConditionCode() {
		return activityConditionCode;
	}

	public void setActivityConditionCode(String activityConditionCode) {
		this.activityConditionCode = activityConditionCode;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityConditionDesc() {
		return activityConditionDesc;
	}

	public void setActivityConditionDesc(String activityConditionDesc) {
		this.activityConditionDesc = activityConditionDesc;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getJavaPostConImpl() {
		return javaPostConImpl;
	}

	public void setJavaPostConImpl(String javaPostConImpl) {
		this.javaPostConImpl = javaPostConImpl;
	}

	public String getNextActivityId() {
		return nextActivityId;
	}

	public void setNextActivityId(String nextActivityId) {
		this.nextActivityId = nextActivityId;
	}

	public String getObjectStatusId() {
		return objectStatusId;
	}

	public void setObjectStatusId(String objectStatusId) {
		this.objectStatusId = objectStatusId;
	}

}
