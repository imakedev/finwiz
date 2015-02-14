package com.gl.finwiz.core.userprofile.rest.resource;

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
import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.rest.resource.BaseResource;
import com.gl.finwiz.core.userprofile.service.UserProfileService;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;


public class UserProfileResource extends BaseResource {
	private static final Logger logger = Logger.getLogger(ServiceConstant.LOG_APPENDER);  
	@Autowired
	private UserProfileService userProfileService;
	//private ConsultantReportService consultantReportService;
	private com.thoughtworks.xstream.XStream xstream; 
	public UserProfileResource() {
		super();
		logger.debug("into constructor ConsultantReportResource");
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
			xstream.processAnnotations(UserLoginM.class);// or xstream.autodetectAnnotations(true); (Auto-detect  Annotations)
			UserLoginM xbpsTerm = new UserLoginM();
			Object ntcCalendarObj = xstream.fromXML(in);
			if (ntcCalendarObj != null) {
				xbpsTerm = (UserLoginM) ntcCalendarObj;
				if (xbpsTerm != null) { 
					if (xbpsTerm.getServiceName() != null
							&& xbpsTerm.getServiceName().length()!=0) {
						logger.debug(" BPS servicename = "
								+ xbpsTerm.getServiceName());
						String serviceName = xbpsTerm.getServiceName();
						
						if(serviceName.equals(ServiceConstant.USER_PROFILE_LOGIN)){
							FinWizResultMessage vresultMessage = new FinWizResultMessage();
							vresultMessage = userProfileService.login(xbpsTerm);
							  /* if(xbpsTerm!=null){
									List<UserLoginM> xntcCalendars = new ArrayList<UserLoginM>(1);
									xbpsTerm.setPagging(null);							 
									xntcCalendars.add(xbpsTerm);
									vresultMessage.setResultListObj(xntcCalendars);
								}*/
								return getRepresentation(entity, vresultMessage, xstream);
					}else if(serviceName.equals(ServiceConstant.USER_PROFILE_LOOUT)){
						
						FinWizResultMessage vresultMessage = new FinWizResultMessage();
							if(xbpsTerm!=null){
								List<UserLoginM> xntcCalendars = new ArrayList<UserLoginM>(1);
								xbpsTerm.setPagging(null);							 
								xntcCalendars.add(xbpsTerm);
								vresultMessage.setResultListObj(xntcCalendars);
							}
							return getRepresentation(entity, vresultMessage, xstream);
						}  
						
					} else {
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

	
	@Override
	protected Representation get(Variant variant) throws ResourceException {
		// TODO Auto-generated method stub
		System.out.println("aoe->"+userProfileService);
		 return null;
	} 


	public com.thoughtworks.xstream.XStream getXstream() {
		return xstream;
	}

	public void setXstream(com.thoughtworks.xstream.XStream xstream) {
		this.xstream = xstream;
	}

}
