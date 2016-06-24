<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>
<s:property value="sp.insertstatus"/>
</h2>

<form action="addFaculty" method="get" name="profile">
faculty
name
<input type="text" name="sp.faculty.FacultyName" /><br>
email
<input type="text" name="sp.faculty.EmailId" /><br>
pass
<input type="text" name="sp.faculty.Password" /><br>


<input type="submit" name="submit" value="submit"/>

</form>

</body>
</html>