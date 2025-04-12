<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body bgcolor="lightblue">

<h1>Employee Details</h1>

<hr color="red">

<form action="savedata" method="post">
<pre>
Employee Name:		<input type="text" name="empname"/>

Employee Email:		<input type="email" name="empemail"/>

Employee MobileNo:	<input type="number" name="mobileno"/>

Employee Location:	<input type="text" name="location"/>

		<input type="submit" value="Save" />
</pre>
</form>
</body>
</html>