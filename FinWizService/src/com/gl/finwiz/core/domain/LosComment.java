package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the LOS_COMMENT database table.
 * 
 */
@Entity
@Table(name="LOS_COMMENT")
@NamedQuery(name="LosComment.findAll", query="SELECT l FROM LosComment l")
public class LosComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LosCommentPK id;

	@Column(name="APPLICATION_STATUS")
	private String applicationStatus;

	@Column(name="COMMENT_TEXT")
	private String commentText;

	@Column(name="COMMENT_TYPE")
	private String commentType;

	@Column(name="COMMENTED_BY")
	private String commentedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="COMMENTED_TIME")
	private Date commentedTime;

	//bi-directional many-to-one association to LosApplication
	@ManyToOne
	@JoinColumn(name="LOS_APP_ID",insertable=false,updatable=false)
	private LosApplication losApplication;

	public LosComment() {
	}

	public LosCommentPK getId() {
		return this.id;
	}

	public void setId(LosCommentPK id) {
		this.id = id;
	}

	public String getApplicationStatus() {
		return this.applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getCommentText() {
		return this.commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public String getCommentType() {
		return this.commentType;
	}

	public void setCommentType(String commentType) {
		this.commentType = commentType;
	}

	public String getCommentedBy() {
		return this.commentedBy;
	}

	public void setCommentedBy(String commentedBy) {
		this.commentedBy = commentedBy;
	}

	public Date getCommentedTime() {
		return this.commentedTime;
	}

	public void setCommentedTime(Date commentedTime) {
		this.commentedTime = commentedTime;
	}

	public LosApplication getLosApplication() {
		return this.losApplication;
	}

	public void setLosApplication(LosApplication losApplication) {
		this.losApplication = losApplication;
	}

}