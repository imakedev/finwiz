package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the COLL_LETTER database table.
 * 
 */
@Entity
@Table(name="COLL_LETTER")
@NamedQuery(name="CollLetter.findAll", query="SELECT c FROM CollLetter c")
public class CollLetter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COLL_LETTER_ID")
	private String collLetterId;

	@Column(name="COLL_LETTER_PATH")
	private String collLetterPath;

	@Column(name="COLL_LETTER_TYPE")
	private String collLetterType;

	@Column(name="CONTRACT_NO")
	private String contractNo;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	public CollLetter() {
	}

	public String getCollLetterId() {
		return this.collLetterId;
	}

	public void setCollLetterId(String collLetterId) {
		this.collLetterId = collLetterId;
	}

	public String getCollLetterPath() {
		return this.collLetterPath;
	}

	public void setCollLetterPath(String collLetterPath) {
		this.collLetterPath = collLetterPath;
	}

	public String getCollLetterType() {
		return this.collLetterType;
	}

	public void setCollLetterType(String collLetterType) {
		this.collLetterType = collLetterType;
	}

	public String getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}