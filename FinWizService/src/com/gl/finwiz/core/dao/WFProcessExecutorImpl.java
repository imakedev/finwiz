package com.gl.finwiz.core.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gl.finwiz.core.domain.WfActivity;
import com.gl.finwiz.core.domain.WfActivityInstance;
import com.gl.finwiz.core.model.WfActivityInstanceM;
import com.gl.finwiz.core.service.WFProcessExecutor;
import com.gl.finwiz.core.utils.TokenUtils;
import com.gl.finwiz.core.workflow.ActivityExecutor;
import com.gl.finwiz.core.workflow.pre.PreConExecutor;

@Repository("WFProcessExecutorImpl")
@Transactional
public class WFProcessExecutorImpl implements WFProcessExecutor {
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	private ApplicationContext ctx;

	@Override
	public WfActivityInstanceM startWfProcess(
			WfActivityInstanceM wfActivityInstanceM) {
		// TODO Auto-generated method stub
		String finId = wfActivityInstanceM.getFinId();
		String wfpId = wfActivityInstanceM.getWfpId();
		// find first activity
		Query query = entityManager.createQuery("select p from WfActivity p "
				+ "where p.id.wfpId =:wfpId and p.isstart='1' ",
				WfActivity.class);
		query.setParameter("wfpId", wfpId);
		List<WfActivity> wfActivitys = query.getResultList();
		if (wfActivitys != null && wfActivitys.size() > 0) {
			WfActivity wfActivity = wfActivitys.get(0);

			// run  pre con
			PreConExecutor preConExecutor = (PreConExecutor) ctx
					.getBean(wfActivity.getJavaPreConImpl());
				preConExecutor.runPreCondition();
				
			// run activity
			ActivityExecutor activityExecutor = (ActivityExecutor) ctx
					.getBean(wfActivity.getJavaActivityImpl());
				activityExecutor.runActivity();
			WfActivityInstance wfActivityInstance = new WfActivityInstance();
			BeanUtils.copyProperties(wfActivityInstanceM, wfActivityInstance);
			String token = TokenUtils.genToken(10);
			wfActivityInstance.setWfActivityInstanceId(token);
			wfActivityInstance
					.setActivityId(wfActivity.getId().getActivityId());
			entityManager.persist(wfActivityInstance);
		}
		// ParamPage paramPage =(ParamPage)query.getSingleResult();

		return wfActivityInstanceM;
	}

	@Override
	public WfActivityInstanceM nextActivity(
			WfActivityInstanceM wfActivityInstanceM) {
		// TODO Auto-generated method stub
		return null;
	}

}
