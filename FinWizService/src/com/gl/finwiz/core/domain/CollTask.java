package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the COLL_TASK database table.
 * 
 */
@Entity
@Table(name="COLL_TASK")
@NamedQuery(name="CollTask.findAll", query="SELECT c FROM CollTask c")
public class CollTask implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COLL_TASK_ID")
	private String collTaskId;

	@Column(name="COLL_DEPT_LEVEL_ID")
	private String collDeptLevelId;

	@Column(name="COLL_STAFF_USER_ID")
	private String collStaffUserId;

	@Column(name="COLL_TASK_STATUS")
	private String collTaskStatus;

	@Column(name="CONTRACT_NO")
	private String contractNo;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="DIVISION_ID")
	private String divisionId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DUE_DATE")
	private Date dueDate;

	@Column(name="INSTALLMENT_IN_VAT")
	private BigDecimal installmentInVat;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_PAY_IN_DATE")
	private Date lastPayInDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="NEXT_PAY_IN_DATE")
	private Date nextPayInDate;

	@Column(name="OVERDUE_AMOUNT")
	private double overdueAmount;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	//bi-directional many-to-one association to CollCharge
	@OneToMany(mappedBy="collTask")
	private List<CollCharge> collCharges;

	//bi-directional many-to-one association to CollTracking
	@OneToMany(mappedBy="collTask")
	private List<CollTracking> collTrackings;

	//bi-directional many-to-one association to CollTransferTask
	@OneToMany(mappedBy="collTask")
	private List<CollTransferTask> collTransferTasks;

	public CollTask() {
	}

	public String getCollTaskId() {
		return this.collTaskId;
	}

	public void setCollTaskId(String collTaskId) {
		this.collTaskId = collTaskId;
	}

	public String getCollDeptLevelId() {
		return this.collDeptLevelId;
	}

	public void setCollDeptLevelId(String collDeptLevelId) {
		this.collDeptLevelId = collDeptLevelId;
	}

	public String getCollStaffUserId() {
		return this.collStaffUserId;
	}

	public void setCollStaffUserId(String collStaffUserId) {
		this.collStaffUserId = collStaffUserId;
	}

	public String getCollTaskStatus() {
		return this.collTaskStatus;
	}

	public void setCollTaskStatus(String collTaskStatus) {
		this.collTaskStatus = collTaskStatus;
	}

	public String getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
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

	public String getDivisionId() {
		return this.divisionId;
	}

	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}

	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public BigDecimal getInstallmentInVat() {
		return this.installmentInVat;
	}

	public void setInstallmentInVat(BigDecimal installmentInVat) {
		this.installmentInVat = installmentInVat;
	}

	public Date getLastPayInDate() {
		return this.lastPayInDate;
	}

	public void setLastPayInDate(Date lastPayInDate) {
		this.lastPayInDate = lastPayInDate;
	}

	public Date getNextPayInDate() {
		return this.nextPayInDate;
	}

	public void setNextPayInDate(Date nextPayInDate) {
		this.nextPayInDate = nextPayInDate;
	}

	public double getOverdueAmount() {
		return this.overdueAmount;
	}

	public void setOverdueAmount(double overdueAmount) {
		this.overdueAmount = overdueAmount;
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

	public List<CollCharge> getCollCharges() {
		return this.collCharges;
	}

	public void setCollCharges(List<CollCharge> collCharges) {
		this.collCharges = collCharges;
	}

	public CollCharge addCollCharge(CollCharge collCharge) {
		getCollCharges().add(collCharge);
		collCharge.setCollTask(this);

		return collCharge;
	}

	public CollCharge removeCollCharge(CollCharge collCharge) {
		getCollCharges().remove(collCharge);
		collCharge.setCollTask(null);

		return collCharge;
	}

	public List<CollTracking> getCollTrackings() {
		return this.collTrackings;
	}

	public void setCollTrackings(List<CollTracking> collTrackings) {
		this.collTrackings = collTrackings;
	}

	public CollTracking addCollTracking(CollTracking collTracking) {
		getCollTrackings().add(collTracking);
		collTracking.setCollTask(this);

		return collTracking;
	}

	public CollTracking removeCollTracking(CollTracking collTracking) {
		getCollTrackings().remove(collTracking);
		collTracking.setCollTask(null);

		return collTracking;
	}

	public List<CollTransferTask> getCollTransferTasks() {
		return this.collTransferTasks;
	}

	public void setCollTransferTasks(List<CollTransferTask> collTransferTasks) {
		this.collTransferTasks = collTransferTasks;
	}

	public CollTransferTask addCollTransferTask(CollTransferTask collTransferTask) {
		getCollTransferTasks().add(collTransferTask);
		collTransferTask.setCollTask(this);

		return collTransferTask;
	}

	public CollTransferTask removeCollTransferTask(CollTransferTask collTransferTask) {
		getCollTransferTasks().remove(collTransferTask);
		collTransferTask.setCollTask(null);

		return collTransferTask;
	}

}