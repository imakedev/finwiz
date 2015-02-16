package com.gl.finwiz.core.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("wftoDoListExecutorImpl")
@Transactional
public class WFToDoListExecutorImpl {
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;
}
