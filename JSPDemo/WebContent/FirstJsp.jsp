<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.Counter" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

Hello world from JSP
<%!
int x=25;

%>

<%
	out.println(x);
	
%>
<br>
	Value of counter:<%=new Counter().count() %>



<!-- Session object -->

<%
	session.setAttribute("x", x);
%>
<a href="second.jsp">Second Page</a>
<%= config.getInitParameter("username") %>
<form action="second.jsp">
<%
	pageContext.setAttribute("x", 5, PageContext.REQUEST_SCOPE);
	pageContext.setAttribute("y", 2, PageContext.REQUEST_SCOPE);
	pageContext.setAttribute("z", 1, PageContext.PAGE_SCOPE);
%>
<input type="submit">
</form>
</body>
</html>