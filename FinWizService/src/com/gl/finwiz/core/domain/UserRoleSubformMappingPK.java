package com.gl.finwiz.core.domain;

import java.io.Serializable;

import javax.persistence.*;

/**
 * The primary key class for the USER_ROLE_SUBFORM_MAPPING database table.
 * 
 */
@Embeddable
public class UserRoleSubformMappingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SUBFORM_ID", insertable=false, updatable=false)
	private String subformId;

	@Column(name="PAGE_ID", insertable=false, updatable=false)
	private String pageId;
	@Column(name="ROLE_ID", insertable=false, updatable=false)
	private String roleId;
	public UserRoleSubformMappingPK() {
	}
	public String getSubformId() {
		return this.subformId;
	}
	public void setSubformId(String subformId) {
		this.subformId = subformId;
	}
	public String getPageId() {
		return this.pageId;
	}
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	
}