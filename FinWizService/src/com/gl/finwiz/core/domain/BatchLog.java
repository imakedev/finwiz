package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the BATCH_LOG database table.
 * 
 */
@Entity
@Table(name="BATCH_LOG")
@NamedQuery(name="BatchLog.findAll", query="SELECT b FROM BatchLog b")
public class BatchLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BatchLogPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="BATCH_END_TIME")
	private Date batchEndTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="BATCH_START_TIME")
	private Date batchStartTime;

	@Column(name="RESULT_CODE")
	private String resultCode;

	@Lob
	@Column(name="RESULT_MESSAGE")
	private String resultMessage;

	//bi-directional many-to-one association to Batch
	@ManyToOne
	@JoinColumn(name="BATCH_ID",insertable=false,updatable=false)
	private Batch batch;

	public BatchLog() {
	}

	public BatchLogPK getId() {
		return this.id;
	}

	public void setId(BatchLogPK id) {
		this.id = id;
	}

	public Date getBatchEndTime() {
		return this.batchEndTime;
	}

	public void setBatchEndTime(Date batchEndTime) {
		this.batchEndTime = batchEndTime;
	}

	public Date getBatchStartTime() {
		return this.batchStartTime;
	}

	public void setBatchStartTime(Date batchStartTime) {
		this.batchStartTime = batchStartTime;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Batch getBatch() {
		return this.batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

}