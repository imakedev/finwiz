package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_ADDRESS_TYPE database table.
 * 
 */
@Entity
@Table(name="PARAM_ADDRESS_TYPE")
@NamedQuery(name="ParamAddressType.findAll", query="SELECT p FROM ParamAddressType p")
public class ParamAddressType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ADDRESS_TYPE_ID")
	private String addressTypeId;

	@Column(name="ADDRESS_TYPE_DESC")
	private String addressTypeDesc;

	@Column(name="FIN_ID")
	private String finId;

	public ParamAddressType() {
	}

	public String getAddressTypeId() {
		return this.addressTypeId;
	}

	public void setAddressTypeId(String addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public String getAddressTypeDesc() {
		return this.addressTypeDesc;
	}

	public void setAddressTypeDesc(String addressTypeDesc) {
		this.addressTypeDesc = addressTypeDesc;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

}