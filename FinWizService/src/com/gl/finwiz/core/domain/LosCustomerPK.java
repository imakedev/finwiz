package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the LOS_CUSTOMER database table.
 * 
 */
@Embeddable
public class LosCustomerPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="LOS_CUSTOMER_ID")
	private String losCustomerId;

	@Column(name="LOS_APP_ID", insertable=false, updatable=false)
	private String losAppId;

	public LosCustomerPK() {
	}
	public String getLosCustomerId() {
		return this.losCustomerId;
	}
	public void setLosCustomerId(String losCustomerId) {
		this.losCustomerId = losCustomerId;
	}
	public String getLosAppId() {
		return this.losAppId;
	}
	public void setLosAppId(String losAppId) {
		this.losAppId = losAppId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LosCustomerPK)) {
			return false;
		}
		LosCustomerPK castOther = (LosCustomerPK)other;
		return 
			this.losCustomerId.equals(castOther.losCustomerId)
			&& this.losAppId.equals(castOther.losAppId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.losCustomerId.hashCode();
		hash = hash * prime + this.losAppId.hashCode();
		
		return hash;
	}
}