<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<s:form action="saveData">
	<s:textfield name="id" label="Enter id:"></s:textfield>
	<br>
	<s:textfield name="name" label="Enter name:"></s:textfield>
	<br>
	<s:textfield name="contact" label="Enter contact:"></s:textfield>
	<br>
	<s:submit></s:submit>
</s:form>

</body>
</html>