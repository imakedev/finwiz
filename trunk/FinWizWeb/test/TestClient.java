import com.gl.finwiz.core.model.CacheM;
import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.service.FinwizService;
import com.gl.finwiz.service.impl.FinWizServiceImpl;
import com.thoughtworks.xstream.XStream;


public class TestClient {
	public static void main(String[] args) {
		TestClient client=new TestClient();
		FinwizService service =new FinWizServiceImpl();
		client.test(service);
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
