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
	int id=Integer.parseInt(request.getParameter("id"));
	StudentDao studentDao=new StudentDaoImpl();
	Student student=studentDao.fetch(id);
	if(student==null)
		out.println("No studnet found with given id");
	else{
		student.setName(request.getParameter("name"));
		if(studentDao.update(student)){
			out.println("Details updated successfully");
		}else{
			out.println("unable to update student details");
		}
	}
%>

</body>
</html>