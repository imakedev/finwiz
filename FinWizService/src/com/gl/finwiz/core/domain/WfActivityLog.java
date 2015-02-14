package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the WF_ACTIVITY_LOG database table.
 * 
 */
@Entity
@Table(name="WF_ACTIVITY_LOG")
@NamedQuery(name="WfActivityLog.findAll", query="SELECT w FROM WfActivityLog w")
public class WfActivityLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private WfActivityLogPK id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="ERROR_CODE")
	private String errorCode;

	@Lob
	@Column(name="ERROR_MESSAGE")
	private String errorMessage;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to WfActivityInstance
	@ManyToOne
	@JoinColumn(name="WF_ACTIVITY_INSTANCE_ID",insertable=false,updatable=false)
	private WfActivityInstance wfActivityInstance;

	public WfActivityLog() {
	}

	public WfActivityLogPK getId() {
		return this.id;
	}

	public void setId(WfActivityLogPK id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return this.updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public WfActivityInstance getWfActivityInstance() {
		return this.wfActivityInstance;
	}

	public void setWfActivityInstance(WfActivityInstance wfActivityInstance) {
		this.wfActivityInstance = wfActivityInstance;
	}

}