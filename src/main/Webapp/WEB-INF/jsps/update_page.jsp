<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body bgcolor="yellow">

<h1>Employee Update Page</h1>

<hr color="blue">

<form action="saveupdate" method="post">

<pre>

Employee EmpId:		<input type="text" name="empid" value="${employedata.empid}"/>

Employee Name:		<input type="text" name="empname" value="${employedata.empname}"/>

Employee Email:		<input type="email" name="empemail" value="${employedata.empemail}"/>

Employee MobileNo:	<input type="number" name="mobileno" value="${employedata.mobileno}"/>

Employee Location:	<input type="text" name="location" value="${employedata.location}"/>

		<input type="submit" value="Update" />
</pre>

</form>
</body>
</html>