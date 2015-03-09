package com.gl.finwiz.service.impl;

import org.springframework.stereotype.Service;

import com.gl.finwiz.core.constant.RouterConStant;
import com.gl.finwiz.core.constant.ServiceConstant;
import com.gl.finwiz.core.los.model.LosApplicationM;
import com.gl.finwiz.core.model.CacheM;
import com.gl.finwiz.core.model.ParamPageM;
import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.model.WfActivityInstanceM;
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
	        FinWizResultMessage resultMessage = postMessage(paramPageM, paramPageM.getClass().getName(), "loadForm", true);
	        paramPageM = (ParamPageM)resultMessage.getResultListObj().get(0);
	        		System.out.println("---------------------"+paramPageM.getParamTabs());

	     return resultMessage; 
	}
	@Override
	public FinWizResultMessage saveDraft(LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
			losApplicationM.setServiceName(ServiceConstant.LOS_APPLICATION_SAVE);
	        FinWizResultMessage resultMessage = postMessage(losApplicationM, losApplicationM.getClass().getName(), "los", true);
	        losApplicationM = (LosApplicationM)resultMessage.getResultListObj().get(0);

	     return resultMessage; 
	}
	@Override
	public FinWizResultMessage update(LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
			losApplicationM.setServiceName(ServiceConstant.LOS_APPLICATION_UPDATE);
	        FinWizResultMessage resultMessage = postMessage(losApplicationM, losApplicationM.getClass().getName(), "los", true);
	        losApplicationM = (LosApplicationM)resultMessage.getResultListObj().get(0);

	     return resultMessage; 
	}
	@Override
	public FinWizResultMessage selectByIdApplication(LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
			losApplicationM.setServiceName(ServiceConstant.LOS_APPLICATION_FIND_BY_ID);
	        FinWizResultMessage resultMessage = postMessage(losApplicationM, losApplicationM.getClass().getName(), "los", true);
	        losApplicationM = (LosApplicationM)resultMessage.getResultListObj().get(0);

	     return resultMessage; 
	}
	@Override
	public FinWizResultMessage searchInbox(LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
			losApplicationM.setServiceName(ServiceConstant.LOS_APPLICATION_SEARCH);
	        FinWizResultMessage resultMessage = postMessage(losApplicationM, losApplicationM.getClass().getName(), "los", true);
	        losApplicationM = (LosApplicationM)resultMessage.getResultListObj().get(0);

	     return resultMessage; 
	}
	@Override
	public FinWizResultMessage cache(CacheM cacheM) {
		// TODO Auto-generated method stub
			cacheM.setServiceName(ServiceConstant.CACHE_REFRESH_ALL);
	        FinWizResultMessage resultMessage = postMessage(cacheM, cacheM.getClass().getName(), "cache", true);
	        cacheM = (CacheM)resultMessage.getResultListObj().get(0);

	     return resultMessage; 
	}
	@Override
	public FinWizResultMessage saveWfStart(WfActivityInstanceM wActivityInstanceM) {
		// TODO Auto-generated method stub
			wActivityInstanceM.setServiceName(ServiceConstant.WF_START);
	        FinWizResultMessage resultMessage = postMessage(wActivityInstanceM, wActivityInstanceM.getClass().getName(), "wfprocess", true);
	        wActivityInstanceM = (WfActivityInstanceM)resultMessage.getResultListObj().get(0);

	     return resultMessage; 
	}
	@Override
	public FinWizResultMessage saveWfNext(WfActivityInstanceM wActivityInstanceM) {
		// TODO Auto-generated method stub
			wActivityInstanceM.setServiceName(ServiceConstant.WF_NEXT);
	        FinWizResultMessage resultMessage = postMessage(wActivityInstanceM, wActivityInstanceM.getClass().getName(), "wfprocess", true);
	        wActivityInstanceM = (WfActivityInstanceM)resultMessage.getResultListObj().get(0);

	     return resultMessage; 
	}
	@Override
	public FinWizResultMessage todoListGet(LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
			losApplicationM.setServiceName(ServiceConstant.TODOLIST_GET);
	        FinWizResultMessage resultMessage = postMessage(losApplicationM, losApplicationM.getClass().getName(), "wfprocess", true);
	        losApplicationM = (LosApplicationM)resultMessage.getResultListObj().get(0);

	     return resultMessage; 
	}
}
