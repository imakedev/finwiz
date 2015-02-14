package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the LOS_ASSET database table.
 * 
 */
@Embeddable
public class LosAssetPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="LOS_ASSET_ID")
	private String losAssetId;

	@Column(name="LOS_APP_ID", insertable=false, updatable=false)
	private String losAppId;

	public LosAssetPK() {
	}
	public String getLosAssetId() {
		return this.losAssetId;
	}
	public void setLosAssetId(String losAssetId) {
		this.losAssetId = losAssetId;
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
		if (!(other instanceof LosAssetPK)) {
			return false;
		}
		LosAssetPK castOther = (LosAssetPK)other;
		return 
			this.losAssetId.equals(castOther.losAssetId)
			&& this.losAppId.equals(castOther.losAppId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.losAssetId.hashCode();
		hash = hash * prime + this.losAppId.hashCode();
		
		return hash;
	}
}