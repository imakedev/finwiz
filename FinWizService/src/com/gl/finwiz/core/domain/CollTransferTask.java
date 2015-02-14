package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the COLL_TRANSFER_TASK database table.
 * 
 */
@Entity
@Table(name="COLL_TRANSFER_TASK")
@NamedQuery(name="CollTransferTask.findAll", query="SELECT c FROM CollTransferTask c")
public class CollTransferTask implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CollTransferTaskPK id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="FROM_STAFF_USER_ID")
	private String fromStaffUserId;

	@Column(name="TO_STAFF_USER_ID")
	private String toStaffUserId;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	//bi-directional many-to-one association to CollTask
	@ManyToOne
	@JoinColumn(name="COLL_TASK_ID",insertable=false,updatable=false)
	private CollTask collTask;

	public CollTransferTask() {
	}

	public CollTransferTaskPK getId() {
		return this.id;
	}

	public void setId(CollTransferTaskPK id) {
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

	public String getFromStaffUserId() {
		return this.fromStaffUserId;
	}

	public void setFromStaffUserId(String fromStaffUserId) {
		this.fromStaffUserId = fromStaffUserId;
	}

	public String getToStaffUserId() {
		return this.toStaffUserId;
	}

	public void setToStaffUserId(String toStaffUserId) {
		this.toStaffUserId = toStaffUserId;
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