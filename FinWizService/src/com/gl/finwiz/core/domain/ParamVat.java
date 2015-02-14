package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the PARAM_VAT database table.
 * 
 */
@Entity
@Table(name="PARAM_VAT")
@NamedQuery(name="ParamVat.findAll", query="SELECT p FROM ParamVat p")
public class ParamVat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VAT_ID")
	private String vatId;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Date endDate;

	@Column(name="FIN_ID")
	private String finId;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	private Date startDate;

	@Column(name="VAT_AMOUNT")
	private double vatAmount;

	public ParamVat() {
	}

	public String getVatId() {
		return this.vatId;
	}

	public void setVatId(String vatId) {
		this.vatId = vatId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public double getVatAmount() {
		return this.vatAmount;
	}

	public void setVatAmount(double vatAmount) {
		this.vatAmount = vatAmount;
	}

}