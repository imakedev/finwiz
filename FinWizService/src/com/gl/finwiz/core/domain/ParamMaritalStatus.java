package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_MARITAL_STATUS database table.
 * 
 */
@Entity
@Table(name="PARAM_MARITAL_STATUS")
@NamedQuery(name="ParamMaritalStatus.findAll", query="SELECT p FROM ParamMaritalStatus p")
public class ParamMaritalStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MARITAL_STATUS_ID")
	private String maritalStatusId;

	@Column(name="FIN_ID")
	private String finId;

	@Column(name="MARITAL_STATUS_DESC")
	private String maritalStatusDesc;

	public ParamMaritalStatus() {
	}

	public String getMaritalStatusId() {
		return this.maritalStatusId;
	}

	public void setMaritalStatusId(String maritalStatusId) {
		this.maritalStatusId = maritalStatusId;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

	public String getMaritalStatusDesc() {
		return this.maritalStatusDesc;
	}

	public void setMaritalStatusDesc(String maritalStatusDesc) {
		this.maritalStatusDesc = maritalStatusDesc;
	}

}