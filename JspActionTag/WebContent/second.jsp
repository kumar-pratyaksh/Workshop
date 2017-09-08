<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ page import="com.Student" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- <jsp:useBean id="student" class="com.Student" scope="page"></jsp:useBean>
 --%>
<%-- <jsp:setProperty property="name" name="student" param="username"/>
<jsp:setProperty property="age" name="student" param="age"/>
<jsp:setProperty property="address" name="student" param="address"/> --%>

<%-- <jsp:setProperty property="*" name="student"/>


<jsp:getProperty property="name" name="student"/>
<jsp:getProperty property="age" name="student"/>
<jsp:getProperty property="address" name="student"/> --%>

<%-- Name: ${param.name}
<br>
Age: ${param.age}
<br>
Address: ${param.address} --%>
${student }
<%
	/* Student student2=(Student)request.getAttribute("student");
	out.println(student2.getName());
	out.println(student2.getAddress()); */
	Student student2=(Student)request.getAttribute("student2");
	out.println(student2);
	out.println(request.getAttribute("x"));
%>
<%-- <jsp:getProperty property="name" name="student2"/>
<jsp:getProperty property="age" name="student2"/>
<jsp:getProperty property="address" name="student2"/> --%>

</body>
</html>