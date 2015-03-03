

<%--<%@ include file="/WEB-INF/jsp/finwiz/los/sub-form/costomer.jsp" %>--%>


<c:forEach items="${paramSubForms}" var="paramSubFormsM" varStatus="loop"> 

<jsp:include page="/WEB-INF/jsp/finwiz/los/sub-form/${paramSubFormsM.getFormPath()}.jsp" />

</c:forEach>  