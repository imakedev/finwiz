package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_LOS_APP_STATUS database table.
 * 
 */
@Entity
@Table(name="PARAM_LOS_APP_STATUS")
@NamedQuery(name="ParamLosAppStatus.findAll", query="SELECT p FROM ParamLosAppStatus p")
public class ParamLosAppStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="APP_STATUS_ID")
	private String appStatusId;

	@Column(name="APP_STATUS_DESC")
	private String appStatusDesc;

	@Column(name="FIN_ID")
	private String finId;

	public ParamLosAppStatus() {
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