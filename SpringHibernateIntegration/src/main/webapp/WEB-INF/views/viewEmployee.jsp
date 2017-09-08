<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${message }
<table>
	<thead>
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Address</th>
			<th>Employee Contact</th>
			<th>Edit Employee</th>
			<th>Delete Employee</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listEmployee}" var="employee">
			<tr>
				<td><c:out value="${employee.id }"></c:out></td>
				<td><c:out value="${employee.name }"></c:out></td>
				<td><c:out value="${employee.address }"></c:out></td>
				<td><c:out value="${employee.contact }"></c:out></td>
				<td><a href="updateEmployee/${employee.id }">Edit</a></td>
				<td><a href="deleteEmployee/${employee.id }">Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>