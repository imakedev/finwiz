package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the LOS_POLICY_RESULT database table.
 * 
 */
@Embeddable
public class LosPolicyResultPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="LOS_POLICY_RESULT")
	private String losPolicyResult;

	@Column(name="LOS_APP_ID", insertable=false, updatable=false)
	private String losAppId;

	public LosPolicyResultPK() {
	}
	public String getLosPolicyResult() {
		return this.losPolicyResult;
	}
	public void setLosPolicyResult(String losPolicyResult) {
		this.losPolicyResult = losPolicyResult;
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
		if (!(other instanceof LosPolicyResultPK)) {
			return false;
		}
		LosPolicyResultPK castOther = (LosPolicyResultPK)other;
		return 
			this.losPolicyResult.equals(castOther.losPolicyResult)
			&& this.losAppId.equals(castOther.losAppId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.losPolicyResult.hashCode();
		hash = hash * prime + this.losAppId.hashCode();
		
		return hash;
	}
}