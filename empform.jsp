<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="editsave">
<input type="hidden" name="id" value="${emp.id }"> 
Fname:<input type="text" name="name"  value="${emp.Fname }"><br>
last name:<input type="text" name="Fname" value="${emp.Lname }"><br>
address<input type="text" name="address" value="${emp.address }"><br>
state<input type="text" name="state" value="${emp.state }"><br>
country:<input type="text" name="country" value="${emp.country}"><br>
department<select name="department">

<option value="accounting">accounting</option>
<option value="Technical">Technical</option>
<option value="logistics">logistics</option>


</select><br>
zipcode:<input type="number" name="zipcode" value="${emp.zipcode }">
<input type="submit" value="edit">

</form>

</body>
</html>