package com.gl.finwiz.core.service;

import com.gl.finwiz.core.model.ParamPageM;

public interface CacheExecutor {
	public ParamPageM loadPage(ParamPageM paramPageM); 
	public static final String CACHE_REFRESH = "cacheRefresh";
	public static final String CACHE_REFRESH_ALL= "cacheRefreshAll";
	public static final String CACHE_GET = "cacheGet";
	public static final String CACHE_SIZE = "cacheSize";
}
