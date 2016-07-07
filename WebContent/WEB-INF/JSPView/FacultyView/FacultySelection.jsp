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
    	<link type = "text/css"		rel = "stylesheet"		href = "css/simple-sidebar.css">
    	  
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
	</div>
	<script>
		$(document).ready(function(){
   		$('[data-toggle="popover"]').popover();
			});
	</script>
		

		<div class="container-fluid">
			<div class="row">
			 
				<div class="col-md-2">
					<ul class="sidebar-nav" style="padding:5px; margin:5px; font-size:18px; font-style:italic;">
						<li><a href="StudentOrSubject.jsp">Create</a></li><hr>
						<li><a href="NewFile.jsp">Edit</a></li><hr>
						<li><a href="#">View</a></li><hr>
						<li><a href="#">Delete</a></li><hr>
					</ul>
				</div>
			
				<div class="col-md-10" style="background-color:#FFFFFF;">
					<div class="panel-body col-md-10" style="padding-top:180px; padding-bottom:259px; padding-left:250px;">
						<h2> <strong>Please choose your action from side bar!</strong></h2>
					</div>
				</div>
				
			</div>
		</div>
					
		<div class="container-fluid" style="background-color:#400040;color:#fff;height:53px;">
			<p class="text-center" style="padding-top:15px;">&copy;Copyright Protected : Oak Art</p>
		</div>		
	
	</body>

</html>