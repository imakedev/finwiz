package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PARAM_FIN_MAPPING database table.
 * 
 */
@Entity
@Table(name="PARAM_FIN_MAPPING")
@NamedQuery(name="ParamFinMapping.findAll", query="SELECT p FROM ParamFinMapping p")
public class ParamFinMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FIN_ID")
	private String finId;

	@Column(name="COMPANY_ID")
	private String companyId;

	@Column(name="COUNTRY_ID")
	private String countryId;

	@Column(name="PRODUCT_ID")
	private String productId;

	//bi-directional many-to-one association to ParamFinPageMapping
	@OneToMany(mappedBy="paramFinMapping")
	private List<ParamFinPageMapping> paramFinPageMappings;

	//bi-directional many-to-one association to ParamSysObject
	@OneToMany(mappedBy="paramFinMapping")
	private List<ParamSysObject> paramSysObjects;

	//bi-directional many-to-one association to UserRole
	@OneToMany(mappedBy="paramFinMapping")
	private List<UserRole> userRoles;

	public ParamFinMapping() {
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

	public String getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public List<ParamFinPageMapping> getParamFinPageMappings() {
		return this.paramFinPageMappings;
	}

	public void setParamFinPageMappings(List<ParamFinPageMapping> paramFinPageMappings) {
		this.paramFinPageMappings = paramFinPageMappings;
	}

	public ParamFinPageMapping addParamFinPageMapping(ParamFinPageMapping paramFinPageMapping) {
		getParamFinPageMappings().add(paramFinPageMapping);
		paramFinPageMapping.setParamFinMapping(this);

		return paramFinPageMapping;
	}

	public ParamFinPageMapping removeParamFinPageMapping(ParamFinPageMapping paramFinPageMapping) {
		getParamFinPageMappings().remove(paramFinPageMapping);
		paramFinPageMapping.setParamFinMapping(null);

		return paramFinPageMapping;
	}

	public List<ParamSysObject> getParamSysObjects() {
		return this.paramSysObjects;
	}

	public void setParamSysObjects(List<ParamSysObject> paramSysObjects) {
		this.paramSysObjects = paramSysObjects;
	}

	public ParamSysObject addParamSysObject(ParamSysObject paramSysObject) {
		getParamSysObjects().add(paramSysObject);
		paramSysObject.setParamFinMapping(this);

		return paramSysObject;
	}

	public ParamSysObject removeParamSysObject(ParamSysObject paramSysObject) {
		getParamSysObjects().remove(paramSysObject);
		paramSysObject.setParamFinMapping(null);

		return paramSysObject;
	}

	public List<UserRole> getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public UserRole addUserRole(UserRole userRole) {
		getUserRoles().add(userRole);
		userRole.setParamFinMapping(this);

		return userRole;
	}

	public UserRole removeUserRole(UserRole userRole) {
		getUserRoles().remove(userRole);
		userRole.setParamFinMapping(null);

		return userRole;
	}

}