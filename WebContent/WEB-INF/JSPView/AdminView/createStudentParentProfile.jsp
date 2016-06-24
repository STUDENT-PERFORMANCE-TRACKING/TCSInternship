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
<h2> 
<s:property value="sp.insertstatus"/>

</h2>

<form action="addStudentParent" method="get" name="profile">
student 
fn
<input type="text" name="sp.student.FirstName" /><br>
ln
<input type="text" name="sp.student.LastName" /><br>
email
<input type="text" name="sp.student.EmailId" /><br>
pass
<input type="text" name="sp.student.Password" /><br>
rollNo
<input type="text" name="sp.student.RollNo" /><br>
<select name="sp.student.BranchId">
<option value="1">computer science and engg</option>
<option value="2"> electronic engg</option>
<option value="3"> civil engg </option>
<option value="4"> mechanical engg </option>
<option value="5"> electrical engg </option>
</select>
<br>
<br>
<br>
parent 
fn
<input type="text" name="sp.parent.ParentName" /><br>
email
<input type="text" name="sp.parent.EmailId" /><br>
pass
<input type="text" name="sp.parent.Password" /><br>




<input type="submit" name="submit" value="submit"/>

</form>

</body>
</html>