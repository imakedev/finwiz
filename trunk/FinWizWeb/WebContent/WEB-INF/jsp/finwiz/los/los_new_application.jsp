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
	<div id="main-content">
		 <div class="wrapperdetail">
		<h2>Apply no: PRE-TH-A000001</h2>
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
		<div id="tablecontainer">
			<div class="tablecontainerrow">
				<div class="column1">
					<label class="labelright"><span class="red">*</span> ID type :</label>
				</div>
				<div class="column2">
					<select name="select9" class="textinput">
					<option selected>ID card</option>
					<option>ID passport</option>
					</select>
					<input name="idcode" type="text" id="idcode">
					<button class="btn btn-default btn-sm" id="checkidprofile" onclick="checkIdCard();">Check</button>
					<span id="resultCheckIdCard"></span>
				</div>
				<div class="column3-colspan">
					<input type="button" value="CANCEL" class="btn btn-default">
					<input type="button" value="SAVE AS DRAFT" class="btn btn-warning" id="savedraft2" onClick="">
					<input type="button" value="Submit" class="greenbtn">
				</div>
				<div class="clear" /></div>
			</div>
			
			<div class="tablecontainerrow">
				<div class="column1">
					<label class="labelright"><span class="red">*</span> Prefix :</label>
				</div>
				<div class="column2">
					<select class="textinput">
					<option selected>...</option>
					<option>Mr.</option>
					<option>Mrs.</option>
					<option>Miss</option>
					</select>
				</div>

				<div class="clear" /></div>
			</div>

			<div class="tablecontainerrow">
				<div class="column1">
					<label class="labelright"><span class="red">*</span> First Name :</label>
				</div>
				<div class="column2">
					<input name="txtFirstName" type="text" id="txtFirstName">
				</div>
				<div class="clear" /></div>
			</div>

			<div class="tablecontainerrow">
				<div class="column1">
					<label class="labelright">Middle Name :</label>
				</div>
				<div class="column2">
					<input name="txtMiddleName" type="text" id="txtMiddleName">
				</div>
				<div class="clear" /></div>
			</div>

			<div class="tablecontainerrow">
				<div class="column1">
					<label class="labelright"><span class="red">*</span> Last Name :</label>
				</div>
				<div class="column2">
					<input name="txtLastName" type="text" id="txtLastName">
				</div>
				<div class="clear" /></div>
			</div>

			<div class="tablecontainerrow">
				<div class="column1">
					<label class="labelright">Customer ID :</label>
				</div>
				<div class="column2">
					<input type="text" class="readonlyFormColor" value="TH-A000001" readonly>
				</div>
				<div class="column3">
					<div class="subcolumn3-1">
						<label class="labelright">Contract No :</label>
					</div>
					<div class="subcolumn3-2">
						<input type="text" class="readonlyFormColor" value="" readonly>
					</div>
				</div>
				<div class="clear" /></div>
			</div>
			</div></div>
			
		<%@ include file="/WEB-INF/jsp/templates/tabs.jsp" %>
			</div>
		<!-- // end main-content -->
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/jsp/templates/footer.jsp" %>
<!-- end body -->
