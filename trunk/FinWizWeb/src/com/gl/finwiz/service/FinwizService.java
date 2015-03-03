// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 5/27/2012 12:14:17 AM
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   MissExamService.java

package com.gl.finwiz.service;

import java.util.List;

import com.gl.finwiz.core.los.model.LosApplicationM;
import com.gl.finwiz.core.model.CacheM;
import com.gl.finwiz.core.model.ParamPageM;
import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.model.WfActivityInstanceM;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;



public interface FinwizService {
	// public findByUsername;
	/*public abstract int saveOrUpdateMissTestResult(MissTestResult missTestResult);
	public abstract int startMissTestResult(MissTestResult missTestResult); 
	public abstract int processMissTestResult(MissTestResult missTestResult);
	public abstract int saveOrUpdateMissTodo(MissTodo missTodo);
	 */
	public abstract FinWizResultMessage login(UserLoginM userLoginM);

	public abstract FinWizResultMessage tabs(ParamPageM paramPageM);

	public abstract FinWizResultMessage saveDraft(LosApplicationM losApplicationM);

	public abstract FinWizResultMessage update(LosApplicationM losApplicationM);

	public abstract FinWizResultMessage selectByIdApplication(LosApplicationM losApplicationM);

	public abstract FinWizResultMessage searchInbox(LosApplicationM losApplicationM);

	public abstract FinWizResultMessage cache(CacheM cacheM);

	public abstract FinWizResultMessage saveWfStart(WfActivityInstanceM wfActivityInstanceM);

	public abstract FinWizResultMessage saveWfNext(WfActivityInstanceM wActivityInstanceM);

	public abstract FinWizResultMessage todoListGet(LosApplicationM losApplicationM);
	
}
