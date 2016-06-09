<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div class = "modal-body" >
                			<form name="form1"  action="AddStudent"  method="post">
							
								<p><font size="3" color="red"><s:property value="loginstatus" /></font></p>
							
								<div class = "from-group" >
                    				<input name="student.EmailId" type="email" class="form-control input-lg" placeholder="User Name"  required/><br>
                    			</div>
								
               					<div class = "from-group">
                    				<input name="student.Password" type="password" class="form-control input-lg" placeholder="Password" required /><br>
                    			</div>
								
								<div class = "form-group">
									<input type = "submit" value = "Login" class = "btn btn-block btn-lg btn-primary">
								</div>  
								
							</form>
						</div>

</body>
</html>