<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List page</title>
</head>
<body bgcolor="pink">
<h1>List of Employee Data</h1>

<table border="1">
<tr>
<th>Emp Name</th>
<th>Emp Email</th>
<th>Emp MobileNo</th>
<th>Emp Location</th>
<th>Delete</th>
<th>Update</th>

</tr>
<c:forEach var="emps" items="${emps}">
<tr>
<td>${emps.empname}</td>
<td>${emps.empemail}</td>
<td>${emps.mobileno}</td>
<td>${emps.location}</td>
<td><a href="delete?empid=${emps.empid}">delete</a></td>
<td><a href="update?empid=${emps.empid}">update</a></td>
</tr>
</c:forEach>

</table>

</body>
</html>