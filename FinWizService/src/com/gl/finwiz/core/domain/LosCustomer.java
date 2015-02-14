package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the LOS_CUSTOMER database table.
 * 
 */
@Entity
@Table(name="LOS_CUSTOMER")
@NamedQuery(name="LosCustomer.findAll", query="SELECT l FROM LosCustomer l")
public class LosCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LosCustomerPK id;

	private int age;

	@Column(name="CUSTOMER_TYPE")
	private int customerType;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name="EDUCATION_LEVEL")
	private String educationLevel;

	private String email;

	@Column(name="FACEBOOK_ID")
	private String facebookId;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="HOUSE_HOLD")
	private int houseHold;

	@Temporal(TemporalType.DATE)
	@Column(name="ID_EXPIRY_DATE")
	private Date idExpiryDate;

	@Temporal(TemporalType.DATE)
	@Column(name="ID_ISSUE_DATE")
	private Date idIssueDate;

	@Column(name="ID_NO")
	private String idNo;

	@Column(name="ID_TYPE")
	private String idType;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="MARITAL_STATUS")
	private String maritalStatus;

	private String prefix;

	@Column(name="PROSPECT_ID")
	private String prospectId;

	@Column(name="VER_FACEBOOK_STATUS")
	private int verFacebookStatus;

	//bi-directional many-to-one association to LosApplication
	@ManyToOne
	@JoinColumn(name="LOS_APP_ID",insertable=false,updatable=false)
	private LosApplication losApplication;

	public LosCustomer() {
	}

	public LosCustomerPK getId() {
		return this.id;
	}

	public void setId(LosCustomerPK id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(int customerType) {
		this.customerType = customerType;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEducationLevel() {
		return this.educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebookId() {
		return this.facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getHouseHold() {
		return this.houseHold;
	}

	public void setHouseHold(int houseHold) {
		this.houseHold = houseHold;
	}

	public Date getIdExpiryDate() {
		return this.idExpiryDate;
	}

	public void setIdExpiryDate(Date idExpiryDate) {
		this.idExpiryDate = idExpiryDate;
	}

	public Date getIdIssueDate() {
		return this.idIssueDate;
	}

	public void setIdIssueDate(Date idIssueDate) {
		this.idIssueDate = idIssueDate;
	}

	public String getIdNo() {
		return this.idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getIdType() {
		return this.idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getProspectId() {
		return this.prospectId;
	}

	public void setProspectId(String prospectId) {
		this.prospectId = prospectId;
	}

	public int getVerFacebookStatus() {
		return this.verFacebookStatus;
	}

	public void setVerFacebookStatus(int verFacebookStatus) {
		this.verFacebookStatus = verFacebookStatus;
	}

	public LosApplication getLosApplication() {
		return this.losApplication;
	}

	public void setLosApplication(LosApplication losApplication) {
		this.losApplication = losApplication;
	}

}