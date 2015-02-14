package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PARAM_BRAND database table.
 * 
 */
@Entity
@Table(name="PARAM_BRAND")
@NamedQuery(name="ParamBrand.findAll", query="SELECT p FROM ParamBrand p")
public class ParamBrand implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BRAND_ID")
	private String brandId;

	@Column(name="BRAND_DESC")
	private String brandDesc;

	@Column(name="FIN_ID")
	private String finId;

	//bi-directional many-to-one association to ParamModel
	@OneToMany(mappedBy="paramBrand")
	private List<ParamModel> paramModels;

	public ParamBrand() {
	}

	public String getBrandId() {
		return this.brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandDesc() {
		return this.brandDesc;
	}

	public void setBrandDesc(String brandDesc) {
		this.brandDesc = brandDesc;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

	public List<ParamModel> getParamModels() {
		return this.paramModels;
	}

	public void setParamModels(List<ParamModel> paramModels) {
		this.paramModels = paramModels;
	}

	public ParamModel addParamModel(ParamModel paramModel) {
		getParamModels().add(paramModel);
		paramModel.setParamBrand(this);

		return paramModel;
	}

	public ParamModel removeParamModel(ParamModel paramModel) {
		getParamModels().remove(paramModel);
		paramModel.setParamBrand(null);

		return paramModel;
	}

}