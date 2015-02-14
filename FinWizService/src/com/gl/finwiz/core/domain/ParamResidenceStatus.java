package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_RESIDENCE_STATUS database table.
 * 
 */
@Entity
@Table(name="PARAM_RESIDENCE_STATUS")
@NamedQuery(name="ParamResidenceStatus.findAll", query="SELECT p FROM ParamResidenceStatus p")
public class ParamResidenceStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RESIDENCE_STATUS_ID")
	private String residenceStatusId;

	@Column(name="FIN_ID")
	private String finId;

	@Column(name="RESIDENCE_STATUS_DESC")
	private String residenceStatusDesc;

	public ParamResidenceStatus() {
	}

	public String getResidenceStatusId() {
		return this.residenceStatusId;
	}

	public void setResidenceStatusId(String residenceStatusId) {
		this.residenceStatusId = residenceStatusId;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

	public String getResidenceStatusDesc() {
		return this.residenceStatusDesc;
	}

	public void setResidenceStatusDesc(String residenceStatusDesc) {
		this.residenceStatusDesc = residenceStatusDesc;
	}

}