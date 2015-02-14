package com.gl.finwiz.core.userprofile.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gl.finwiz.core.domain.ParamPage;
import com.gl.finwiz.core.domain.UserLogin;
import com.gl.finwiz.core.domain.UserRoleMapping;
import com.gl.finwiz.core.model.ParamPageM;
import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.model.UserRoleM;
import com.gl.finwiz.core.userprofile.domain.User;
import com.gl.finwiz.core.userprofile.service.UserProfileService;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;


//@Service
@Repository("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService{
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<User> fetchAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinWizResultMessage login(UserLoginM userlogin) {
		// TODO Auto-generated method stub
		FinWizResultMessage finWizResultMessage =new FinWizResultMessage();
		 
		Query query=entityManager.createQuery("select u from UserLogin u where u.id.userId=? and u.id.countryId=? "
				+ "and u.id.companyId=? and u.password=?", UserLogin.class);
		query.setParameter(1, userlogin.getUserId());
		query.setParameter(2, userlogin.getCountryId());
		query.setParameter(3, userlogin.getCompanyId());
		query.setParameter(4, userlogin.getPassword());
		List<UserLogin> userLogins=query.getResultList();
		System.out.println(userLogins);
		UserLoginM userLoginM=null;
		if(userLogins!=null && userLogins.size()>0){
			UserLogin userloginD=userLogins.get(0);
			userloginD.getId();
			userLoginM =new UserLoginM();
			BeanUtils.copyProperties(userloginD, userLoginM,"id");
			//get role mapping
			query=entityManager.createQuery("select role_mapping from UserRoleMapping role_mapping "
					+ "where role_mapping.id.userId=? ");
			query.setParameter(1, userlogin.getUserId());	
			List<UserRoleMapping> userRoleMappings=query.getResultList();
			List<UserRoleM> userRolesM=null;
			String role="";
			if(userRoleMappings!=null && userRoleMappings.size()>0){
				userRolesM = new ArrayList<UserRoleM>(userRoleMappings.size());
				for (UserRoleMapping userRoleMapping : userRoleMappings) {
					UserRoleM userRoleM = new UserRoleM();
					role=userRoleMapping.getId().getRoleId();
					userRoleM.setRoleId(role);
					userRolesM.add(userRoleM);
				}
				userLoginM.setUserRoles(userRolesM);
			}
			
		//get menu
			query=entityManager.createQuery("select p.id.pageId from UserRoleMenuMapping p "
					+ "where p.id.roleId=? ");
			System.out.println(""+role);
			query.setParameter(1,role);	
			List<String> pageIds= query.getResultList();
			System.out.println(pageIds);
			
			query=entityManager.createQuery("select p from ParamPage p "
					+ "where p.pageId in :pageIds  order by p.menuOrder ");
			query.setParameter("pageIds",pageIds);	
			List<ParamPage> paramPages=query.getResultList();
			List<ParamPageM> paramPagesM=null;
			if(paramPages!=null && paramPages.size()>0){
				paramPagesM = new ArrayList<ParamPageM>(paramPages.size());
				for (ParamPage paramPage : paramPages) {
					ParamPageM paramPageM = new ParamPageM();
					BeanUtils.copyProperties(paramPage, paramPageM);
					paramPagesM.add(paramPageM);
				}
				userLoginM.setParamPages(paramPagesM);
			}
		}
		/*String pageName="";
		if(userlogin.getUserId().equals("checker")){
			pageName="los_inbox";
		}
		String subForm1="";
		String subForm2="";
		List<String> subForms=new ArrayList<String>();
		
		String tab1="loan_request";
		List<String> tabs=new ArrayList<String>();	
		
		tabs.add(tab1);
	
		PageM pageM=new PageM();
		pageM.setPageName(pageName);
		pageM.setSubForms(subForms);
		pageM.setTabs(tabs);*/
		List results =new ArrayList();
		results.add(userLoginM);
	//	results.add(pageM);
		finWizResultMessage.setResultListObj(results);
		return finWizResultMessage;
	}

}
