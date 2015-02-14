package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_PHONE_TYPE database table.
 * 
 */
@Entity
@Table(name="PARAM_PHONE_TYPE")
@NamedQuery(name="ParamPhoneType.findAll", query="SELECT p FROM ParamPhoneType p")
public class ParamPhoneType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PHONE_TYPE_ID")
	private String phoneTypeId;

	@Column(name="FIN_ID")
	private String finId;

	@Column(name="PHONE_TYPE_DESC")
	private String phoneTypeDesc;

	public ParamPhoneType() {
	}

	public String getPhoneTypeId() {
		return this.phoneTypeId;
	}

	public void setPhoneTypeId(String phoneTypeId) {
		this.phoneTypeId = phoneTypeId;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

	public String getPhoneTypeDesc() {
		return this.phoneTypeDesc;
	}

	public void setPhoneTypeDesc(String phoneTypeDesc) {
		this.phoneTypeDesc = phoneTypeDesc;
	}

}