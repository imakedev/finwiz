package com.gl.finwiz.core.model;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("pageM")
public class PageM implements Serializable {
	private static final long serialVersionUID = 1L;
	private String pageName;
	private String controller;
	private List<String> subForms;
	private List<String> tabs;
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public List<String> getSubForms() {
		return subForms;
	}
	public void setSubForms(List<String> subForms) {
		this.subForms = subForms;
	}
	public List<String> getTabs() {
		return tabs;
	}
	public void setTabs(List<String> tabs) {
		this.tabs = tabs;
	}
	public String getController() {
		return controller;
	}
	public void setController(String controller) {
		this.controller = controller;
	}
	
}
