package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the WF_PI database table.
 * 
 */
@Embeddable
public class WfPiPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="WFPI_ID")
	private String wfpiId;

	@Column(name="WFP_ID", insertable=false, updatable=false)
	private String wfpId;

	public WfPiPK() {
	}
	public String getWfpiId() {
		return this.wfpiId;
	}
	public void setWfpiId(String wfpiId) {
		this.wfpiId = wfpiId;
	}
	public String getWfpId() {
		return this.wfpId;
	}
	public void setWfpId(String wfpId) {
		this.wfpId = wfpId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof WfPiPK)) {
			return false;
		}
		WfPiPK castOther = (WfPiPK)other;
		return 
			this.wfpiId.equals(castOther.wfpiId)
			&& this.wfpId.equals(castOther.wfpId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.wfpiId.hashCode();
		hash = hash * prime + this.wfpId.hashCode();
		
		return hash;
	}
}