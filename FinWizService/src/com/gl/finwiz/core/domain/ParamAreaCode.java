package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_AREA_CODE database table.
 * 
 */
@Entity
@Table(name="PARAM_AREA_CODE")
@NamedQuery(name="ParamAreaCode.findAll", query="SELECT p FROM ParamAreaCode p")
public class ParamAreaCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AREA_CODE_ID")
	private String areaCodeId;

	@Column(name="AREA_CODE_DESCRIPTION")
	private String areaCodeDescription;

	@Column(name="FIN_ID")
	private String finId;

	public ParamAreaCode() {
	}

	public String getAreaCodeId() {
		return this.areaCodeId;
	}

	public void setAreaCodeId(String areaCodeId) {
		this.areaCodeId = areaCodeId;
	}

	public String getAreaCodeDescription() {
		return this.areaCodeDescription;
	}

	public void setAreaCodeDescription(String areaCodeDescription) {
		this.areaCodeDescription = areaCodeDescription;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

}