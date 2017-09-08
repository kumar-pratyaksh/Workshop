<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<body>
<h2>Hello World!</h2>
<s:form action="hello">
<s:textfield name="message" label="Enter message"></s:textfield>
<s:submit></s:submit>
</s:form>
</body>
</html>
