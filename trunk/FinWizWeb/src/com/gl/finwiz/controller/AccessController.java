package com.gl.finwiz.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.LocaleEditor;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.gl.finwiz.service.FinwizService;

@Controller
@RequestMapping
public class AccessController {
	@Autowired(required=true)
	@Qualifier("finWizServiceimpl")
	private FinwizService finwizService;
	@RequestMapping("/login")
	public String login(HttpServletRequest request,HttpServletResponse response,Model model, @RequestParam(required=false) String message) {
		
		String language=request.getParameter("language");
    	if(language!=null && language.length()>0){
    	 LocaleEditor localeEditor = new LocaleEditor();
         localeEditor.setAsText(language);

         LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
         localeResolver.setLocale(request, response,
             (Locale) localeEditor.getValue());
    	}
    	System.out.println("login");
		return "access/login";
	}
	
	@RequestMapping(value = "/denied")
 	public String denied() {
		return "access/denied";
	}
	@RequestMapping(value = "/checking")
   public String checking(Model model,HttpServletRequest request) {
	//	MissTestResult missTest=new MissTestResult();
		String userid=SecurityContextHolder.getContext().getAuthentication().getName();
		//missTest.setUserid(userid);
		int result=0;//finwizService.checkMissTestResult(missTest);
		String	useragent = request.getHeader("User-Agent");
		String user = useragent.toLowerCase();
		String band="";
		 if(user.indexOf("firefox") != -1) {
			band="Firefox"; 		
		} else if(user.indexOf("chrome") != -1) {
			band="Chrome";
		} else if(user.indexOf("opera") != -1) {
			band="Opera";
		} else if(user.indexOf("safari") != -1) {
			band="Safari";
		} else if(user.indexOf("msie") != -1) {
			band="IE";
		}  
		/* MissSystemUse missSystemUse=new MissSystemUse(); 
			missSystemUse.setMsystemType(1L);
			missSystemUse.setMsystemUserId(userid); 
			missSystemUse.setMsystemBrowserBand(band);
			missSystemUse.setMsystemBrowserVersion(getVersionBrowser(band,user)); 
			missSystemUse.setMsystemBrowserFullVersion(useragent); */
			//finwizService.saveMissSystemUse(missSystemUse);
		if(result==1){ 
			model.addAttribute("message", "You test finish"); 
			return "access/login";
		}else
			return "redirect:/";
	}
	
	@RequestMapping(value = "/login/failure")
 	public String loginFailure(Model model,HttpServletRequest request,HttpServletResponse response) { 
		String message = "Invalid User or Password.";
		if(!LocaleContextHolder.getLocale().getDisplayLanguage().equals("English"))
			message="ชื่อผู้ใช้ หรือ รหัสผ่าน ไม่ถู�?ต้อง.";
		String language=request.getParameter("language");
		
		if(language!=null && language.length()>0){
	    	 LocaleEditor localeEditor = new LocaleEditor();
	         localeEditor.setAsText(language);
 
	         LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
	         localeResolver.setLocale(request, response,
	             (Locale) localeEditor.getValue());
	         message="";
	    	}
		model.addAttribute("message", message);
		return "access/login";
	}
	
	@RequestMapping(value = "/logout/success")
 	public String logoutSuccess() {
		String message = "Logout Success!";
		return "redirect:/login?message="+message;
	}
	private String getVersionBrowser(String band,String fullAgent){
		String version=""; 
		if(band.length()>0){
			String[] versions=fullAgent.split(" ");
			if("Chrome".equals(band)){				
				for (int i = 0; i < versions.length; i++) {
					if(versions[i].indexOf("chrome")!=-1){
						version=versions[i].split("/")[1];
						break;
					}
				}
			}else if("Firefox".equals(band)){
				for (int i = 0; i < versions.length; i++) {
					if(versions[i].indexOf("firefox")!=-1){
						version=versions[i].split("/")[1];
						break;
					}
				}
			}else if("Opera".equals(band)){
				for (int i = 0; i < versions.length; i++) {
					if(versions[i].indexOf("version")!=-1){
						version=versions[i].split("/")[1];
						break;
					}
				}
			}else if("Safari".equals(band)){
				for (int i = 0; i < versions.length; i++) {
					if(versions[i].indexOf("version")!=-1){
						version=versions[i].split("/")[1];
						break;
					}
				}
			}else if("IE".equals(band)){
				 versions=fullAgent.split(";");
				for (int i = 0; i < versions.length; i++) {
					if(versions[i].trim().indexOf("msie")!=-1){
						versions[i]=versions[i].trim();
						version=versions[i].split(" ")[1];
						break;
					}
				}
			}
			
		}
		return version;
	}
	@RequestMapping(value = "/login/duplicate") 
 	public String loginDuplicate(Model model,HttpServletRequest request,HttpServletResponse response) {
		String message = "This Account already been used."; 
		if(!LocaleContextHolder.getLocale().getDisplayLanguage().equals("English"))
			message="aoe";
		String language=request.getParameter("language");
		
		if(language!=null && language.length()>0){
	    	 LocaleEditor localeEditor = new LocaleEditor();
	         localeEditor.setAsText(language);
 
	         LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
	         localeResolver.setLocale(request, response,
	             (Locale) localeEditor.getValue());
	         message="";
	    	}
		model.addAttribute("message", message);
		return "access/login";
	}
}