package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_DISTRICT database table.
 * 
 */
@Entity
@Table(name="PARAM_DISTRICT")
@NamedQuery(name="ParamDistrict.findAll", query="SELECT p FROM ParamDistrict p")
public class ParamDistrict implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DISTRICT_ID")
	private String districtId;

	@Column(name="DISTRICT_DESC")
	private String districtDesc;

	@Column(name="FIN_ID")
	private String finId;

	public ParamDistrict() {
	}

	public String getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getDistrictDesc() {
		return this.districtDesc;
	}

	public void setDistrictDesc(String districtDesc) {
		this.districtDesc = districtDesc;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

}