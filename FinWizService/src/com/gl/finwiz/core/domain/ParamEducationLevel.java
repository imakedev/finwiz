package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_EDUCATION_LEVEL database table.
 * 
 */
@Entity
@Table(name="PARAM_EDUCATION_LEVEL")
@NamedQuery(name="ParamEducationLevel.findAll", query="SELECT p FROM ParamEducationLevel p")
public class ParamEducationLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EDUCATION_LEVEL_ID")
	private String educationLevelId;

	@Column(name="EDUCATION_LEVEL_DESC")
	private String educationLevelDesc;

	@Column(name="FIN_ID")
	private String finId;

	public ParamEducationLevel() {
	}

	public String getEducationLevelId() {
		return this.educationLevelId;
	}

	public void setEducationLevelId(String educationLevelId) {
		this.educationLevelId = educationLevelId;
	}

	public String getEducationLevelDesc() {
		return this.educationLevelDesc;
	}

	public void setEducationLevelDesc(String educationLevelDesc) {
		this.educationLevelDesc = educationLevelDesc;
	}

	public String getFinId() {
		return this.finId;
	}

	public void setFinId(String finId) {
		this.finId = finId;
	}

}