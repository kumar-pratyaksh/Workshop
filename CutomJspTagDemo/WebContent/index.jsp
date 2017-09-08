<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="WEB-INF/tldFile.tld"  prefix="m"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page errorPage="errorHandler.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

Square:<m:myTag number="21"></m:myTag>
<%-- <%
	int x=1,y=0;
	out.println(x/y);
%> --%>

<c:set var="x" value="29"></c:set>
<c:out value="${x }"></c:out>
<% String s="Hello"; %>

<c:if test="${ not empty s }">
	<c:out value="S is not null"></c:out>
</c:if>
<c:if test="${empty s }">
	<c:out value="S id null"></c:out>
</c:if>
<c:choose>
	<c:when test="${x==29 }">
		<c:out value="x is 29"></c:out>
	</c:when>
	<c:otherwise>
		<c:out value="x is not 29"></c:out>
	</c:otherwise>
</c:choose>

<c:forEach var="i" begin="1" end="5">
	<c:out value="${i }"></c:out>
</c:forEach>

<%!
	ArrayList<String> list=new ArrayList<>();
%>

<%
	list.add("aaa");
	list.add("bbb");
	list.add("ccc");
%>
<c:forEach var="listItem" items="${list}">

	<c:set var="listItem1" value="${listItem }"></c:set>
	<c:out value="${listItem1 })"></c:out>
</c:forEach>

</body>
</html>