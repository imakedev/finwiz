package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM_PRODUCT database table.
 * 
 */
@Entity
@Table(name="PARAM_PRODUCT")
@NamedQuery(name="ParamProduct.findAll", query="SELECT p FROM ParamProduct p")
public class ParamProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRODUCT_ID")
	private String productId;

	@Column(name="PRODUCT_DESC")
	private String productDesc;

	@Column(name="PRODUCT_NAME")
	private String productName;

	public ParamProduct() {
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductDesc() {
		return this.productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}