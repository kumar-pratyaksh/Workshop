<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-dojo-tags" prefix="sx"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<s:head />
<sx:head />
</head>
<body>
	<s:form>
		<%-- <sx:autocompleter label="Favourite framework"
			list="webframeworks" ></sx:autocompleter> --%>
		<sx:datetimepicker label="Completion Date" displayFormat="dd/MM/yyyy"></sx:datetimepicker>
		<s:url  value="/hello.action" />
		<sx:div href="%{#url}" delay="2000">Initial content</sx:div>
		<sx:tabbedpanel id="tabContainer">
			<sx:div label="Tab 1">Tab 1</sx:div>
			<sx:div label="Tab 2">Tab 2</sx:div>
		</sx:tabbedpanel>
	</s:form>
</body>
</html>