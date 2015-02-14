package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LOS_ADDRESS database table.
 * 
 */
@Entity
@Table(name="LOS_ADDRESS")
@NamedQuery(name="LosAddress.findAll", query="SELECT l FROM LosAddress l")
public class LosAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LOS_ADDRESS_ID")
	private String losAddressId;

	@Column(name="ADDRESS_TYPE")
	private String addressType;

	private String district;

	@Column(name="LIVING_MONTH")
	private int livingMonth;

	@Column(name="LIVING_YEAR")
	private int livingYear;

	@Column(name="LOS_CUSTOMER_ID")
	private String losCustomerId;

	@Column(name="LOS_INCOME_ID")
	private String losIncomeId;

	private String moo;

	@Column(name="NUMBER_BUILDING")
	private String numberBuilding;

	private String province;

	@Column(name="RESIDENCE_STATUS")
	private String residenceStatus;

	@Column(name="SAME_AS")
	private int sameAs;

	@Column(name="SAME_AS_ID")
	private String sameAsId;

	private String soi;

	private String street1;

	private String street2;

	private String subdistrict;

	@Column(name="VER_ADDRESS_STATUS")
	private int verAddressStatus;

	private String zipcode;

	public LosAddress() {
	}

	public String getLosAddressId() {
		return this.losAddressId;
	}

	public void setLosAddressId(String losAddressId) {
		this.losAddressId = losAddressId;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getLivingMonth() {
		return this.livingMonth;
	}

	public void setLivingMonth(int livingMonth) {
		this.livingMonth = livingMonth;
	}

	public int getLivingYear() {
		return this.livingYear;
	}

	public void setLivingYear(int livingYear) {
		this.livingYear = livingYear;
	}

	public String getLosCustomerId() {
		return this.losCustomerId;
	}

	public void setLosCustomerId(String losCustomerId) {
		this.losCustomerId = losCustomerId;
	}

	public String getLosIncomeId() {
		return this.losIncomeId;
	}

	public void setLosIncomeId(String losIncomeId) {
		this.losIncomeId = losIncomeId;
	}

	public String getMoo() {
		return this.moo;
	}

	public void setMoo(String moo) {
		this.moo = moo;
	}

	public String getNumberBuilding() {
		return this.numberBuilding;
	}

	public void setNumberBuilding(String numberBuilding) {
		this.numberBuilding = numberBuilding;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getResidenceStatus() {
		return this.residenceStatus;
	}

	public void setResidenceStatus(String residenceStatus) {
		this.residenceStatus = residenceStatus;
	}

	public int getSameAs() {
		return this.sameAs;
	}

	public void setSameAs(int sameAs) {
		this.sameAs = sameAs;
	}

	public String getSameAsId() {
		return this.sameAsId;
	}

	public void setSameAsId(String sameAsId) {
		this.sameAsId = sameAsId;
	}

	public String getSoi() {
		return this.soi;
	}

	public void setSoi(String soi) {
		this.soi = soi;
	}

	public String getStreet1() {
		return this.street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return this.street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getSubdistrict() {
		return this.subdistrict;
	}

	public void setSubdistrict(String subdistrict) {
		this.subdistrict = subdistrict;
	}

	public int getVerAddressStatus() {
		return this.verAddressStatus;
	}

	public void setVerAddressStatus(int verAddressStatus) {
		this.verAddressStatus = verAddressStatus;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}