package com.gl.finwiz.core.userprofile.service;

import java.util.List;

import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.userprofile.domain.User;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;


//@Service("userServices")
public interface UserProfileService {
	/* 
	private UserDao userDao;
	 
	public UserDao getUserDao() {
	return userDao;
	}
	@Autowired
	public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
	}*/
	 
	public FinWizResultMessage login(UserLoginM userlogin);
	public List<User> fetchAllUsers() ;
}
