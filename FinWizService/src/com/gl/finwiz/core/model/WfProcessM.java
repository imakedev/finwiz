package com.gl.finwiz.core.model;

import java.io.Serializable;
import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("WfProcessM")
public class WfProcessM implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String wfpId;

	private String createdBy;

	private Date createdTime;

	private String finId;

	private String javaWfData;

	private String updatedBy;

	private Date updatedTime;

	private String wfpDesc;

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