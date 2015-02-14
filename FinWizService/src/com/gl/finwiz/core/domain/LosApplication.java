package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the LOS_APPLICATION database table.
 * 
 */
@Entity
@Table(name="LOS_APPLICATION")
@NamedQuery(name="LosApplication.findAll", query="SELECT l FROM LosApplication l")
public class LosApplication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LOS_APP_ID")
	private String losAppId;

	@Column(name="APPLICATION_ID")
	private String applicationId;

	@Column(name="APPLICATION_STATUS")
	private String applicationStatus;

	@Column(name="APPROVED_BY")
	private String approvedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="APPROVED_DATE")
	private Date approvedDate;

	@Column(name="CAMPAIGN_ID")
	private String campaignId;

	@Column(name="CONTRACT_NO")
	private String contractNo;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="DEALER_ID")
	private String dealerId;

	@Column(name="DOWN_PAYMENT")
	private double downPayment;

	@Column(name="FIN_AMOUNT")
	private double finAmount;

	@Column(name="FIN_ID")
	private String finId;

	@Temporal(TemporalType.DATE)
	@Column(name="FIRST_DUE_DATE")
	private Date firstDueDate;

	@Column(name="INPUT_DATA_BY")
	private String inputDataBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INPUT_DATA_DATE")
	private Date inputDataDate;

	private double installment;

	@Column(name="IS_ACTIVE")
	private int isActive;

	private int term;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	private int version;

	private int verson;

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
	private List<LosPolicyResult> losPolicyResults;

	public LosApplication() {
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

	public List<LosApplicationLog> getLosApplicationLogs() {
		return this.losApplicationLogs;
	}

	public void setLosApplicationLogs(List<LosApplicationLog> losApplicationLogs) {
		this.losApplicationLogs = losApplicationLogs;
	}

	public LosApplicationLog addLosApplicationLog(LosApplicationLog losApplicationLog) {
		getLosApplicationLogs().add(losApplicationLog);
		losApplicationLog.setLosApplication(this);

		return losApplicationLog;
	}

	public LosApplicationLog removeLosApplicationLog(LosApplicationLog losApplicationLog) {
		getLosApplicationLogs().remove(losApplicationLog);
		losApplicationLog.setLosApplication(null);

		return losApplicationLog;
	}

	public List<LosAsset> getLosAssets() {
		return this.losAssets;
	}

	public void setLosAssets(List<LosAsset> losAssets) {
		this.losAssets = losAssets;
	}

	public LosAsset addLosAsset(LosAsset losAsset) {
		getLosAssets().add(losAsset);
		losAsset.setLosApplication(this);

		return losAsset;
	}

	public LosAsset removeLosAsset(LosAsset losAsset) {
		getLosAssets().remove(losAsset);
		losAsset.setLosApplication(null);

		return losAsset;
	}

	public List<LosComment> getLosComments() {
		return this.losComments;
	}

	public void setLosComments(List<LosComment> losComments) {
		this.losComments = losComments;
	}

	public LosComment addLosComment(LosComment losComment) {
		getLosComments().add(losComment);
		losComment.setLosApplication(this);

		return losComment;
	}

	public LosComment removeLosComment(LosComment losComment) {
		getLosComments().remove(losComment);
		losComment.setLosApplication(null);

		return losComment;
	}

	public List<LosCustomer> getLosCustomers() {
		return this.losCustomers;
	}

	public void setLosCustomers(List<LosCustomer> losCustomers) {
		this.losCustomers = losCustomers;
	}

	public LosCustomer addLosCustomer(LosCustomer losCustomer) {
		getLosCustomers().add(losCustomer);
		losCustomer.setLosApplication(this);

		return losCustomer;
	}

	public LosCustomer removeLosCustomer(LosCustomer losCustomer) {
		getLosCustomers().remove(losCustomer);
		losCustomer.setLosApplication(null);

		return losCustomer;
	}

	public List<LosPolicyResult> getLosPolicyResults() {
		return this.losPolicyResults;
	}

	public void setLosPolicyResults(List<LosPolicyResult> losPolicyResults) {
		this.losPolicyResults = losPolicyResults;
	}

	public LosPolicyResult addLosPolicyResult(LosPolicyResult losPolicyResult) {
		getLosPolicyResults().add(losPolicyResult);
		losPolicyResult.setLosApplication(this);

		return losPolicyResult;
	}

	public LosPolicyResult removeLosPolicyResult(LosPolicyResult losPolicyResult) {
		getLosPolicyResults().remove(losPolicyResult);
		losPolicyResult.setLosApplication(null);

		return losPolicyResult;
	}

}