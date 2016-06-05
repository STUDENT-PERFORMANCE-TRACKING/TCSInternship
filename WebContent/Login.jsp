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
  		<h1 class="style1">Student Tracking Portal</h1>
	</div>
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->
<!-- --------------------------------------------------- Start Of Header ---------------------------------------------------------------------- -->
<!-- ------------------------------------------------------------------------------------------------------------------------------------------ -->

	<form name="myForm" action="loginAction" onsubmit="return validateForm()" method = "POST">
	<div class="container-fluid">
		<div class="row">
			 
			<div class="radio col-md-2">
			
				<label><input type="radio" name="optradio">Option 1</label><br>
			</div>
			<!-- 
			<div class="radio col-md-2">
				<label><input type="radio" name="optradio">Option 2</label><br>
			</div>
			<div class="radio col-md-2">
				<label><input type="radio" name="optradio" >Option 3</label><br>
			</div>
  			<!-- Start Of Side Bar 
			<div class="col-md-2" style="background-color:;">
				<ul class="nav nav-pills nav-stacked" style="line-height:20px;">
					<li><a href="#"><h4>Student</h4></a></li>
					<li><a href="#"><h4>Faculty</h4></a></li>
					<li><a href="#"><h4>Parents</h4></a></li>
				</ul>
			</div>	-->
			<!-- End Of Side Bar -->
			
			
			<div class="col-md-10" style="background-color:#FFFFFF;">
			
				<!-- Start Of Sign-in Box -->
				<div class = "modal-dialog jumbotron" style="box-shadow:3px 3px 3px  #888888;border-radius:5px" >
		 			
					<div calss = "modal-content"> 
						<div class = "modal-header" style="text-shadow:1px 1px 5px #888888;padding-top:0px;" >
							<h1 class = "text-center" style="padding:0px;">Sign-In</h1>
						</div>
						
						<div class = "modal-body" >
                			<form name="form1" method="post">
							
								<div class = "from-group" >
                    				<input name="EmailId" type="email" class="form-control input-lg" placeholder="User Name"  required/><br>
                    			</div>
								
               					<div class = "from-group">
                    				<input name="Password" type="password" class="form-control input-lg" placeholder="Password" required /><br>
                    			</div>
								
								<div class = "form-group">
									<input type = "submit" value = "Login" class = "btn btn-block btn-lg btn-primary">
								</div>  
								<s:property value="loginstatus" />
								
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