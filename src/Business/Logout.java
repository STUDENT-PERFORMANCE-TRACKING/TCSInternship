package Business;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport implements SessionAware {
	
	private Map<String, Object> sessionMap;

	public String logoutStudent()
	{ 
		new Controller.Session().removeStudentSession(sessionMap);
		
		new Controller.Session().removeParentSession(sessionMap);
			
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;			
	}

}
