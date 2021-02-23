<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
      <%@ page isELIgnored="false" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>viewemployee</title>
</head>
<body>
<table>
<tr><th>id</th><th>First name</th><th></th><th>Last name</th><th>address</th><th>state</th><th>country</th><th>department</th><th>zipcode</th><th>Delete</th><th>Edit</th></tr>

<c:forEach var="e" items="${list }">
<tr>
<td>${e.id }</td>


<td>${e.Fname }</td>
<td>${e.Lname}</td>
<td>${e.address }</td>
<td>${e.state}</td>
<td>${e.country }</td>
<td>${e.department}</td>
<td>${e.zipcode }</td>
<td><a href="delete?id=${e.id}">delete</a></td>
<td><a href="edit?id=${e.id}">edit</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>