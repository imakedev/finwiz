<%@ include file="/WEB-INF/jsp/templates/header.jsp" %>
 
	<style type="text/css">
		th, td { white-space: nowrap; }
			div.dataTables_wrapper {
				width: 100%;
				margin: 0 auto;
			}
	</style>
    <script type="text/javascript">
    $( document ).ready(function() {
    	
		createDataTableForInboxChecker();	
})


    var dataSet = [
                   ['TH-A000005','PRE-TH-A000013','18/12/2015','0 day 2 hours 10 min 33 sec','Jean','Foor','+66 718 194 342','DTH000001','Honda NCX 115','MCTH000001','P001 GL HIRE PURCHASE','Checker - Approve with conditions','<a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1aprove" role="button"><i class="glyphicon glyphicon-eye-open"></i></a> <a class="btn btn-xs btn-success" href="#" role="button" onClick="OpenPageCheckerforAdd();"><i class="glyphicon glyphicon-pencil"></i></a>'],
                   ['TH-A000006','PRE-TH-A000014','19/12/2015','0 day 4 hours 20 min 33 sec','Jean','Foor','+66 718 194 342','DTH000002','Honda NCX 115','MCTH000001','P001 GL HIRE PURCHASE','Underwriting','<a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1aprove" role="button"><i class="glyphicon glyphicon-eye-open"></i></a> <a class="btn btn-xs btn-success" href="#" role="button" onClick="OpenPageCheckerforAdd();"><i class="glyphicon glyphicon-pencil"></i></a>'],
                   ['TH-A000007','PRE-TH-A000015','20/12/2015','0 day 6 hours 30 min 33 sec','Jean','Foor','+66 718 194 342','DTH000003','Honda NCX 115','MCTH000001','P001 GL HIRE PURCHASE','Input Data','<a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1aprove" role="button"><i class="glyphicon glyphicon-eye-open"></i></a> <a class="btn btn-xs btn-success" href="#" role="button" onClick="OpenPageCheckerforAdd();"><i class="glyphicon glyphicon-pencil"></i></a>'],
                   ['TH-A000008','PRE-TH-A000016','21/12/2015','0 day 8 hours 40 min 33 sec','Jean','Foor','+66 718 194 342','DTH000004','Honda NCX 115','MCTH000001','P001 GL HIRE PURCHASE','Rejected','<a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1aprove" role="button"><i class="glyphicon glyphicon-eye-open"></i></a> <a class="btn btn-xs btn-success" href="#" role="button" onClick="OpenPageCheckerforAdd();"><i class="glyphicon glyphicon-pencil"></i></a>'],
                   ['TH-A000009','PRE-TH-A000017','22/12/2015','0 day 10 hours 50 min 33 sec','Jean','Foor','+66 718 194 342','DTH000005','Honda NCX 115','MCTH000001','P001 GL HIRE PURCHASE','Approved','<a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1aprove" role="button"><i class="glyphicon glyphicon-eye-open"></i></a> <a class="btn btn-xs btn-success" href="#" role="button" onClick="OpenPageCheckerforAdd();"><i class="glyphicon glyphicon-pencil"></i></a>'],
				   ['TH-A000005','PRE-TH-A000013','18/12/2015','0 day 2 hours 10 min 33 sec','Jean','Foor','+66 718 194 342','DTH000001','Honda NCX 115','MCTH000001','P001 GL HIRE PURCHASE','Draft','<a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1aprove" role="button"><i class="glyphicon glyphicon-eye-open"></i></a> <a class="btn btn-xs btn-success" href="#" role="button" onClick="OpenPageCheckerforAdd();"><i class="glyphicon glyphicon-pencil"></i></a>'],
                   ['TH-A000006','PRE-TH-A000014','19/12/2015','0 day 4 hours 20 min 33 sec','Jean','Foor','+66 718 194 342','DTH000002','Honda NCX 115','MCTH000001','P001 GL HIRE PURCHASE','Proposal','<a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1aprove" role="button"><i class="glyphicon glyphicon-eye-open"></i></a> <a class="btn btn-xs btn-success" href="#" role="button" onClick="OpenPageCheckerforAdd();"><i class="glyphicon glyphicon-pencil"></i></a>'],
                   ['TH-A000007','PRE-TH-A000015','20/12/2015','0 day 6 hours 30 min 33 sec','Jean','Foor','+66 718 194 342','DTH000003','Honda NCX 115','MCTH000001','P001 GL HIRE PURCHASE','Should Reject','<a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1aprove" role="button"><i class="glyphicon glyphicon-eye-open"></i></a> <a class="btn btn-xs btn-success" href="#" role="button" onClick="OpenPageCheckerforAdd();"><i class="glyphicon glyphicon-pencil"></i></a>'],
                   ['TH-A000008','PRE-TH-A000016','21/12/2015','0 day 8 hours 40 min 33 sec','Jean','Foor','+66 718 194 342','DTH000004','Honda NCX 115','MCTH000001','P001 GL HIRE PURCHASE','Rejected','<a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1aprove" role="button"><i class="glyphicon glyphicon-eye-open"></i></a> <a class="btn btn-xs btn-success" href="#" role="button" onClick="OpenPageCheckerforAdd();"><i class="glyphicon glyphicon-pencil"></i></a>'],
                   ['TH-A000009','PRE-TH-A000017','22/12/2015','0 day 10 hours 50 min 33 sec','Jean','Foor','+66 718 194 342','DTH000005','Honda NCX 115','MCTH000001','P001 GL HIRE PURCHASE','Approved','<a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1aprove" role="button"><i class="glyphicon glyphicon-eye-open"></i></a> <a class="btn btn-xs btn-success" href="#" role="button" onClick="OpenPageCheckerforAdd();"><i class="glyphicon glyphicon-pencil"></i></a>'],
				   ['TH-A000005','PRE-TH-A000013','18/12/2015','0 day 2 hours 10 min 33 sec','Jean','Foor','+66 718 194 342','DTH000001','Honda NCX 115','MCTH000001','P001 GL HIRE PURCHASE','Draft','<a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1aprove" role="button"><i class="glyphicon glyphicon-eye-open"></i></a> <a class="btn btn-xs btn-success" href="#" role="button" onClick="OpenPageCheckerforAdd();"><i class="glyphicon glyphicon-pencil"></i></a>'],
                   ['TH-A000006','PRE-TH-A000014','19/12/2015','0 day 4 hours 20 min 33 sec','Jean','Foor','+66 718 194 342','DTH000002','Honda NCX 115','MCTH000001','P001 GL HIRE PURCHASE','Underwriting','<a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1aprove" role="button"><i class="glyphicon glyphicon-eye-open"></i></a> <a class="btn btn-xs btn-success" href="#" role="button" onClick="OpenPageCheckerforAdd();"><i class="glyphicon glyphicon-pencil"></i></a>'],
                   ['TH-A000007','PRE-TH-A000015','20/12/2015','0 day 6 hours 30 min 33 sec','Jean','Foor','+66 718 194 342','DTH000003','Honda NCX 115','MCTH000001','P001 GL HIRE PURCHASE','Input Data','<a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1aprove" role="button"><i class="glyphicon glyphicon-eye-open"></i></a> <a class="btn btn-xs btn-success" href="#" role="button" onClick="OpenPageCheckerforAdd();"><i class="glyphicon glyphicon-pencil"></i></a>'],
                   ['TH-A000008','PRE-TH-A000016','21/12/2015','0 day 8 hours 40 min 33 sec','Jean','Foor','+66 718 194 342','DTH000004','Honda NCX 115','MCTH000001','P001 GL HIRE PURCHASE','Rejected','<a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1aprove" role="button"><i class="glyphicon glyphicon-eye-open"></i></a> <a class="btn btn-xs btn-success" href="#" role="button" onClick="OpenPageCheckerforAdd();"><i class="glyphicon glyphicon-pencil"></i></a>'],
                   ['TH-A000009','PRE-TH-A000017','22/12/2015','0 day 10 hours 50 min 33 sec','Jean','Foor','+66 718 194 342','DTH000005','Honda NCX 115','MCTH000001','P001 GL HIRE PURCHASE','Approved','<a class="btn btn-xs btn-default" href="#" data-featherlight="#fl1aprove" role="button"><i class="glyphicon glyphicon-eye-open"></i></a> <a class="btn btn-xs btn-success" href="#" role="button" onClick="OpenPageCheckerforAdd();"><i class="glyphicon glyphicon-pencil"></i></a>']
               ];
    function createDataTableForInboxChecker(){
    	
	    $('#table_inbox').html( '<table width="100%" class="display" id="table_InboxChecker" cellspacing="0">' );
	    
	    $('#table_InboxChecker').dataTable( {
	    	"scrollX":        true,
	        "jQueryUI":       true,
	        "data": dataSet,
	        "columns": [
	            { "title": "Customer ID" },
	            { "title": "Application NO" },
	            { "title": "Date Application" },
	            { "title": "Time Elapsed Since Submiited" },
	            { "title": "First Name" },
	            { "title": "Last Name" },
	            { "title": "Phone" },
	            { "title": "Dealer Shop" },
	            { "title": "Model" },
	            { "title": "Marketing Campaign" },
	            { "title": "Product" },
	            { "title": "Status" },
	            { "title": "Actions" }
	        ],
	        "fnRowCallback": function( nRow, aData, iDisplayIndex, iDisplayIndexFull ) {
	            if ( aData[11] == "Rejected" )
	            {
	             $('td',nRow).css('background-color', '#FF0000')
	            }else if ( aData[11] == "Proposal" )
	            {
		         $('td',nRow).css('background-color', '#538DD5')
		        }else if ( aData[11] == "Underwriting" )
	            {
		         $('td',nRow).css('background-color', '#D9D9D9')
		        }else if ( aData[11] == "Checker - Approve with conditions" || aData[11] == "Draft")
	            {
			     $('td',nRow).css('background-color', '#ffffff')
			    }else if ( aData[11] == "Input Data")
	            {
				 $('td',nRow).css('background-color', '#F2F2F2')
				}else if ( aData[11] == "Should Reject")
	            {
				 $('td',nRow).css('background-color', '#DCE6F1')
				}else if ( aData[11] == "Approved")
	            {
				 $('td',nRow).css('background-color', '#00B050')
				}
	          }
	    } );   
    }
    function OpenPageCheckerforAdd(){

    	window.open('los_new_application','_self') 
    }
    $(document).on('click','.close_button',function(){
        $('.featherlight').click();
    });
     
    </script>
<form:form id="testf" name="testf" method="POST">
<div id="body-wrapper" class="clearfix">
	<%@ include file="/WEB-INF/jsp/templates/sidebar.jsp" %>
	
	<div id="main-content">
		<div class="wrapperdetail">
		 	<h2>Inbox</h2>
			    <div class="content-box">
				    <div class="content-box-content">
				        <div class="separator bottom form-inline">
				        	<div id="table_inbox"></div>
						</div>
					</div>
				</div>
		</div>
	</div>
</div>	
<div class="lightbox" id="fl1aprove">
  <h4><i class="glyphicon glyphicon-user"></i><label>Customer ID : </label> TH-A000001 </h4>
  <div class="well">
    <ul>
      <li>&nbsp;Name : Jean Foor</li>
      <li>&nbsp;Status : <span class="label label-success">If Proposal</span></li>
    </ul>
  </div>
  <div> More conditions: <br>
			<div class="row_group1">
			 Net Finance:
			</div>
			<div class="row_group2">
			   	40,000
			</div>
			<div class="row_group1">
			 Total Interest:
			</div>
			<div class="row_group2">
			   10,000
			</div>
			<div class="row_group1">
			 Total AR:
			</div>
			<div class="row_group2">
			   99
			</div>
			<div class="row_group1">
			 Total VAT:
			</div>
			<div class="row_group2">
			    	99
			</div>
			<br>
			<div class="row_group1">
			 Installment Net:
			</div>
			<div class="row_group2">
			    	 	2,000
			</div>
			<div class="row_group1">
			 Installment VAT:
			</div>
			<div class="row_group2">
			    	 	 	99
			</div>
			<div class="row_group1">
			 Total Installment:
			</div>
			<div class="row_group2">
			    	 	 	99
			</div>
			<div class="row_group1">
			 Advance Installment:
			</div>
			<div class="row_group2">
			    	 	 	99
			</div>
			<br>
			<div class="row_group1">
			 Down Payment:
			</div>
			<div class="row_group2">
			    	 	 	 	3,500
			</div>
			<div class="row_group1">
			 Down Payment %:
			</div>
			<div class="row_group2">
			    	9
			</div>
			<div class="row_group1">
			 Flat Rate:
			</div>
			<div class="row_group2">
			    	 	1.99
			</div>
			<div class="row_group1">
			 Terms:
			</div>
			<div class="row_group2">
			    	 	12
			</div>
			<br>
			<div class="row_group1">
			 Nb of Guarantor:
			</div>
			<div class="row_group2">
			    	 	0
			</div>
			<div class="row_group1">
			 First due date:
			</div>
			<div class="row_group2">
			    	 	20/02/2015
			</div>
			<div class="row_group1">
			  	Last due date:
			</div>
			<div class="row_group2">
			    	 	20/02/2015
			</div>
  <div class="clear"></div>
  <textarea  rows="2" class="form-control boxcomment" readonly>COMMENT MANAGER ..</textarea>
  <textarea rows="2" class="form-control boxcomment">COMMENT CHECKER ..</textarea>
  <p class="pull-right"><br>
<input type="button" value="Approve" class="greenbtn close_button">
<input type="button" value="Decline" class="redbtn close_button">
 </p>
</div>
</div>
</form:form>
	<%@ include file="/WEB-INF/jsp/templates/footer.jsp" %>
