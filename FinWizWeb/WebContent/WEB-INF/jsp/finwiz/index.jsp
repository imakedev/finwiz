<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page import="org.springframework.security.web.servletapi.*" %>

<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_MISSCONSULT')" var="isManageMC"/>
<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_COMPANY')" var="isManageCompany"/>
<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_CANDIDATE')" var="isManageCandidate"/>
<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_SEARCH_REPORT')" var="isManageSearchReport"/>
<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_SERIES')" var="isManageSeries"/>
<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_TEST')" var="isManageTest"/>
<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_DOWNLOAD')" var="isManageDownload"/>
<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_MISSCONSULT_REPORT_MANAGEMENT')" var="isManageReportManagement"/> 
<sec:authentication var="myUser" property="principal.myUser"/> 
<html>
<head>
    <script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>
    <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
    <!--<link href="<c:url value="/resources/css/supersized.css" />" rel="stylesheet" media="screen">
    <link href="<c:url value="/resources/css/supersized.shutter.css" />" rel="stylesheet" media="screen">
    <script src="<c:url value="/resources/js/supersized.shutter.min.js" />"></script>
    <script src="<c:url value="/resources/js/supersized.3.2.7.min.js" />"></script>-->
    <script src="<c:url value="/resources/js/jquery.easing.min.js" />"></script>
    <script src="<c:url value="/resources/js/jquery-latest.min.js" />"></script>
    <script src="<c:url value="/resources/js/prefixfree.min.js" />"></script>
    <link rel="stylesheet" href="<c:url value="/resources/css/supersized.core.css" />" type="text/css" media="screen" />
	<script type="text/javascript" src="<c:url value="/resources/js/supersized.core.3.2.1.min.js" />"></script>
    
    
    <script type="text/javascript">

    jQuery(function($){
		
		$.supersized({
		
			// Functionality
			start_slide             :   0,			// Start slide (0 is random)
			new_window				:	1,			// Image links open in new window/tab
			image_protect			:	1,			// Disables image dragging and right click with Javascript
													   
			// Size & Position						   
			min_width		        :   0,			// Min width allowed (in pixels)
			min_height		        :   0,			// Min height allowed (in pixels)
			vertical_center         :   1,			// Vertically center background
			horizontal_center       :   1,			// Horizontally center background
			fit_always				:	0,			// Image will never exceed browser width or height (Ignores min. dimensions)
			fit_portrait         	:   1,			// Portrait images will not exceed browser height
			fit_landscape			:   0,			// Landscape images will not exceed browser width
													   
			// Components
			slides 					:  	[			// Slideshow Images
												{image : '<c:url value="/resources/images/bg1.jpg" />'},
												{image : '<c:url value="/resources/images/bg2.jpg" />'}
										]
			
		});
    });
        
    </script>
</head>
<body>

  <div class="wrapper">
      <div class="bgdrop"></div>
      
      <section id="contentlog">
        <div class="lang">
          <a href="#" class="fl"><img src="<c:url value="/resources/images/iconEn.png" />"></a>
          <a href="#" class="fl"><img src="<c:url value="/resources/images/iconTh.png" />"></a>
        </div>

        <a href="#">
          <img src="<c:url value="/resources/images/logo_login.png" />">
        </a>
        <form action="los_checker_inbox">
          <h1>Login Form</h1>
          

          <div>
            <select name="username" id="username"  class="select">
<option value="CHECKER">CHECKER</option>
<option value="INPUTDATA">INPUT DATA</option>
<option value="UNDERWRITING">UNDERWRITING</option>
<option value="MANAGER">MANAGER</option>
<option value="CO">CONTRACT OPERATION</option>
<option value="MANAGER2">MANAGER 2</option>
</select>
          </div>
          <div>
            <input type="password" id="password" value="123" placeholder="Password" style="width: 340px"/>
          </div>
          <div>
            <select class="select">
              <option>Group Lease</option>
            </select>
          </div>
          <div>
            <input type="submit" value="LogIn" class="fl" name="submit" />
          </div>
</form>
        <!-- form -->
        
        <div class="button">
        
          <span class="green">Device Code</span> BK001 , 06/02/2015 , 09:46
        </div><!-- button -->
      </section><!-- content -->
      <p class="copyright">Powered by The Blue Code</p>
    </div>
</body>
</html>
