<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- <jsp:include page="header.jsp"></jsp:include>
<h1>Index Page</h1>

<jsp:forward page="second.jsp">
	<jsp:param value="KP" name="userName"/>
</jsp:forward> --%>

<%-- <jsp:useBean id="student" class="com.Student" scope="page"></jsp:useBean>

<jsp:setProperty property="name" name="student" value="KP"/>
<jsp:setProperty property="age" name="student" value="23"/>
<jsp:setProperty property="address" name="student" value="MBD"/>


<jsp:getProperty property="name" name="student"/> --%>

<form action="second.jsp" method="POST">

	<!-- Username:<input type="text" name="name">
	<br>
	Age:<input type="text" name="age">
	<br>
	Address:<input type="text" name="address">
	<br>
	<input type="submit"> -->
	<jsp:useBean id="student" class="com.Student" scope="session"></jsp:useBean>
	<jsp:setProperty property="name" name="student" value="kp"/>
	<jsp:setProperty property="age" name="student" value="23"/>
	<%-- <%
		student=new Student();
		student.setName("KP");
		student.setAge(23);
		student.setAddress("ddn");
		request.setAttribute("student", student);
	%> --%>
	<%
		student.setAddress("ddn");
		request.setAttribute("student", student);
		request.setAttribute("student1", new Student("kp1",23,"ddn1"));
		request.setAttribute("x", 123);
	%>
	<input type="submit">
</form>

</body>
</html>