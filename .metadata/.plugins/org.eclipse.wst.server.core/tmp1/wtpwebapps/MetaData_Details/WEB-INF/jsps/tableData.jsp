<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tables</title>
</head>
<body>
	<form:form action="tableData" method="post" commandName="metaDataBean">
	<h2>Table Detail are as follow</h2>
	<form:hidden path="tableValue" name="tableValue"/>
		<table align="center" border="1">
		<th>Table in dataBase</th>
	<c:forEach var="tables" items="${tableList}">
	<tr>
	
	<td><a href="columnData?tableValue=${tables}">${tables}</a></td>
	</tr>
	</c:forEach>
	</table>
	
	</form:form>
	
</body>
</html>