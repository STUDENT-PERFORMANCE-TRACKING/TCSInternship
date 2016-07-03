<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri = "/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="wxyz">
	<select name="s.Student.BranchId">
		<option value="1">computer</option>
		<option value="2">civil</option>
		<option value="3">mechanical</option>
		<option value="4">electrical</option>
		<option value="5">electronics</option>
	</select>
	<select name="s.Result.SemesterFirst">
		<option>1</option>
		<option>2</option>
		<option>3</option>
		<option>4</option>
		<option>5</option>
		<option>6</option>
		<option>7</option>
		<option>8</option>
	</select>
	<select name="StudentSubject">
		<option>Student</option>
		<option>Subject</option>
	</select>
	<input type="submit" value="submit" name="submit"/>
</form>
</body>
</html>