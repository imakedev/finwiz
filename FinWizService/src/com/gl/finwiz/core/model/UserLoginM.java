package com.gl.finwiz.core.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XStreamAlias("userLoginM")
public class UserLoginM extends FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;

	private String userId;

	private String countryId;

	private String companyId;


	private String createdBy;

	private Date createdDate;

	private String email;

	private String firstName;

	private String lastName;

	private String password;

	private int status;

	private String updatedBy;

	private Date updatedDate;

	private ParamCompanyM paramCompany;

	private List<UserRoleM> userRoles;
	
	private List<ParamPageM> paramPages;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public ParamCompanyM getParamCompany() {
		return paramCompany;
	}

	public void setParamCompany(ParamCompanyM paramCompany) {
		this.paramCompany = paramCompany;
	}

	public ParamCountryM getParamCountry() {
		return paramCountry;
	}

	public void setParamCountry(ParamCountryM paramCountry) {
		this.paramCountry = paramCountry;
	}

	private ParamCountryM paramCountry;

	public UserLoginM() {
	}

	public List<UserRoleM> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRoleM> userRoles) {
		this.userRoles = userRoles;
	}

	public List<ParamPageM> getParamPages() {
		return paramPages;
	}

	public void setParamPages(List<ParamPageM> paramPages) {
		this.paramPages = paramPages;
	}

	
}