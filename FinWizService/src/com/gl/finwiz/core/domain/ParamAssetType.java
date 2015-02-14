package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_ASSET_TYPE database table.
 * 
 */
@Entity
@Table(name="PARAM_ASSET_TYPE")
@NamedQuery(name="ParamAssetType.findAll", query="SELECT p FROM ParamAssetType p")
public class ParamAssetType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ASSET_TYPE_ID")
	private String assetTypeId;

	@Column(name="ASSET_TYPE_DESC")
	private String assetTypeDesc;

	@Column(name="FIN_ID")
	private String finId;

	public ParamAssetType() {
	}

	public String getAssetTypeId() {
		return this.assetTypeId;
	}

	public void setAssetTypeId(String assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public String getAssetTypeDesc() {
		return this.assetTypeDesc;
	}

	public void setAssetTypeDesc(String assetTypeDesc) {
		this.assetTypeDesc = assetTypeDesc;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

}