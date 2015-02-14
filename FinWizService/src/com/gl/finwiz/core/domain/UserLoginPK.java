package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the USER_LOGIN database table.
 * 
 */
@Embeddable
public class UserLoginPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="USER_ID")
	private String userId;

	@Column(name="COUNTRY_ID", insertable=false, updatable=false)
	private String countryId;

	@Column(name="COMPANY_ID", insertable=false, updatable=false)
	private String companyId;

	public UserLoginPK() {
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCountryId() {
		return this.countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserLoginPK)) {
			return false;
		}
		UserLoginPK castOther = (UserLoginPK)other;
		return 
			this.userId.equals(castOther.userId)
			&& this.countryId.equals(castOther.countryId)
			&& this.companyId.equals(castOther.companyId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.countryId.hashCode();
		hash = hash * prime + this.companyId.hashCode();
		
		return hash;
	}
}