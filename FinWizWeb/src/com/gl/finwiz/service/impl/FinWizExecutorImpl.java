package com.gl.finwiz.service.impl;

import org.springframework.stereotype.Service;

import com.gl.finwiz.core.constant.RouterConStant;
import com.gl.finwiz.core.constant.ServiceConstant;
import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.model.WfActivityInstanceM;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;
import com.gl.finwiz.service.FinWizExecutor;

@Service("finWizExecutorImpl")
public class FinWizExecutorImpl extends PostCommon
    implements FinWizExecutor
{

    public FinWizExecutorImpl()
    {
    }

	@Override
	public UserLoginM login(UserLoginM userLoginM) {
		// TODO Auto-generated method stub
		userLoginM.setServiceName(ServiceConstant.USER_PROFILE_LOGIN);
	        FinWizResultMessage resultMessage = postMessage(userLoginM, userLoginM.getClass().getName(), RouterConStant.USER_ENDPOINT, true);
	        userLoginM = (UserLoginM)resultMessage.getResultListObj().get(0);
	     return userLoginM; 
	}

	@Override
	public WfActivityInstanceM startWfProcess(WfActivityInstanceM wfActivityInstanceM) {
		// TODO Auto-generated method stub
		wfActivityInstanceM.setServiceName(ServiceConstant.WF_START);
        FinWizResultMessage resultMessage = postMessage(wfActivityInstanceM, wfActivityInstanceM.getClass().getName(), "wfprocess", true);
        wfActivityInstanceM = (WfActivityInstanceM)resultMessage.getResultListObj().get(0);
     return wfActivityInstanceM; 	
	}


}
