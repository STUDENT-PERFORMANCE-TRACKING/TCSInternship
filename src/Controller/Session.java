package Controller;

import java.util.Map;

public class Session {
	

	
	public boolean checkStudentSession(Map<String, Object> sessionMap)
	{
		if(sessionMap.get("student")==null)
			return false;
		else
			return true;
	}
	
	public boolean checkParentSession(Map<String, Object> sessionMap)
	{
		if(sessionMap.get("parent")==null)
			return false;
		else
			return true;
	}
	
	public boolean checkFacultySession(Map<String, Object> sessionMap)
	{
		if(sessionMap.get("faculty")==null)
			return false;
		else
			return true;
	}

}
