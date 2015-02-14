package com.gl.finwiz.core.model;

import java.io.Serializable;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;


/**
 * The persistent class for the PARAM_TAB database table.
 * 
 */
@XStreamAlias("paramTabM")
public class ParamTabM extends FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;
	private String tabId;
	private String pageId;
	private String tabPath;

	private ParamPageM paramPage;

	public String getTabId() {
		return tabId;
	}

	public void setTabId(String tabId) {
		this.tabId = tabId;
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getTabPath() {
		return tabPath;
	}

	public void setTabPath(String tabPath) {
		this.tabPath = tabPath;
	}

	public ParamPageM getParamPage() {
		return paramPage;
	}

	public void setParamPage(ParamPageM paramPage) {
		this.paramPage = paramPage;
	}


}