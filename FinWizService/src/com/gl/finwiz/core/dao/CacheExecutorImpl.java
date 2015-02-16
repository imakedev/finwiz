package com.gl.finwiz.core.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gl.finwiz.core.domain.SystemCache;
import com.gl.finwiz.core.model.CacheM;
import com.gl.finwiz.core.service.CacheExecutor;

@Repository("cacheExecutorImpl")
@Transactional
public class CacheExecutorImpl implements CacheExecutor{
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;

	
	@Override
	public CacheM refresh(CacheM cacheM) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CacheM refreshAll() {
		// TODO Auto-generated method stub
		CacheM cacheM=new CacheM();
		Query query=entityManager.createQuery("select u from SystemCache u where u.cacheStatus=1 ", SystemCache.class);
		Map m =new HashMap();
		List<SystemCache> systemCaches=query.getResultList();
		for (SystemCache systemCache : systemCaches) {
			
			String cacheId=systemCache.getCacheId();
			String tableName=systemCache.getTableName();
			String columnKey=systemCache.getColumnKey();
			String columnDesc=systemCache.getColumnDesc();
			query=entityManager.createNativeQuery("select u."+columnKey+"  , u."+columnDesc+" from "+tableName+" u "
					+ "  ");
		 List list=	query.getResultList();
		
		 if(list!=null && list.size()>0){
			 int size=list.size();
			 List result=new ArrayList(size);
			 for (int i = 0; i < size; i++) {
				Object[] obj= (Object[])list.get(i);
				String[] values=new String[2];
					values[0]=(obj[0]!=null)?((String)(obj[0])):"";
					values[1]=(obj[1]!=null)?((String)(obj[1])):"";
					result.add(values);
			 }
			 m.put(cacheId,result);
		 }
			
		}
		cacheM.setCacheObject(m);
	//	System.out.println(userLogins);
		return cacheM;
	}

	@Override
	public CacheM getCache(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCacheSize() {
		// TODO Auto-generated method stub
		return 0;
	}
}
