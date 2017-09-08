<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<body>
<a href="/Localization/?siteLanguage=en">English</a>
<a href="/Localization/?siteLanguage=fr">French</a>
<h2><spring:message code="form.message"></spring:message></h2>
<form:errors path="student.*"/>
<form action="saveApplication">
	<spring:message code="field.name"></spring:message><input type="text" name="name">
	<br>
	<spring:message code="field.email"></spring:message><input type="email" name="email">
	<br>
	<spring:message code="field.contact"></spring:message><input type="tel" name="contact" >
	<br>
	<spring:message code="field.dob"></spring:message><input type="text" name="dob">
	<br>
	<spring:message code="field.hobbies"></spring:message>
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
