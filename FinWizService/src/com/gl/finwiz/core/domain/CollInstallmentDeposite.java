package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the COLL_INSTALLMENT_DEPOSITE database table.
 * 
 */
@Entity
@Table(name="COLL_INSTALLMENT_DEPOSITE")
@NamedQuery(name="CollInstallmentDeposite.findAll", query="SELECT c FROM CollInstallmentDeposite c")
public class CollInstallmentDeposite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COLL_INSTALLMENT_DEPOSITE_ID")
	private String collInstallmentDepositeId;

	@Column(name="COLL_INSTALLMENT_DEPOSITE_STATUS")
	private String collInstallmentDepositeStatus;

	@Column(name="CONTRACT_NO")
	private String contractNo;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="DEALER_ID")
	private String dealerId;

	@Column(name="PAY_IN_AMOUNT")
	private double payInAmount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PAY_IN_DATE")
	private Date payInDate;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	public CollInstallmentDeposite() {
	}

	public String getCollInstallmentDepositeId() {
		return this.collInstallmentDepositeId;
	}

	public void setCollInstallmentDepositeId(String collInstallmentDepositeId) {
		this.collInstallmentDepositeId = collInstallmentDepositeId;
	}

	public String getCollInstallmentDepositeStatus() {
		return this.collInstallmentDepositeStatus;
	}

	public void setCollInstallmentDepositeStatus(String collInstallmentDepositeStatus) {
		this.collInstallmentDepositeStatus = collInstallmentDepositeStatus;
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

	public String getDealerId() {
		return this.dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public double getPayInAmount() {
		return this.payInAmount;
	}

	public void setPayInAmount(double payInAmount) {
		this.payInAmount = payInAmount;
	}

	public Date getPayInDate() {
		return this.payInDate;
	}

	public void setPayInDate(Date payInDate) {
		this.payInDate = payInDate;
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