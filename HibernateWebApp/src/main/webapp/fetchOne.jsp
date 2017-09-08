<%@page import="com.avizva.model.Student"%>
<%@page import="com.avizva.dao.StudentDaoImpl"%>
<%@page import="com.avizva.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		StudentDao studentDao=new StudentDaoImpl();
		Student student=studentDao.fetch(Integer.parseInt(request.getParameter("id")));
		if(student==null){
			out.println("No student found with given id");
		}
		else
		out.println(student);
	%>
</body>
</html>