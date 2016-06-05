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
<s:form action="loginAction" method = "POST">
<s:textfield name="UserId"   label="LoginId" ></s:textfield>
<s:password  name="Password" label="Password" ></s:password>
<s:submit></s:submit>
<s:property value="loginstatus" />
</s:form>
</body>
</html>