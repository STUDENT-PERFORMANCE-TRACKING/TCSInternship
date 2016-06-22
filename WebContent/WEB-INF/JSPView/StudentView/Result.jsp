<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri = "/struts-tags" %>
    
   
   <%

   response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   response.addHeader("Pragma", "no-cache"); 
   response.addDateHeader ("Expires", 0);
   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
<!-- --------------------------------------------------- Start Head content ------------------------------------------------------------------- -->
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
<head>
    <!-- Required meta tags always come first -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    
	<title>PORTAL</title>
	 
    	<!-- Bootstrap core CSS -->
    	<link type = "text/css"		rel = "stylesheet"		href = "css/bootstrap.css">
		<link type = "text/css"		rel = "stylesheet"		href = "css/bootstrap.min.css">
    	<link type = "text/css"		rel = "stylesheet"		href = "css/bootstrap-theme.css">
    	<link type = "text/css"		rel = "stylesheet"		href = "css/bootstrap-theme.min.css">
		
		<script>
			function myFunction() 
			{
    			window.print();
			}
		</script>

</head>
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
<!-- --------------------------------------------------- End Head content --------------------------------------------------------------------- -->
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->



<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
<!-- --------------------------------------------------- Body content ------------------------------------------------------------------------- -->
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
<body style="background-color:#CCCCCC">

<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
<!-- --------------------------------------------------- Start Of Header ---------------------------------------------------------------------- -->
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
	<div class="container-fluid" style="background-color:#400040;color:#fff;height:120px;">
  		<h1>Student Tracking Portal</h1>
	</div>
	<br>
	<div class="container">
		<div class="panel panel-primary text-center" style="width:100%">
			<div class="panel-heading">Student Result</div>
			<div class="panel-body">
				<div class="table-responsive">
					<table class="table table-bordered" >
						<tr>
							<th>Name:</th>
							<td colspan="2">
								<s:property value="result.getStudent().getFirstName()"/>
								<s:property value="result.getStudent().getLastName()"/></td>
						</tr>
						<tr>
							<th>Fathers Name:</th>
							<td colspan="2">
							<s:property value="ParentName"/>
							</td>
							
						</tr>
						<tr>
							<th>Roll No.</th>
							<td colspan="2"><s:property value="result.getStudent().getRollno()"/></td>
						</tr>
						<tr >
							<th>Semester</th>
							<td colspan="2"><s:property value="result.getSemester()"/></td>
						</tr>
						<tr>
							<th class="text-center">Subject</th>
							<th class="text-center">Maximum Marks</th>
							<th class="text-center">Marks</th>
		                </tr>
		
	   				 	<s:iterator value="studentresult" >
	     				<tr>
	     					<td><s:property value="getSubjectName()"/> </td>
							<td><s:property value="getObtainedMarks()"/></td>
							<td><s:property value="getMaximumMarks()"/></td>
		                </tr>     
		                </s:iterator>
	   					
						<tr>
							<th class="text-center">Total Marks </th>
							<td colspan="2"><s:property value="result.getTotalMarks()"/>/<s:property value="result.getMaximumMarks()"/></td>
						</tr>
					</table>			
				</div>			
			</div>
		<div class="panel-footer panel-default">Successfully passed the examination </div>
		</div>
		<button type="button" class="btn btn-success btn-md" onClick="myFunction()" style="margin-left:550px; margin-bottom:5px">
			<Strong>Print</Strong>
		</button>
	</div>

<a href="<s:url action="logoutStudent"/>">click here for logout</a>



<div class="container-fluid" style="background-color:#400040;color:#fff;height:53px;">
		<p class="text-center" style="padding-top:15px;">&copy;Copyright Protected : Oak Art</p>
	</div>		
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
<!-- --------------------------------------------------- Start Of Footer ---------------------------------------------------------------------- -->
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->

</body>
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
<!-- --------------------------------------------------- End Body content --------------------------------------------------------------------- -->
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->



</html>