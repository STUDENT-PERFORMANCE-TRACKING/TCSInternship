<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri = "/struts-tags" %>

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
 		<div class="container-fluid" style="background-color:#400040;">
    		<div class="navbar-header">
		  		<a class="navbar-brand" href="#"><h3 class="style1" style="color:#FFFFFF;">Student Tracking Portal<h3></a>
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
					<span class="icon-bar"></span>
        			<span class="icon-bar"></span>
       			 </button>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right" style="margin-top:60px;">
      				<li>
						<a href="#" style="color:#3366FF;" data-toggle="popover" data-placement="bottom" data-trigger="focus" 
						data-content= "For any query mail to : mail@gmail.com">
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

	<div class="container-fluid">
		<div class="row">
			
			<div class="col-md-12" style="background-color:#FFFFFF;">
			
				<!-- Start Of Sign-in Box -->
				<div class = "modal-dialog jumbotron" style="box-shadow:3px 3px 3px  #888888;border-radius:5px" >
		 			
					<div calss = "modal-content"> 
						<div class = "modal-header" style="text-shadow:1px 1px 5px #888888;padding:0px;" >
							<h1 class = "text-center" style="padding:0px;">Sign-In</h1>
						</div>
						
						<div class = "modal-body" >
                			<form name="LoginForm" action="loginAction" method="post">
							
								<p><font size="3" color="red"><s:property value="loginstatus" /></font></p>
							
								<div class = "from-group" >
                    				<input name="EmailId" type="email" class="form-control input-lg" placeholder="User Name"  required/><br>
                    			</div>
								
               					<div class = "from-group">
                    				<input name="Password" type="password" class="form-control input-lg" placeholder="Password" required /><br>
                    			</div>
								
								<div class = "form-group">
									<input type = "submit" value = "Login" class = "btn btn-block btn-lg btn-primary">
								</div>  
								
							   <s:token />	
							</form>
						</div>
						
					</div>
				</div>
				<!-- End of Sign-in Box -->
				
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