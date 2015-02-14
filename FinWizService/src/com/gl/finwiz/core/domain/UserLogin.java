package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the USER_LOGIN database table.
 * 
 */
@Entity
@Table(name="USER_LOGIN")
@NamedQuery(name="UserLogin.findAll", query="SELECT u FROM UserLogin u")
public class UserLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserLoginPK id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	private String email;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	private String password;

	private int status;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	//bi-directional many-to-one association to ParamCompany
	@ManyToOne
	@JoinColumn(name="COMPANY_ID",insertable=false,updatable=false)
	private ParamCompany paramCompany;

	//bi-directional many-to-one association to ParamCountry
	@ManyToOne
	@JoinColumn(name="COUNTRY_ID",insertable=false,updatable=false)
	private ParamCountry paramCountry;

	public UserLogin() {
	}

	public UserLoginPK getId() {
		return this.id;
	}

	public void setId(UserLoginPK id) {
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public ParamCompany getParamCompany() {
		return this.paramCompany;
	}

	public void setParamCompany(ParamCompany paramCompany) {
		this.paramCompany = paramCompany;
	}

	public ParamCountry getParamCountry() {
		return this.paramCountry;
	}

	public void setParamCountry(ParamCountry paramCountry) {
		this.paramCountry = paramCountry;
	}

}