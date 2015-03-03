<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/templates/includes.jsp" %>
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
    <script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
    <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
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
        <form:form action="loginForm" modelAttribute="userLoginForm" method="POST">
          <h1>Login Form</h1>
          <form:hidden path="userLoginM.countryId" value="th" />
          <form:hidden path="userLoginM.status" value="0" />
          <div>
					<form:select path="userLoginM.userId" cssClass="select">
						<form:option value="checker">CHECKER</form:option>
						<form:option value="de">INPUT DATA</form:option>
						<form:option value="underwriter">UNDERWRITER</form:option>
						<form:option value="manager">MANAGER</form:option>
					</form:select>
          </div>
          <div>
          <form:input path="userLoginM.password" type="password" value="password" style="width: 340px"/>
          </div>
          <div>
					<form:select path="userLoginM.companyId" cssClass="select">
						<form:option value="gl">Group Lease</form:option>
					</form:select>
          </div>
          <div>
            <input type="submit" class="fl" value="Log In" name="submit" />
          </div>
</form:form>
        <!-- form -->
        
        <div class="button">
        
          <span class="green">Device Code</span> BK001 , 06/02/2015 , 09:46
        </div><!-- button -->
      </section><!-- content -->
      <p class="copyright">Powered by The Blue Code</p>
    </div>
</body>
</html>
