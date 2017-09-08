<%@taglib uri="/struts-tags" prefix="s" %>

<html>
<body>
<h2>Hello World!</h2>

<s:form action="decrypt" onsubmit="return encrypt()">
	<s:textfield name="text" label="Enter text" id="text"></s:textfield>
	<s:submit></s:submit>
</s:form>

<script type="text/javascript">
	function encrypt(){
		var textBox=document.querySelector('#text');
		var text=textBox.value;
		var encryptedText="";
		for(var i=0;i<text.length;i++){
			encryptedText+=String.fromCharCode(text.charCodeAt(i)+1);
		}
		textBox.value=encryptedText;
		return true;
	}
</script>

</body>
</html>
