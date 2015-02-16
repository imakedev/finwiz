package com.gl.finwiz.core.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("wfActivityM")
public class WfActivityM extends FinWizXML implements Serializable {
	private static final long serialVersionUID = 1L;

	private String activityId;

	private String wfpId;

	private String activityDesc;

	private String activityName;

	private String activityOwner;

	private String activityType;

	private String createdBy;

	private Date createdTime;

	private String javaImpl;

	private String requireMerge;

	private String updatedBy;

	private Date updatedTime;

	//bi-directional many-to-one association to WfProcess
	@ManyToOne
	@JoinColumn(name="WFP_ID",insertable=false,updatable=false)
	private WfProcessM wfProcess;

	public WfActivityM() {
	}

}