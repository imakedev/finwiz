package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the BATCH database table.
 * 
 */
@Entity
@NamedQuery(name="Batch.findAll", query="SELECT b FROM Batch b")
public class Batch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BATCH_ID")
	private String batchId;

	@Column(name="BATCH_JAVA_IMPL")
	private String batchJavaImpl;

	@Column(name="BATCH_PLSQL_IMPL")
	private String batchPlsqlImpl;

	@Column(name="BATCH_TYPE")
	private String batchType;

	private String ends;

	@Column(name="ENDS_AFTER")
	private String endsAfter;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ENDS_ON")
	private Date endsOn;

	@Column(name="EXECUTE_TIME")
	private String executeTime;

	@Column(name="INPUT_PATH")
	private String inputPath;

	@Column(name="MAPPING_TEMPLATE_PATH")
	private String mappingTemplatePath;

	@Column(name="OUTPUT_PATH")
	private String outputPath;

	@Column(name="PRINT_FORM_TYPE")
	private String printFormType;

	@Column(name="REF_ID")
	private String refId;

	@Column(name="REPEATE_ON")
	private String repeateOn;

	private String repeates;

	@Column(name="RESULT_EMAIL_LIST")
	private String resultEmailList;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STARTS_ON")
	private Date startsOn;

	private String status;

	//bi-directional many-to-one association to BatchLog
	@OneToMany(mappedBy="batch")
	private List<BatchLog> batchLogs;

	//bi-directional many-to-one association to BatchPrintFormMapping
	@OneToMany(mappedBy="batch")
	private List<BatchPrintFormMapping> batchPrintFormMappings;

	public Batch() {
	}

	public String getBatchId() {
		return this.batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBatchJavaImpl() {
		return this.batchJavaImpl;
	}

	public void setBatchJavaImpl(String batchJavaImpl) {
		this.batchJavaImpl = batchJavaImpl;
	}

	public String getBatchPlsqlImpl() {
		return this.batchPlsqlImpl;
	}

	public void setBatchPlsqlImpl(String batchPlsqlImpl) {
		this.batchPlsqlImpl = batchPlsqlImpl;
	}

	public String getBatchType() {
		return this.batchType;
	}

	public void setBatchType(String batchType) {
		this.batchType = batchType;
	}

	public String getEnds() {
		return this.ends;
	}

	public void setEnds(String ends) {
		this.ends = ends;
	}

	public String getEndsAfter() {
		return this.endsAfter;
	}

	public void setEndsAfter(String endsAfter) {
		this.endsAfter = endsAfter;
	}

	public Date getEndsOn() {
		return this.endsOn;
	}

	public void setEndsOn(Date endsOn) {
		this.endsOn = endsOn;
	}

	public String getExecuteTime() {
		return this.executeTime;
	}

	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}

	public String getInputPath() {
		return this.inputPath;
	}

	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}

	public String getMappingTemplatePath() {
		return this.mappingTemplatePath;
	}

	public void setMappingTemplatePath(String mappingTemplatePath) {
		this.mappingTemplatePath = mappingTemplatePath;
	}

	public String getOutputPath() {
		return this.outputPath;
	}

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	public String getPrintFormType() {
		return this.printFormType;
	}

	public void setPrintFormType(String printFormType) {
		this.printFormType = printFormType;
	}

	public String getRefId() {
		return this.refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public String getRepeateOn() {
		return this.repeateOn;
	}

	public void setRepeateOn(String repeateOn) {
		this.repeateOn = repeateOn;
	}

	public String getRepeates() {
		return this.repeates;
	}

	public void setRepeates(String repeates) {
		this.repeates = repeates;
	}

	public String getResultEmailList() {
		return this.resultEmailList;
	}

	public void setResultEmailList(String resultEmailList) {
		this.resultEmailList = resultEmailList;
	}

	public Date getStartsOn() {
		return this.startsOn;
	}

	public void setStartsOn(Date startsOn) {
		this.startsOn = startsOn;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<BatchLog> getBatchLogs() {
		return this.batchLogs;
	}

	public void setBatchLogs(List<BatchLog> batchLogs) {
		this.batchLogs = batchLogs;
	}

	public BatchLog addBatchLog(BatchLog batchLog) {
		getBatchLogs().add(batchLog);
		batchLog.setBatch(this);

		return batchLog;
	}

	public BatchLog removeBatchLog(BatchLog batchLog) {
		getBatchLogs().remove(batchLog);
		batchLog.setBatch(null);

		return batchLog;
	}

	public List<BatchPrintFormMapping> getBatchPrintFormMappings() {
		return this.batchPrintFormMappings;
	}

	public void setBatchPrintFormMappings(List<BatchPrintFormMapping> batchPrintFormMappings) {
		this.batchPrintFormMappings = batchPrintFormMappings;
	}

	public BatchPrintFormMapping addBatchPrintFormMapping(BatchPrintFormMapping batchPrintFormMapping) {
		getBatchPrintFormMappings().add(batchPrintFormMapping);
		batchPrintFormMapping.setBatch(this);

		return batchPrintFormMapping;
	}

	public BatchPrintFormMapping removeBatchPrintFormMapping(BatchPrintFormMapping batchPrintFormMapping) {
		getBatchPrintFormMappings().remove(batchPrintFormMapping);
		batchPrintFormMapping.setBatch(null);

		return batchPrintFormMapping;
	}

}