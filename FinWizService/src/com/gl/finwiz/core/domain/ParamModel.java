package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_MODEL database table.
 * 
 */
@Entity
@Table(name="PARAM_MODEL")
@NamedQuery(name="ParamModel.findAll", query="SELECT p FROM ParamModel p")
public class ParamModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ParamModelPK id;

	@Column(name="FIN_ID")
	private String finId;

	@Column(name="MODEL_DESC")
	private String modelDesc;

	//bi-directional many-to-one association to ParamBrand
	@ManyToOne
	@JoinColumn(name="BRAND_ID",insertable=false,updatable=false)
	private ParamBrand paramBrand;

	public ParamModel() {
	}

	public ParamModelPK getId() {
		return this.id;
	}

	public void setId(ParamModelPK id) {
		this.id = id;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

	public String getModelDesc() {
		return this.modelDesc;
	}

	public void setModelDesc(String modelDesc) {
		this.modelDesc = modelDesc;
	}

	public ParamBrand getParamBrand() {
		return this.paramBrand;
	}

	public void setParamBrand(ParamBrand paramBrand) {
		this.paramBrand = paramBrand;
	}

}