package com.gl.finwiz.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.gl.finwiz.core.xstream.common.FinWizResultMessage;
import com.gl.finwiz.core.xstream.common.FinWizXML;
import com.gl.finwiz.core.xstream.common.Paging;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
/*import th.co.vlink.utils.Pagging;
import th.co.vlink.xstream.common.VResultMessage;
import th.co.vlink.xstream.common.VServiceXML;
*/
 
public class PostCommon {
	public static final int PAGE_SIZE = 5; 
	public FinWizResultMessage postMessage(FinWizXML vserviceXML,@SuppressWarnings("rawtypes") Class[] className,String endPoint,boolean isReturn) {
		//HttpPost httppost = new HttpPost(ServiceConstant.hostReference+endPoint); 
		//HttpPost httppost = new HttpPost("http://localhost:3003/v1/"+endPoint);
//		HttpPost httppost = new HttpPost("http://192.168.1.199:3000/v1/"+endPoint);
		
		//HttpPost httppost = new HttpPost("http://192.168.1.118:3000/v1/"+endPoint);
		 HttpPost httppost = new HttpPost("http://localhost:3000/v1/"+endPoint);
		 
		//HttpPost httppost = new HttpPost("http://localhost:8080/MISSExamServices/rest/"+endPoint);
				
				//HttpPost httppost = new HttpPost("http://10.0.20.27:3000/v1/"+endPoint);
				//Test
				//HttpPost httppost = new HttpPost("http://10.2.0.94:10000/BPSService/RestletServlet/"+endPoint);
				
				
				XStream xstream = new XStream(new Dom4JDriver());
				/*Class c  = null;
				try {
					  c = Class.forName(className);
				} catch (ClassNotFoundException e2) {
					e2.printStackTrace();
				}*/
				xstream.processAnnotations(className);
				int startIndex = 0;
				if(vserviceXML.getPaging()==null){
					Paging p = new Paging();
					p.setPageNo(1);
					p.setPageSize(PAGE_SIZE);
					vserviceXML.setPagging(p);
				}
				startIndex = vserviceXML.getPaging().getPageNo()==1?0:(vserviceXML.getPaging().getPageNo()-1)*vserviceXML.getPaging().getPageSize();
				vserviceXML.getPaging().setStartIndex(startIndex);
				String xString = xstream.toXML(vserviceXML);
				ByteArrayEntity entity = null;
				try {
					entity = new ByteArrayEntity(xString.getBytes("UTF-8"));
				} catch (UnsupportedEncodingException e1) {
					e1.printStackTrace();
				}
				httppost.setEntity(entity); 
				HttpClient httpclient = new DefaultHttpClient(); 
				HttpResponse response = null;
				HttpEntity resEntity = null;
				try {
					response = httpclient.execute(httppost);
					resEntity = response.getEntity();
				} catch (ClientProtocolException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				FinWizResultMessage  vresultMessage = null; 
				InputStream in = null;
			if (isReturn) {
			 if (resEntity != null) {
			
					try {
						in = resEntity.getContent();
						xstream.processAnnotations(FinWizResultMessage.class); 
						Object obj = xstream.fromXML(in);
						if(obj!=null){
							vresultMessage = (FinWizResultMessage)obj; 
							 
							int maxRow = 0;
							if(vresultMessage.getMaxRow()!=null && vresultMessage.getMaxRow().length()!=0)
								maxRow = Integer.parseInt(vresultMessage.getMaxRow());
							int pageSize = 0;
							if(vserviceXML.getPaging()!=null )
								pageSize = vserviceXML.getPaging().getPageSize();				
							int lastpage = (maxRow/pageSize)+((maxRow%pageSize)==0?0:1);
							vresultMessage.setLastpage(lastpage+"");
						}
					} catch (IllegalStateException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if(in!=null)
							in.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
			 	}
			}
				httpclient.getConnectionManager().shutdown();
				return    vresultMessage ;
	}
	public FinWizResultMessage postMessage(FinWizXML vserviceXML,String className,String endPoint,boolean isReturn) {
		@SuppressWarnings("rawtypes")
		Class c  = null;
		try {
			  c = Class.forName(className);
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		}
		@SuppressWarnings("rawtypes")
		Class[] classArray=new Class[]{c};
		//classArray[0]=c;
		return postMessage(vserviceXML,classArray,endPoint,isReturn);
	}
}
