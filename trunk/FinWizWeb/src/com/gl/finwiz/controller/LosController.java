package com.gl.finwiz.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.LocaleEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.gl.finwiz.core.model.ParamPageM;
import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;
import com.gl.finwiz.form.FinWizForm;
import com.gl.finwiz.form.validator.FinwizValidateExecutorImpl;
import com.gl.finwiz.service.FinWizExecutor;

@Controller
public class LosController {
	@Autowired
	@Qualifier("finWizExecutorImpl")
	private FinWizExecutor finWizExecutor;
	@Autowired
	private ApplicationContext ctx;
	
	 @Autowired
	    @Qualifier("finwizValidateExecutorImpl")
	    private Validator validator;
	 @InitBinder
	    protected void initBinder(WebDataBinder binder) {
	        binder.setValidator(validator);
	 }
    @RequestMapping(value={"/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String getNewForm(HttpServletRequest request,HttpServletResponse response,Locale locale,  Model model)
    {	
    	// Start Test
    	String language=request.getParameter("language");
    	if(language!=null && language.length()>0){
    	 LocaleEditor localeEditor = new LocaleEditor();
         localeEditor.setAsText(language);

         // set the new locale
         LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
         localeResolver.setLocale(request, response,
             (Locale) localeEditor.getValue());
    	}
    	System.out.println("into test->"+locale);
    	model.addAttribute("finWizForm",new FinWizForm());
	 return "test/test";
    	//End Test
        // return "finwiz/index";
    }
    @RequestMapping(value={"/test/action"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public String action( HttpServletRequest request,@ModelAttribute(value="finWizForm") @Validated FinWizForm finWizForm, BindingResult result, Model model)
    {
    	System.out.println("into action->"+finWizForm);
    	 if (result.hasErrors()) {
    		 System.out.println("into hasErrors->"+result);
	            return "test/test";
	        }
    		model.addAttribute("finWizForm",new FinWizForm());
    	 //finWizExecutor.saveLosApplication(finWizForm.getLosApplicationM());
        return "test/test";
    }
	
    @RequestMapping(value={"/xx"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String getNewxForm(Locale locale,  Model model)
    {	
    	// Start Test
    	
    	System.out.println("into test2->"+locale);
    	model.addAttribute("finWizForm",new FinWizForm());
	 return "test/test";
    	//End Test
        // return "finwiz/index";
    }
    
	@RequestMapping(value={"/login"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public String getLoginForm(HttpServletRequest request,HttpServletResponse response,  Model model)
    {
		UserLoginM userLogin = new UserLoginM();
    	userLogin.setUserId(request.getParameter("userId"));
    	userLogin.setCountryId("th");
    	userLogin.setCompanyId(request.getParameter("companyId"));
    	userLogin.setPassword(request.getParameter("password"));
    	userLogin.setStatus(0);
    	FinWizResultMessage finWizResultMessage = null;//finwizService.login(userLogin);
    	UserLoginM	 userLoginM = (UserLoginM)finWizResultMessage.getResultListObj().get(0);
//    	PageM	 pageM = (PageM)finWizResultMessage.getResultListObj().get(0);
    	model.addAttribute("paramPage", userLoginM.getParamPages());
//    	model.addAttribute("pageM", pageM);
//		FinwizService finwizService = (FinwizService) ctx.getBean("losService");
//		model.addAttribute("paramPage", request.getParameter("userId"));
		
		
		//model.addAttribute("paramPage", userLoginM.getParamPages());
        return "finwiz/los/los_inbox";
    }
	
	@RequestMapping(value={"/los_inbox"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String getLosInboxForm(HttpServletRequest request,HttpServletResponse response,  Model model)
    {
		
        return "finwiz/los/los_inbox";
    }
	
	@RequestMapping(value={"/los_new_application"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String getLosNewApplicationForm(HttpServletRequest request,HttpServletResponse response,  Model model)
    {
		ParamPageM paramPageM = new ParamPageM();
		paramPageM.setPageId("5");
		paramPageM.setRoleId("CHECKER_ROLE");
		FinWizResultMessage finWizResultMessage = null;//finwizService.tabs(paramPageM);
		ParamPageM paramPageTabs = (ParamPageM)finWizResultMessage.getResultListObj().get(0);
		
		model.addAttribute("tabsPage", paramPageTabs.getPagePath());
        return "finwiz/los/los_new_application";
    }
	
	@RequestMapping(value={"/los_search"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String getLosSearchForm(HttpServletRequest request,HttpServletResponse response,  Model model)
    {
//		UserLoginM userLogin = new UserLoginM();
//    	userLogin.setUserId("checker");
//    	userLogin.setCountryId("th");
//    	userLogin.setCompanyId("gl");
//    	userLogin.setPassword("password");
//    	userLogin.setStatus(0);
//		FinWizResultMessage finWizResultMessage = finwizService.login(userLogin);
//		PageM pageM = (PageM)finWizResultMessage.getResultListObj().get(0);
		//model.addAttribute("tabsPage", "loan_request");
        return "finwiz/los/los_search";
    }
	
	@RequestMapping(value={"/logout"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public String getLogoutForm(HttpServletRequest request,HttpServletResponse response,  Model model)
    {
		
        return "finwiz/index";
    }
}
