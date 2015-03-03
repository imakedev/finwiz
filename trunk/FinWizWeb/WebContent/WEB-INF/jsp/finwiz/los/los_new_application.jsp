<%@ include file="/WEB-INF/jsp/templates/header.jsp" %>
<style type="text/css">

</style>
<script type="text/javascript">
function cancelButton(){

	window.open('los_inbox','_self')
}
function checkIdCard(){
	
	$('#resultCheckIdCard').html('<span class="label label-info">New customer</span>');
}
</script>

<!-- start body -->
<div id="body-wrapper" class="clearfix">
<!-- start sidebar -->
<%@ include file="/WEB-INF/jsp/templates/sidebar.jsp" %>
<!-- end sidebar -->
<!-- start maincontent -->
<form:form action="applicationForm" modelAttribute="applicationForm" method="POST">
	<div id="main-content">
		 <div class="wrapperdetail">
		<h2>Apply no: PRE-TH-A000001
		
		<form:hidden path="actions"/>
		<form:hidden path="losApplicationM.applicationId"/>
		<form:hidden path="losApplicationM.losAppId"/>
		<form:hidden path="losApplicationM.conditionCode"/>
		<form:hidden path="losApplicationM.updatedBy" value="${userId}"/>
		<form:hidden path="wfActivityInstanceM.activityId"/>
		<form:hidden path="wfActivityInstanceM.applicationStatus" value="0001"/>
		<form:hidden path="wfActivityInstanceM.wfActivityInstanceId"/>
		<form:hidden path="wfActivityInstanceM.wfpiId"/>
		<form:hidden path="wfActivityInstanceM.refObjectId"/>
		<form:hidden path="wfActivityInstanceM.wfpId" value="WFP0001"/>
		<form:hidden path="wfActivityInstanceM.wfActivityInstanceOwnerUser" value="${userId}"/>
        <form:hidden path="wfActivityInstanceM.wfActivityInstanceOwnerRole" value="${userRolesId}"/> 
        <form:hidden path="wfActivityInstanceM.finId" value="THGL0000000001"/>    	
		</h2>
<!-- start content-box -->
		 <div class="content-box">
<!-- start content-box-content -->
			<div class="content-box-content">
				<div class="pull-right"> <a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1time" role="button"><i class="glyphicon glyphicon-eye-open"></i></a>
				<div class="badge">Status : <span name="displayJobStatus" id="displayJobStatus">Checker</span>
			  </div>
			    &nbsp;&nbsp;time elapse :1 day</div>
		  </div>
		  <!-- end content-box-content -->
    </div>
    <!--end content-box -->
    <div class="content-box">
    <div class="content-box-content">
<%@ include file="/WEB-INF/jsp/templates/buttons.jsp" %>
		<div id="tablecontainer">
			<div class="tablecontainerrow">
				<div class="column1">
					<label class="labelright"><span class="red">*</span> ID Dealer :</label>
				</div>
				<div class="column2">
					<form:input type="text" path="losApplicationM.dealerId"/>
				</div>
				<div class="clear" /></div>
			</div>
			</div>
<%@ include file="/WEB-INF/jsp/templates/subforms.jsp" %>
	</div>
			
		<%@ include file="/WEB-INF/jsp/templates/tabs.jsp" %>
			</div>
		<!-- // end main-content -->
		</div>
	</div>
	</form:form>
</div>

<%@ include file="/WEB-INF/jsp/templates/footer.jsp" %>
<!-- end body -->
