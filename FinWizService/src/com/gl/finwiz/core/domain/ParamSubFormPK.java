package com.gl.finwiz.core.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * The primary key class for the PARAM_TAB database table.
 * 
 */
@Embeddable
public class ParamSubFormPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SUBFORM_ID")
	private String paramSubFormId;


	@Column(name="PAGE_ID", insertable=false, updatable=false)
	private String pageId;

	public ParamSubFormPK() {
	}

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

	

}
