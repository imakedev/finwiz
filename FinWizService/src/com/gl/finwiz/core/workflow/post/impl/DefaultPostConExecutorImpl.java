package com.gl.finwiz.core.workflow.post.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gl.finwiz.core.workflow.post.PostConExecutor;

@Repository("DefaultPostConExecutorImpl")
@Transactional
public class DefaultPostConExecutorImpl implements PostConExecutor{

	@Override
	public void runPostCondition() {
		// TODO Auto-generated method stub
		
	}

}
