package com.gl.finwiz.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

public class LosApplicationM implements Serializable {
	private static final long serialVersionUID = 1L;

	

//	@Min(18)
	private String losAppId;
	@NotNull
	private String applicationId;

	private String applicationStatus;

	private String approvedBy;

	private Date approvedDate;
	//@Size(min=2, max=30)	
	private String campaignId;

	private String contractNo;

	private String createdBy;

	private Date createdTime;

	private String dealerId;

	private double downPayment;

	private double finAmount;

	private String finId;

	private Date firstDueDate;

	private String inputDataBy;

	private Date inputDataDate;

	private double installment;

	private int isActive;

	private int term;

	private String updatedBy;

	private Date updatedDate;

	private int version;

	private int verson;

	

	public LosApplicationM() {
	}

	public String getLosAppId() {
		return this.losAppId;
	}

	public void setLosAppId(String losAppId) {
		this.losAppId = losAppId;
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationStatus() {
		return this.applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getApprovedBy() {
		return this.approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Date getApprovedDate() {
		return this.approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getCampaignId() {
		return this.campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
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

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getDealerId() {
		return this.dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public double getDownPayment() {
		return this.downPayment;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	public double getFinAmount() {
		return this.finAmount;
	}

	public void setFinAmount(double finAmount) {
		this.finAmount = finAmount;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

	public Date getFirstDueDate() {
		return this.firstDueDate;
	}

	public void setFirstDueDate(Date firstDueDate) {
		this.firstDueDate = firstDueDate;
	}

	public String getInputDataBy() {
		return this.inputDataBy;
	}

	public void setInputDataBy(String inputDataBy) {
		this.inputDataBy = inputDataBy;
	}

	public Date getInputDataDate() {
		return this.inputDataDate;
	}

	public void setInputDataDate(Date inputDataDate) {
		this.inputDataDate = inputDataDate;
	}

	public double getInstallment() {
		return this.installment;
	}

	public void setInstallment(double installment) {
		this.installment = installment;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getTerm() {
		return this.term;
	}

	public void setTerm(int term) {
		this.term = term;
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

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getVerson() {
		return this.verson;
	}

	public void setVerson(int verson) {
		this.verson = verson;
	}

}