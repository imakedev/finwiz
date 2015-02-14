package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the LOS_APPLICATION_LOG database table.
 * 
 */
@Embeddable
public class LosApplicationLogPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="APP_LOG_ID")
	private String appLogId;

	@Column(name="LOS_APP_ID", insertable=false, updatable=false)
	private String losAppId;

	public LosApplicationLogPK() {
	}
	public String getAppLogId() {
		return this.appLogId;
	}
	public void setAppLogId(String appLogId) {
		this.appLogId = appLogId;
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
		if (!(other instanceof LosApplicationLogPK)) {
			return false;
		}
		LosApplicationLogPK castOther = (LosApplicationLogPK)other;
		return 
			this.appLogId.equals(castOther.appLogId)
			&& this.losAppId.equals(castOther.losAppId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.appLogId.hashCode();
		hash = hash * prime + this.losAppId.hashCode();
		
		return hash;
	}
}