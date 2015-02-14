package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_PREFIX database table.
 * 
 */
@Entity
@Table(name="PARAM_PREFIX")
@NamedQuery(name="ParamPrefix.findAll", query="SELECT p FROM ParamPrefix p")
public class ParamPrefix implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PREFIX_ID")
	private String prefixId;

	@Column(name="FIN_DESC")
	private String finDesc;

	@Column(name="FIN_ID")
	private String finId;

	public ParamPrefix() {
	}

	public String getPrefixId() {
		return this.prefixId;
	}

	public void setPrefixId(String prefixId) {
		this.prefixId = prefixId;
	}

	public String getFinDesc() {
		return this.finDesc;
	}

	public void setFinDesc(String finDesc) {
		this.finDesc = finDesc;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

}