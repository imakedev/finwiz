package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CONTRACT database table.
 * 
 */
@Entity
@NamedQuery(name="Contract.findAll", query="SELECT c FROM Contract c")
public class Contract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CONTRACT_NO")
	private String contractNo;

	@Column(name="CONTRACT_ID")
	private String contractId;

	@Column(name="LOS_APP_NO")
	private String losAppNo;

	private int version;

	public Contract() {
	}

	public String getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractId() {
		return this.contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getLosAppNo() {
		return this.losAppNo;
	}

	public void setLosAppNo(String losAppNo) {
		this.losAppNo = losAppNo;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}