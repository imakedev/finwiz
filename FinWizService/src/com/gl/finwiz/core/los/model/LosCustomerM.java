package com.gl.finwiz.core.los.model;

import java.io.Serializable;
import java.util.Date;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;


/**
 * The persistent class for the LOS_CUSTOMER database table.
 * 
 */
@XStreamAlias("losCustomerM")
public class LosCustomerM extends FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;

	private String losCustomerId;

	private String losAppId;

	private int age;

	private int customerType;

	private Date dob;

	private String educationLevel;

	private String email;

	private String facebookId;

	private String firstName;

	private int houseHold;

	private Date idExpiryDate;

	private Date idIssueDate;

	private String idNo;

	private String idType;

	private String lastName;

	private String maritalStatus;

	private String prefix;

	private String prospectId;

	private int verFacebookStatus;

	/*//bi-directional many-to-one association to LosApplication
	private LosApplication losApplication;*/

	public LosCustomerM() {
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


	public String getLosCustomerId() {
		return losCustomerId;
	}


	public void setLosCustomerId(String losCustomerId) {
		this.losCustomerId = losCustomerId;
	}


	public String getLosAppId() {
		return losAppId;
	}


	public void setLosAppId(String losAppId) {
		this.losAppId = losAppId;
	}

	
}