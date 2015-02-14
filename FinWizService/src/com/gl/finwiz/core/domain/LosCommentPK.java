package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the LOS_COMMENT database table.
 * 
 */
@Embeddable
public class LosCommentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="LOS_COMMENT_ID")
	private String losCommentId;

	@Column(name="LOS_APP_ID", insertable=false, updatable=false)
	private String losAppId;

	public LosCommentPK() {
	}
	public String getLosCommentId() {
		return this.losCommentId;
	}
	public void setLosCommentId(String losCommentId) {
		this.losCommentId = losCommentId;
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
		if (!(other instanceof LosCommentPK)) {
			return false;
		}
		LosCommentPK castOther = (LosCommentPK)other;
		return 
			this.losCommentId.equals(castOther.losCommentId)
			&& this.losAppId.equals(castOther.losAppId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.losCommentId.hashCode();
		hash = hash * prime + this.losAppId.hashCode();
		
		return hash;
	}
}