package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;


/**
 * The persistent class for the COLL_DEBT_LEVEL database table.
 * 
 */
@Entity
@Table(name="COLL_DEBT_LEVEL")
@NamedQuery(name="CollDebtLevel.findAll", query="SELECT c FROM CollDebtLevel c")
public class CollDebtLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CollDebtLevelPK id;

	@Column(name="COLL_DEBT_LEVEL_DESCRIPTION")
	private String collDebtLevelDescription;

	@Column(name="COLL_DEBT_LEVEL_NAME")
	private String collDebtLevelName;

	@Column(name="COLL_DEBT_LEVEL_PERIOD")
	private BigInteger collDebtLevelPeriod;

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

	//bi-directional many-to-one association to CollDepartment
	@ManyToOne
	@JoinColumn(name="COLL_DEPARTMENT_ID",insertable=false,updatable=false)
	private CollDepartment collDepartment;

	public CollDebtLevel() {
	}

	public CollDebtLevelPK getId() {
		return this.id;
	}

	public void setId(CollDebtLevelPK id) {
		this.id = id;
	}

	public String getCollDebtLevelDescription() {
		return this.collDebtLevelDescription;
	}

	public void setCollDebtLevelDescription(String collDebtLevelDescription) {
		this.collDebtLevelDescription = collDebtLevelDescription;
	}

	public String getCollDebtLevelName() {
		return this.collDebtLevelName;
	}

	public void setCollDebtLevelName(String collDebtLevelName) {
		this.collDebtLevelName = collDebtLevelName;
	}

	public BigInteger getCollDebtLevelPeriod() {
		return this.collDebtLevelPeriod;
	}

	public void setCollDebtLevelPeriod(BigInteger collDebtLevelPeriod) {
		this.collDebtLevelPeriod = collDebtLevelPeriod;
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

	public CollDepartment getCollDepartment() {
		return this.collDepartment;
	}

	public void setCollDepartment(CollDepartment collDepartment) {
		this.collDepartment = collDepartment;
	}

}