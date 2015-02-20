package com.gl.finwiz.core.los.model;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;


@XStreamAlias("ParamLosAppStatusM")
public class ParamLosAppStatusM implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String appStatusId;

	private String appStatusDesc;

	private String finId;

	public ParamLosAppStatusM() {
	}

	public String getAppStatusId() {
		return this.appStatusId;
	}

	public void setAppStatusId(String appStatusId) {
		this.appStatusId = appStatusId;
	}

	public String getAppStatusDesc() {
		return this.appStatusDesc;
	}

	public void setAppStatusDesc(String appStatusDesc) {
		this.appStatusDesc = appStatusDesc;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

}