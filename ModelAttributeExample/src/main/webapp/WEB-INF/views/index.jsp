<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
<h2>Student Addmission Form</h2>
<form:errors path="student.*"/>
<form action="saveApplication">
	Student Name:<input type="text" name="name">
	<br>
	Student Email:<input type="email" name="email">
	<br>
	Student Contact:<input type="tel" name="contact">
	<br>
	DOB:<input type="text" name="dob">
	<br>
	Hobbies:
	<select name="hobbies" multiple="multiple">
		<option value="Singing">Singing</option>
		<option value="Coding">Coding</option>
		<option value="Reading">Reading</option>
	</select>
	<br>
<!-- 	Address:<input type="text" name="address.city"><input type="text" name="address.country"><input type="text" name="address.pin">
 -->	<input type="submit"> 
</form>

</body>
</html>
