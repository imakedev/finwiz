package com.gl.finwiz.core.rest.application;

import org.restlet.Application;
import org.restlet.Restlet;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author Chatchai Pimtun (Admin)
 *
 */
public class CommonResourceApplication extends Application {


    /**
     * Creates a root Restlet that will receive all incoming calls.
     */
	
   @Override
    public synchronized Restlet createInboundRoot(){
    //createRoot() {
        // Create a router Restlet that defines routes.
    	//System.out.println("yyyyyyyyyyyy createInboundRoot xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    	final   ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext(
                 new String[] {
                		 "com/gl/finwiz/core/rest/config/applicationContext-common.xml",
                		 "com/gl/finwiz/core/rest/config/applicationContext-hibernate.xml",
                		 "com/gl/finwiz/core/rest/config/applicationContext-finwiz-resource.xml",
                		 "com/gl/finwiz/core/rest/config/applicationContext-root-router.xml"});  
        // Add a route for the MailRoot resource
    	org.restlet.ext.spring.SpringRouter router = (org.restlet.ext.spring.SpringRouter)springContext.getBean("root");
    	springContext.close();
        return router;
    } 
     
}
