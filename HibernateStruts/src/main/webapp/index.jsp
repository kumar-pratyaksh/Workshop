<%@ taglib uri="/struts-tags" prefix="s"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>

<ul>
	<li><a href="addStudent">Add student</a>
</ul>

Students
<br>
<table>
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Contact</th>
		</tr>
	</thead>
	<tbody>
		
		<c:forEach items="${students}" var="student">
			<tr>
				<td><c:out value="${student.id }"></c:out></td>
				<td><c:out value="${student.name }"></c:out></td>
				<td><c:out value="${student.contact }"></c:out></td>
				<td><a href="update?id=${student.id }">Update</a></td>
				<td><a href="delete?id=${student.id }">Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>


</body>
</html>
