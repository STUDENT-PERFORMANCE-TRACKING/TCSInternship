<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

  <%
  if (session.getAttribute("student")!= null )
  {
    %><jsp:forward page="/JSPView/StudentView/Semester.jsp" /><%
  }
  
  else  if (session.getAttribute("parent")!= null )
  {
	    %><jsp:forward page="/JSPView/LoginView/Login.jsp" /><%
  }
  
  else  if (session.getAttribute("faculty")!= null )
  {
	    %><jsp:forward page="/JSPView/LoginView/Login.jsp" /><%
  }

  %>