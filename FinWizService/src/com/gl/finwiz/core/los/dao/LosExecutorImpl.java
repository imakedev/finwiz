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
import com.gl.finwiz.core.los.model.LosApplicationM;
import com.gl.finwiz.core.los.service.LosExecutor;
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
	
		Query query=entityManager.createQuery("select u from LosApplication u where u.updatedBy=:updatedBy "
				+ "", LosApplication.class);
		query.setParameter("updatedBy", losApplicationM.getUpdatedBy());
		List<LosApplication> losApplications=query.getResultList();
		 List<LosApplicationM> losApplications_model=null;
		if(losApplications!=null){
			losApplications_model = new ArrayList<LosApplicationM>(losApplications.size());
			for (LosApplication app : losApplications) {
				LosApplicationM model =new LosApplicationM();
				BeanUtils.copyProperties(app, model);
				losApplications_model.add(model);
			}
		}
	 return losApplications_model;	
	}

}
