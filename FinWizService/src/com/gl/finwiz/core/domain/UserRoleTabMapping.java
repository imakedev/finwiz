package com.gl.finwiz.core.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the USER_ROLE_TAB_MAPPING database table.
 * 
 */
@Entity
@Table(name="USER_ROLE_TAB_MAPPING")
@NamedQuery(name="UserRoleTabMapping.findAll", query="SELECT u FROM UserRoleTabMapping u")
public class UserRoleTabMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserRoleTabMappingPK id;

	
	//bi-directional many-to-one association to ParamPage
	@ManyToOne
	@JoinColumn(name="PAGE_ID",insertable=false,updatable=false)
	private ParamPage paramPage;

	//bi-directional many-to-one association to ParamTab
	/*@ManyToOne
	@JoinColumn(name="TAB_ID")
	private ParamTab paramTab;*/

	public UserRoleTabMapping() {
	}

	public UserRoleTabMappingPK getId() {
		return this.id;
	}

	public void setId(UserRoleTabMappingPK id) {
		this.id = id;
	}

	
	public ParamPage getParamPage() {
		return this.paramPage;
	}

	public void setParamPage(ParamPage paramPage) {
		this.paramPage = paramPage;
	}



}