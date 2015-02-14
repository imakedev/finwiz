package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the PARAM_SYS_OBJECT database table.
 * 
 */
@Entity
@Table(name="PARAM_SYS_OBJECT")
@NamedQuery(name="ParamSysObject.findAll", query="SELECT p FROM ParamSysObject p")
public class ParamSysObject implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ParamSysObjectPK id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="SYS_OBJECT_DESC")
	private String sysObjectDesc;

	@Column(name="SYS_OBJECT_NAME")
	private String sysObjectName;

	@Column(name="SYS_OBJECT_TYPE")
	private String sysObjectType;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	//bi-directional many-to-one association to ParamFinMapping
	@ManyToOne
	@JoinColumn(name="FIN_ID",insertable=false,updatable=false)
	private ParamFinMapping paramFinMapping;

	public ParamSysObject() {
	}

	public ParamSysObjectPK getId() {
		return this.id;
	}

	public void setId(ParamSysObjectPK id) {
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

	public String getSysObjectDesc() {
		return this.sysObjectDesc;
	}

	public void setSysObjectDesc(String sysObjectDesc) {
		this.sysObjectDesc = sysObjectDesc;
	}

	public String getSysObjectName() {
		return this.sysObjectName;
	}

	public void setSysObjectName(String sysObjectName) {
		this.sysObjectName = sysObjectName;
	}

	public String getSysObjectType() {
		return this.sysObjectType;
	}

	public void setSysObjectType(String sysObjectType) {
		this.sysObjectType = sysObjectType;
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

	public ParamFinMapping getParamFinMapping() {
		return this.paramFinMapping;
	}

	public void setParamFinMapping(ParamFinMapping paramFinMapping) {
		this.paramFinMapping = paramFinMapping;
	}

}