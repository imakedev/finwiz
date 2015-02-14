package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the COLL_CHARGE database table.
 * 
 */
@Entity
@Table(name="COLL_CHARGE")
@NamedQuery(name="CollCharge.findAll", query="SELECT c FROM CollCharge c")
public class CollCharge implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CollChargePK id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="PARAM_CHARGE_ID")
	private String paramChargeId;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	//bi-directional many-to-one association to CollTask
	@ManyToOne
	@JoinColumn(name="COLL_TASK_ID",insertable=false,updatable=false)
	private CollTask collTask;

	public CollCharge() {
	}

	public CollChargePK getId() {
		return this.id;
	}

	public void setId(CollChargePK id) {
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

	public String getParamChargeId() {
		return this.paramChargeId;
	}

	public void setParamChargeId(String paramChargeId) {
		this.paramChargeId = paramChargeId;
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

	public CollTask getCollTask() {
		return this.collTask;
	}

	public void setCollTask(CollTask collTask) {
		this.collTask = collTask;
	}

}