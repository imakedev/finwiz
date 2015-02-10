// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 5/27/2012 12:14:17 AM
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   MissExamService.java

package com.gl.finwiz.service;

import com.gl.finwiz.core.model.UserLoginM;



public interface FinwizService {
	// public findByUsername;
	/*public abstract int saveOrUpdateMissTestResult(MissTestResult missTestResult);
	public abstract int startMissTestResult(MissTestResult missTestResult); 
	public abstract int processMissTestResult(MissTestResult missTestResult);
	public abstract int saveOrUpdateMissTodo(MissTodo missTodo);
	 */
	public abstract UserLoginM login(UserLoginM userLoginM);
	
}
