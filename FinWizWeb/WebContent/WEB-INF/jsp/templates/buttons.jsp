		<div id="tablecontainer">
			<div class="tablecontainerrow">
				<div class="columnBtn3">
				<c:set var="userId" scope="session" value="${userId}"/>
				<c:if test="${userId=='checker'}">
					<input type="button" value="CANCEL" class="btn btn-default" onclick="cancelButton();">
					<input type="submit" name="btnAction" value="SAVE AS DRAFT" class="btn btn-warning" id="savedraft2">
					<input type="submit" name="btnAction" value="SUBMIT" class="greenbtn">
				</c:if>
					
					<c:if test="${userId=='manager'}">
					<input type="button" value="CANCEL" class="btn btn-default" onclick="cancelButton();">
					<input type="submit" name="btnAction" value="SAVE AS DRAFT" class="btn btn-warning" id="savedraft2">
					<input type="submit" name="btnAction" value="APPOVE" class="greenbtn">
					<input type="submit" name="btnAction" value="REJECT TO CHECKER" class="greenbtn">
					<input type="submit" name="btnAction" value="REJECT" class="greenbtn">
					</c:if>
				
				</div>
				<div class="clear" />
			</div>
		</div>