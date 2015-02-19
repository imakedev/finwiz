package com.gl.finwiz.core.service;

import java.util.List;

import com.gl.finwiz.core.model.WfActivityInstanceM;


public interface WFProcessExecutor {
	/*public WfActivityM processActivity();
	public WfActivityM runProcess();*/
	public WfActivityInstanceM startWfProcess(WfActivityInstanceM wfActivityInstanceM);
	public WfActivityInstanceM nextActivity(WfActivityInstanceM wfActivityInstanceM);
	public List<WfActivityInstanceM> listTodoList(WfActivityInstanceM wfActivityInstanceM);
}
