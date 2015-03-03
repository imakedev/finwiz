package com.gl.finwiz.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.map.HashedMap;
import org.aspectj.weaver.Iterators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.gl.finwiz.core.los.model.LosApplicationM;
import com.gl.finwiz.core.model.CacheM;
import com.gl.finwiz.core.model.ParamPageM;
import com.gl.finwiz.core.model.ParamSubFormM;
import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.model.UserRoleM;
import com.gl.finwiz.core.model.WfActivityInstanceM;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;
import com.gl.finwiz.form.ApplicationForm;
import com.gl.finwiz.form.InboxForm;
import com.gl.finwiz.form.UserLoginForm;
import com.gl.finwiz.service.FinwizService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Controller
//@Cacheable(value={"jsonInboxToApplication","userRoles","paramPages","paramTabs","paramSubForms","userId"})
@SessionAttributes(value={"jsonInboxToApplication","userRolesId","paramPages","paramTabs","paramSubForms","userId"})
public class LosController {
	@Autowired
	@Qualifier("finWizServiceImpl")
	private FinwizService finwizService;
	@Autowired
	private ApplicationContext ctx;
	
    @RequestMapping(value={"/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public ModelAndView getNewForm(@ModelAttribute("userLoginForm") UserLoginForm userLoginForm)
    {
    	
        //return "finwiz/index";
    	return new ModelAndView("finwiz/index", "userLoginForm", userLoginForm);
    }
    
	@RequestMapping(value={"/loginForm"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public ModelAndView getLoginForm(@ModelAttribute("userLoginForm") UserLoginForm userLoginForm,Model model)
    {
    	//request.getSession().setAttribute("userId", request.getParameter("userId"));
//		userLogin.setUserId(loginForm.getUserId());
//    	userLogin.setCountryId("th");
//    	userLogin.setCompanyId(loginForm.getCompanyId());
//    	userLogin.setPassword(loginForm.getPassword());
//    	userLogin.setStatus(0);
    	FinWizResultMessage finWizResultMessage = finwizService.login(userLoginForm.getUserLoginM());
    	UserLoginM	 userLoginM = (UserLoginM)finWizResultMessage.getResultListObj().get(0);
    	model.addAttribute("userId",userLoginForm.getUserLoginM().getUserId());
    	//model.addAttribute("userRoles",userLoginM.getUserRoles());
    	model.addAttribute("paramTabs",userLoginM.getParamTabM());
    	model.addAttribute("paramPages",userLoginM.getParamPages());
    	model.addAttribute("paramSubForms",userLoginM.getParamSubForms());
    	model.addAttribute("userRolesId",userLoginM.getUserRoles().get(0).getRoleId());
    	System.out.println("-----------"+userLoginM.getUserRoles().get(0).getRoleId());
//    	List<UserRoleM> list = (List<UserRoleM>) userLoginM.getUserRoles();
//    	for(UserRoleM userRole : list) model.addAttribute("userRolesId",userRole.getRoleId());
    	
    	//ParamSubFormM cc = new ParamSubFormM();
//    	for(ParamSubFormM dd:userLoginM.getParamSubForms()){
//    		System.out.println(dd.getFormPath());
//    		
//    	}
    	
    	//model.addAttribute("paramSerch",search.getDealerId());
        //return "finwiz/los/los_inbox";
        return new ModelAndView("finwiz/los/los_inbox", "userLoginForm", userLoginForm );
    	//return new ModelAndView("finwiz/los/los_inbox", "test55", resultSerch );
    }
	
	@RequestMapping(value={"/los_inbox"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String getLosInboxForm(HttpServletRequest request,HttpServletResponse response,  Model model)
    {
		
        return "finwiz/los/los_inbox";
    }
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value={"/los_new_application"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public ModelAndView getLosNewApplicationForm(@ModelAttribute ApplicationForm applicationForm,HttpServletRequest request,HttpServletResponse response,  Model model)
    {
		
		//List<UserRoleM> list = (List<UserRoleM>) request.getSession().getAttribute("userRoles");
		//String userRoleId = "";
		//for(UserRoleM userRole : list)userRoleId = userRole.getRoleId();
		//ParamPageM paramPageM = new ParamPageM();
		//paramPageM.setPageId("5");
		//System.out.println("user roles---"+userRoleId);
		//paramPageM.setRoleId(userRoleId);
		//FinWizResultMessage finWizResultMessage = finwizService.tabs(paramPageM);
		//ParamPageM paramPageTabs = (ParamPageM)finWizResultMessage.getResultListObj().get(0);
		//request.getSession().setAttribute("tabsPage", paramPageTabs.getParamTabs());
		//model.addAttribute("tabsPage",paramPageTabs.getParamTabs());
		
		CacheM cacheM = new CacheM();
		FinWizResultMessage resultCache = finwizService.cache(cacheM);
		CacheM xx = (CacheM)resultCache.getResultListObj().get(0);
		xx.getCacheObject();
		
       // return "finwiz/los/los_new_application";
		return new ModelAndView("finwiz/los/los_new_application", "applicationForm", applicationForm );
    }
	
	@RequestMapping(value={"/los_search"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String getLosSearchForm(HttpServletRequest request,HttpServletResponse response,  Model model)
    {
		//FinWizResultMessage finWizResultMessage = finwizService.tabs(paramPageM);
        return "finwiz/los/los_search";
    }
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value={"/applicationForm"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public String getNewApplicationForm(@RequestParam String btnAction,@ModelAttribute ApplicationForm applicationForm,HttpServletRequest request,HttpServletResponse response,  Model model,HttpSession session)
    {
		System.out.println("los----"+applicationForm.getLosApplicationM());
		if( btnAction.equals("SAVE AS DRAFT") ){
		      if(applicationForm.getActions().equals("update")){
		    	  
		    	  System.out.println("START SAVE AS DRAFT----> UPDATE DRAFT");
//			       LosApplicationM losApplicationM = new LosApplicationM();
//			       losApplicationM.setDealerId(applicationForm.getLosApplicationM().getDealerId());
//			       //losApplicationM.setApplicationId(applicationId);
//			      // losApplicationM.setApplicationStatus(applicationStatus);
//			       losApplicationM.setUpdatedBy(session.getAttribute("userId").toString());
//			       losApplicationM.setApplicationId(applicationForm.getLosApplicationM().getApplicationId());
//			       losApplicationM.setLosAppId(applicationForm.getLosApplicationM().getLosAppId());
//			       System.out.println("get Dealer Id: "+applicationForm.getLosApplicationM().getDealerId());
			       FinWizResultMessage listUpdateDraft = finwizService.update(applicationForm.getLosApplicationM());
			       System.out.println("END SAVE AS DRAFT----> UPDATE DRAFT");
		    	  
			       return "finwiz/los/los_inbox";
		      }else{
		       System.out.println("START SAVE AS DRAFT----> NEW DRAFT");
//		       LosApplicationM losApplicationM = new LosApplicationM();
//		       losApplicationM.setDealerId(applicationForm.getLosApplicationM().getDealerId());
//		       losApplicationM.setUpdatedBy(session.getAttribute("userId").toString());
		       FinWizResultMessage finWizResultMessage = finwizService.saveDraft(applicationForm.getLosApplicationM());
		       LosApplicationM listSaveDraft =(LosApplicationM) finWizResultMessage.getResultListObj().get(0);
		       
		       // start
		       List<UserRoleM> list = (List<UserRoleM>) session.getAttribute("userRoles");
		    	String userRoleId = "";
		    	for(UserRoleM userRole : list)userRoleId = userRole.getRoleId();
		    	WfActivityInstanceM  wfActivityInstanceM =new WfActivityInstanceM();
		    	wfActivityInstanceM.setWfActivityInstanceOwnerUser(session.getAttribute("userId").toString());
		    	wfActivityInstanceM.setWfActivityInstanceOwnerRole(session.getAttribute("userRolesId").toString());
		  		wfActivityInstanceM.setRefObjectId(listSaveDraft.getLosAppId());
		  		wfActivityInstanceM.setFinId("THGL0000000001");
		  		wfActivityInstanceM.setWfpId("WFP0001");
		  		wfActivityInstanceM.setApplicationStatus("0001");
		        FinWizResultMessage listSaveWfStart = finwizService.saveWfStart(applicationForm.getWfActivityInstanceM());
		        System.out.println("END SAVE AS DRAFT----> NEW DRAFT");
		       return "finwiz/los/los_inbox";
		      }
		    }
		    else if( btnAction.equals("SUBMIT") ){
		    	
		    	String userId = session.getAttribute("userId").toString();
		    	if(userId.equals("checker")){
		    		userId = "manager";
		    	}
		    	
		    	 if(applicationForm.getActions().equals("update")){
		    		 System.out.println("START TO SUBMIT----> UPDATE SUBMIT");
//				       LosApplicationM losApplicationM = new LosApplicationM();
//				       losApplicationM.setDealerId(applicationForm.getLosApplicationM().getDealerId());
//				       //losApplicationM.setApplicationId(applicationId);
//				      // losApplicationM.setApplicationStatus(applicationStatus);
//				       losApplicationM.setUpdatedBy(userId);
//				       losApplicationM.setApplicationId(applicationForm.getLosApplicationM().getApplicationId());
//				       losApplicationM.setLosAppId(applicationForm.getLosApplicationM().getLosAppId());
//				       System.out.println("get Dealer Id: "+applicationForm.getLosApplicationM().getDealerId());
				       
				       LosApplicationM losApplicationM = new LosApplicationM();
				       losApplicationM.setDealerId(applicationForm.getLosApplicationM().getDealerId());
				       losApplicationM.setUpdatedBy(userId);
				       losApplicationM.setApplicationId("PRE-TH-A000001");
				       losApplicationM.setApplicationStatus("02");
				       losApplicationM.setConditionCode("0002");
				       losApplicationM.setLosAppId(applicationForm.getLosApplicationM().getLosAppId());
				       FinWizResultMessage listUpdateSubmit = finwizService.update(applicationForm.getLosApplicationM());
				       
				        WfActivityInstanceM  wfActivityInstanceM2 =new WfActivityInstanceM();
				        wfActivityInstanceM2.setWfActivityInstanceOwnerUser("checker");
				        wfActivityInstanceM2.setWfActivityInstanceOwnerRole("CHECKER_ROLE");
				        wfActivityInstanceM2.setFinId("THGL0000000001");
				        wfActivityInstanceM2.setWfpId("WFP0001");
				        wfActivityInstanceM2.setApplicationStatus("0005");
				        //wfActivityInstanceM2.setActivityId(applicationForm.getWfActivity());
				        //System.out.println("getWfActivity--"+applicationForm.getWfActivity());
				        wfActivityInstanceM2.setWfpiId(applicationForm.getWfActivityInstanceM().getWfpiId());
				        //System.out.println("getWfpiId--"+applicationForm.getWfpiId());
				        wfActivityInstanceM2.setRefObjectId(applicationForm.getWfActivityInstanceM().getRefObjectId());
				        //System.out.println("getRefObjectId--"+applicationForm.getRefObjectId());
				        wfActivityInstanceM2.setWfActivityInstanceId(applicationForm.getWfActivityInstanceM().getWfActivityInstanceId());
				        //System.out.println("getWfActivityInstanceId--"+applicationForm.getWfActivityInstanceId());
				       // wfActivityInstanceM2.setApplicationStatus(newApplication.getAppStatus());
				        //System.out.println("getAppStatus--"+applicationForm.getAppStatus());
				        wfActivityInstanceM2.setWfpId("WFP0001");
				        FinWizResultMessage listSaveWfNext = finwizService.saveWfNext(applicationForm.getWfActivityInstanceM());
				       // next wf
//				        WfActivityInstanceM  wfActivityInstanceM2 =new WfActivityInstanceM();
//				        wfActivityInstanceM2.setWfActivityInstanceOwnerUser("checker");
//				        wfActivityInstanceM2.setWfActivityInstanceOwnerRole("CHECKER_ROLE");
//				        wfActivityInstanceM2.setFinId("THGL0000000001");
//				        wfActivityInstanceM2.setWfpId("WFP0001");
//				        wfActivityInstanceM2.setApplicationStatus("0005");
//				        wfActivityInstanceM2.setActivityId(applicationForm.getWfActivity());
//				        System.out.println("getWfActivity--"+applicationForm.getWfActivity());
//				        wfActivityInstanceM2.setWfpiId(applicationForm.getWfpiId());
//				        System.out.println("getWfpiId--"+applicationForm.getWfpiId());
//				        wfActivityInstanceM2.setRefObjectId(applicationForm.getRefObjectId());
//				        System.out.println("getRefObjectId--"+applicationForm.getRefObjectId());
//				        wfActivityInstanceM2.setWfActivityInstanceId(applicationForm.getWfActivityInstanceId());
//				        System.out.println("getWfActivityInstanceId--"+applicationForm.getWfActivityInstanceId());
//				       // wfActivityInstanceM2.setApplicationStatus(newApplication.getAppStatus());
//				        System.out.println("getAppStatus--"+applicationForm.getAppStatus());
//				        wfActivityInstanceM2.setWfpId("WFP0001");
//				        FinWizResultMessage resultWfNext = finwizService.saveWfNext(applicationForm.getWfActivityInstanceM());
				        System.out.println("END TO SUBMIT----> UPDATE SUBMIT");
			    	  
				       return "finwiz/los/los_inbox";
			      }else{
			    	  System.out.println("START TO SUBMIT----> NEW SUBMIT");
			       LosApplicationM losApplicationM = new LosApplicationM();
			       losApplicationM.setDealerId(applicationForm.getLosApplicationM().getDealerId());
			       losApplicationM.setUpdatedBy(userId);
			       losApplicationM.setApplicationId("PRE-TH-A000001");
			       losApplicationM.setApplicationStatus("02");
			       losApplicationM.setConditionCode("0002");
			       FinWizResultMessage listNewSubmit = finwizService.saveDraft(losApplicationM);
			       LosApplicationM listLosApplication =(LosApplicationM) listNewSubmit.getResultListObj().get(0);
			       
			       //start wf
//			        List<UserRoleM> list = (List<UserRoleM>) session.getAttribute("userRoles");
			    	String userRoleId = "";
//			    	for(UserRoleM userRole : list)userRoleId = userRole.getRoleId();
			    	WfActivityInstanceM  wfActivityInstanceM =new WfActivityInstanceM();
			    	wfActivityInstanceM.setWfActivityInstanceOwnerUser(session.getAttribute("userId").toString());
			    	wfActivityInstanceM.setWfActivityInstanceOwnerRole(session.getAttribute("userRolesId").toString());
			  		wfActivityInstanceM.setRefObjectId(listLosApplication.getLosAppId());
			  		wfActivityInstanceM.setFinId("THGL0000000001");
			  		wfActivityInstanceM.setWfpId("WFP0001");
			  		wfActivityInstanceM.setApplicationStatus("0001");
			        FinWizResultMessage listSaveWfStart = finwizService.saveWfStart(wfActivityInstanceM);
			        
			        WfActivityInstanceM wfActivityInstance =(WfActivityInstanceM) listSaveWfStart.getResultListObj().get(0);
			        //next wf
			        WfActivityInstanceM  wfActivityInstanceM2 =new WfActivityInstanceM();
			        wfActivityInstanceM2.setWfActivityInstanceOwnerUser(userId);
			        if(userRoleId.equals("CHECKER_ROLE")){
			        	userRoleId = "MANAGER_ROLE";
			        
			        }
			        wfActivityInstanceM2.setWfActivityInstanceId(wfActivityInstance.getWfActivityInstanceId());
			        wfActivityInstanceM2.setWfActivityInstanceOwnerRole(userRoleId);
			        wfActivityInstanceM2.setRefObjectId(listLosApplication.getLosAppId());
			        wfActivityInstanceM2.setFinId("THGL0000000001");
			        wfActivityInstanceM2.setWfpId("WFP0001");
			        wfActivityInstanceM2.setApplicationStatus("0002");
			        wfActivityInstanceM2.setActivityId(wfActivityInstance.getActivityId());
			        wfActivityInstanceM2.setWfpiId(wfActivityInstance.getWfpiId());
			        FinWizResultMessage listSaveWfNext = finwizService.saveWfNext(wfActivityInstanceM2);
			        System.out.println("END TO SUBMIT----> NEW SUBMIT");
			    	  
			    	  
			       
			       return "finwiz/los/los_inbox";
			      }
		    }else if( btnAction.equals("APPOVE") ){
		    	System.out.println("START TO APPOVE----> APPOVE");
		    	   LosApplicationM losApplicationM = new LosApplicationM();
			       losApplicationM.setDealerId(applicationForm.getLosApplicationM().getDealerId());
			       losApplicationM.setUpdatedBy("manager");
			       losApplicationM.setApplicationId(applicationForm.getLosApplicationM().getApplicationId());
			       losApplicationM.setLosAppId(applicationForm.getLosApplicationM().getLosAppId());
			       losApplicationM.setApplicationStatus("03");
			       FinWizResultMessage listUpdateAppove = finwizService.update(losApplicationM);
		    	
			       
			        WfActivityInstanceM  wfActivityInstanceM2 =new WfActivityInstanceM();
			        wfActivityInstanceM2.setWfActivityInstanceOwnerUser("checker");
			        wfActivityInstanceM2.setWfActivityInstanceOwnerRole("CHECKER_ROLE");
			        wfActivityInstanceM2.setFinId("THGL0000000001");
			        wfActivityInstanceM2.setWfpId("WFP0001");
			        wfActivityInstanceM2.setApplicationStatus("0005");
//			        wfActivityInstanceM2.setActivityId(applicationForm.getWfActivity());
//			        System.out.println("getWfActivity--"+applicationForm.getWfActivity());
//			        wfActivityInstanceM2.setWfpiId(applicationForm.getWfActivityInstanceM().getWfpiId());
//			        System.out.println("getWfpiId--"+applicationForm.getWfpiId());
//			        wfActivityInstanceM2.setRefObjectId(applicationForm.getRefObjectId());
//			        System.out.println("getRefObjectId--"+applicationForm.getRefObjectId());
//			        wfActivityInstanceM2.setWfActivityInstanceId(applicationForm.getWfActivityInstanceId());
//			        System.out.println("getWfActivityInstanceId--"+applicationForm.getWfActivityInstanceId());
//			       // wfActivityInstanceM2.setApplicationStatus(newApplication.getAppStatus());applicationForm.
//			        System.out.println("getAppStatus--"+applicationForm.getApplicationStatus());
			        wfActivityInstanceM2.setWfpId("WFP0001");
			        FinWizResultMessage listSaveWfNext = finwizService.saveWfNext(applicationForm.getWfActivityInstanceM());
			        System.out.println("END TO APPOVE----> APPOVE");
			        return "finwiz/los/los_inbox";
		    }
        return "finwiz/los/los_new_application";
    }
	
	@RequestMapping(value={"/logout"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String getLogoutForm(HttpServletRequest request,HttpServletResponse response,  Model model)
    {
		
		try{
		HttpSession session = request.getSession(false);
	    session.invalidate();
	    
		}catch (Exception ex){
			
		}
	    
	    
        return "finwiz/index";
    }
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value={"/los_update_application"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public ModelAndView getLosUpdateApplicationForm(@ModelAttribute("losApplication") LosApplicationM losApplication,@ModelAttribute("applicationForm") ApplicationForm applicationForm,HttpServletRequest request,HttpServletResponse response,  Model model,HttpSession session)
    {
		//List<UserRoleM> list = (List<UserRoleM>) session.getAttribute("userRoles");
		//String userRoleId = "";
		//for(UserRoleM userRole : list)userRoleId = userRole.getRoleId();
		//ParamPageM paramPageM = new ParamPageM();
		//paramPageM.setPageId("5");
		//System.out.println("user roles---"+userRoleId);
		//paramPageM.setRoleId(userRoleId);
		//FinWizResultMessage finWizResultMessage = finwizService.tabs(paramPageM);
		//ParamPageM paramPageTabs = (ParamPageM)finWizResultMessage.getResultListObj().get(0);
		//request.getSession().setAttribute("tabsPage", paramPageTabs.getParamTabs());
		//model.addAttribute("tabsPage",paramPageTabs.getParamTabs());
		System.out.println("update-----"+session.getAttribute("jsonInboxToApplication"));
		Gson gson = new Gson(); // Or use new GsonBuilder().create();
		//NewApplication target = new NewApplication();
		String json = session.getAttribute("jsonInboxToApplication").toString(); // serializes target to Json
		ApplicationForm target2 = gson.fromJson(json, ApplicationForm.class); // deserializes json into target2

//		WfActivityInstanceM wfActivityInstanceM = new WfActivityInstanceM();
//		wfActivityInstanceM.setActivityId(target2.getWfActivity());
//		wfActivityInstanceM.setWfActivityInstanceId(target2.getWfActivityInstanceId());
//		wfActivityInstanceM.setWfpiId(target2.getWfpiId());
//		wfActivityInstanceM.setWfpId(target2.getWfpId());
//		wfActivityInstanceM.setRefObjectId(target2.getRefObjectId());
//		wfActivityInstanceM.setApplicationStatus(target2.getApplicationStatus());
		applicationForm.setWfActivityInstanceM(target2.getWfActivityInstanceM());
//		losApplication.setLosAppId(target2.getLosAppId());
//		losApplication.setConditionCode(target2.getConditionCode());
//		losApplication.setApplicationStatus(target2.getApplicationStatus());
//		losApplication.setApplicationId(target2.getApplicationId());
		applicationForm.setLosApplicationM(target2.getLosApplicationM());
		FinWizResultMessage listApplication = finwizService.selectByIdApplication(losApplication);
		LosApplicationM listLosApplication = (LosApplicationM)listApplication.getResultListObj().get(0);
		applicationForm.setLosApplicationM(listLosApplication);
		//applicationForm.setDealerId(te.getDealerId());
	//	return new ModelAndView("finwiz/los/los_new_application", "newApplication", te );
		return new ModelAndView("finwiz/los/los_new_application", "applicationForm", applicationForm );
    }
//	@RequestMapping(value="/doajax.do", method = RequestMethod.GET)
//  public @ResponseBody String doAjax(HttpServletRequest request) {
//	return null;
//	}
//	@SuppressWarnings("unchecked")
//	@RequestMapping(value="/doajax.do", method = RequestMethod.GET)
//    public @ResponseBody String doAjax(HttpServletRequest request,HttpSession session) 
//	{
//		//String userRoleId = null;
//		String json = null;
//		try{
////		List<UserRoleM> list = (List<UserRoleM>) session.getAttribute("userRoles");
////    	if(!list.isEmpty()||list!=null){
////    	for(UserRoleM userRole : list)userRoleId = userRole.getRoleId();
////    	}
//		LosApplicationM losApplicationM = new LosApplicationM();
//    	losApplicationM.setUser(session.getAttribute("userId").toString());
//    	losApplicationM.setRole(session.getAttribute("userRolesId").toString());
//    	FinWizResultMessage resultSearchInbox = finwizService.searchInbox(losApplicationM);
//    	
//    	json = "{ \"aaData\":[";
//    	if(resultSearchInbox!=null){
//	    	for(int i=0,j=1;i<resultSearchInbox.getResultListObj().size();){
//	    	List<LosApplicationM> arrAsList = Arrays.asList((LosApplicationM)resultSearchInbox.getResultListObj().get(i));
//	    	
//		    	for(LosApplicationM losList:arrAsList){
//			    	if(session.getAttribute("userId").toString().equals("checker")){
//			        json += "[\""+losList.getApplicationId()+"\","+
//			    			"\""+losList.getDealerId()+"\","+
//			    			"\""+losList.getParamLosAppStatusM().getAppStatusDesc()+"\","+
//			    		    "\"<input type='hidden' id='hidLosAppId' name='hidLosAppId' value="+losList.getLosAppId()+"><a class='btn btn-xs btn-default' href='#' data-featherlight='#fl1aprove' role='button'><i class='glyphicon glyphicon-eye-open'></i></a> <a class='btn btn-xs btn-success' href='#' role='button' onClick='OpenPageCheckerforAdd();'><i class='glyphicon glyphicon-pencil' id='btnEdit' name='btnEdit'></i></a>\"]";
//			    	}else{
//			    	json += "[\""+losList.getApplicationId()+"\","+
//				    		"\""+losList.getDealerId()+"\","+
//				    		"\""+losList.getParamLosAppStatusM().getAppStatusDesc()+"\","+
//				    		 "\"<input type='hidden' id='hidWfpId' name='hidWfpId' value='WFP0001'><input type='hidden' id='hidAppStatus' name='hidAppStatus' value='03'><input type='hidden' id='hidRefObjectId' name='hidRefObjectId' value="+losList.getWfActivityInstanceM().getRefObjectId()+"><input type='hidden' id='hidWfpiId' name='hidWfpiId' value="+losList.getWfActivityInstanceM().getWfpiId()+"><input type='hidden' id='hidWfActivityInstanceId' name='hidWfActivityInstanceId' value="+losList.getWfActivityInstanceM().getWfActivityInstanceId()+"><input type='hidden' id='hidApplicationStatus' name='hidApplicationStatus' value='03'><input type='hidden' id='hidConditionCode' name='hidConditionCode' value='0005'><input type='hidden' id='hidWfActivity' name='hidWfActivity' value="+losList.getWfActivityInstanceM().getActivityId()+"><input type='hidden' id='hidLosAppId' name='hidLosAppId' value="+losList.getLosAppId()+"><a class='btn btn-xs btn-default' href='#' data-featherlight='#fl1aprove' role='button'><i class='glyphicon glyphicon-eye-open'></i></a> <a class='btn btn-xs btn-success' href='#' role='button' onClick='OpenPageCheckerforAdd();'><i class='glyphicon glyphicon-pencil' id='btnEdit' name='btnEdit'></i></a>\"]";
//			    	
//			    	}
//		    	}
//			    	if(j==resultSearchInbox.getResultListObj().size()){	 
//			    		json += "";  
//			    	}else{
//			    		json += ",";	
//			    		j++;
//			    	}
//			    		i++;
//	    	}
//    	}
//    	json += "]}";
//		}catch (Exception ex){
//			
//		}
//		//json ="{ \"aaData\":[[{\"applicationId\": \"N02P02-f0e6f22b-3a0c-48b0-bd9a-df9b94c9714f\",\"dealerId\": 1,\"status\": \"TEST-NY-EDG\",\"actions\": 1382453631320}]]}";
//        return json;
//    }
	
//    @RequestMapping(value = "/helloWorld.web", method = RequestMethod.GET)
//        public String printWelcome(@ModelAttribute("losApplication") LosApplicationM losApplication, BindingResult result,ModelMap model, HttpServletRequest request, HttpServletResponse response) {
//    	
//        	return "finwiz/los/helloWorld";
//
//        }

        @RequestMapping(value = "/dataTablesToInbox", method = RequestMethod.GET, produces = "application/json")
        public @ResponseBody String getDataTablesToInbox(HttpServletRequest  request,String jsonObject,HttpSession session) throws IOException {
        	//List<LosApplicationM> losApplicationList = createLosApplicationData(session);
        	LosApplicationM losApplicationM = new LosApplicationM();
        	losApplicationM.setUser(session.getAttribute("userId").toString());
        	System.out.println("----------- "+session.getAttribute("userId").toString());
        	losApplicationM.setRole(session.getAttribute("userRolesId").toString());
        	System.out.println("----------- "+session.getAttribute("userRolesId").toString());
        	FinWizResultMessage resultSearchInbox = finwizService.searchInbox(losApplicationM);
        	List<LosApplicationM> losApplicationList = null;
        	InboxForm losInbox = null;
        	List<InboxForm> list = new ArrayList<InboxForm>();
        	for(int i=0;i<resultSearchInbox.getResultListObj().size();){
    	    	losApplicationList = Arrays.asList((LosApplicationM)resultSearchInbox.getResultListObj().get(i));
    	    	for(LosApplicationM losList:losApplicationList){
    	    		losInbox = new InboxForm();
    	    		if(null!=losList.getApplicationId())
    	    		losInbox.setApplicationId(losList.getApplicationId());
    	    		if(null!=losList.getDealerId())
    	    		losInbox.setDealerId(losList.getDealerId());
    	    		if(null!=losList.getParamLosAppStatusM())
    	    			if(null!=losList.getParamLosAppStatusM().getAppStatusDesc())
    	    		losInbox.setAppStatusDesc(losList.getParamLosAppStatusM().getAppStatusDesc());
    	    		losInbox.setAction("<input type='hidden' id='hidActions' name='hidActions' value='update'><input type='hidden' id='hidWfpId' name='hidWfpId' value='WFP0001'><input type='hidden' id='hidAppStatus' name='hidAppStatus' value='03'><input type='hidden' id='hidRefObjectId' name='hidRefObjectId' value="+losList.getWfActivityInstanceM().getRefObjectId()+"><input type='hidden' id='hidWfpiId' name='hidWfpiId' value="+losList.getWfActivityInstanceM().getWfpiId()+"><input type='hidden' id='hidWfActivityInstanceId' name='hidWfActivityInstanceId' value="+losList.getWfActivityInstanceM().getWfActivityInstanceId()+"><input type='hidden' id='hidApplicationStatus' name='hidApplicationStatus' value='03'><input type='hidden' id='hidConditionCode' name='hidConditionCode' value='0005'><input type='hidden' id='hidActivityId' name='hidActivityId' value="+losList.getWfActivityInstanceM().getActivityId()+"><input type='hidden' id='hidLosAppId' name='hidLosAppId' value="+losList.getLosAppId()+"><a class='btn btn-xs btn-default' href='#' data-featherlight='#fl1aprove' role='button'><i class='glyphicon glyphicon-eye-open'></i></a> <a class='btn btn-xs btn-success' href='#' role='button' id='btnEdit' name='btnEdit'><i class='glyphicon glyphicon-pencil'></i></a>");
    	    		list.add(losInbox);
    	    	}
    	    	i++;
        	}
        	if(!list.isEmpty()||list!=null){
        	Collections.shuffle(list);
        	InboxForm losInbox2 = new InboxForm();
        	losInbox2.setAaData(list);
    		Gson gson = new GsonBuilder().setPrettyPrinting().create();
    		jsonObject = gson.toJson(losInbox2);
    		
        	}
    		return jsonObject;
        }

//		private List<LosApplicationM> createLosApplicationData(HttpSession session) {
//    		
//    		
//    		LosApplicationM losApplicationM = new LosApplicationM();
//        	losApplicationM.setUser(session.getAttribute("userId").toString());
//        	losApplicationM.setRole(session.getAttribute("userRolesId").toString());
//        	FinWizResultMessage resultSearchInbox = finwizService.searchInbox(losApplicationM);
//        	InboxForm inboxForm = new InboxForm();
//        	for(int i=0,j=1;i<resultSearchInbox.getResultListObj().size();){
//    	    	List<LosApplicationM> arrAsList = Arrays.asList((LosApplicationM)resultSearchInbox.getResultListObj().get(i));
//    	    	
//    		    	for(LosApplicationM losList:arrAsList){
//    		    		inboxForm = new InboxForm();
//    		    		inboxForm.setApplicationId(losList.getApplicationId());
//    		    		inboxForm.setDealerId(losList.getDealerId());
//    		    		inboxForm.setApplicationStatus(losList.getApplicationStatus());
//    		    		inboxForm.seta<input type='hidden' id='hidWfpId' name='hidWfpId' value='WFP0001'><input type='hidden' id='hidAppStatus' name='hidAppStatus' value='03'><input type='hidden' id='hidRefObjectId' name='hidRefObjectId' value="+losList.getWfActivityInstanceM().getRefObjectId()+"><input type='hidden' id='hidWfpiId' name='hidWfpiId' value="+losList.getWfActivityInstanceM().getWfpiId()+"><input type='hidden' id='hidWfActivityInstanceId' name='hidWfActivityInstanceId' value="+losList.getWfActivityInstanceM().getWfActivityInstanceId()+"><input type='hidden' id='hidApplicationStatus' name='hidApplicationStatus' value='03'><input type='hidden' id='hidConditionCode' name='hidConditionCode' value='0005'><input type='hidden' id='hidWfActivity' name='hidWfActivity' value="+losList.getWfActivityInstanceM().getActivityId()+"><input type='hidden' id='hidLosAppId' name='hidLosAppId' value="+losList.getLosAppId()+"><a class='btn btn-xs btn-default' href='#' data-featherlight='#fl1aprove' role='button'><i class='glyphicon glyphicon-eye-open'></i></a> <a class='btn btn-xs btn-success' href='#' role='button' onClick='OpenPageCheckerforAdd();'><i class='glyphicon glyphicon-pencil' id='btnEdit' name='btnEdit'></i></a>
//    		    	}
//        	}
//        	
//    				LosApplicationM person2 = new LosApplicationM();
//    				person2.setApplicationId("11111");
//    	            person2.setDealerId("<input type='button' value='Open' name='btnOpen' id='btnOpen'><input type='submit' value='Edit' name='btnEdit' id='btnEdit'>");
//    	            personsList.add(person2);
//    	            
//    	            person2 = new LosApplicationM();
//    				person2.setApplicationId("55555");
//    	            person2.setDealerId("88888");
//    	            personsList.add(person2);
//    		return personsList;
//    	}
    	
    	@RequestMapping(value = "/dataTablesToApplication",  method={org.springframework.web.bind.annotation.RequestMethod.POST})
        public ModelAndView getDataTablesToApplication(@RequestBody String json,@ModelAttribute ApplicationForm applicationForm,HttpServletRequest request,HttpServletResponse response,  Model model)
        {
    		model.addAttribute("jsonInboxToApplication",json);
    		System.out.println("jsonInboxToApplication--"+json);
    		//return "finwiz/los/los_new_application";
    		return new ModelAndView("finwiz/los/los_new_application", "applicationForm", applicationForm );
        }
}
