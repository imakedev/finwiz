package com.gl.finwiz.core.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the USER_ROLE_SUBFORM_MAPPING database table.
 * 
 */
@Entity
@Table(name="USER_ROLE_SUBFORM_MAPPING")
@NamedQuery(name="UserRoleSubformMapping.findAll", query="SELECT u FROM UserRoleSubformMapping u")
public class UserRoleSubformMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserRoleSubformMappingPK id;

	

	//bi-directional many-to-one association to ParamPage
	@ManyToOne
	@JoinColumn(name="PAGE_ID",insertable=false,updatable=false)
	private ParamPage paramPage;

	//bi-directional many-to-one association to ParamSubform
	/*@ManyToOne
	@JoinColumn(name="SUBFORM_ID")
	private ParamSubForm paramSubform;*/

	public UserRoleSubformMapping() {
	}

	public UserRoleSubformMappingPK getId() {
		return this.id;
	}

	public void setId(UserRoleSubformMappingPK id) {
		this.id = id;
	}

	

	public ParamPage getParamPage() {
		return this.paramPage;
	}

	public void setParamPage(ParamPage paramPage) {
		this.paramPage = paramPage;
	}

/*s*/

}