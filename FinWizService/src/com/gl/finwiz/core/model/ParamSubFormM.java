package com.gl.finwiz.core.model;

import java.io.Serializable;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.gl.finwiz.core.xstream.common.Paging;
import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("paramSubFormM")
public class ParamSubFormM extends FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;
	private String paramSubFormId;

	private String pageId;
	private Paging paging;
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
	
	public Paging getPaging() {
		return paging;
	}
	public void setPagging(Paging pagging) {
		this.paging = pagging;
	}

}
