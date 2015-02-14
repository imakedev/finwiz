package com.gl.finwiz.core.model;

import java.io.Serializable;
import java.util.List;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("paramPageM")
public class ParamPageM extends FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String pageId;

	private String menuName;
	private String menuIcon;
	private String pagePath;

	private String roleId;
	private List<ParamTabM> paramTabs;
	private List<ParamSubFormM> paramSubForms;
	

	public ParamPageM() {
	}

	public String getPageId() {
		return this.pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getPagePath() {
		return this.pagePath;
	}

	public void setPagePath(String pagePath) {
		this.pagePath = pagePath;
	}

	public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}

	public List<ParamTabM> getParamTabs() {
		return paramTabs;
	}

	public void setParamTabs(List<ParamTabM> paramTabs) {
		this.paramTabs = paramTabs;
	}

	public List<ParamSubFormM> getParamSubForms() {
		return paramSubForms;
	}

	public void setParamSubForms(List<ParamSubFormM> paramSubForms) {
		this.paramSubForms = paramSubForms;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}


}