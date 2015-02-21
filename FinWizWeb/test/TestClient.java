import com.gl.finwiz.core.model.CacheM;
import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.model.WfActivityInstanceM;
import com.gl.finwiz.service.FinwizService;
import com.gl.finwiz.service.impl.FinWizServiceImpl;
import com.thoughtworks.xstream.XStream;


public class TestClient {
	public static void main(String[] args) {
		TestClient client=new TestClient();
		FinwizService service =new FinWizServiceImpl();
		client.testWF(service);
	}
	public void testWF(FinwizService finwizService){
		System.out.println(finwizService);
		WfActivityInstanceM  wfActivityInstanceM =new WfActivityInstanceM();
		wfActivityInstanceM.setRefObjectId("0001");
		wfActivityInstanceM.setFinId("THGL0000000001");
		wfActivityInstanceM.setWfpId("WFP0001");
		wfActivityInstanceM.setApplicationStatus("0001");
		finwizService.startWfProcess(wfActivityInstanceM);
		wfActivityInstanceM.setWfActivityInstanceId("2kk07m8q95");
		wfActivityInstanceM.setActivityId("1");
		wfActivityInstanceM.setApplicationStatus("0002");
		
		//finwizService.nextActivity(wfActivityInstanceM);
	}
	public void testCache(FinwizService service){
		CacheM cacheM=new CacheM();
	
		/*cacheM = service.refreshAll();
		Map m=cacheM.getCacheObject();
		List list =(List)m.get("TITLE");
		String[] result1=(String[])list.get(0);
	
		System.out.println(result1[0]);*/
		/*List va= (String[])list.get(0);
		
		 System.out.println("list="+va[0]);*/
	}
	public void test(FinwizService service){
		
		
		UserLoginM userLoginM=new UserLoginM();
		userLoginM.setUserId("checker");
		userLoginM.setPassword("password");
		userLoginM.setCountryId("th");
		userLoginM.setCompanyId("gl");
		System.out.println(service);
		UserLoginM vresultMessage = service.login(userLoginM);
		//userLoginM = (UserLoginM)vresultMessage.getResultListObj().get(0);
		  XStream xstream =new XStream();
	        xstream.processAnnotations(UserLoginM.class);
	        System.out.println(xstream.toXML(userLoginM));
	}
}
