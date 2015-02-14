package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the BATCH_LOG database table.
 * 
 */
@Embeddable
public class BatchLogPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="BATCH_LOG_ID")
	private String batchLogId;

	@Column(name="BATCH_ID", insertable=false, updatable=false)
	private String batchId;

	public BatchLogPK() {
	}
	public String getBatchLogId() {
		return this.batchLogId;
	}
	public void setBatchLogId(String batchLogId) {
		this.batchLogId = batchLogId;
	}
	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BatchLogPK)) {
			return false;
		}
		BatchLogPK castOther = (BatchLogPK)other;
		return 
			this.batchLogId.equals(castOther.batchLogId)
			&& this.batchId.equals(castOther.batchId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.batchLogId.hashCode();
		hash = hash * prime + this.batchId.hashCode();
		
		return hash;
	}
}