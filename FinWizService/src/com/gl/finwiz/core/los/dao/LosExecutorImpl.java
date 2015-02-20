package com.gl.finwiz.core.los.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gl.finwiz.core.domain.LosApplication;
import com.gl.finwiz.core.domain.ParamLosAppStatus;
import com.gl.finwiz.core.domain.WfActivityInstance;
import com.gl.finwiz.core.los.model.LosApplicationM;
import com.gl.finwiz.core.los.model.ParamLosAppStatusM;
import com.gl.finwiz.core.los.service.LosExecutor;
import com.gl.finwiz.core.model.WfActivityInstanceM;
import com.gl.finwiz.core.utils.TokenUtils;
@Repository("losExecutorImpl")
@Transactional
public class LosExecutorImpl implements LosExecutor {
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public String saveLosApplication(LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
		LosApplication losApplication =new LosApplication();
		BeanUtils.copyProperties(losApplicationM, losApplication);
		String token=TokenUtils.genToken(10);
		
		losApplication.setLosAppId(token);
		//losApplication.setApplicationId(token);
		losApplication.setVersion(1);
		losApplication.setIsActive(1);
		entityManager.persist(losApplication);
		entityManager.flush();
		return losApplication.getLosAppId();
		
	}

	@Override
	public String saveLosApplicationVersion(LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
		LosApplication losApplication =new LosApplication();
		BeanUtils.copyProperties(losApplicationM, losApplication);
		Query query=entityManager.createQuery("select u from LosApplication u where u.applicationId=:applicationId"
				+ "  and u.isActive=1 "
				+ "", LosApplication.class);
		query.setParameter("applicationId", losApplicationM.getApplicationId());
		List<LosApplication> losApplications=query.getResultList();
		if(losApplications!=null){
			for (LosApplication app : losApplications) {
				app.setIsActive(0);
				entityManager.merge(app);
			}
		}
		String token=TokenUtils.genToken(10);	
		losApplication.setLosAppId(token);
		losApplication.setIsActive(1);
		entityManager.persist(losApplication);
		entityManager.flush();
		return losApplication.getLosAppId();
	}

	@Override
	public LosApplicationM findLosApplicationById(String losAppId) {
		// TODO Auto-generated method stub
		LosApplicationM losApplicationM =new LosApplicationM();
		LosApplication losApplication=entityManager.find(LosApplication.class, losAppId);
		BeanUtils.copyProperties(losApplication, losApplicationM);
		if(losApplication!=null && losApplication.getApplicationStatus()!=null 
				&& losApplication.getApplicationStatus().length()>0){
			ParamLosAppStatus pramLosAppStatus=entityManager.find(ParamLosAppStatus.class, losApplication.getApplicationStatus());
			ParamLosAppStatusM paramLosAppStatusM =new ParamLosAppStatusM();
			if(pramLosAppStatus!=null){
				BeanUtils.copyProperties(pramLosAppStatus, paramLosAppStatusM);
				losApplicationM.setParamLosAppStatusM(paramLosAppStatusM);
			}
			
		}
		return losApplicationM;
	}

	@Override
	public String updateLosApplicationVersion(LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
		LosApplication losApplication =new LosApplication();
		BeanUtils.copyProperties(losApplicationM, losApplication);
		entityManager.merge(losApplication);
		entityManager.flush();
		return losApplication.getLosAppId();
	}

	@Override
	public List<LosApplicationM> searchLosApplication(
			LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
		Query query=entityManager.createQuery("select u from WfActivityInstance u where ( u.wfActivityInstanceOwnerUser=:wfActivityInstanceOwnerUser "
				+ " or   u.wfActivityInstanceOwnerRole=:wfActivityInstanceOwnerRole ) and wfActivityInstanceStatus=:wfActivityInstanceStatus "
				+ "", WfActivityInstance.class);
		query.setParameter("wfActivityInstanceOwnerUser", losApplicationM.getUser());
		query.setParameter("wfActivityInstanceOwnerRole", losApplicationM.getRole());
		query.setParameter("wfActivityInstanceStatus","1");
		 List<LosApplicationM> losApplications_model=new ArrayList<LosApplicationM>();
		List<WfActivityInstance> wfActivityInstances=query.getResultList();
		for (WfActivityInstance wfActivityInstance : wfActivityInstances) {
			WfActivityInstanceM wfActivityInstanceM=new WfActivityInstanceM();
			BeanUtils.copyProperties(wfActivityInstance, wfActivityInstanceM);
			 query=entityManager.createQuery("select u from LosApplication u where u.losAppId=:losAppId "
						+ "", LosApplication.class);
				query.setParameter("losAppId", wfActivityInstance.getRefObjectId());
				List<LosApplication> losApplications=query.getResultList();
				if(losApplications!=null && losApplications.size()>0){
					LosApplicationM losApplicationModel =new LosApplicationM();
					BeanUtils.copyProperties(losApplications.get(0), losApplicationModel);
					losApplicationModel.setWfActivityInstanceM(wfActivityInstanceM);
					if(losApplicationModel!=null && losApplicationModel.getApplicationStatus()!=null 
							&& losApplicationModel.getApplicationStatus().length()>0){
						ParamLosAppStatus pramLosAppStatus=entityManager.find(ParamLosAppStatus.class, losApplicationModel.getApplicationStatus());
						ParamLosAppStatusM paramLosAppStatusM =new ParamLosAppStatusM();
						if(pramLosAppStatus!=null){
							BeanUtils.copyProperties(pramLosAppStatus, paramLosAppStatusM);
							losApplicationModel.setParamLosAppStatusM(paramLosAppStatusM);
						}
						
					}
					losApplications_model.add(losApplicationModel);
				}
		}
		/*
		List<LosApplication> losApplications=query.getResultList();
		// List<LosApplicationM> losApplications_model=null;
		if(losApplications!=null){
			losApplications_model = new ArrayList<LosApplicationM>(losApplications.size());
			for (LosApplication app : losApplications) {
				LosApplicationM model =new LosApplicationM();
				BeanUtils.copyProperties(app, model);
				if(app!=null && app.getApplicationStatus()!=null 
						&& app.getApplicationStatus().length()>0){
					ParamLosAppStatus pramLosAppStatus=entityManager.find(ParamLosAppStatus.class, app.getApplicationStatus());
					ParamLosAppStatusM paramLosAppStatusM =new ParamLosAppStatusM();
					if(pramLosAppStatus!=null){
						BeanUtils.copyProperties(pramLosAppStatus, paramLosAppStatusM);
						model.setParamLosAppStatusM(paramLosAppStatusM);
					}
					
				}
				losApplications_model.add(model);
			}
		}*/
	 return losApplications_model;	
	}

}
