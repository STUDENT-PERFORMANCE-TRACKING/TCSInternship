package Business;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport implements SessionAware {
	
	private Map<String, Object> sessionMap;

	public String logout()
	{ 
		new Controller.Session().removeStudentSession(sessionMap);
		
		new Controller.Session().removeParentSession(sessionMap);
		
		new Controller.Session().removeFacultySession(sessionMap);
			
		return SUCCESS;
	}
	
	public String logoutAdmin()
	{
		new Controller.Session().removeAdminSession(sessionMap);
		
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;			
	}

}
