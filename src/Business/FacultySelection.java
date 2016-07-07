package Business;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class FacultySelection extends ActionSupport implements SessionAware{
	
	private String OptionSelected;
	private Map<String, Object> sessionMap;
	
	public String getOptionSelected()
	{
		if(new Controller.Session().getCurrentFacultySession(sessionMap) == null)
			return ERROR;
		
		sessionMap.put("optionselected", OptionSelected);
		
		/*
		if(OptionSelected == "Create")
		{
			return "create";
		}
		
		else if(OptionSelected == "View")
		{
			return "view";
		}
		
		else if(OptionSelected == "Edit")
		{
			return "edit";
		}
		
		else 
		{
			return "delete";
		}    
		          */
		
		return SUCCESS;
		
	}
	
	

	public void setOptionSelected(String optionSelected) {
		OptionSelected = optionSelected;
	}



	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap=sessionMap;
		
	}

}
