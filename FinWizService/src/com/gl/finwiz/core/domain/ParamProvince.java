package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_PROVINCE database table.
 * 
 */
@Entity
@Table(name="PARAM_PROVINCE")
@NamedQuery(name="ParamProvince.findAll", query="SELECT p FROM ParamProvince p")
public class ParamProvince implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DISTRICT_ID")
	private String districtId;

	@Column(name="DISTRICT_DESC")
	private String districtDesc;

	@Column(name="IN_ID")
	private String inId;

	public ParamProvince() {
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

	public String getInId() {
		return this.inId;
	}

	public void setInId(String inId) {
		this.inId = inId;
	}

}