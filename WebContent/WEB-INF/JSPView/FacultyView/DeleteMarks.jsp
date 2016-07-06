<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri = "/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Marks</title>
</head>
<body>

<s:form action="deleteStudentMarks">
	
	<input type="text" name="s.Student.BranchId" value="<s:property value="s.Student.BranchId"/>" />
	<input type="text" name="s.Result.SemesterFirst" value="<s:property value="s.Result.SemesterFirst"/>" />
	<input type="text" name="s.Student.RollNo" value="<s:property value="s.Student.RollNo"/>" />
	
	
	<s:iterator value="r" status="elemsStatus">
   <tr>
  <td><s:textfield name="r[%{#elemsStatus.index}].studentSubject" value="%{studentSubject}" theme="simple"/></td>
    <td><s:textfield name="r[%{#elemsStatus.index}].SubjectId" value="%{SubjectId}" theme="simple"/></td>
    <td><s:textfield name="r[%{#elemsStatus.index}].ObtainedMarks" value="%{ObtainedMarks}" theme="simple"/></td>
    <td><s:checkbox name="r[%{#elemsStatus.index}].Check" value="%{Check}" theme="simple"/></td>
  
    </tr>
  </s:iterator>
	
	<input type="submit" value="submit" name="submit"/>
</s:form>
</body>
</html>