package Business;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminAction extends ActionSupport implements ModelDriven, SessionAware{
	
	private Model.Login login = new Model.Login();
	private Model.AdminStudentParentForm sp;
	
	private Map<String, Object> sessionMap;

    public String checkAdminSignupURL()
    {
    	if(new Controller.Session().getCurrentAdminSession(sessionMap)!= null)
    		return "adminalreadylogin";
    	else
    		return "adminnotlogin";
    }
	
	public String checkAdminLogin()
	{
		if(login.getEmailId().equals("admin@admin.com")  && login.getPassword().equals("password"))
		{
			new Controller.Session().createAdminSession(sessionMap, login);
			return SUCCESS;
		}
		
		else 
		{
			return ERROR;
		}
			
	}
	
	
	public String adminSelectAction()
	{
	   if(new Controller.Session().getCurrentAdminSession(sessionMap)== null)
		   return ERROR;
	   
	   if(sp.getAdminSelect().equals("Student"))
		   return "studentparentform";
	   
	   else
		   return "facultyform";
		   
	}
	
	public String addStudentParent()
	{
		 if(new Controller.Session().getCurrentAdminSession(sessionMap)== null)
			   return ERROR;
		 
		System.out.println("admin stpaform "+sp.getStudent().getBranchId());
		
		if(new Controller.AdminAction().addStudentParent(sp).equals("inserted"))
		{
			sp.setInsertstatus("Record Successfully Inserted");
			return SUCCESS;
		}
		else
		  {
			sp.setInsertstatus("Record Not Inseted");
			return "insertionfailed";
		  }
	}
	
	
	public String addFaculty()
	{
		 if(new Controller.Session().getCurrentAdminSession(sessionMap)== null)
			   return ERROR;
		 
		System.out.println("parent "+sp.getFaculty().getEmailId());
		 
		if(new Controller.AdminAction().addFaculty(sp).equals("inserted"))
		{
			sp.setInsertstatus("Record Successfully Inserted");
			return SUCCESS;
		}
		else
		  {
			sp.setInsertstatus("Record Not Inseted");
			return "insertionfailed";
		  }
	}
	
	public String addMoreInfo()
	{
		if(new Controller.Session().getCurrentAdminSession(sessionMap)== null)
			return ERROR;
		else
			return SUCCESS;
	}
	
	
	public String logoutAdmin()
	{ 
		return new Controller.Session().removeAdminSession(sessionMap);
	}
	
	@Override
	public Object getModel() 
	{
		return login;
	}

	
	public Model.AdminStudentParentForm getSp() {
		return sp;
	}


	public void setSp(Model.AdminStudentParentForm sp) {
		this.sp = sp;
	}


	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap=sessionMap;
		
	}


	

}
