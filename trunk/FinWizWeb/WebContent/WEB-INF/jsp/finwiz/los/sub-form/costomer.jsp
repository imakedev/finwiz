		<div id="tablecontainer">
			<div class="tablecontainerrow">
				<div class="column1">
					<label class="labelright"><span class="red">*</span> ID type :</label>
				</div>
				<div class="column2">
					<select name="ddlIdType" id="ddlIdType" class="textinput">
					<option selected>ID card</option>
					<option>ID passport</option>
					</select>
					<input name="txtIdCode" type="text" id="txtIdCode">
					<button class="btn btn-default btn-sm" id="checkidprofile" onclick="checkIdCard();">Check</button>
					<span id="resultCheckIdCard"></span>
				</div>
				<div class="clear" /></div>
			</div>
			
			<div class="tablecontainerrow">
				<div class="column1">
					<label class="labelright"><span class="red">*</span> Prefix :</label>
				</div>
				<div class="column2">
					<select name="ddlPreFix" id="ddlPreFix" class="textinput">
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
					<input name="txtCustomerId" id="txtCustomerId" type="text" class="readonlyFormColor" value="TH-A000001" readonly>
				</div>
				<div class="column3">
					<div class="subcolumn3-1">
						<label class="labelright">Contract No :</label>
					</div>
					<div class="subcolumn3-2">
						<input name="txtContractNo" id="txtContractNo" type="text" class="readonlyFormColor" readonly>
					</div>
				</div>
				<div class="clear" /></div>
			</div>
			</div>