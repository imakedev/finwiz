package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the BATCH_PRINT_FORM_MAPPING database table.
 * 
 */
@Embeddable
public class BatchPrintFormMappingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PRINT_FORM_ID")
	private String printFormId;

	@Column(name="BATCH_ID", insertable=false, updatable=false)
	private String batchId;

	public BatchPrintFormMappingPK() {
	}
	public String getPrintFormId() {
		return this.printFormId;
	}
	public void setPrintFormId(String printFormId) {
		this.printFormId = printFormId;
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
		if (!(other instanceof BatchPrintFormMappingPK)) {
			return false;
		}
		BatchPrintFormMappingPK castOther = (BatchPrintFormMappingPK)other;
		return 
			this.printFormId.equals(castOther.printFormId)
			&& this.batchId.equals(castOther.batchId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.printFormId.hashCode();
		hash = hash * prime + this.batchId.hashCode();
		
		return hash;
	}
}