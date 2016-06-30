<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri = "/struts-tags" %>
    
   
   <%

   response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   response.addHeader("Pragma", "no-cache"); 
   response.addDateHeader ("Expires", 0);
   %>
   

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
		
		<script>
			function myFunction() 
			{
    			window.print();
			}
			
			
		</script>
		<style>
			.popover-content 
			{
      			background-color: coral;
      			color: #FFFFFF;
      		}
		</style>
		
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
						<a href="<s:url action="LogoutAdmin"/>" style="color:#3366FF;">
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
	</div>
	<script>
		$(document).ready(function(){
   		$('[data-toggle="popover"]').popover();
			});
	</script>
		
	

	
	
	
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
<!-- --------------------------------------------------- End Of Header ---------------------------------------------------------------------- -->
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->

	<div class="container-fluid" style="background-color:#FFFFFF;">
	<div class="col-md-12" >
	<div style="margin-left:300px; margin-right:400px;">
	<form action="addStudentParent" method="get" name="StudentParentProfile">
		
		<fieldset>
			<legend><h2><strong>Student Details</strong></h2></legend>
			<div class="form-group col-md-8">
				<h4><strong>First Name :</strong></h4>
					<input type="text" name="sp.student.FirstName" class="form-control input-md" id="inputdefault" required>
				<h4><strong>Last Name :</strong></h4>
					<input type="text" name="sp.student.LastName" class="form-control input-md" id="inputdefault">
				<h4><strong>Email-Id :</strong></h4>
					<input type="email" name="sp.student.EmailId" class="form-control input-md" id="inputdefault" required>
				<h4><strong>Password :</strong></h4>
					<input type="Password" name="sp.student.Password" class="form-control input-md" id="inputdefault" required>
				<h4><strong>Roll No. :</strong></h4>
					<input type="number" name="sp.student.RollNo" class="form-control input-md" id="inputdefault" required>
				<h4><strong>Branch :</strong></h4>
					<select name="sp.student.BranchId" class="form-control">
						<option value="1">computer science and engg</option>
						<option value="2"> civil engg</option>
						<option value="3"> electrical engg </option>
						<option value="4"> mechanical engg </option>
						<option value="5"> electronic engg </option>
					</select>
			</div>
		</fieldset>
		
		<br><br>
		
		<fieldset>
			<legend><h2><strong>Parent Details</strong></h2> </legend>
			<div class="form-group col-md-8">
				<h4><strong>Name :</strong></h4>
					<input type="text"  name="sp.parent.ParentName" class="form-control input-md" id="inputdefault" required>
				<h4><strong>Email-Id :</strong></h4>
					<input type="email" name="sp.parent.EmailId" class="form-control input-md" id="inputdefault" required>
				<h4><strong>Password :</strong></h4>
					<input type="Password" name="sp.parent.Password" class="form-control input-md" id="inputdefault" required>
			</div>
		</fieldset>
		
		<div class="col-md-8" style="padding-bottom:10px;">
			<input type="button" class="btn btn-block btn-primary" name="submit" value="submit"/>	
		</div>
	</form>
	</div>
</div>
</div>
	
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
<!-- --------------------------------------------------- Start Of Footer ---------------------------------------------------------------------- -->
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
	<div class="container-fluid" style="background-color:#400040;color:#fff;height:61px;">
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