package com.gl.finwiz.core.los.service;

import java.util.List;

import com.gl.finwiz.core.los.model.LosApplicationM;

public interface LosExecutor {
	public Long saveLosApplication(LosApplicationM losApplicationM) ;
	public Long saveLosApplicationVersion(LosApplicationM losApplicationM) ;
	public LosApplicationM findLosApplicationById(String losAppId);
	public Long updateLosApplicationVersion(LosApplicationM losApplicationM) ;
	public List<LosApplicationM> searchLosApplication(LosApplicationM losApplicationM) ;
}
