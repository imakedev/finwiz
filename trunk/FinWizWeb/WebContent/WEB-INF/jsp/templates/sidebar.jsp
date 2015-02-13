<aside id="sidebar">
  <div id="sidebar-wrapper"  class="clearfix">
    <!-- Sidebar -->
    <ul id="main-nav"> 
    <c:set var="userId" scope="session" value="${paramPage}"/>
    
   		<li> <a class="nav-top-item" href="los_inbox"><i class="glyphicon glyphicon-inbox"></i> Inbox <i class="massage">9</i></a></li>
		<c:if test="${userId=='checker'}">
		<li><a class="nav-top-item" href="los_new_application"><i class="glyphicon glyphicon-plus"></i> New Application</a></li>
		</c:if>
		<li><a class="nav-top-item" href="los_inbox"><i class="glyphicon glyphicon-search"></i> Search</a></li>
		 
		 <c:if test="${userId=='manager'}">
		 <li> <a class="nav-top-item havesub"><i class="glyphicon glyphicon-cog"></i> Parameters</a>
		 <div class="sub-menu">
          <ul>
          <li><a href="#">Test Sub Parameters</a></li>
          </ul>
          </div>
          </c:if>
          
		  <li><a class="nav-top-item havesub"> <i class="glyphicon glyphicon-file"></i> Report</a>
        <div class="sub-menu">
          <ul>
          <li><a href="#">Test Sub Report</a></li>
          </ul>
          </div>       </li> 
	
        
	<%--<c:forEach items="${paramPage}" var="paramPageM" varStatus="loop"> 
			
	      <li> <a class="nav-top-item" href="${paramPageM.getPagePath()}"><i class="glyphicon glyphicon-${paramPageM.getMenuIcon()}"></i> ${paramPageM.getMenuName()} </a></li>
	</c:forEach>
	      <%--<li><a class="nav-top-item" href="los02.php?s=new"><i class="glyphicon glyphicon-plus"></i> New Application</a></li>       
	      <li><a class="nav-top-item" href="search.php"><i class="glyphicon glyphicon-search"></i> Search</a></li>
	      
	       <li> <a class="nav-top-item havesub"><i class="glyphicon glyphicon-cog"></i> Parameters</a>
		        <div class="sub-menu">
		          <ul>
		            <li><a href="dealer.php">Dealer shops</a></li>
		            <li><a href="campaign.php">Marketing campaign</a></li>
		            <li><a href="product.php">Products</a></li>
		            <li><a href="model.php">Models</a></li>
		            <li><a href="policy.php">Policy</a></li>
		            <li><a href="creditscoring.php">Credit scoring</a></li>  
		            <li><a href="documentlist.php">Documents list</a></li>
		          </ul>
		        </div>
	      </li> 
	       
	       <li> <a class="nav-top-item havesub"><i class="glyphicon glyphicon-file"></i> Report</a>
		        <div class="sub-menu">
			          <ul>
				           <li><a href="r_approve.php">aaa</a></li>
				           <li><a href="r_perfomance.php">bbb</a></li>
				           <li><a href="r_customer.php">ccc</a></li>
				           <li><a href="r_finance.php">ddd</a></li>
			          </ul>
		         </div>       
	       </li> --%>
	       <li> <a class="nav-top-item" href="logout"><i class="glyphicon glyphicon-off"></i> Log out</a></li>
    </ul>
  </div>
</aside>