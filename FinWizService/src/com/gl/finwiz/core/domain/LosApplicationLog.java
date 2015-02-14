package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the LOS_APPLICATION_LOG database table.
 * 
 */
@Entity
@Table(name="LOS_APPLICATION_LOG")
@NamedQuery(name="LosApplicationLog.findAll", query="SELECT l FROM LosApplicationLog l")
public class LosApplicationLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LosApplicationLogPK id;

	@Column(name="`COMMENT`")
	private String comment;

	@Column(name="LOS_APP_STATUS")
	private String losAppStatus;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	//bi-directional many-to-one association to LosApplication
	@ManyToOne
	@JoinColumn(name="LOS_APP_ID",insertable=false,updatable=false)
	private LosApplication losApplication;

	public LosApplicationLog() {
	}

	public LosApplicationLogPK getId() {
		return this.id;
	}

	public void setId(LosApplicationLogPK id) {
		this.id = id;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getLosAppStatus() {
		return this.losAppStatus;
	}

	public void setLosAppStatus(String losAppStatus) {
		this.losAppStatus = losAppStatus;
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

	public LosApplication getLosApplication() {
		return this.losApplication;
	}

	public void setLosApplication(LosApplication losApplication) {
		this.losApplication = losApplication;
	}

}