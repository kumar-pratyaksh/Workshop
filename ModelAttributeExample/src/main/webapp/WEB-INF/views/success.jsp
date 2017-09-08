<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>${message }</h2>
	Thanks for registration. Entered details are:
	<h2>Name:${student.name} </h2> 
	<h2>Contact:${student.contact} </h2> 
	<h2>Email:${student.email} </h2> 
	<h2>DOB:${student.dob }</h2>
	<h2>Hobbies:${student.hobbies }</h2>
<%-- 	<h2>Address:${student.address.city },${student.address.country },${student.address.pin }</h2>
 --%></body>
</html>