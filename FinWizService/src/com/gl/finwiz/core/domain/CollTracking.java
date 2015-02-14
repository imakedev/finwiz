package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the COLL_TRACKING database table.
 * 
 */
@Entity
@Table(name="COLL_TRACKING")
@NamedQuery(name="CollTracking.findAll", query="SELECT c FROM CollTracking c")
public class CollTracking implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CollTrackingPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="COLL_TRACKING_END_TIME")
	private Date collTrackingEndTime;

	@Column(name="COLL_TRACKING_FOLLOWERS")
	private String collTrackingFollowers;

	@Column(name="COLL_TRACKING_PHONE")
	private String collTrackingPhone;

	@Column(name="COLL_TRACKING_REMARK")
	private String collTrackingRemark;

	@Column(name="COLL_TRACKING_RESULT")
	private String collTrackingResult;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="COLL_TRACKING_START_TIME")
	private Date collTrackingStartTime;

	@Column(name="COLL_TRACKING_TYPE")
	private String collTrackingType;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	//bi-directional many-to-one association to CollTask
	@ManyToOne
	@JoinColumn(name="COLL_TASK_ID",insertable=false,updatable=false)
	private CollTask collTask;

	public CollTracking() {
	}

	public CollTrackingPK getId() {
		return this.id;
	}

	public void setId(CollTrackingPK id) {
		this.id = id;
	}

	public Date getCollTrackingEndTime() {
		return this.collTrackingEndTime;
	}

	public void setCollTrackingEndTime(Date collTrackingEndTime) {
		this.collTrackingEndTime = collTrackingEndTime;
	}

	public String getCollTrackingFollowers() {
		return this.collTrackingFollowers;
	}

	public void setCollTrackingFollowers(String collTrackingFollowers) {
		this.collTrackingFollowers = collTrackingFollowers;
	}

	public String getCollTrackingPhone() {
		return this.collTrackingPhone;
	}

	public void setCollTrackingPhone(String collTrackingPhone) {
		this.collTrackingPhone = collTrackingPhone;
	}

	public String getCollTrackingRemark() {
		return this.collTrackingRemark;
	}

	public void setCollTrackingRemark(String collTrackingRemark) {
		this.collTrackingRemark = collTrackingRemark;
	}

	public String getCollTrackingResult() {
		return this.collTrackingResult;
	}

	public void setCollTrackingResult(String collTrackingResult) {
		this.collTrackingResult = collTrackingResult;
	}

	public Date getCollTrackingStartTime() {
		return this.collTrackingStartTime;
	}

	public void setCollTrackingStartTime(Date collTrackingStartTime) {
		this.collTrackingStartTime = collTrackingStartTime;
	}

	public String getCollTrackingType() {
		return this.collTrackingType;
	}

	public void setCollTrackingType(String collTrackingType) {
		this.collTrackingType = collTrackingType;
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

	public CollTask getCollTask() {
		return this.collTask;
	}

	public void setCollTask(CollTask collTask) {
		this.collTask = collTask;
	}

}