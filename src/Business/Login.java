package Business;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Login extends ActionSupport implements ModelDriven , SessionAware
{
	private Map<String, Object> sessionMap;
	private String loginStatus;
	private ArrayList<String> StudentNames;
	
	private Model.Login login = new Model.Login();
	
	
	public String signIn()
	{
		System.out.println("Session="+sessionMap.toString());
		/*
		String[] rp={"ankita.innocent24@gmail.com"};
		
		new Controller.SendingMail().sendMail(rp, "aaaaaa", "aaaaaa");
		*/
		if(new Controller.Session().getCurrentStudentSession(sessionMap)!=null)
		{
			return "studentalreadylogin";
		}
		
		else if(new Controller.Session().getCurrentParentSession(sessionMap)!=null)
		{
			setStudentNames(new Controller.Login().getStudentNames(new Controller.Session().getCurrentParentSession(sessionMap)));
			return "parentalreadylogin";
		}
		
		else if(new Controller.Session().getCurrentFacultySession(sessionMap)!=null)
		{
			return "facultyalreadylogin";
		}
		
		else{
		
			if(new Controller.Login().studentLogin(login)!=null)
		   {
			   new Controller.Session().createStudentSession(sessionMap,login);
			   return "studentlogin";
		   }
		
		   else if(new Controller.Login().parentLogin(login)!=null)
		   {
			   new Controller.Session().createParentSession(sessionMap,login);
			   setStudentNames(new Controller.Login().getStudentNames(new Controller.Session().getCurrentParentSession(sessionMap)));
			   return "parentlogin";
		   }
		
		   else if(new Controller.Login().facultyLogin(login)!=null)
		   {
			   new Controller.Session().createFacultySession(sessionMap,login);
			   return "facultylogin";
		   }
		
		   else
		   { 
			   setLoginStatus("Wrong emailId or password!");
			   return ERROR;
		   }
		}
			
			
	}
	
	
	public String checkLoginResubmit()
	{
		if(new Controller.Session().getCurrentStudentSession(sessionMap)!=null)
		{
			return "studentalreadylogin";
		}
		
		else if(new Controller.Session().getCurrentParentSession(sessionMap)!=null)
		{
			setStudentNames(new Controller.Login().getStudentNames(new Controller.Session().getCurrentParentSession(sessionMap)));
			return "parentalreadylogin";
		}
		
		else if(new Controller.Session().getCurrentFacultySession(sessionMap)!=null)
		{
			return "facultyalreadylogin";
		}
		
		else
		{
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



	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;		
	}
	
	public ArrayList<String> getStudentNames() {
		return StudentNames;
	}


	public void setStudentNames(ArrayList<String> studentNames) {
		StudentNames = studentNames;
	}


}
