package com.gl.finwiz.core.model;

import java.io.Serializable;
import java.util.Date;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("userRoleM")
public class UserRoleM extends FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;

	private String roleId;

	private String finId;
	
	private String createdBy;

	private Date createdDate;

	private String roleDesc;

	private String roleName;

	private String updatedBy;

	private Date updatedDate;

	
	private ParamFinMappingM paramFinMapping;

	public UserRoleM() {
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getFinId() {
		return finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public ParamFinMappingM getParamFinMapping() {
		return paramFinMapping;
	}

	public void setParamFinMapping(ParamFinMappingM paramFinMapping) {
		this.paramFinMapping = paramFinMapping;
	}


}