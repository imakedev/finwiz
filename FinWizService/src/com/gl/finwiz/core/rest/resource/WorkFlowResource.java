package com.gl.finwiz.core.rest.resource;

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
import com.gl.finwiz.core.model.WfActivityInstanceM;
import com.gl.finwiz.core.service.WFProcessExecutor;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;

public class WorkFlowResource extends BaseResource {
	private static final Logger logger = Logger.getLogger(ServiceConstant.LOG_APPENDER);  
	@Autowired
	private WFProcessExecutor wfProcessExecutor;
	private com.thoughtworks.xstream.XStream xstream; 
	public WorkFlowResource() {
		super();
		logger.debug("into constructor WorkFlowResource");
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
			
			xstream.processAnnotations(WfActivityInstanceM.class);// or xstream.autodetectAnnotations(true); (Auto-detect  Annotations)
			WfActivityInstanceM xbpsTerm = new WfActivityInstanceM();
			Object ntcCalendarObj = xstream.fromXML(in);
			if (ntcCalendarObj != null) {
				xbpsTerm = (WfActivityInstanceM) ntcCalendarObj;
				if (xbpsTerm != null) { 
					if (xbpsTerm.getServiceName() != null
							&& xbpsTerm.getServiceName().length()!=0) {
						logger.debug(" BPS servicename = "
								+ xbpsTerm.getServiceName());
						String serviceName = xbpsTerm.getServiceName();
						if(serviceName.equals(ServiceConstant.WF_START)){
							FinWizResultMessage vresultMessage = new FinWizResultMessage();
							System.out.println("xx="+wfProcessExecutor);
							xbpsTerm = wfProcessExecutor.startWfProcess(xbpsTerm);
							//xbpsTerm= cacheExecutor.loadPage(xbpsTerm);
							  if(xbpsTerm!=null){
									List<WfActivityInstanceM> xntcCalendars = new ArrayList<WfActivityInstanceM>(1);
									xbpsTerm.setPagging(null);							 
									xntcCalendars.add(xbpsTerm);
									vresultMessage.setResultListObj(xntcCalendars);
								}
								return getRepresentation(entity, vresultMessage, xstream);
					 }else if(serviceName.equals(ServiceConstant.WF_NEXT)){
							FinWizResultMessage vresultMessage = new FinWizResultMessage();
							//xbpsTerm= cacheExecutor.loadPage(xbpsTerm);
							xbpsTerm = wfProcessExecutor.nextActivity(xbpsTerm);
							  if(xbpsTerm!=null){
									List<WfActivityInstanceM> xntcCalendars = new ArrayList<WfActivityInstanceM>(1);
									xbpsTerm.setPagging(null);							 
									xntcCalendars.add(xbpsTerm);
									vresultMessage.setResultListObj(xntcCalendars);
								}
								return getRepresentation(entity, vresultMessage, xstream);
					 }else if(serviceName.equals(ServiceConstant.TODOLIST_GET)){
							FinWizResultMessage vresultMessage = new FinWizResultMessage();
							//xbpsTerm= cacheExecutor.loadPage(xbpsTerm);
							List<WfActivityInstanceM> xntcCalendars  = wfProcessExecutor.listTodoList(xbpsTerm);
							  if(xntcCalendars!=null){
								//	List<WfActivityInstanceM> xntcCalendars = new ArrayList<WfActivityInstanceM>(1);
								/*	xbpsTerm.setPagging(null);							 
									xntcCalendars.add(xbpsTerm);*/
									vresultMessage.setResultListObj(xntcCalendars);
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
