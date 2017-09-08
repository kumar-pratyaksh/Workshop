<%@ taglib uri="/struts-tags" prefix="s" %>
<html>

<head>
	<style>
<!--
	
-->
	.errorMessage {
    background-color:#FFCCCC;
    border:1px solid #CC0000;
    width:400px;
    margin-bottom:8px;
}
</style>
</head>
<body>
<h2>Hello World!</h2>
<s:form action="hello">
	<s:textfield name="userName" label="UserName" errorPosition="bottom" ></s:textfield>
	<s:textfield name="url" label="url"></s:textfield>
	<s:submit></s:submit>
</s:form>
</body>
</html>
