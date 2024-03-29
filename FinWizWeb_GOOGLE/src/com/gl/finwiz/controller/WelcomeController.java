// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 5/27/2012 12:06:21 AM
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   WelcomeController.java

package com.gl.finwiz.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;
import com.gl.finwiz.core.xstream.common.Paging;
import com.gl.finwiz.form.FinWizForm;
import com.gl.finwiz.form.validator.FinwizValidateExecutorImpl;
import com.gl.finwiz.model.LosApplicationM;
import com.gl.finwiz.service.FinWizExecutor;
import com.gl.finwiz.service.FinwizService;

@Controller 
public class WelcomeController
{
	@Autowired
	@Qualifier("finWizServiceImpl")
	private FinwizService finwizService;
	@Autowired
	private ApplicationContext ctx;
	@Autowired
    @Qualifier("finwizValidateExecutorImpl")
    private Validator validator;
	private static int PAGE_SIZE=20;
	  private static String MAIL_SERVER = "";
	  private static String MAIL_PROTOCAL = "";
	  private static String MAIL_PORT="";
	  private static String MAIL_USE_AUTHEN="";
	  private static String MAIL_EMAIL="";
	  private static String MAIL_PASSWORD=""; 
	  private static String MAIL_PERSONAL_NAME="";
	  private static String MAIL_TLS="";
	 // private static ResourceBundle bundle;
		static{
		/*	bundle =  ResourceBundle.getBundle( "config" );		
			MAIL_SERVER=bundle.getString("mail.host");
			MAIL_PROTOCAL=bundle.getString("mail.protocal");
			MAIL_USE_AUTHEN=bundle.getString("mail.useAuthen");
			MAIL_PORT=bundle.getString("mail.port");
			MAIL_EMAIL=bundle.getString("mail.email");
			MAIL_PASSWORD=bundle.getString("mail.password");
			MAIL_PERSONAL_NAME=bundle.getString("mail.personal_name");
			MAIL_TLS=bundle.getString("mail.TLS");*/
		}
		 @InitBinder
		    protected void initBinder(WebDataBinder binder) {
		        binder.setValidator(new FinwizValidateExecutorImpl());
		 }
		 @RequestMapping(value={"/save"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
		    public String doSave(@Valid LosApplicationM losApplicationM, BindingResult bindingResult) {
			 if (bindingResult.hasErrors()) {
		            return "form";
		        }
			  return "finwiz/index";
		    }
	  /*  @RequestMapping(value={"/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	    public String getNewForm(HttpServletRequest request,HttpServletResponse response,  Model model)
	    {
	    	 System.out.println(ctx);	
	    	 FinWizExecutor finwizService = (FinWizExecutor) ctx
	 				.getBean("losService");
	    	 System.out.println(finwizService);	
	    	String language=request.getParameter("language");
	        System.out.println("xxx");	
	        return "finwiz/index";
	    }*/
	    @RequestMapping(value={"/los_checker_inbox"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	    public String getLos01Form(HttpServletRequest request,HttpServletResponse response,  Model model)
	    {
	    	
	        System.out.println("los_checker_inbox");
	        model.addAttribute("haveTab", true);
	        return "finwiz/los/los_checker_inbox";
	    }
	    @RequestMapping(value={"/los_checker_input"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	    public String getLos02Form(HttpServletRequest request,HttpServletResponse response,  Model model)
	    {
	    	
	        System.out.println("los_checker_input");	
	        return "finwiz/los/los_checker_input";
	    }
    @RequestMapping(value={"/template/todolist"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String getToDoList(Model model, @RequestParam(value="pageNo", required=false) String pageNoStr)
    {
       // Authentication auth = SecurityContextHolder.getContext().getAuthentication();
      //  String name = auth.getName();
      //  logger.debug((new StringBuilder(" name  ===>")).append(name).toString());
       // logger.debug((new StringBuilder(" auth.getAuthorities() ====>")).append(auth.getAuthorities()).toString());
        int pageNo = 1;
        if(pageNoStr != null && pageNoStr.length()!=0)
            pageNo = Integer.parseInt(pageNoStr);
        Paging page = new Paging();
        page.setPageNo(pageNo);
        page.setPageSize(PAGE_SIZE);
      /*  MissTodo missTodo = new MissTodo();
        missTodo.setPagging(page);
        if(model.containsAttribute("UserMissContact")){
        	MissContact missContact= (MissContact)model.asMap().get("UserMissContact");
        	if(missContact.getIsMC()!=null && missContact.getIsMC().equals("0")){
        		 MissAccount missAccount = new MissAccount(); 
        		 missAccount.setMaId(missContact.getMcontactRef());
        		 missTodo.setMissAccount(missAccount);
        		 //candidateForm.getMissCandidate().setMissAccount(missAccount);
        	}
        }*/
        FinWizResultMessage vresult =null;// finwizService.searchMissTodo(missTodo);
        model.addAttribute("todolists", vresult.getResultListObj());
        model.addAttribute("totals", vresult.getMaxRow());
        model.addAttribute("pageObj", page);
        return "exam/template/home";
    } 

    @RequestMapping(value={"/doTodoAction/{pageNo}"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public String doTodoAction(HttpServletRequest request
    		//, @ModelAttribute(value="welcomeForm") WelcomeForm welcomeForm, BindingResult result
    		, @PathVariable int pageNo,Model model)
    {
    	 
    	   Paging page = new Paging();
    	//   MissTodo misstodo =new MissTodo();
    	   page.setPageSize(PAGE_SIZE);
    	   page.setPageNo(pageNo);
    	 //  misstodo.setPagging(page);
         
     
    	   FinWizResultMessage vresult =null;// finwizService.searchMissTodo(misstodo);    
           model.addAttribute("todolists", vresult.getResultListObj());
           model.addAttribute("totals", vresult.getMaxRow());
         //  model.addAttribute("UserMissContact", missContact);
           model.addAttribute("pageObj", page);
        return "exam/template/home";
    }

    @RequestMapping(value={"/page/{page}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String index(HttpServletRequest request,HttpServletResponse response,  Model model,@PathVariable String page)
    {
        return "exam/"+page;
    }
    @RequestMapping(value={"/test"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String test(HttpServletRequest request,HttpServletResponse response,  Model model,@PathVariable String page)
    {
    	System.out.println("into test");
    	 model.addAttribute("finWizForm",new FinWizForm());
        return "test/test";
    }
   
  
  
   
    private String genToken(){
  		StringBuffer sb = new StringBuffer();
  	    for (int i = 36; i > 0; i -= 12) {
  	      int n = Math.min(12, Math.abs(i));
  	      sb.append(org.apache.commons.lang3.StringUtils.leftPad(Long.toString(Math.round(Math.random() * Math.pow(36, n)), 36), n, '0'));
  	    }
  	    return sb.toString();
   }

    @RequestMapping(value={"/checksession"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public @ResponseBody String checksession()
    { 
    	Authentication authen=SecurityContextHolder.getContext().getAuthentication();		
		String userid=null;
		if(authen!=null)
			userid=authen.getName();
		return userid;
    }
  
   // private static SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
  
    @Autowired
    @Qualifier("finWizExecutorImpl")
    private FinWizExecutor finWizExecutor;


}
