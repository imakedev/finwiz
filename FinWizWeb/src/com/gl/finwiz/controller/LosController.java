package com.gl.finwiz.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.finwiz.core.model.ParamPageM;
import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;
import com.gl.finwiz.service.FinwizService;

@Controller
public class LosController {
	@Autowired
	@Qualifier("finWizServiceImpl")
	private FinwizService finwizService;
	@Autowired
	private ApplicationContext ctx;
	
    @RequestMapping(value={"/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String getNewForm(HttpServletRequest request,HttpServletResponse response,  Model model)
    {
    	
        return "finwiz/index";
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
    	FinWizResultMessage finWizResultMessage = finwizService.login(userLogin);
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
		FinWizResultMessage finWizResultMessage = finwizService.tabs(paramPageM);
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
