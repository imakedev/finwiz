package com.gl.finwiz.core.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the USER_ROLE database table.
 * 
 */
@Entity
@Table(name="USER_ROLE_MENU_MAPPING")
public class UserRoleMenuMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserRoleMenuMappingPK id;

	public UserRoleMenuMappingPK getId() {
		return id;
	}

	public void setId(UserRoleMenuMappingPK id) {
		this.id = id;
	}

}
