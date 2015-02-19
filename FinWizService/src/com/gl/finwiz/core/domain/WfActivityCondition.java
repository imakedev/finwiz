package com.gl.finwiz.core.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="WF_ACTIVITY_CONDITION")
@NamedQuery(name="WfActivityCondition.findAll", query="SELECT w FROM WfActivityCondition w")
public class WfActivityCondition  implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ACTIVITY_CONDITION_CODE")
	private String activityConditionCode;
	
	@Column(name="ACTIVITY_ID")
	private String activityId;
	
	@Column(name="ACTIVITY_CONDITION_DESC")
	private String activityConditionDesc;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;
	
	@Column(name="UPDATED_BY")
	private String updatedBy;
	
	@Column(name="JAVA_POST_CON_IMPL")
	private String javaPostConImpl;
	
	@Column(name="NEXT_ACTIVITY_ID")
	private String nextActivityId;
	
	@Column(name="OBJECT_STATUS_ID")
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
