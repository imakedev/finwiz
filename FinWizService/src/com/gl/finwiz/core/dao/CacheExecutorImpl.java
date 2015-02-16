package com.gl.finwiz.core.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gl.finwiz.core.model.ParamPageM;
import com.gl.finwiz.core.service.CacheExecutor;

@Repository("cacheExecutorImpl")
@Transactional
public class CacheExecutorImpl implements CacheExecutor{
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public ParamPageM loadPage(ParamPageM paramPageM) {
		// TODO Auto-generated method stub
		return null;
	}
}
