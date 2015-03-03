<aside id="sidebar">
  <div id="sidebar-wrapper"  class="clearfix">
    <!-- Sidebar -->
    <ul id="main-nav"> 

<%--    <c:set var="userId" scope="session" value="${paramPage}"/>
    
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
          </div>       </li> --%>
          <input type="hidden" name="test" id="test">
	<c:forEach items="${paramPages}" var="paramPageM" varStatus="loop"> 
			
	      <li> <a class="nav-top-item" href="${paramPageM.getPagePath()}"><i class="glyphicon glyphicon-${paramPageM.getMenuIcon()}"></i> ${paramPageM.getMenuName()} </a></li>
	</c:forEach>
		<%--  <li> <a class="nav-top-item" href="los_inbox"><i class="glyphicon glyphicon-inbox"></i> Inbox <i class="massage">9</i></a></li>
	      <li><a class="nav-top-item" href="los_new_application"><i class="glyphicon glyphicon-plus"></i> New Application</a></li>       
	      <li><a class="nav-top-item" href="los_search"><i class="glyphicon glyphicon-search"></i> Search</a></li>
	      
	       <li> <a class="nav-top-item havesub"><i class="glyphicon glyphicon-cog"></i> Parameters</a>
		        <div class="sub-menu">
		          <ul>
		            <li><a href="#">Dealer shops</a></li>
		            <li><a href="#">Marketing campaign</a></li>
		            <li><a href="#">Products</a></li>
		            <li><a href="#">Models</a></li>
		            <li><a href="#">Policy</a></li>
		            <li><a href="#">Credit scoring</a></li>  
		            <li><a href="#">Documents list</a></li>
		          </ul>
		        </div>
	      </li> 
	       
	       <li> <a class="nav-top-item havesub"><i class="glyphicon glyphicon-file"></i> Report</a>
		        <div class="sub-menu">
			          <ul>
				           <li><a href="#">aaa</a></li>
				           <li><a href="#">bbb</a></li>
				           <li><a href="#">ccc</a></li>
				           <li><a href="#">ddd</a></li>
			          </ul>
		         </div>       
	       </li> --%>
	       <li> <a class="nav-top-item" href="logout"><i class="glyphicon glyphicon-off"></i> Log out</a></li>
    </ul>
  </div>
</aside>