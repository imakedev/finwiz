package com.gl.finwiz.core.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("WfProcessM")
public class WfProcessM implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="WFP_ID")
	private String wfpId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="FIN_ID")
	private String finId;

	@Column(name="JAVA_WF_DATA")
	private String javaWfData;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="WFP_DESC")
	private String wfpDesc;

	@Column(name="WFP_NAME")
	private String wfpName;

	
	public WfProcessM() {
	}

	public String getWfpId() {
		return this.wfpId;
	}

	public void setWfpId(String wfpId) {
		this.wfpId = wfpId;
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

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

	public String getJavaWfData() {
		return this.javaWfData;
	}

	public void setJavaWfData(String javaWfData) {
		this.javaWfData = javaWfData;
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

	public String getWfpDesc() {
		return this.wfpDesc;
	}

	public void setWfpDesc(String wfpDesc) {
		this.wfpDesc = wfpDesc;
	}

	public String getWfpName() {
		return this.wfpName;
	}

	public void setWfpName(String wfpName) {
		this.wfpName = wfpName;
	}

	
}