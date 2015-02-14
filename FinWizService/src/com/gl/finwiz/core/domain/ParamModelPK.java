package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the PARAM_MODEL database table.
 * 
 */
@Embeddable
public class ParamModelPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="MODEL_ID")
	private String modelId;

	@Column(name="BRAND_ID", insertable=false, updatable=false)
	private String brandId;

	public ParamModelPK() {
	}
	public String getModelId() {
		return this.modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ParamModelPK)) {
			return false;
		}
		ParamModelPK castOther = (ParamModelPK)other;
		return 
			this.modelId.equals(castOther.modelId)
			&& this.brandId.equals(castOther.brandId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.modelId.hashCode();
		hash = hash * prime + this.brandId.hashCode();
		
		return hash;
	}
}