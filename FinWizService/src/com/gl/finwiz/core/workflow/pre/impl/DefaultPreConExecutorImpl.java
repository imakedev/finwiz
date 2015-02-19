package com.gl.finwiz.core.workflow.pre.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gl.finwiz.core.workflow.pre.PreConExecutor;
@Repository("DefaultPreConExecutorImpl")
@Transactional
public class DefaultPreConExecutorImpl implements PreConExecutor{

	@Override
	public void runPreCondition() {
		// TODO Auto-generated method stub
		
	}

}
