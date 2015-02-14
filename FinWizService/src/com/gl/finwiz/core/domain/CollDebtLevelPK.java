package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COLL_DEBT_LEVEL database table.
 * 
 */
@Embeddable
public class CollDebtLevelPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="COLL_DEBT_LEVEL_ID")
	private String collDebtLevelId;

	@Column(name="COLL_DEPARTMENT_ID", insertable=false, updatable=false)
	private String collDepartmentId;

	public CollDebtLevelPK() {
	}
	public String getCollDebtLevelId() {
		return this.collDebtLevelId;
	}
	public void setCollDebtLevelId(String collDebtLevelId) {
		this.collDebtLevelId = collDebtLevelId;
	}
	public String getCollDepartmentId() {
		return this.collDepartmentId;
	}
	public void setCollDepartmentId(String collDepartmentId) {
		this.collDepartmentId = collDepartmentId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CollDebtLevelPK)) {
			return false;
		}
		CollDebtLevelPK castOther = (CollDebtLevelPK)other;
		return 
			this.collDebtLevelId.equals(castOther.collDebtLevelId)
			&& this.collDepartmentId.equals(castOther.collDepartmentId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.collDebtLevelId.hashCode();
		hash = hash * prime + this.collDepartmentId.hashCode();
		
		return hash;
	}
}