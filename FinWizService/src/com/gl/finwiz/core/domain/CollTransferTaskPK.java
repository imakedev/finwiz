package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COLL_TRANSFER_TASK database table.
 * 
 */
@Embeddable
public class CollTransferTaskPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="COLL_TRANSFER_TASK_ID")
	private String collTransferTaskId;

	@Column(name="COLL_TASK_ID", insertable=false, updatable=false)
	private String collTaskId;

	public CollTransferTaskPK() {
	}
	public String getCollTransferTaskId() {
		return this.collTransferTaskId;
	}
	public void setCollTransferTaskId(String collTransferTaskId) {
		this.collTransferTaskId = collTransferTaskId;
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
		if (!(other instanceof CollTransferTaskPK)) {
			return false;
		}
		CollTransferTaskPK castOther = (CollTransferTaskPK)other;
		return 
			this.collTransferTaskId.equals(castOther.collTransferTaskId)
			&& this.collTaskId.equals(castOther.collTaskId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.collTransferTaskId.hashCode();
		hash = hash * prime + this.collTaskId.hashCode();
		
		return hash;
	}
}