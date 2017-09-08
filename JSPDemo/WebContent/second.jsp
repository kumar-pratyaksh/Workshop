<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Stored application value <%= pageContext.getAttribute("x", PageContext.APPLICATION_SCOPE)%><br>
	Stored request value <%= pageContext.getAttribute("y",PageContext.REQUEST_SCOPE) %><br>
	Stored page value not accessible <%= pageContext.getAttribute("z") %>
</body>
</html>