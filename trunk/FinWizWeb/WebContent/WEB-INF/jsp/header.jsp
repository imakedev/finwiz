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
  <%-- 
  <link rel="stylesheet" href="<spring:url value="/styles/petclinic.css" htmlEscape="true" />" type="text/css"/>
   --%> 
    <title>GL</title>
    <link rel="shortcut icon" href="<c:url value="/resources/images/icon.ico" />" type="image/x-icon">
	<script src="<c:url value="/resources/js/jquery-latest.min.js" />"></script>
	
	<!-- Bootstrap -->
	<script src="<c:url value="/resources/js/common/bootstrap/extend/typeahead/bootstrap-typeahead.js" />"></script>
	<link href="<c:url value="/resources/js/common/bootstrap/css/bootstrap.css" />" rel="stylesheet" type="text/css" />
	<!-- <link href="<c:url value="/resources/js/common/bootstrap/css/responsive.css" />" rel="stylesheet" type="text/css" />  -->    
    <!-- addprefix -->
    <script src="<c:url value="/resources/js/prefixfree.min.js" />"></script>
    <link href="<c:url value="/resources/css/reset.css" />" rel="stylesheet" type="text/css" />
    <link href="<c:url value="/resources/css/layoutStyle.css" />" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/jquery.datetimepicker.css" />"/>
    <link href="<c:url value="/resources/css/jquery-ui-1.10.4.custom.min.css" />" rel="stylesheet" type="text/css" />
    <!--[if IE]>
      <script src="<c:url value="/resources/js/html5shiv.js" />"></script>
    <![endif]-->
    <!-- ui -->
    <script type="text/javascript" src="<c:url value="/resources/js/jquery-ui-1.10.4.custom.min.js" />"></script>
	<!-- DateTimePicker Plugin -->
	<script src="<c:url value="/resources/js/jquery.datetimepicker.js" />"></script>
    
    <link href="<c:url value="/resources/css/grid.css" />" rel="stylesheet" type="text/css" />
    
    <script src="<c:url value="/resources/js/tabs/tabs.js" />"></script>
    <link href="<c:url value="/resources/js/tabs/tabs.css" />" rel="stylesheet" type="text/css" media="screen" />
   
    <script type="text/javascript">
      $(document).ready(function() {
        $('.showhidemenu').click(function(){

          if($('#sidebar-wrapper').is(":visible"))
          {
            $(this).removeClass('active');
            $('#sidebar-wrapper').fadeOut(500,function(){
              $('#sidebar').removeClass('showmenu');
            });
            
          }
           else
          {
            $(this).addClass('active'); 
            $('#sidebar').addClass('showmenu');
            $('#sidebar-wrapper').delay(500).fadeIn(500);
          }
        });

        $('.havesub').click(function () {
          var detail = $(this).parent().find('.sub-menu');

          $('.havesub').removeClass('active');
          $('.sub-menu').slideUp(500);

          if(detail.is(":visible"))
          {
            detail.stop().slideUp(500);
            $(this).removeClass('active');
          }else{
            detail.stop().slideDown(500);
            $(this).addClass('active');
          }
        });

        $('.datepicker').datetimepicker({
          timepicker:false,
          format:'d/m/Y',
          formatDate:'Y/m/d'
        });
		$('.datepickermy').datetimepicker({
          timepicker:false,
          format:'m/Y',
          formatDate:'Y/m'
        });
        $('.timepicker').datetimepicker({
          datepicker:false,
          format:'H:i',
          step:30
        });
      });
    </script>
</head> 
   <header class="header clearfix">
    
    <div class="lang">
      <a href="#" class="fl"><img src="<c:url value="/resources/images/iconEn.png" />"></a>
      <a href="#" class="fl"><img src="<c:url value="/resources/images/iconTh.png" />"></a>
    </div>

    <div class="showhidemenu">
      
    </div>
    
    <a href="#" class="logomain">
       <img src="<c:url value="/resources/images/logo_login.png" />" width="100">
    </a>

    <ul class="datahead">
      <li>
        <div class="val">11545 Checker</div>
        <dev class="des">User ID</dev>
        
      </li>

      <li>
        <div class="val">Group Lease</div>
        <dev class="des">Company</dev>
      </li>

      <li>
        <div class="val">06/02/2015</div>
        <dev class="des">Date</dev>
      </li>

      <li>
        <div class="val">Prachachuen</div>
        <dev class="des">Branch</dev>
      </li>

      <li>
        <div class="val">10:00</div>
        <dev class="des">Time </dev>
      </li>

       <li>
        <div class="val">BK001</div>
        <dev class="des" style="width:80px;">Device Code </dev>
      </li>

    </ul>
  </header>
  <body>