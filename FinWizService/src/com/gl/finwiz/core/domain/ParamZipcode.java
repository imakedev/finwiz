package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_ZIPCODE database table.
 * 
 */
@Entity
@Table(name="PARAM_ZIPCODE")
@NamedQuery(name="ParamZipcode.findAll", query="SELECT p FROM ParamZipcode p")
public class ParamZipcode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ZIPCODE_ID")
	private String zipcodeId;

	@Column(name="FIN_ID")
	private String finId;

	@Column(name="ZIPCODE_DESC")
	private String zipcodeDesc;

	public ParamZipcode() {
	}

	public String getZipcodeId() {
		return this.zipcodeId;
	}

	public void setZipcodeId(String zipcodeId) {
		this.zipcodeId = zipcodeId;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

	public String getZipcodeDesc() {
		return this.zipcodeDesc;
	}

	public void setZipcodeDesc(String zipcodeDesc) {
		this.zipcodeDesc = zipcodeDesc;
	}

}