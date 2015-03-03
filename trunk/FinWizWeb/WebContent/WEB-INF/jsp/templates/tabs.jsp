		<div class="tablecontainerrow"></div>
		
			<div id='tab-container'>
			<c:forEach items="${paramTabs}" var="paramTabsM" varStatus="loop"> 
					  <div class="tab-content" style="padding:10px;">
						<h1 class="tab" title="">${paramTabsM.getTabPath()}</h1>
						
						<jsp:include page="/WEB-INF/jsp/finwiz/los/tabs/${paramTabsM.getTabPath()}.jsp" />
					  </div>
			</c:forEach> 
					<%--  <!-- //end tab-content-->
					  
				 	  <div class="tab-content" style="padding:10px;">
						<h1 class="tab" title="">Loan request</h1>
						<%@ include file="/WEB-INF/jsp/finwiz/los/tabs/loan_request.jsp" %>
					  </div>
					  
					 <div class="tab-content" style="padding:10px;">
						<h1 class="tab" title="">Customer information</h1>
						<%@ include file="/WEB-INF/jsp/finwiz/los/tabs/customer_information.jsp" %>
					  </div>
					  <!-- //end tab-content-->
					  
					  <div class="tab-content" style="padding:10px;">
						<h1 class="tab" title="">Verification</h1>
					  <%@ include file="/WEB-INF/jsp/finwiz/los/tabs/verification.jsp" %>
					  </div>
					  <!-- //end tab-content-->
					  
					  <div class="tab-content" style="padding:10px;">
						<h1 class="tab" title="">Analysis</h1>
					   <%@ include file="/WEB-INF/jsp/finwiz/los/tabs/analysis.jsp" %>
					  </div>
					  <!-- //end tab-content-->--%>
				</div>
				<!-- //end tab-container-->
		
	  <!-- // end wrapperdetail -->
<style type="text/css" media="screen">@import "resources/css/tabs.css";</style>
<script type="text/javascript" src="resources/js/tabs.js"></script>