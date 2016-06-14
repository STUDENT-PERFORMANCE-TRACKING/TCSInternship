package Business;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport implements SessionAware {
	
	private Map<String, Object> sessionMap;

	public String logoutStudent()
	{ 
		if(sessionMap.containsKey("student"))
			sessionMap.remove("student");
			
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;			
	}

}
