package com.gl.finwiz.core.los.service;

import java.util.List;

import com.gl.finwiz.core.los.model.LosApplicationM;

public interface LosExecutor {
	public String saveLosApplication(LosApplicationM losApplicationM) ;
	public String saveLosApplicationVersion(LosApplicationM losApplicationM) ;
	public LosApplicationM findLosApplicationById(String losAppId);
	public String updateLosApplicationVersion(LosApplicationM losApplicationM) ;
	public List<LosApplicationM> searchLosApplication(LosApplicationM losApplicationM) ;
}
