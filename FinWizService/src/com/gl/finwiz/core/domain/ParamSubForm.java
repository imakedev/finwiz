package com.gl.finwiz.core.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="PARAM_SUBFORM")
public class ParamSubForm implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private ParamSubFormPK id;

	@Column(name="FORM_PATH")
	private String formPath;

	//bi-directional many-to-one association to ParamPage
	/*@ManyToOne
	@JoinColumn(name="PAGE_ID",insertable=false,updatable=false)
	private ParamPage paramPage;*/

	public ParamSubFormPK getId() {
		return id;
	}

	public void setId(ParamSubFormPK id) {
		this.id = id;
	}

	public String getFormPath() {
		return formPath;
	}

	public void setFormPath(String formPath) {
		this.formPath = formPath;
	}


}
