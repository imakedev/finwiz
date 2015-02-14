package com.gl.finwiz.core.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the PARAM_TAB database table.
 * 
 */
@Entity
@Table(name="PARAM_TAB")
@NamedQuery(name="ParamTab.findAll", query="SELECT p FROM ParamTab p")
public class ParamTab implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ParamTabPK id;
	@Column(name="PAGE_ID")
	private String pageId;
	@Column(name="TAB_PATH")
	private String tabPath;

/*	//bi-directional many-to-one association to ParamPage
	@ManyToOne
	@JoinColumn(name="PAGE_ID",insertable=false,updatable=false)
	private ParamPage paramPage;*/

	public ParamTab() {
	}

	public ParamTabPK getId() {
		return this.id;
	}

	public void setId(ParamTabPK id) {
		this.id = id;
	}

	public String getTabPath() {
		return this.tabPath;
	}

	public void setTabPath(String tabPath) {
		this.tabPath = tabPath;
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}



}