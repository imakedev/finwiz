package com.gl.finwiz.core.model;

import java.io.Serializable;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("paramSubFormM")
public class ParamSubFormM extends FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;
	private String paramSubFormId;

	private String pageId;
	private String formPath;
	public String getParamSubFormId() {
		return paramSubFormId;
	}
	public void setParamSubFormId(String paramSubFormId) {
		this.paramSubFormId = paramSubFormId;
	}
	
	public String getPageId() {
		return pageId;
	}
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
	public String getFormPath() {
		return formPath;
	}
	public void setFormPath(String formPath) {
		this.formPath = formPath;
	}

}
