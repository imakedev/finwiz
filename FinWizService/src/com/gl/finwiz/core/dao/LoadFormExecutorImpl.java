package com.gl.finwiz.core.dao;


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
import com.gl.finwiz.core.domain.ParamSubForm;
import com.gl.finwiz.core.domain.ParamSubFormPK;
import com.gl.finwiz.core.domain.ParamTab;
import com.gl.finwiz.core.domain.ParamTabPK;
import com.gl.finwiz.core.domain.UserRoleSubformMapping;
import com.gl.finwiz.core.domain.UserRoleTabMapping;
import com.gl.finwiz.core.model.ParamPageM;
import com.gl.finwiz.core.model.ParamSubFormM;
import com.gl.finwiz.core.model.ParamTabM;
import com.gl.finwiz.core.service.LoadFormExecutor;


//@Service
@Repository("loadFormExecutorImpl")
@Transactional
public class LoadFormExecutorImpl implements LoadFormExecutor{
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public ParamPageM loadPage(ParamPageM paramPageM) {
		// TODO Auto-generated method stub
		String pageId=paramPageM.getPageId();
	
		String roleId=paramPageM.getRoleId();
		System.out.println(pageId);
		System.out.println(roleId);
		Query query=entityManager.createQuery("select p from ParamPage p "
				+ "where p.pageId =:pageId  ",ParamPage.class);
		query.setParameter("pageId",pageId);
		//List<ParamPage> paramPages=query.getResultList();
		ParamPage paramPage =(ParamPage)query.getSingleResult();
		ParamPageM paramPageReturnM =new ParamPageM();
		BeanUtils.copyProperties(paramPage, paramPageReturnM);
		//get paramPage
		query=entityManager.createQuery("select userRoleTabMapping from UserRoleTabMapping userRoleTabMapping "
				+ "where userRoleTabMapping.id.pageId =:pageId and userRoleTabMapping.id.roleId=:roleId ",UserRoleTabMapping.class);
		query.setParameter("pageId", pageId);	
		query.setParameter("roleId", roleId);	
		List<UserRoleTabMapping> paramTabs=query.getResultList();
		List<ParamTabM> paramTabModels=null;
		System.out.println(paramTabs);
		if(paramTabs!=null && paramTabs.size()>0){
			paramTabModels = new ArrayList<ParamTabM>(paramTabs.size());
			for (UserRoleTabMapping paramTab : paramTabs) {
				ParamTabM paramTabM = new ParamTabM();
				ParamTabPK pk =new ParamTabPK();
			//	pk.setPageId(pageId);
				pk.setTabId(paramTab.getId().getTabId());
				ParamTab tab = (ParamTab)entityManager.find(ParamTab.class,pk );
				System.out.println(tab);
				paramTabM.setTabId(paramTab.getId().getTabId());
				paramTabM.setTabPath(tab.getTabPath());
				paramTabModels.add(paramTabM);
			}
			paramPageReturnM.setParamTabs(paramTabModels);
		}
		//get subForm
		query=entityManager.createQuery("select userRoleSubformMapping from UserRoleSubformMapping userRoleSubformMapping "
				+ "where userRoleSubformMapping.id.pageId =:pageId and userRoleSubformMapping.id.roleId=:roleId ");
		query.setParameter("pageId", pageId);	
		query.setParameter("roleId", roleId);
		
		List<UserRoleSubformMapping> paramSubForms=query.getResultList();
		List<ParamSubFormM> ParamSubFormModels=null;
		
		if(paramSubForms!=null && paramSubForms.size()>0){
			ParamSubFormModels = new ArrayList<ParamSubFormM>(paramSubForms.size());
			for (UserRoleSubformMapping paramSubForm : paramSubForms) {
				ParamSubFormM ParamSubFormM = new ParamSubFormM();
				ParamSubFormPK pk =new ParamSubFormPK();
				pk.setPageId(pageId);
				pk.setParamSubFormId(paramSubForm.getId().getSubformId());
				ParamSubForm subform = (ParamSubForm)entityManager.find(ParamSubForm.class,pk) ;
				ParamSubFormM.setParamSubFormId(subform.getId().getParamSubFormId());
				ParamSubFormM.setFormPath(subform.getFormPath());
				ParamSubFormModels.add(ParamSubFormM);
			}
			paramPageReturnM.setParamSubForms(ParamSubFormModels);
		}
		return paramPageReturnM;
	}

	

}
