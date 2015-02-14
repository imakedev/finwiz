package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COLL_CHARGE database table.
 * 
 */
@Embeddable
public class CollChargePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="COLL_CHARGE_ID")
	private String collChargeId;

	@Column(name="COLL_TASK_ID", insertable=false, updatable=false)
	private String collTaskId;

	public CollChargePK() {
	}
	public String getCollChargeId() {
		return this.collChargeId;
	}
	public void setCollChargeId(String collChargeId) {
		this.collChargeId = collChargeId;
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
		if (!(other instanceof CollChargePK)) {
			return false;
		}
		CollChargePK castOther = (CollChargePK)other;
		return 
			this.collChargeId.equals(castOther.collChargeId)
			&& this.collTaskId.equals(castOther.collTaskId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.collChargeId.hashCode();
		hash = hash * prime + this.collTaskId.hashCode();
		
		return hash;
	}
}