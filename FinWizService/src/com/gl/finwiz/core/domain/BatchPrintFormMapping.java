package com.gl.finwiz.core.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BATCH_PRINT_FORM_MAPPING database table.
 * 
 */
@Entity
@Table(name="BATCH_PRINT_FORM_MAPPING")
@NamedQuery(name="BatchPrintFormMapping.findAll", query="SELECT b FROM BatchPrintFormMapping b")
public class BatchPrintFormMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BatchPrintFormMappingPK id;

	@Column(name="PRINT_FORM_CELL_NAME")
	private String printFormCellName;

	@Column(name="PRINT_FORM_COLUMN_NAME")
	private String printFormColumnName;

	@Column(name="PRINT_FORM_VIEW_NAME")
	private String printFormViewName;

	//bi-directional many-to-one association to Batch
	@ManyToOne
	@JoinColumn(name="BATCH_ID",insertable=false,updatable=false)
	private Batch batch;

	public BatchPrintFormMapping() {
	}

	public BatchPrintFormMappingPK getId() {
		return this.id;
	}

	public void setId(BatchPrintFormMappingPK id) {
		this.id = id;
	}

	public String getPrintFormCellName() {
		return this.printFormCellName;
	}

	public void setPrintFormCellName(String printFormCellName) {
		this.printFormCellName = printFormCellName;
	}

	public String getPrintFormColumnName() {
		return this.printFormColumnName;
	}

	public void setPrintFormColumnName(String printFormColumnName) {
		this.printFormColumnName = printFormColumnName;
	}

	public String getPrintFormViewName() {
		return this.printFormViewName;
	}

	public void setPrintFormViewName(String printFormViewName) {
		this.printFormViewName = printFormViewName;
	}

	public Batch getBatch() {
		return this.batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

}