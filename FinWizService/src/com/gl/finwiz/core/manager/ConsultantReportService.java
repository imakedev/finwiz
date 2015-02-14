package com.gl.finwiz.core.manager;

import org.springframework.dao.DataAccessException;

import com.gl.finwiz.core.domain.ConsultantReport;


public interface ConsultantReportService {
	public ConsultantReport findConsultantReport(String mode,String mcontactId,String month,String year) throws DataAccessException ;
	public ConsultantReport findSales(String query) throws DataAccessException ;
}
