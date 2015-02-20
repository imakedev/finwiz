package com.gl.finwiz.core.dao;

import java.util.ArrayList;
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
import com.gl.finwiz.core.domain.WfPi;
import com.gl.finwiz.core.domain.WfPiPK;
import com.gl.finwiz.core.model.WfActivityInstanceM;
import com.gl.finwiz.core.service.WFProcessExecutor;
import com.gl.finwiz.core.utils.TokenUtils;

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
		System.out.println("startWfProcess");
		String finId = wfActivityInstanceM.getFinId();
		String wfpId = wfActivityInstanceM.getWfpId();
		String refId=wfActivityInstanceM.getRefObjectId();
		String wfpiId = TokenUtils.genToken(10);
		WfPi wfpiObj=new WfPi();
		WfPiPK pk =new WfPiPK();
		pk.setWfpiId(wfpiId);
		pk.setWfpId(wfpId);
		wfpiObj.setId(pk);
		wfpiObj.setRefId(refId);
		wfpiObj.setWfpiStatus("1");
		entityManager.persist(wfpiObj);
		entityManager.flush();
		
		// find first activity
		Query query = entityManager.createQuery("select p from WfActivity p "
				+ "where p.id.wfpId =:wfpId and p.isstart='1' ",
				WfActivity.class);
		query.setParameter("wfpId", wfpId);
		List<WfActivity> wfActivitys = query.getResultList();
		if (wfActivitys != null && wfActivitys.size() > 0) {
			WfActivity wfActivity = wfActivitys.get(0);

			// run  pre con
			System.out.println("ctx->"+ctx+"wfActivity.getJavaPreConImpl()->"+wfActivity.getJavaPreConImpl());
			
		//	ctx.
			/*PreConExecutor preConExecutor = (PreConExecutor) ctx
					.getBean(wfActivity.getJavaPreConImpl());
				preConExecutor.runPreCondition();*/
				
			// run activity
			/*ActivityExecutor activityExecutor = (ActivityExecutor) ctx
					.getBean(wfActivity.getJavaActivityImpl());
				activityExecutor.runActivity();*/
			WfActivityInstance wfActivityInstance = new WfActivityInstance();
			BeanUtils.copyProperties(wfActivityInstanceM, wfActivityInstance);
			String token = TokenUtils.genToken(10);
			wfActivityInstance.setWfActivityInstanceId(token);
			wfActivityInstance.setWfActivityInstanceStatus("1"); // active
			wfActivityInstance
					.setActivityId(wfActivity.getId().getActivityId());
			wfActivityInstance.setWfpiId(wfpiId);
			entityManager.persist(wfActivityInstance);
			entityManager.flush();
			BeanUtils.copyProperties(wfActivityInstance,wfActivityInstanceM );
			wfActivityInstanceM.setWfpiId(wfpiId);
			wfActivityInstanceM.setWfActivityInstanceId(wfActivityInstance.getWfActivityInstanceId());
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
		System.out.println("activityId=>"+ wfActivityInstanceM.getActivityId());
		System.out.println("activityConditionCode=>"+ wfActivityInstanceM.getApplicationStatus());
		System.out.println("xxxxxx=>");
		List<WfActivityCondition> wfActivityConditions = query.getResultList();
		if (wfActivityConditions != null && wfActivityConditions.size() > 0) {
			for (WfActivityCondition wfActivityCondition : wfActivityConditions) {
				// run  post con
				/*PostConExecutor postConExecutor = (PostConExecutor) ctx
						.getBean(wfActivityCondition.getJavaPostConImpl());
				postConExecutor.runPostCondition();	*/
				
				// get next activity
				String nextActivityId=wfActivityCondition.getNextActivityId();
				 query = entityManager.createQuery("select p from WfActivity p "
						+ "where p.id.wfpId =:wfpId and p.id.activityId=:activityId ",
						WfActivity.class);
					System.out.println("wfpId=>"+wfActivityInstanceM.getWfpId());
					System.out.println("activityId=>"+ nextActivityId);
					System.out.println("xxxxxx=>");
				query.setParameter("wfpId", wfActivityInstanceM.getWfpId());
				query.setParameter("activityId", nextActivityId);
				List<WfActivity> wfActivitys = query.getResultList();
				if (wfActivitys != null && wfActivitys.size() > 0) {
					WfActivity wfActivity = wfActivitys.get(0);

					// run  pre con
					/*PreConExecutor preConExecutor = (PreConExecutor) ctx
							.getBean(wfActivity.getJavaPreConImpl());
						preConExecutor.runPreCondition();*/
						
					// run activity
					/*ActivityExecutor activityExecutor = (ActivityExecutor) ctx
							.getBean(wfActivity.getJavaActivityImpl());
						activityExecutor.runActivity();*/
					WfActivityInstance wfActivityInstance = new WfActivityInstance();
					BeanUtils.copyProperties(wfActivityInstanceM, wfActivityInstance);
					String token = TokenUtils.genToken(10);
					wfActivityInstance.setWfActivityInstanceId(token);
					wfActivityInstance.setWfActivityInstanceIdPrev(wfActivityInstanceId);
					wfActivityInstance.setWfActivityInstanceStatus("1");
					wfActivityInstance
							.setActivityId(wfActivity.getId().getActivityId());
					entityManager.persist(wfActivityInstance);
					entityManager.flush();
					System.out.println("nextActivity=>"+ wfActivityInstanceM.getActivityId());
					System.out.println("activityConditionCode=>"+ wfActivityInstanceM.getApplicationStatus());
					System.out.println("getRefObjectId=>"+ wfActivityInstanceM.getRefObjectId());
					System.out.println("getWfpiId=>"+ wfActivityInstanceM.getWfpiId());
					// update status prev instance
					query = entityManager.createQuery("UPDATE WfActivityInstance p  set p.wfActivityInstanceStatus=:wfActivityInstanceStatus "
							+ "where p.wfActivityInstanceId =:wfActivityInstanceId"
							);
					query.setParameter("wfActivityInstanceId",wfActivityInstanceId);
					query.setParameter("wfActivityInstanceStatus", "0");
					 int updateCount = query.executeUpdate();
					 
					// check end process
					 if(wfActivity.getIsstart()!=null && wfActivity.getIsstart().equals("2")){
						 query = entityManager.createQuery("UPDATE WfPi p  set p.wfpiStatus=:wfpiStatus "
									+ "where p.id.wfpiId =:wfpiId and p.id.wfpId=:wfpId "
									);
						
							query.setParameter("wfpiId",wfActivityInstance.getWfpiId());
							query.setParameter("wfpId",wfActivity.getId().getWfpId());
							query.setParameter("wfpiStatus", "0");
							  updateCount = query.executeUpdate();
					 }
						
				}
			}
			
			// update status
			/*query = entityManager.createQuery("UPDATE WfActivityInstance p  set p.wfActivityInstanceStatus=:wfActivityInstanceStatus "
					+ "where p.wfActivityInstanceId =:wfActivityInstanceId"
					);
			query.setParameter("wfActivityInstanceId",wfActivityInstanceId);
			query.setParameter("wfActivityInstanceStatus", "0");
			 int updateCount = query.executeUpdate();*/
		}
		return wfActivityInstanceM;
	}

	@Override
	public List<WfActivityInstanceM> listTodoList(
			WfActivityInstanceM wfActivityInstanceM) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select p from WfActivityInstance p "
				+ "where  ( p.wfActivityInstanceOwnerUser =:wfActivityInstanceOwnerUser or p.wfActivityInstanceOwnerRole=:wfActivityInstanceOwnerRole ) "
				+ " and p.wfActivityInstanceStatus=:wfActivityInstanceStatus ",
				WfActivityInstance.class);
		query.setParameter("wfActivityInstanceOwnerRole", wfActivityInstanceM.getWfActivityInstanceOwnerRole());
		query.setParameter("wfActivityInstanceOwnerUser", wfActivityInstanceM.getWfActivityInstanceOwnerUser());
		query.setParameter("wfActivityInstanceStatus", wfActivityInstanceM.getWfActivityInstanceStatus());
		List<WfActivityInstance> wfActivityInstances = query.getResultList();
		List<WfActivityInstanceM> WfActivityInstanceModels = new ArrayList<WfActivityInstanceM>(wfActivityInstances.size());
		for (WfActivityInstance wfActivityInstance : wfActivityInstances) {
			WfActivityInstanceM wfActivityInstanceModel =new WfActivityInstanceM();
			BeanUtils.copyProperties(wfActivityInstance, wfActivityInstanceModel);
			WfActivityInstanceModels.add(wfActivityInstanceModel);
		}
		return WfActivityInstanceModels;
	}

}
