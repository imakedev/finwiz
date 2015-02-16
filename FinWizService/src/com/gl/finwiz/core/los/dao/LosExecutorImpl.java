package com.gl.finwiz.core.los.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gl.finwiz.core.domain.LosApplication;
import com.gl.finwiz.core.los.model.LosApplicationM;
import com.gl.finwiz.core.los.service.LosExecutor;
@Repository("losExecutorImpl")
@Transactional
public class LosExecutorImpl implements LosExecutor {
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public Long saveLosApplication(LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
		LosApplication losApplication =new LosApplication();
		BeanUtils.copyProperties(losApplicationM, losApplication);
		entityManager.persist(losApplication);
		return 1l;
	}

	@Override
	public Long saveLosApplicationVersion(LosApplicationM losApplicationM) {
		// TODO Auto-generated method stub
		LosApplication losApplication =new LosApplication();
		BeanUtils.copyProperties(losApplicationM, losApplication);
		entityManager.persist(losApplication);
		return 1l;
	}

}
