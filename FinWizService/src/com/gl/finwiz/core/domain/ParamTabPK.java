package com.gl.finwiz.core.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the PARAM_TAB database table.
 * 
 */
@Embeddable
public class ParamTabPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TAB_ID")
	private String tabId;

	/*@Column(name="PAGE_ID", insertable=false, updatable=false)
	private String pageId;*/

	public ParamTabPK() {
	}
	public String getTabId() {
		return this.tabId;
	}
	public void setTabId(String tabId) {
		this.tabId = tabId;
	}


	
}