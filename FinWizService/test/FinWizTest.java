

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.finwiz.core.los.model.LosApplicationM;
import com.gl.finwiz.core.los.service.LosExecutor;
import com.gl.finwiz.core.model.CacheM;
import com.gl.finwiz.core.model.ParamPageM;
import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.model.WfActivityInstanceM;
import com.gl.finwiz.core.service.CacheExecutor;
import com.gl.finwiz.core.service.LoadFormExecutor;
import com.gl.finwiz.core.service.WFProcessExecutor;
import com.gl.finwiz.core.userprofile.service.UserProfileService;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;
import com.thoughtworks.xstream.XStream;



public class FinWizTest {
	public void testWF(WFProcessExecutor wfProcessExecutor){
		System.out.println(wfProcessExecutor);
		WfActivityInstanceM  wfActivityInstanceM =new WfActivityInstanceM();
		wfActivityInstanceM.setRefObjectId("0001");
		wfActivityInstanceM.setFinId("THGL0000000001");
		wfActivityInstanceM.setWfpId("WFP0001");
		wfActivityInstanceM.setApplicationStatus("0001");
		//wfProcessExecutor.startWfProcess(wfActivityInstanceM);
		wfActivityInstanceM.setWfActivityInstanceId("2kk07m8q95");
		wfActivityInstanceM.setActivityId("1");
		wfActivityInstanceM.setApplicationStatus("0002");
		
		wfProcessExecutor.nextActivity(wfActivityInstanceM);
	}
	public void testLosList(LosExecutor losExecutor){
		
		LosApplicationM losApplication =new LosApplicationM();
		losApplication.setUpdatedBy("checker");
		List<LosApplicationM> list = losExecutor.searchLosApplication(losApplication );
		 System.out.println("list="+list);
		/*List va= (String[])list.get(0);*/ 
		
		
	}
	public void testCache(CacheExecutor cacheExecutor){
		CacheM cacheM=new CacheM();
	
		cacheM = cacheExecutor.refreshAll();
		Map m=cacheM.getCacheObject();
		List list =(List)m.get("TITLE");
		String[] result1=(String[])list.get(0);
	
		System.out.println(result1[0]);
		/*List va= (String[])list.get(0);
		
		 System.out.println("list="+va[0]);*/
	}
	public void testLoadPage(LoadFormExecutor loadFormExecutor){
		ParamPageM paramPageM=new ParamPageM();
		paramPageM.setPageId("5");
		paramPageM.setRoleId("DE_ROLE");
		 paramPageM = loadFormExecutor.loadPage(paramPageM);
		 System.out.println("param"+paramPageM.getParamTabs());
	}
	public void testLogin(UserProfileService userProfileService){
		UserLoginM userLoginM=new UserLoginM();
		userLoginM.setUserId("checker");
		userLoginM.setPassword("password");
		userLoginM.setCountryId("th");
		userLoginM.setCompanyId("gl");
		System.out.println(userProfileService);
		FinWizResultMessage vresultMessage = userProfileService.login(userLoginM);
		userLoginM = (UserLoginM)vresultMessage.getResultListObj().get(0);
		  XStream xstream =new XStream();
	        xstream.processAnnotations(UserLoginM.class);
	        System.out.println(xstream.toXML(userLoginM));
	}
	public static void main(String[] args) {
		System.out.println("************** BEGINNING PROGRAM **************");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config-test.xml");
		FinWizTest finWizTest=new FinWizTest();
		/*UserProfileService userProfileService = (UserProfileService) context
				.getBean("userProfileService");*/
		WFProcessExecutor wfProcessExecutor = (WFProcessExecutor) context
				.getBean("WFProcessExecutorImpl");
		finWizTest.testWF(wfProcessExecutor);
		/*LoadFormExecutor loadFormExecutor = (LoadFormExecutor) context
				.getBean("loadFormExecutorImpl");
		finWizTest.testLoadPage(loadFormExecutor);*/
		
	/*	CacheExecutor cacheExecutor = (CacheExecutor) context
				.getBean("cacheExecutorImpl");
		finWizTest.testCache(cacheExecutor);
		LosExecutor losExecutor = (LosExecutor) context
				.getBean("losExecutorImpl");
		finWizTest.testLosList(losExecutor);*/
		
		//finWizTest.testLogin(userProfileService);
				//.getBean("userServiceJdbcImp");
	/*	Aoe person = new Aoe();
		person.setName("Alba");*/
		
		/*JAXBContext jc=null;
		try {
			jc = JAXBContext.newInstance(UserLoginM.class);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
        Marshaller marshaller=null;
		try {
			marshaller = jc.createMarshaller();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		} catch (PropertyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			marshaller.marshal(userLoginM, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
      
	/*	System.out.println("Person : " + person + " added successfully");
		List<Aoe> persons = personService.fetchAllUsers();
		System.out.println("The list of all personss = " + persons);*/
		System.out.println("************** ENDING PROGRAM *****************");
		
	}
}