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
                   ['TH-A000002','PRE-TH-A000005','13/12/2015','8.15 AM','Jean','Foor','+66 718 194 342','Honda NCX 115','DTH000001','Checker - Approve with conditions','LOS108','U000001','--','Time elapsed'],
                   ['TH-A000003','PRE-TH-A000006','13/12/2015','8.15 AM','Jean','Foor','+66 718 194 342','Honda NCX 115','DTH000001','Wait for Checker','LOS108','U000001','--','Time elapsed'],
                   ['TH-A000004','PRE-TH-A000007','13/12/2015','8.15 AM','Jean','Foor','+66 718 194 342','Honda NCX 115','DTH000001','Wait for Checker','LOS108','U000001','--','Time elapsed'],
                   ['TH-A000005','PRE-TH-A000008','13/12/2015','8.15 AM','Jean','Foor','+66 718 194 342','Honda NCX 115','DTH000001','Wait for Checker','LOS108','U000001','--','Time elapsed'],
                   ['TH-A000006','PRE-TH-A000009','13/12/2015','8.15 AM','Jean','Foor','+66 718 194 342','Honda NCX 115','DTH000001','Rejected','LOS108','U000001','--','Time elapsed'],
                   ['TH-A000007','PRE-TH-A0000010','13/12/2015','8.15 AM','Jean','Foor','+66 718 194 342','Honda NCX 115','DTH000001','Approved','LOS108','U000001','--','Time elapsed']
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
	            { "title": "Hour" },
	            { "title": "First Name" },
	            { "title": "Last Name" },
	            { "title": "Phone" },
	            { "title": "Model" },
	            { "title": "Dealer Shop" },
	            { "title": "Status" },
	            { "title": "Stage" },
	            { "title": "User" },
	            { "title": "Comment" },
	            { "title": "Time elapsed" }
	        ],
	        "fnRowCallback": function( nRow, aData, iDisplayIndex, iDisplayIndexFull ) {
	            if ( aData[9] == "Rejected" )
	            {
	             $('td',nRow).css('background-color', '#FF0000')
	            }else if ( aData[9] == "Proposal" )
	            {
		         $('td',nRow).css('background-color', '#538DD5')
		        }else if ( aData[9] == "Underwriting" )
	            {
		         $('td',nRow).css('background-color', '#D9D9D9')
		        }else if ( aData[9] == "Checker - Approve with conditions" || aData[9] == "Draft")
	            {
			     $('td',nRow).css('background-color', '#ffffff')
			    }else if ( aData[9] == "Input Data")
	            {
				 $('td',nRow).css('background-color', '#F2F2F2')
				}else if ( aData[9] == "Should Reject")
	            {
				 $('td',nRow).css('background-color', '#DCE6F1')
				}else if ( aData[9] == "Approved")
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
		 	<h2>Search</h2>
		 	<div class="content-box">
        <div class="content-box-header">
          <form class="searchform">
            <table width="100%" border="0" cellspacing="0" cellpadding="1">

              <tr>
                <td width="250" align="right" nowrap>Application NO :</td>
                <td width="150" nowrap><input type="text"  class="textinput"></td>
                <td width="200" align="right" nowrap>Model :</td>
                <td nowrap><input type="text"  class="textinput"></td>
              </tr>
              <tr>
                <td align="right" nowrap>Customer    ID :</td>
                <td nowrap><input type="text"  class="textinput"></td>
                <td align="right" nowrap>ID Number:</td>
                <td nowrap><input type="text"  class="textinput"></td>
              </tr>
              <tr>
                <td align="right" nowrap>First Name  Last Name:</td>
                <td nowrap><input type="text"  class="textinput"></td>
                <td align="right" nowrap>&nbsp;</td>
                <td nowrap>&nbsp;</td>
              </tr>

              <tr>
                <td colspan="4" align="right" nowrap><input type="submit"  value="Search" class="search">
                    <input type="submit"  value="Reset" class="search"></td>
              </tr>
            </table>
          </form>
        </div>
      </div>
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
</form:form>
	<%@ include file="/WEB-INF/jsp/templates/footer.jsp" %>
