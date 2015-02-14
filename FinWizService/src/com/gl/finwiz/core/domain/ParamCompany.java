package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PARAM_COMPANY database table.
 * 
 */
@Entity
@Table(name="PARAM_COMPANY")
@NamedQuery(name="ParamCompany.findAll", query="SELECT p FROM ParamCompany p")
public class ParamCompany implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COMPANY_ID")
	private String companyId;

	@Column(name="COMPANY_NAME")
	private String companyName;

	@Column(name="COMPANY_SHORT_NAME")
	private String companyShortName;

	//bi-directional many-to-one association to UserLogin
	@OneToMany(mappedBy="paramCompany")
	private List<UserLogin> userLogins;

	public ParamCompany() {
	}

	public String getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyShortName() {
		return this.companyShortName;
	}

	public void setCompanyShortName(String companyShortName) {
		this.companyShortName = companyShortName;
	}

	public List<UserLogin> getUserLogins() {
		return this.userLogins;
	}

	public void setUserLogins(List<UserLogin> userLogins) {
		this.userLogins = userLogins;
	}

	public UserLogin addUserLogin(UserLogin userLogin) {
		getUserLogins().add(userLogin);
		userLogin.setParamCompany(this);

		return userLogin;
	}

	public UserLogin removeUserLogin(UserLogin userLogin) {
		getUserLogins().remove(userLogin);
		userLogin.setParamCompany(null);

		return userLogin;
	}

}