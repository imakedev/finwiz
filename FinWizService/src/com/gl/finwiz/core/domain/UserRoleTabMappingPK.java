package com.gl.finwiz.core.domain;

import java.io.Serializable;

import javax.persistence.*;

/**
 * The primary key class for the USER_ROLE_TAB_MAPPING database table.
 * 
 */
@Embeddable
public class UserRoleTabMappingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PAGE_ID", insertable=false, updatable=false)
	private String pageId;

	@Column(name="TAB_ID", insertable=false, updatable=false)
	private String tabId;
	
	@Column(name="ROLE_ID", insertable=false, updatable=false)
	private String roleId;


	public UserRoleTabMappingPK() {
	}
	public String getPageId() {
		return this.pageId;
	}
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
	public String getTabId() {
		return this.tabId;
	}
	public void setTabId(String tabId) {
		this.tabId = tabId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	

	
}