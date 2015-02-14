package com.gl.finwiz.core.model;

import java.io.Serializable;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("paramFinMappingM")
public class ParamFinMappingM extends FinWizXML  implements Serializable {
	private static final long serialVersionUID = 1L;

	private String finId;

	private String companyId;

	private String countryId;

	private String productId;

	

	public ParamFinMappingM() {
	}



	public String getFinId() {
		return finId;
	}



	public void setFinId(String finId) {
		this.finId = finId;
	}



	public String getCompanyId() {
		return companyId;
	}



	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}



	public String getCountryId() {
		return countryId;
	}



	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}



	public String getProductId() {
		return productId;
	}



	public void setProductId(String productId) {
		this.productId = productId;
	}

}