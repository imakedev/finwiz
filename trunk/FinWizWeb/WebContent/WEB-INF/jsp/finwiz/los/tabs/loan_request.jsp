 <script type="text/javascript">
function btnAddIncome(){
	var addIncome1 = document.getElementById("addIncome1-1").className;
	if(addIncome1=='rowTabsLeftNoDis'){
	document.getElementById("addIncome1-1").className = "rowTabsLeftNoDisTest";
	document.getElementById("addIncome1-2").className = "rowTabsLeftNoDisTest";
	}
}

function btnCloseIncome(){
	var closeIncome1 = document.getElementById("addIncome1-1").className;
	if(closeIncome1=='rowTabsLeftNoDisTest'){
	document.getElementById("addIncome1-1").className = "rowTabsLeftNoDis";
	document.getElementById("addIncome1-2").className = "rowTabsLeftNoDis";
	}
}
</script>
<style type="text/css">

	.rowTabsLeftNoDis
    {
        display:	none;
    }
    
    .rowTabsLeftNoDisTest
    {
        display:	table-row;
    }
</style>
  <div class="tableTabs">
		<div class="rowTabs">
			<div class="cellTabs">
				<div class="tableTabsLeft">
						<div class="rowTabsLeft">
							<div class="cellTabsLeft-1"><label class="labelright"><span class="red">*</span> DOB :</label></div>
							<div class="cellTabsLeft-2"><input name="txtDob" type="text" id="txtDob"></div>

						</div>
						<div class="rowTabsLeft">
							<div class="cellTabsLeft-1"><label class="labelright"><span class="red">*</span> Nationality :</label></div>
							<div class="cellTabsLeft-2">
								<select class="textinput" name="seleNationality" id="seleNationality">
									  <option>Thai</option>
									  <option>Trinidadian or Tobagonian</option>
								</select>
							</div>

						</div>
						<div class="rowTabsLeft">
							<div class="cellTabsLeft-1"><label class="labelright"><span class="red">*</span> Income type :</label></div>
							<div class="cellTabsLeft-2">
								<select class="textinput" name="seleIncomeType" id="seleIncomeType">
									<option value='' selected>...</option>
									<option value="e">Earned Income</option>
									<option value="w">Work Income</option>
									<option value="o">Other</option>
								</select>
							</div>
						</div>

						<div class="rowTabsLeft">
							<div class="cellTabsLeft-1"><label class="labelright"><span class="red">*</span> Monthly income(baht) :</label></div>
							<div class="cellTabsLeft-2">
								<input name="incomeBaht1" type="text" id="incomeBaht1">
								<label class="labelright"><span class="red">*</span> Since :</label>
								<input type="text" class="datepickermy">
							</div>
						</div>

						<div id="addIncome1-1" class="rowTabsLeftNoDis">
							<div class="cellTabsLeft-1"><label class="labelright"><span class="red">*</span> Income type: :</label></div>
							<div class="cellTabsLeft-2">
								<select class="textinput" name="seleIncomeType" id="seleIncomeType">
									<option value='' selected>...</option>
									<option value="e">Earned Income</option>
									<option value="w">Work Income</option>
									<option value="o">Other</option>
								</select>
								<button class="btn btn-xs close" onClick="btnCloseIncome();"> x </button>
							</div>
						</div>
						<div id="addIncome1-2" class="rowTabsLeftNoDis">
							<div class="cellTabsLeft-1"><label class="labelright"><span class="red">*</span> Monthly income(baht) :</label></div>
							<div class="cellTabsLeft-2">
								<input name="incomeBaht1" type="text" id="incomeBaht1">
								<label class="labelright"><span class="red">*</span> Since :</label>
								<input type="text" class="datepickermy">
							</div>
						</div>


				</div>
				<br />
				<button class="btn btn-default btn-block btn-sm" id="addincome" name="addincome" style="width: 86%" onclick="btnAddIncome();">Add income</button>
			</div>
	<div class="Cell">
		<div class="well">
			<div class="tableTabsRight">
					<div class="rowTabsRight">
						<div class="cellTabsRight-1"><input type="checkbox"><label class="labelright"><span class="red">*</span> ID copy :</label></div>
						<div class="cellTabsRight-2"><input type="file" class="form-control"> </div>
					</div>

					<div class="rowTabsRight">
						<div class="cellTabsRight-1"><input type="checkbox"><label class="labelright"><span class="red">*</span> NCB :</label></div>
						<div class="cellTabsRight-2"><input type="file" class="form-control"> </div>
					</div>

					<div class="rowTabsRight">
						<div class="cellTabsRight-1"><input type="checkbox"><label class="labelright"><span class="red">*</span> Application form :</label></div>
						<div class="cellTabsRight-2"><input type="file" class="form-control"> </div>
					</div>

					<div class="rowTabsRight">
						<div class="cellTabsRight-1"><input type="checkbox"><label class="labelright">Salary slip :</label></div>
						<div class="cellTabsRight-2"><input type="file" class="form-control"> </div>
					</div>

					<div class="rowTabsRight">
						<div class="cellTabsRight-1"><input type="checkbox"><label class="labelright">Bank statement :</label></div>
						<div class="cellTabsRight-2"><input type="file" class="form-control"> </div>
					</div>

					<div class="rowTabsRight">
						<div class="cellTabsRight-1"><input type="checkbox"><label class="labelright">House Photo :</label></div>
						<div class="cellTabsRight-2"><input type="file" class="form-control"> </div>
					</div>

					<div class="rowTabsRight">
						<div class="cellTabsRight-1"><input type="checkbox"><label class="labelright">Field check :</label></div>
						<div class="cellTabsRight-2"><input type="file" class="form-control"> </div>
					</div>

					<div class="rowTabsRight">
						<div class="cellTabsRight-1"><input type="checkbox"><label class="labelright">House registration :</label></div>
						<div class="cellTabsRight-2"><input type="file" class="form-control"> </div>
					</div>

					<div class="rowTabsRight">
						<div class="cellTabsRight-1"><input type="checkbox"><label class="labelright">Guarantor agreement :</label></div>
						<div class="cellTabsRight-2"><input type="file" class="form-control"> </div>
					</div>

					<div class="rowTabsRight">
						<div class="cellTabsRight-1"><input type="checkbox"><label class="labelright">Guarantor ID copy :</label></div>
						<div class="cellTabsRight-2"><input type="file" class="form-control"> </div>
					</div>
				</div>
			</div>
		</div>
	</div>
 </div>