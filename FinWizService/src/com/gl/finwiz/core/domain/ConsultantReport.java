package com.gl.finwiz.core.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the MISS_ACCOUNT database table.
 * 
 */
@Entity
@Table(name="CONSULTANT_REPORT")
public class ConsultantReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MA_ID")
	private Long maId;

	@Column(name="MA_ADDRESS")
	private String maAddress;

	public Long getMaId() {
		return maId;
	}

	public void setMaId(Long maId) {
		this.maId = maId;
	}

	public String getMaAddress() {
		return maAddress;
	}

	public void setMaAddress(String maAddress) {
		this.maAddress = maAddress;
	}


	
}