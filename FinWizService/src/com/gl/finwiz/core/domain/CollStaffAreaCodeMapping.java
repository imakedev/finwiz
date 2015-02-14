package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the COLL_STAFF_AREA_CODE_MAPPING database table.
 * 
 */
@Entity
@Table(name="COLL_STAFF_AREA_CODE_MAPPING")
@NamedQuery(name="CollStaffAreaCodeMapping.findAll", query="SELECT c FROM CollStaffAreaCodeMapping c")
public class CollStaffAreaCodeMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COLL_STAFF_AREA_CODE_MAPPING_ID")
	private String collStaffAreaCodeMappingId;

	@Column(name="AREA_CODE_ID")
	private String areaCodeId;

	@Column(name="COLL_STAFF_USER_ID")
	private String collStaffUserId;

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

	public CollStaffAreaCodeMapping() {
	}

	public String getCollStaffAreaCodeMappingId() {
		return this.collStaffAreaCodeMappingId;
	}

	public void setCollStaffAreaCodeMappingId(String collStaffAreaCodeMappingId) {
		this.collStaffAreaCodeMappingId = collStaffAreaCodeMappingId;
	}

	public String getAreaCodeId() {
		return this.areaCodeId;
	}

	public void setAreaCodeId(String areaCodeId) {
		this.areaCodeId = areaCodeId;
	}

	public String getCollStaffUserId() {
		return this.collStaffUserId;
	}

	public void setCollStaffUserId(String collStaffUserId) {
		this.collStaffUserId = collStaffUserId;
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

}