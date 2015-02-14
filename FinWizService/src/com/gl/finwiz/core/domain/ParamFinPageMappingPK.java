package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the PARAM_FIN_PAGE_MAPPING database table.
 * 
 */
@Embeddable
public class ParamFinPageMappingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PAGE_ID", insertable=false, updatable=false)
	private String pageId;

	@Column(name="FIN_ID", insertable=false, updatable=false)
	private String finId;

	public ParamFinPageMappingPK() {
	}
	public String getPageId() {
		return this.pageId;
	}
	public void setPageId(String pageId) {
		this.pageId = pageId;
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
		if (!(other instanceof ParamFinPageMappingPK)) {
			return false;
		}
		ParamFinPageMappingPK castOther = (ParamFinPageMappingPK)other;
		return 
			this.pageId.equals(castOther.pageId)
			&& this.finId.equals(castOther.finId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.pageId.hashCode();
		hash = hash * prime + this.finId.hashCode();
		
		return hash;
	}
}