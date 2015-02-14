package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the PARAM_SYS_OBJECT database table.
 * 
 */
@Embeddable
public class ParamSysObjectPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SYS_OBJECT_ID")
	private String sysObjectId;

	@Column(name="FIN_ID", insertable=false, updatable=false)
	private String finId;

	public ParamSysObjectPK() {
	}
	public String getSysObjectId() {
		return this.sysObjectId;
	}
	public void setSysObjectId(String sysObjectId) {
		this.sysObjectId = sysObjectId;
	}
	public String getFinId() {
		return this.finId;
	}
	public void setFinId(String finId) {
		this.finId = finId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ParamSysObjectPK)) {
			return false;
		}
		ParamSysObjectPK castOther = (ParamSysObjectPK)other;
		return 
			this.sysObjectId.equals(castOther.sysObjectId)
			&& this.finId.equals(castOther.finId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.sysObjectId.hashCode();
		hash = hash * prime + this.finId.hashCode();
		
		return hash;
	}
}