package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LOS_ASSET database table.
 * 
 */
@Entity
@Table(name="LOS_ASSET")
@NamedQuery(name="LosAsset.findAll", query="SELECT l FROM LosAsset l")
public class LosAsset implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LosAssetPK id;

	@Column(name="ASSET_TYPE")
	private String assetType;

	private String brand;

	private String grade;

	@Column(name="MARKETING_NAME")
	private String marketingName;

	private String model;

	@Column(name="WHOLE_SALE_PRICE")
	private double wholeSalePrice;

	//bi-directional many-to-one association to LosApplication
	@ManyToOne
	@JoinColumn(name="LOS_APP_ID",insertable=false,updatable=false)
	private LosApplication losApplication;

	public LosAsset() {
	}

	public LosAssetPK getId() {
		return this.id;
	}

	public void setId(LosAssetPK id) {
		this.id = id;
	}

	public String getAssetType() {
		return this.assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMarketingName() {
		return this.marketingName;
	}

	public void setMarketingName(String marketingName) {
		this.marketingName = marketingName;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getWholeSalePrice() {
		return this.wholeSalePrice;
	}

	public void setWholeSalePrice(double wholeSalePrice) {
		this.wholeSalePrice = wholeSalePrice;
	}

	public LosApplication getLosApplication() {
		return this.losApplication;
	}

	public void setLosApplication(LosApplication losApplication) {
		this.losApplication = losApplication;
	}

}