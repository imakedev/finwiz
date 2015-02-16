package com.gl.finwiz.core.constant;

import java.util.ResourceBundle;

public class ServiceConstant {
	public static final String hostReference = "http://10.2.0.76:10000/BPSService/RestletServlet/";
	
	public static final String LOG_APPENDER = "FinWizLog";
	
	public static final String INTERFACE_RETURN_TYPE = "java.util.List";
	public static final String VOID_RETURN_TYPE = "void";
	public static final ResourceBundle bundle;
	public static String SCHEMA="";
	static{
		bundle =  ResourceBundle.getBundle( "jdbc" );	
		SCHEMA=bundle.getString("schema");
	}

	// USER_PROFILE
	public static final String USER_PROFILE_LOGIN = "loginUserProfile";
	public static final String USER_PROFILE_LOOUT = "logoutUserProfile";
	public static final String USER_PROFILE_SEARCH = "SearchUserProfile";
	public static final String USER_PROFILE_SAVE= "saveUserProfile";	
	public static final String MISS_ACCOUNT_UPDATE = "updateUserProfile";
	public static final String MISS_ACCOUNT_ITEMS_DELETE = "deleteUserProfileItems";
	public static final String MISS_ACCOUNT_DELETE = "deleteUserProfile";
	
	
	public static final String LOAD_FORM = "loadForm";	
	public static final String SAVE_APPLICATION = "saveApplication";
	
	// LOS
	public static final String LOS_APPLICATION_SEARCH = "SearchLosApplication";
	public static final String LOS_APPLICATION_SAVE= "saveLosApplication";	
	public static final String LOS_APPLICATION_SAVE_VERSION= "saveLosApplicationVersion";	
	public static final String LOS_APPLICATION_UPDATE = "updateLosApplication";
	public static final String LOS_APPLICATION_ITEMS_DELETE = "deleteLosApplicationItems";
	public static final String LOS_APPLICATION_DELETE = "deleteLosApplication";
	public static final String LOS_APPLICATION_FIND_BY_ID = "findLosApplicationById";
	// CacheUtil
	public static final String CACHE_REFRESH = "cacheRefresh";
	public static final String CACHE_REFRESH_ALL= "cacheRefreshAll";
	public static final String CACHE_GET = "cacheGet";
	public static final String CACHE_SIZE = "cacheSize";
	
	// WorkFlow
	public static final String TODOLIST_GET= "getTodoList";
	public static final String TODOLIST_SAVE= "saveTodoList";
	
}
