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
import com.gl.finwiz.core.domain.WfActivityCondition;
import com.gl.finwiz.core.domain.WfActivityInstance;
import com.gl.finwiz.core.model.WfActivityInstanceM;
import com.gl.finwiz.core.service.WFProcessExecutor;
import com.gl.finwiz.core.utils.TokenUtils;
import com.gl.finwiz.core.workflow.ActivityExecutor;
import com.gl.finwiz.core.workflow.post.PostConExecutor;
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
			wfActivityInstance.setWfActivityInstanceStatus("1"); // active
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
		String wfActivityInstanceId=wfActivityInstanceM.getWfActivityInstanceId();
		Query query = entityManager.createQuery("select p from WfActivityCondition p "
				+ "where p.activityId =:activityId and p.activityConditionCode=:activityConditionCode",
				WfActivityCondition.class);
		query.setParameter("activityId", wfActivityInstanceM.getActivityId());
		query.setParameter("activityConditionCode", wfActivityInstanceM.getApplicationStatus());
		List<WfActivityCondition> wfActivityConditions = query.getResultList();
		if (wfActivityConditions != null && wfActivityConditions.size() > 0) {
			for (WfActivityCondition wfActivityCondition : wfActivityConditions) {
				// run  post con
				PostConExecutor postConExecutor = (PostConExecutor) ctx
						.getBean(wfActivityCondition.getJavaPostConImpl());
				postConExecutor.runPostCondition();	
				
				// get next activity
				String nextActivityId=wfActivityCondition.getNextActivityId();
				 query = entityManager.createQuery("select p from WfActivity p "
						+ "where p.id.wfpId =:wfpId and p.id.activityId=:activityId ",
						WfActivity.class);
				query.setParameter("wfpId", wfActivityInstanceM.getWfpId());
				query.setParameter("activityId", nextActivityId);
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
					wfActivityInstance.setWfActivityInstanceIdPrev(wfActivityInstanceId);
					wfActivityInstance.setWfActivityInstanceStatus("1");
					wfActivityInstance
							.setActivityId(wfActivity.getId().getActivityId());
					entityManager.persist(wfActivityInstance);
				}
			}
			
			// update status
			
			query = entityManager.createQuery("UPDATE WfActivityInstance p  set p.wfActivityInstanceStatus=:wfActivityInstanceStatus "
					+ "where p.wfActivityInstanceId =:wfActivityInstanceId"
					);
			query.setParameter("wfActivityInstanceId",wfActivityInstanceId);
			query.setParameter("wfActivityInstanceStatus", "0");
			 int updateCount = query.executeUpdate();
		}
		return wfActivityInstanceM;
	}

}
