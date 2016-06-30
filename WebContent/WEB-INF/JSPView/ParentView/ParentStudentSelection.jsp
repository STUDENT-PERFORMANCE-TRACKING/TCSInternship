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
						<a href="<s:url action="logoutStudent"/>" style="color:#3366FF;">
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
<!-- --------------------------------------------------- Start Of Header ---------------------------------------------------------------------- -->
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->

	<div class="container-fluid" style="background-color:#FFFFFF;">
		<div style="margin-top:40px;">
						<div class="panel-body col-md-3">
						</div>
						<div class="panel-body col-md-3">
						<h3><strong>select your ward whose result you want to view : </strong></h3>
						</div><br>
						<div class="panel-body col-md-3">
						<select name="result.StudentName" class="form-control ">
						
		                	<s:iterator value="StudentNames" >
		                	    <option><s:property/></option>
							</s:iterator>	
						</select>
						</div>
						
		 </div>
	 </div>	
										
		<div class="container-fluid" style="background-color:#FFFFFF; padding-bottom:135px; padding-top:40px;">
		<div >
			<div class="row">
				<h2 style="margin-left:150px;"><strong> Either select semester or year and press submit to view result</strong></h2>
				<div class="col-md-4" style="margin-left:120px; margin-right:50px">
					<form action="parentstudentresultsemesterAction" method="get">
						<div >
							<h4><strong>SEMESTER</strong></h4>
						</div>
						
						<select name="SemesterFirst" class="form-control ">
							<option selected value="1">1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
							<option>6</option>
							<option>7</option>
							<option>8</option>
						</select>
						
						<div style="margin-top:5px;">
							<button type="submit" class="btn btn-block btn-primary">SUBMIT</button>
						</div>
					</form>
				</div>
				
				<div class="col-md-4" style="margin-left:80px;">
					<form action="parentstudentresultyearAction" method="get">
						<div >
							<h4><strong>YEAR.</strong></h4>
						</div>
						
						<select name="Year" class="form-control ">
							<option value="1">1st year</option>
							<option value="2">2nd year</option>
							<option value="3">3rd year</option>
							<option value="4">4th year</option>
						</select>
						
						<div style="margin-top:5px;">
							<button type="submit" class="btn btn-block btn-primary">SUBMIT</button>
						</div>
					
					</form>
				</div>
			</div>
		</div>
	</div>
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
<!-- --------------------------------------------------- Start Of Footer ---------------------------------------------------------------------- -->
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
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