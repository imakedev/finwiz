package com.gl.finwiz.service.impl;

import com.gl.finwiz.core.constant.RouterConStant;
import com.gl.finwiz.core.constant.ServiceConstant;
import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;
import com.gl.finwiz.service.FinwizService;


public class FinWizServiceImpl extends PostCommon
    implements FinwizService
{

    public FinWizServiceImpl()
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


}
