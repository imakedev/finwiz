package com.gl.finwiz.core.model;

import java.io.Serializable;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("paramCountryM")
public class ParamCountryM extends FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;

	private String countryId;

	
	private String countryName;


	public ParamCountryM() {
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	
}