package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PARAM_COUNTRY database table.
 * 
 */
@Entity
@Table(name="PARAM_COUNTRY")
@NamedQuery(name="ParamCountry.findAll", query="SELECT p FROM ParamCountry p")
public class ParamCountry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COUNTRY_ID")
	private String countryId;

	@Column(name="COUNTRY_NAME")
	private String countryName;

	//bi-directional many-to-one association to UserLogin
	@OneToMany(mappedBy="paramCountry")
	private List<UserLogin> userLogins;

	public ParamCountry() {
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<UserLogin> getUserLogins() {
		return this.userLogins;
	}

	public void setUserLogins(List<UserLogin> userLogins) {
		this.userLogins = userLogins;
	}

	public UserLogin addUserLogin(UserLogin userLogin) {
		getUserLogins().add(userLogin);
		userLogin.setParamCountry(this);

		return userLogin;
	}

	public UserLogin removeUserLogin(UserLogin userLogin) {
		getUserLogins().remove(userLogin);
		userLogin.setParamCountry(null);

		return userLogin;
	}

}