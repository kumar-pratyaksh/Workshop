<%@taglib uri="/struts-tags" prefix="s" %>

<html>
<body>
<h2>Hello World!</h2>

<s:form action="hello">
	<s:textfield name="name" label="Enter the name"></s:textfield>
	<s:submit></s:submit>
</s:form>


</body>
</html>
