package com.gl.finwiz.core.service;

import com.gl.finwiz.core.model.CacheM;

public interface CacheExecutor {
	public CacheM refresh(CacheM cacheM); 
	public CacheM refreshAll(); 
	public CacheM getCache(String id); 
	public int getCacheSize(); 
	
}
