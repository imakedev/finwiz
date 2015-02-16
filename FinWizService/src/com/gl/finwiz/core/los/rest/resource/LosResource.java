package com.gl.finwiz.core.los.rest.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.restlet.representation.Representation;
import org.restlet.representation.Variant;
import org.restlet.resource.ResourceException;
import org.springframework.beans.factory.annotation.Autowired;

import com.gl.finwiz.core.constant.ServiceConstant;
import com.gl.finwiz.core.los.model.LosApplicationM;
import com.gl.finwiz.core.los.service.LosExecutor;
import com.gl.finwiz.core.rest.resource.BaseResource;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;

public class LosResource extends BaseResource {
	private static final Logger logger = Logger.getLogger(ServiceConstant.LOG_APPENDER);  
	@Autowired
	private LosExecutor losExecutor;
	private com.thoughtworks.xstream.XStream xstream; 
	public LosResource() {
		super();
		logger.debug("into constructor LosResource");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doInit() throws ResourceException {
		// TODO Auto-generated method stub
		super.doInit();
		logger.debug("into doInit");
	}
	
	@Override
	protected Representation post(Representation entity, Variant variant)
			throws ResourceException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		logger.debug("into Post ConsultantReportResource 2");
		InputStream in = null;
		try {
			in = entity.getStream();
			xstream.processAnnotations(LosApplicationM.class);// or xstream.autodetectAnnotations(true); (Auto-detect  Annotations)
			LosApplicationM xbpsTerm = new LosApplicationM();
			Object ntcCalendarObj = xstream.fromXML(in);
			if (ntcCalendarObj != null) {
				xbpsTerm = (LosApplicationM) ntcCalendarObj;
				if (xbpsTerm != null) { 
					if (xbpsTerm.getServiceName() != null
							&& xbpsTerm.getServiceName().length()!=0) {
						logger.debug(" BPS servicename = "
								+ xbpsTerm.getServiceName());
						String serviceName = xbpsTerm.getServiceName();
						
						if(serviceName.equals(ServiceConstant.LOS_APPLICATION_SAVE)){
							FinWizResultMessage vresultMessage = new FinWizResultMessage();
							Long mqId= losExecutor.saveLosApplication(xbpsTerm);
							int updateRecord=mqId.intValue(); 
							//xbpsTerm.setMqId(mqId);
							  if(xbpsTerm!=null){
									List<LosApplicationM> xntcCalendars = new ArrayList<LosApplicationM>(1);
									xbpsTerm.setPagging(null);							 
									xntcCalendars.add(xbpsTerm);
									vresultMessage.setResultListObj(xntcCalendars);
								}
								return getRepresentation(entity, vresultMessage, xstream);
					 }else if(serviceName.equals(ServiceConstant.LOS_APPLICATION_SAVE_VERSION)){
							FinWizResultMessage vresultMessage = new FinWizResultMessage();
							Long mqId= losExecutor.saveLosApplicationVersion(xbpsTerm);
							int updateRecord=mqId.intValue(); 
							//xbpsTerm.setMqId(mqId);
							  if(xbpsTerm!=null){
									List<LosApplicationM> xntcCalendars = new ArrayList<LosApplicationM>(1);
									xbpsTerm.setPagging(null);							 
									xntcCalendars.add(xbpsTerm);
									vresultMessage.setResultListObj(xntcCalendars);
								}
								return getRepresentation(entity, vresultMessage, xstream);
					 }else if(serviceName.equals(ServiceConstant.LOS_APPLICATION_FIND_BY_ID)){
							FinWizResultMessage vresultMessage = new FinWizResultMessage();
							xbpsTerm = losExecutor.findLosApplicationById(xbpsTerm.getLosAppId());
							//int updateRecord=mqId.intValue(); 
							//xbpsTerm.setMqId(mqId);
							  if(xbpsTerm!=null){
									List<LosApplicationM> xntcCalendars = new ArrayList<LosApplicationM>(1);
									xbpsTerm.setPagging(null);							 
									xntcCalendars.add(xbpsTerm);
									vresultMessage.setResultListObj(xntcCalendars);
								}
								return getRepresentation(entity, vresultMessage, xstream);
					 }else if(serviceName.equals(ServiceConstant.LOS_APPLICATION_UPDATE)){
							FinWizResultMessage vresultMessage = new FinWizResultMessage();
							Long mqId= losExecutor.updateLosApplicationVersion(xbpsTerm);
							int updateRecord=mqId.intValue(); 
							//xbpsTerm.setMqId(mqId);
							  if(xbpsTerm!=null){
									List<LosApplicationM> xntcCalendars = new ArrayList<LosApplicationM>(1);
									xbpsTerm.setPagging(null);							 
									xntcCalendars.add(xbpsTerm);
									vresultMessage.setResultListObj(xntcCalendars);
								}
								return getRepresentation(entity, vresultMessage, xstream);
					 }else if(serviceName.equals(ServiceConstant.LOS_APPLICATION_SEARCH)){
							//Pagging page = xbpsTerm.getPagging(); 
							@SuppressWarnings("rawtypes")
							List result = (List) losExecutor.searchLosApplication(xbpsTerm);
							 FinWizResultMessage vresultMessage = new FinWizResultMessage();
							if(result!=null){		
								vresultMessage.setResultListObj(result);
							}
							return getRepresentation(entity, vresultMessage, xstream);	
					 }
					}else {
					}
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			logger.debug(" into Finally Call");
			try {
				if (in != null)
					in.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	
	}

	

	public com.thoughtworks.xstream.XStream getXstream() {
		return xstream;
	}

	public void setXstream(com.thoughtworks.xstream.XStream xstream) {
		this.xstream = xstream;
	}


}
