package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the COLL_DEPARTMENT database table.
 * 
 */
@Entity
@Table(name="COLL_DEPARTMENT")
@NamedQuery(name="CollDepartment.findAll", query="SELECT c FROM CollDepartment c")
public class CollDepartment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COLL_DEPARTMENT_ID")
	private String collDepartmentId;

	@Column(name="COLL_DEPARTMENT_DESCRIPTION")
	private String collDepartmentDescription;

	@Column(name="COLL_DEPARTMENT_NAME")
	private String collDepartmentName;

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

	//bi-directional many-to-one association to CollDebtLevel
	@OneToMany(mappedBy="collDepartment")
	private List<CollDebtLevel> collDebtLevels;

	public CollDepartment() {
	}

	public String getCollDepartmentId() {
		return this.collDepartmentId;
	}

	public void setCollDepartmentId(String collDepartmentId) {
		this.collDepartmentId = collDepartmentId;
	}

	public String getCollDepartmentDescription() {
		return this.collDepartmentDescription;
	}

	public void setCollDepartmentDescription(String collDepartmentDescription) {
		this.collDepartmentDescription = collDepartmentDescription;
	}

	public String getCollDepartmentName() {
		return this.collDepartmentName;
	}

	public void setCollDepartmentName(String collDepartmentName) {
		this.collDepartmentName = collDepartmentName;
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

	public List<CollDebtLevel> getCollDebtLevels() {
		return this.collDebtLevels;
	}

	public void setCollDebtLevels(List<CollDebtLevel> collDebtLevels) {
		this.collDebtLevels = collDebtLevels;
	}

	public CollDebtLevel addCollDebtLevel(CollDebtLevel collDebtLevel) {
		getCollDebtLevels().add(collDebtLevel);
		collDebtLevel.setCollDepartment(this);

		return collDebtLevel;
	}

	public CollDebtLevel removeCollDebtLevel(CollDebtLevel collDebtLevel) {
		getCollDebtLevels().remove(collDebtLevel);
		collDebtLevel.setCollDepartment(null);

		return collDebtLevel;
	}

}