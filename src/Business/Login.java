package Business;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Login extends ActionSupport implements ModelDriven 
{
	
	private Model.Login login = new Model.Login();
	private String loginstatus;
	
	
	public String studentLogin()
	{
		
		//Controller.Login logincontroller = new Controller.Login();
		
		//List<Model.Student> student=null;
		//String s = logincontroller.checkStudentLoginCredential(login);
		
		String s="jfjhfjh";
		
		if(s==null || s=="")
		{
			loginstatus = "Wrong emailId or password!";
			return ERROR;
			
		}
		else
		{
			loginstatus = "Good emailId or password!";
			return LOGIN;
			
		}
			
	}
	
	
	
	public String execute() 
	{
		System.out.println("Method executed!");
		System.out.println("email-id : "+login.getEmailId());
		System.out.println("password : "+login.getPassword());

		return SUCCESS;
		
	}
	
	
	@Override
	public Object getModel() 
	{
		return login;
	}

	
	public String getLoginstatus() {
		return loginstatus;
	}



	public void setLoginstatus(String loginstatus) {
		this.loginstatus = loginstatus;
	}
	
}
