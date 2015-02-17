package com.gl.finwiz.core.los.model;

import java.io.Serializable;
import java.util.Date;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;


@XStreamAlias("losApplicationM")
public class LosApplicationM  extends FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;


	
	private String losAppId;

	private String applicationId;

	private String applicationStatus;

	private String approvedBy;

	private Date approvedDate;

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
	
	private LosCustomerM losCustomerM;
/*
	//bi-directional many-to-one association to LosApplicationLog
	@OneToMany(mappedBy="losApplication")
	private List<LosApplicationLog> losApplicationLogs;

	//bi-directional many-to-one association to LosAsset
	@OneToMany(mappedBy="losApplication")
	private List<LosAsset> losAssets;

	//bi-directional many-to-one association to LosComment
	@OneToMany(mappedBy="losApplication")
	private List<LosComment> losComments;

	//bi-directional many-to-one association to LosCustomer
	@OneToMany(mappedBy="losApplication")
	private List<LosCustomer> losCustomers;

	//bi-directional many-to-one association to LosPolicyResult
	@OneToMany(mappedBy="losApplication")
	private List<LosPolicyResult> losPolicyResults;*/

	public String getLosAppId() {
		return losAppId;
	}

	public void setLosAppId(String losAppId) {
		this.losAppId = losAppId;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	public double getFinAmount() {
		return finAmount;
	}

	public void setFinAmount(double finAmount) {
		this.finAmount = finAmount;
	}

	public String getFinId() {
		return finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

	public Date getFirstDueDate() {
		return firstDueDate;
	}

	public void setFirstDueDate(Date firstDueDate) {
		this.firstDueDate = firstDueDate;
	}

	public String getInputDataBy() {
		return inputDataBy;
	}

	public void setInputDataBy(String inputDataBy) {
		this.inputDataBy = inputDataBy;
	}

	public Date getInputDataDate() {
		return inputDataDate;
	}

	public void setInputDataDate(Date inputDataDate) {
		this.inputDataDate = inputDataDate;
	}

	public double getInstallment() {
		return installment;
	}

	public void setInstallment(double installment) {
		this.installment = installment;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getVerson() {
		return verson;
	}

	public void setVerson(int verson) {
		this.verson = verson;
	}

	public LosCustomerM getLosCustomerM() {
		return losCustomerM;
	}

	public void setLosCustomerM(LosCustomerM losCustomerM) {
		this.losCustomerM = losCustomerM;
	}



}