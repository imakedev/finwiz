package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the WF_PI database table.
 * 
 */
@Entity
@Table(name="WF_PI")
@NamedQuery(name="WfPi.findAll", query="SELECT w FROM WfPi w")
public class WfPi implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private WfPiPK id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="REF_ID")
	private String refId;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	@Column(name="WFPI_STATUS")
	private String wfpiStatus;

	//bi-directional many-to-one association to WfProcess
	@ManyToOne
	@JoinColumn(name="WFP_ID",insertable=false,updatable=false)
	private WfProcess wfProcess;

	public WfPi() {
	}

	public WfPiPK getId() {
		return this.id;
	}

	public void setId(WfPiPK id) {
		this.id = id;
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

	public String getRefId() {
		return this.refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
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

	public String getWfpiStatus() {
		return this.wfpiStatus;
	}

	public void setWfpiStatus(String wfpiStatus) {
		this.wfpiStatus = wfpiStatus;
	}

	public WfProcess getWfProcess() {
		return this.wfProcess;
	}

	public void setWfProcess(WfProcess wfProcess) {
		this.wfProcess = wfProcess;
	}

}