package Controller;

import java.util.Map;

public class Session {
	
	

	
	public Model.Student getCurrentStudentSession(Map<String, Object> sessionMap)
	{
		if(sessionMap.get("student")==null)
			return null;
		else
			return (Model.Student)sessionMap.get("student");
	}
	
	
	public Model.Parent getCurrentParentSession(Map<String, Object> sessionMap)
	{
		if(sessionMap.get("parent")==null)
			return null;
		else
			return (Model.Parent)sessionMap.get("parent");
	}
	
	
	public Model.Faculty getCurrentFacultySession(Map<String, Object> sessionMap)
	{
		if(sessionMap.get("parent")==null)
			return null;
		else
			return (Model.Faculty)sessionMap.get("faculty");
	}
	
	
	public Map<String, Object> createStudentSession(Map<String, Object> sessionMap,Model.Login login)
	{
		sessionMap.put("student", new Controller.Login().studentLogin(login));
		return sessionMap;
	}
	
	public Map<String, Object> createParentSession(Map<String, Object> sessionMap,Model.Login login)
	{
		sessionMap.put("parent", new Controller.Login().parentLogin(login));
		return sessionMap;
	}
	
	public Map<String, Object> createFacultySession(Map<String, Object> sessionMap,Model.Login login)
	{
		sessionMap.put("faculty", new Controller.Login().facultyLogin(login));
		return sessionMap;
	}
	
	

}
