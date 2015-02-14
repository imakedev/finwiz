package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COLL_TRACKING database table.
 * 
 */
@Embeddable
public class CollTrackingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="COLL_TRACKING_ID")
	private String collTrackingId;

	@Column(name="COLL_TASK_ID", insertable=false, updatable=false)
	private String collTaskId;

	public CollTrackingPK() {
	}
	public String getCollTrackingId() {
		return this.collTrackingId;
	}
	public void setCollTrackingId(String collTrackingId) {
		this.collTrackingId = collTrackingId;
	}
	public String getCollTaskId() {
		return this.collTaskId;
	}
	public void setCollTaskId(String collTaskId) {
		this.collTaskId = collTaskId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CollTrackingPK)) {
			return false;
		}
		CollTrackingPK castOther = (CollTrackingPK)other;
		return 
			this.collTrackingId.equals(castOther.collTrackingId)
			&& this.collTaskId.equals(castOther.collTaskId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.collTrackingId.hashCode();
		hash = hash * prime + this.collTaskId.hashCode();
		
		return hash;
	}
}