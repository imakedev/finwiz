package com.gl.finwiz.core.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="USER_ROLE_MAPPING")
public class UserRoleMapping  implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private UserRoleMappingPK id;
	public UserRoleMappingPK getId() {
		return id;
	}
	public void setId(UserRoleMappingPK id) {
		this.id = id;
	}
}
