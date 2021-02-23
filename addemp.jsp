<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="save">
First name:<input type="text" name="Fname"><br>
last name:<input type="text" name="Lname"><br>
address<input type="text" name="address"><br>
state<input type="text" name="state"><br>
country:<input type="text" name="country"><br>
department<select name="department">

<option value="accounting">accounting</option>
<option value="Technical">Technical</option>
<option value="logistics">logistics</option>


</select><br>
zipcode:<input type="number" name="zipcode">
<input type="submit" value="add">

</form>

</body>
</html>