package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the WF_PROCESS database table.
 * 
 */
@Entity
@Table(name="WF_PROCESS")
@NamedQuery(name="WfProcess.findAll", query="SELECT w FROM WfProcess w")
public class WfProcess implements Serializable {
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

	//bi-directional many-to-one association to WfActivity
	@OneToMany(mappedBy="wfProcess")
	private List<WfActivity> wfActivities;

	//bi-directional many-to-one association to WfPi
	@OneToMany(mappedBy="wfProcess")
	private List<WfPi> wfPis;

	public WfProcess() {
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

	public List<WfActivity> getWfActivities() {
		return this.wfActivities;
	}

	public void setWfActivities(List<WfActivity> wfActivities) {
		this.wfActivities = wfActivities;
	}

	public WfActivity addWfActivity(WfActivity wfActivity) {
		getWfActivities().add(wfActivity);
		wfActivity.setWfProcess(this);

		return wfActivity;
	}

	public WfActivity removeWfActivity(WfActivity wfActivity) {
		getWfActivities().remove(wfActivity);
		wfActivity.setWfProcess(null);

		return wfActivity;
	}

	public List<WfPi> getWfPis() {
		return this.wfPis;
	}

	public void setWfPis(List<WfPi> wfPis) {
		this.wfPis = wfPis;
	}

	public WfPi addWfPi(WfPi wfPi) {
		getWfPis().add(wfPi);
		wfPi.setWfProcess(this);

		return wfPi;
	}

	public WfPi removeWfPi(WfPi wfPi) {
		getWfPis().remove(wfPi);
		wfPi.setWfProcess(null);

		return wfPi;
	}

}