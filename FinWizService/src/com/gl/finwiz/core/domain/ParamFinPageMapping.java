package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_FIN_PAGE_MAPPING database table.
 * 
 */
@Entity
@Table(name="PARAM_FIN_PAGE_MAPPING")
@NamedQuery(name="ParamFinPageMapping.findAll", query="SELECT p FROM ParamFinPageMapping p")
public class ParamFinPageMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ParamFinPageMappingPK id;

	@Column(name="JAVA_CONTROLLER")
	private String javaController;

	//bi-directional many-to-one association to ParamFinMapping
	@ManyToOne
	@JoinColumn(name="FIN_ID",insertable=false,updatable=false)
	private ParamFinMapping paramFinMapping;

	//bi-directional many-to-one association to ParamPage
	@ManyToOne
	@JoinColumn(name="PAGE_ID",insertable=false,updatable=false)
	private ParamPage paramPage;

	public ParamFinPageMapping() {
	}

	public ParamFinPageMappingPK getId() {
		return this.id;
	}

	public void setId(ParamFinPageMappingPK id) {
		this.id = id;
	}

	public String getJavaController() {
		return this.javaController;
	}

	public void setJavaController(String javaController) {
		this.javaController = javaController;
	}

	public ParamFinMapping getParamFinMapping() {
		return this.paramFinMapping;
	}

	public void setParamFinMapping(ParamFinMapping paramFinMapping) {
		this.paramFinMapping = paramFinMapping;
	}

	public ParamPage getParamPage() {
		return this.paramPage;
	}

	public void setParamPage(ParamPage paramPage) {
		this.paramPage = paramPage;
	}

}