<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
<body>
<h2>Hello World!</h2>
<s:form action="register">
	<s:textfield name="name" label="Name:"></s:textfield>
	<s:password name="password" label="Password:"></s:password>
	<s:textarea name="comment" label="Comment:"></s:textarea>
	<s:select headerValue="Select country" list="countries" label="Country" name="country"></s:select>
	<s:radio list="genders" label="Gender" name="gender"></s:radio>
	<s:submit></s:submit>

</s:form>
</body>
</html>
