package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_LOS_ID_TYPE database table.
 * 
 */
@Entity
@Table(name="PARAM_LOS_ID_TYPE")
@NamedQuery(name="ParamLosIdType.findAll", query="SELECT p FROM ParamLosIdType p")
public class ParamLosIdType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TYPE_ID")
	private String idTypeId;

	@Column(name="FIN_ID")
	private String finId;

	@Column(name="ID_TYPE_DESC")
	private String idTypeDesc;

	public ParamLosIdType() {
	}

	public String getIdTypeId() {
		return this.idTypeId;
	}

	public void setIdTypeId(String idTypeId) {
		this.idTypeId = idTypeId;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

	public String getIdTypeDesc() {
		return this.idTypeDesc;
	}

	public void setIdTypeDesc(String idTypeDesc) {
		this.idTypeDesc = idTypeDesc;
	}

}