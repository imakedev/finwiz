package com.gl.finwiz.core.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the WF_ACTIVITY database table.
 * 
 */
@Entity
@Table(name="WF_ACTIVITY")
@NamedQuery(name="WfActivity.findAll", query="SELECT w FROM WfActivity w")
public class WfActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private WfActivityPK id;

	@Column(name="ACTIVITY_DESC")
	private String activityDesc;

	@Column(name="ACTIVITY_NAME")
	private String activityName;

	@Column(name="ACTIVITY_OWNER")
	private String activityOwner;

	@Column(name="ACTIVITY_TYPE")
	private String activityType;

	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="IS_START")
	private String isstart;
	
	public String getIsstart() {
		return isstart;
	}

	public void setIsstart(String isstart) {
		this.isstart = isstart;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="JAVA_PRE_CON_IMPL")
	private String javaPreConImpl;
	public String getJavaPreConImpl() {
		return javaPreConImpl;
	}

	public void setJavaPreConImpl(String javaPreConImpl) {
		this.javaPreConImpl = javaPreConImpl;
	}

	public String getJavaActivityImpl() {
		return javaActivityImpl;
	}

	public void setJavaActivityImpl(String javaActivityImpl) {
		this.javaActivityImpl = javaActivityImpl;
	}

	@Column(name="JAVA_ACTIVITY_IMPL")
	private String javaActivityImpl;

	@Column(name="REQUIRE_MERGE")
	private String requireMerge;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to WfProcess
	@ManyToOne
	@JoinColumn(name="WFP_ID",insertable=false,updatable=false)
	private WfProcess wfProcess;

	public WfActivity() {
	}

	public WfActivityPK getId() {
		return this.id;
	}

	public void setId(WfActivityPK id) {
		this.id = id;
	}

	public String getActivityDesc() {
		return this.activityDesc;
	}

	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}

	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityOwner() {
		return this.activityOwner;
	}

	public void setActivityOwner(String activityOwner) {
		this.activityOwner = activityOwner;
	}

	public String getActivityType() {
		return this.activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
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



	public String getRequireMerge() {
		return this.requireMerge;
	}

	public void setRequireMerge(String requireMerge) {
		this.requireMerge = requireMerge;
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

	public WfProcess getWfProcess() {
		return this.wfProcess;
	}

	public void setWfProcess(WfProcess wfProcess) {
		this.wfProcess = wfProcess;
	}

}