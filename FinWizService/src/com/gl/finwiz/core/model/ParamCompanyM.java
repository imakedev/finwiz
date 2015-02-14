package com.gl.finwiz.core.model;

import java.io.Serializable;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("paramCompanyM")
public class ParamCompanyM extends FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;

	private String companyId;

	private String companyName;

	private String companyShortName;


	public ParamCompanyM() {
	}

	public String getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyShortName() {
		return this.companyShortName;
	}

	public void setCompanyShortName(String companyShortName) {
		this.companyShortName = companyShortName;
	}

	
}