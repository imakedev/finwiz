package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_LOS_DOC_TYPE database table.
 * 
 */
@Entity
@Table(name="PARAM_LOS_DOC_TYPE")
@NamedQuery(name="ParamLosDocType.findAll", query="SELECT p FROM ParamLosDocType p")
public class ParamLosDocType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DOC_TYPE_ID")
	private String docTypeId;

	@Column(name="DO_TYPE_DESC")
	private String doTypeDesc;

	@Column(name="FIN_ID")
	private String finId;

	public ParamLosDocType() {
	}

	public String getDocTypeId() {
		return this.docTypeId;
	}

	public void setDocTypeId(String docTypeId) {
		this.docTypeId = docTypeId;
	}

	public String getDoTypeDesc() {
		return this.doTypeDesc;
	}

	public void setDoTypeDesc(String doTypeDesc) {
		this.doTypeDesc = doTypeDesc;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

}