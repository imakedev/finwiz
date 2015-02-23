<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<style>
.error {
    color: #ff0000;
    font-style: italic;
    font-weight: bold;
}
</style>
  <div class="lang">
      <a href="/finwiz/?language=th_TH" class="fl"><img src="<c:url value="/resources/images/iconEn.png" />"></a>
      <a href="/finwiz/?language=en" class="fl"><img src="<c:url value="/resources/images/iconTh.png" />"></a>
    </div>
<form:form   id="finWizForm" name="finWizForm" modelAttribute="finWizForm"    method="POST" action="/finwiz/test/action"
		cssClass="form-horizontal" role="form" style="margin-bottom: 50px;">
		    <fieldset>
		    	<legend style="font-weight: bold; font-size: 32px;"><spring:message code="page_title"/>
		    	|<fmt:message key="page_title"/>
		    	</legend>
		    
		    	<div class="form-group">
		            <div class="col-md-4" style="padding-bottom: 10px;">
		              	<form:errors path="losApplicationM.applicationId" cssClass="error" />
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">App ID</label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		                <form:input path="losApplicationM.applicationId" cssClass="form-control textsize"
		                 placeholder="App ID"  />
		               
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">Custermer name</label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		                <form:input path="losCustomerM.firstName" cssClass="form-control textsize"
		                 placeholder="Custermer name"  />
		               
		            </div>
	            </div>
	               <div class="form-group">
		            <div class="col-lg-10 col-lg-offset-4">
		              
		                <button type="submit" class="btn btn-material-purple" style="font-weight: bold; font-size: 22px;">Submit</button>
		            </div>
		        </div>
		    </fieldset>
		</form:form>