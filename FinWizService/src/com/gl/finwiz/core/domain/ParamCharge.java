package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_CHARGE database table.
 * 
 */
@Entity
@Table(name="PARAM_CHARGE")
@NamedQuery(name="ParamCharge.findAll", query="SELECT p FROM ParamCharge p")
public class ParamCharge implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PARAM_CHARGE_ID")
	private String paramChargeId;

	@Column(name="CHARGE_AMOUNT")
	private double chargeAmount;

	@Column(name="CHARGE_CODE")
	private String chargeCode;

	@Column(name="CHARGE_DESCRIPTION")
	private String chargeDescription;

	@Column(name="FIN_ID")
	private String finId;

	public ParamCharge() {
	}

	public String getParamChargeId() {
		return this.paramChargeId;
	}

	public void setParamChargeId(String paramChargeId) {
		this.paramChargeId = paramChargeId;
	}

	public double getChargeAmount() {
		return this.chargeAmount;
	}

	public void setChargeAmount(double chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public String getChargeCode() {
		return this.chargeCode;
	}

	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	public String getChargeDescription() {
		return this.chargeDescription;
	}

	public void setChargeDescription(String chargeDescription) {
		this.chargeDescription = chargeDescription;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

}