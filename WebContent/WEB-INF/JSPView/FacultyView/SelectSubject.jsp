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
    	  
    	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		
		<style>
			.popover-content 
			{
      			background-color: coral;
      			color: #FFFFFF;
      		}
		</style>
		
		<script type="text/javascript">
		
		function setStudentNameSemester()
		{
			document.getElementById("name1").value = document.getElementById("name").value;
		}
		
		function setStudentNameYear()
		{
			document.getElementById("name2").value = document.getElementById("name").value;
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
	
	<nav class="navbar navbar-full navbar-default" style="margin-bottom:0px;">
 		<div class="container-fluid" style="background-color:#400040;color:#fff;">
    		<div class="navbar-header">
		  		<a class="navbar-brand" href="#"><h3 class="style1" style="color:#FFFFFF;">Student Tracking Portal<h3></a>
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
					<span class="icon-bar"></span>
        			<span class="icon-bar"></span>
       			 </button>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right" style="margin-top:60px;" >
      				<li>
						<a href="<s:url action="logout"/>" style="color:#3366FF;">
						<span class="glyphicon glyphicon-off"></span> Log-out</a>
					</li>
      				<li>
						<a href="#"  data-toggle="popover" data-placement="bottom" data-trigger="focus" 
						data-content= "For any query mail to : mail@gmail.com" style="color:#3366FF;">
						<span class="glyphicon glyphicon-envelope"></span> Contact-us</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	
	<script>
		$(document).ready(function(){
   		$('[data-toggle="popover"]').popover();
			});
	</script>
		
	
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
<!-- --------------------------------------------------- Start Of Header ---------------------------------------------------------------------- -->
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
						
		<div class="container-fluid" style="background-color:#FFFFFF; padding-bottom:253px; padding-top:120px;">
			<div class="col-md-8" style="padding-left:260px;">
				
				<form action="abc" method="get">
					
					<input type="hidden" name="s.Student.BranchId" value="<s:property value="s.Student.BranchId"/>" />
					
					<input type="hidden" name="s.Result.SemesterFirst" value="<s:property value="s.Result.SemesterFirst"/>" />
	
					<div >
						<h3><strong>Select subject whose data you want to modify : </strong></h3>
					</div>
					<select name="s.studentSubject" class="form-control">
						<s:iterator value="StudentSubjectList">
							<option><s:property/></option>
						</s:iterator>
					</select>				
					
					<div style="margin-top:5px;">
						<button type="submit" class="btn btn-block btn-primary">SUBMIT</button>
					</div>
					
					</form>
				</div>
			</div>
						
			
		<div class="container-fluid" style="background-color:#400040;color:#fff;height:53px;">
			<p class="text-center" style="padding-top:15px;">&copy;Copyright Protected : Oak Art</p>
		</div>
				
	</body>
</html>