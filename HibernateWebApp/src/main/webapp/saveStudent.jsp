<%@page import="com.avizva.dao.StudentDaoImpl"%>
<%@page import="com.avizva.dao.StudentDao"%>
<%@page import="com.avizva.model.Student"%>
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
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		Student student = new Student();
		student.setName(name);
		student.setContact(contact);
		StudentDao studentDao=new StudentDaoImpl();
		if(studentDao.saveStudent(student)){
			out.print("Saved details");
		}else{
			out.print("Failure");
		}
	%>
</body>
</html>