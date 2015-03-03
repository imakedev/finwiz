package com.gl.finwiz.service.impl;

import org.springframework.stereotype.Service;

import com.gl.finwiz.core.constant.RouterConStant;
import com.gl.finwiz.core.constant.ServiceConstant;
import com.gl.finwiz.core.model.ParamPageM;
import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;
import com.gl.finwiz.service.FinwizService;

@Service("finWizServiceImpl")
public class FinWizServiceImpl extends PostCommon
    implements FinwizService
{

    public FinWizServiceImpl()
    {
    }

	@Override
	public FinWizResultMessage login(UserLoginM userLoginM) {
		// TODO Auto-generated method stub
		userLoginM.setServiceName(ServiceConstant.USER_PROFILE_LOGIN);
	        FinWizResultMessage resultMessage = postMessage(userLoginM, userLoginM.getClass().getName(), RouterConStant.USER_ENDPOINT, true);
	        userLoginM = (UserLoginM)resultMessage.getResultListObj().get(0);
	        		System.out.println("---------------------"+userLoginM.getCreatedDate());
	        		System.out.println("---------------------"+userLoginM.getEmail());
	        		System.out.println("---------------------"+userLoginM.getFirstName());
	        		System.out.println("---------------------"+userLoginM.getLastName());
	        		System.out.println("---------------------"+userLoginM.getPassword());
	        		System.out.println("---------------------"+userLoginM.getStatus());
	     return resultMessage; 
	}
	@Override
	public FinWizResultMessage tabs(ParamPageM paramPageM) {
		// TODO Auto-generated method stub
		paramPageM.setServiceName(ServiceConstant.LOAD_FORM);
	        FinWizResultMessage resultMessage = postMessage(paramPageM, paramPageM.getClass().getName(), RouterConStant.USER_ENDPOINT, true);
	        paramPageM = (ParamPageM)resultMessage.getResultListObj().get(0);
	        		System.out.println("---------------------"+paramPageM.getPagePath());

	     return resultMessage; 
	}
}
