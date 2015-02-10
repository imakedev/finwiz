<%@ include file="/WEB-INF/jsp/header.jsp" %>
<style type="text/css">

</style>
<script type="text/javascript">
$(function() {
	$( "#tabs" ).tabs();
	});
function cancelButton(){

	window.open('los_checker_inbox','_self')
}
</script>
<div id="body-wrapper" class="clearfix">
	<%@ include file="/WEB-INF/jsp/sidebar.jsp" %>
	
	<div id="main-content">
		<div class="wrapperdetail">
		 	<h2>Apply no: PRE-TH-A000001</h2>
			    <div class="content-box">
				    <div class="content-box-content">
<div class="pull-right"> <a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1time" role="button"><i class="glyphicon glyphicon-eye-open"></i></a>
          <div class="badge">Status : <span name="displayJobStatus" id="displayJobStatus"></span></div>
            &nbsp;&nbsp;time elapse :1 day</div>
					</div>
				</div>
				<div class="content-box">
      <div class="content-box-content">
        <div class="pull-right">
          <p>&nbsp;
            <input type="button" value="CANCEL" class="btn btn-default" onclick="cancelButton();">
            <input type="button" value="SAVE AS DRAFT" class="btn btn-warning" id="savedraft2" onClick="$('#displayJobStatus').html($('#userdraft').val()+' Draft');">
            <input type="button"  value="Submit to Input Data" class="greenbtn" onClick="if(confirm('Submit to Input Data')=='yes'){               window.location.href = 'los01.php'}; ">
         </p>
        </div>
        <div class="div_row1">
			<span class="red">*</span> ID type
			</div>
			<div class="div_row2">
			   <select name="select9" class="textinput">
                <option selected>ID card</option>
                <option>ID passport</option>
              </select>
                 <input name="idcode" type="text" id="idcode">
              <button class="btn btn-default btn-sm" id="checkidprofile">Check</button>
			</div><br><br><br>
<div class="div_row1">
			<span class="red">*</span> Prefix
			</div>
			<div class="div_row2">
			   <select class="textinput">
                <option selected>...</option>
                <option>Mr.</option>
                <option>Mrs.</option>
                <option>Miss</option>
              </select>
			</div><br><br><br>
			<div class="div_row1">
			<span class="red">*</span> First name
			</div>
			<div class="div_row2">
			   <input type="text" >
			</div>
			<br><br><br>
			<div class="div_row1">
			middle name
			</div>
			<div class="div_row2">
			   <input type="text" >
			</div>
			<br><br><br>
			<div class="div_row1">
			<span class="red">*</span> Last name
			</div>
			<div class="div_row2">
			   <input type="text" >
			</div>
			<br><br><br>
			<div class="div_row1">
			Customer ID
			</div>
			<div class="div_row2">
			   <input type="text" readonly>
			</div>
      </div><br><br><br>
	<div id="tabs">
		<ul>
		<li><a href="#tabs-1">Loan request</a></li>
		<li><a href="#tabs-2">Customer Information</a></li>
		</ul>
		<div id="tabs-1">
		<div class="div_row1">
			<span class="red">*</span> DOB: 
			</div>
			<div class="div_row2">
			   <input name="dob" type="text" class="datepicker" id="dob" readonly>
			</div><br><br><br>
            <div class="div_row1">
			<span class="red">*</span> Nationality: 
			</div>
			<div class="div_row2">
			   <select class="textinput" name="nationality" id="nationality">
                          <option>Afghan</option>
                          <option>Albanian</option>
                          <option>Algerian</option>
                          <option>American</option>
                          <option>Andorran</option>
                          <option>Angolan</option>
                          <option>Antiguans</option>
                          <option>Argentinean</option>
                          <option>Armenian</option>
                          <option>Australian</option>
                        </select>
			</div><br><br><br>
		</div>
		<div id="tabs-2">
		<div class="div_row1">
			<span class="red">*</span> DOB: 
			</div>
			<div class="div_row2">
			   <input name="dob" type="text" class="datepicker" id="dob" readonly>
			</div><br><br><br>
		</div>
	</div>
</div>


		</div>
		
	</div>
	
</div>
	<%@ include file="/WEB-INF/jsp/footer.jsp" %>
