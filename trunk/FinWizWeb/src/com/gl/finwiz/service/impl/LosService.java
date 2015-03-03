package com.gl.finwiz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.finwiz.core.los.model.LosApplicationM;
import com.gl.finwiz.core.model.CacheM;
import com.gl.finwiz.core.model.ParamPageM;
import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.model.WfActivityInstanceM;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;
import com.gl.finwiz.service.FinwizService;
@Service("losService")
public class LosService extends PostCommon
implements FinwizService{


	@Override
	public FinWizResultMessage login(UserLoginM userLoginM) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinWizResultMessage tabs(ParamPageM paramPageM) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinWizResultMessage saveDraft(LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinWizResultMessage update(LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinWizResultMessage selectByIdApplication(
			LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public FinWizResultMessage cache(CacheM cacheM) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinWizResultMessage searchInbox(LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinWizResultMessage saveWfStart(
			WfActivityInstanceM wfActivityInstanceM) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinWizResultMessage saveWfNext(WfActivityInstanceM wActivityInstanceM) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinWizResultMessage todoListGet(
			LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
		return null;
	}



}
