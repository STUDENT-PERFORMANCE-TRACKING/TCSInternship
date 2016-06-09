package Business;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Login extends ActionSupport implements ModelDriven 
{
	
	private String loginStatus;
	
	private Model.Login login = new Model.Login();
	
	
	public String signIn()
	{
		
		
		if(new Controller.Login().studentLogin(login)!=null)
		{
			   return SUCCESS;
		}
		
		else if(new Controller.Login().parentLogin(login)!=null)
		{
			return SUCCESS;
		}
		
		else if(new Controller.Login().facultyLogin(login)!=null)
		{
			return SUCCESS;
		}
		
		else
		{ 
			setLoginStatus("Wrong emailId or password!");
			return ERROR;
		}
			
			
	}
	
	
	
	@Override
	public Object getModel() 
	{
		return login;
	}

	
	
	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	
}
