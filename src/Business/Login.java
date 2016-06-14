package Business;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Login extends ActionSupport implements ModelDriven , SessionAware
{
	private Map<String, Object> sessionMap;
	private String loginStatus;
	
	
	private Model.Login login = new Model.Login();
	
	
	public String signIn()
	{
		
		if(new Controller.Session().checkStudentSession(sessionMap))
		{
			return "studentalreadylogin";
		}
		
		else if(new Controller.Session().checkParentSession(sessionMap))
		{
			return "parentalreadylogin";
		}
		
		else if(new Controller.Session().checkFacultySession(sessionMap))
		{
			return "facultyalreadylogin";
		}
		
		else{
		
			if(new Controller.Login().studentLogin(login)!=null)
		   {
			   sessionMap.put("student", new Controller.Login().studentLogin(login));
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



	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;		
	}
	
	
}
