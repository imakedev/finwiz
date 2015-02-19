package com.gl.finwiz.core.service;

import com.gl.finwiz.core.model.WfActivityInstanceM;


public interface WFProcessExecutor {
	/*public WfActivityM processActivity();
	public WfActivityM runProcess();*/
	public WfActivityInstanceM startWfProcess(WfActivityInstanceM wfActivityInstanceM);
	public WfActivityInstanceM nextActivity(WfActivityInstanceM wfActivityInstanceM);
}
