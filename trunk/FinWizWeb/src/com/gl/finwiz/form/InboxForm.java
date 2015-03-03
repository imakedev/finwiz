package com.gl.finwiz.form;

import java.util.List;

import com.gl.finwiz.core.los.model.LosApplicationM;

public class InboxForm {
	String action;
	String applicationId;
	String dealerId;
	String appStatusDesc;
	List<InboxForm> aaData;

	public List<InboxForm> getAaData() {
		return aaData;
	}

	public void setAaData(List<InboxForm> aaData) {
		this.aaData = aaData;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public String getAppStatusDesc() {
		return appStatusDesc;
	}

	public void setAppStatusDesc(String appStatusDesc) {
		this.appStatusDesc = appStatusDesc;
	}

}
