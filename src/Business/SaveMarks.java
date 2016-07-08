package Business;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;

public class SaveMarks implements ModelDriven,SessionAware
{
	private Model.EditMarks em = new Model.EditMarks();
	private ArrayList<Model.StudentOrSubject> r= new ArrayList<Model.StudentOrSubject>();
	
	private Map<String, Object> sessionMap;
	
	public String save()
	{
		if(new Controller.Session().getCurrentFacultySession(sessionMap) == null)
			return "error";
		
		if(new Controller.SaveMarks().save(r).equals("success"))
		  return "updated";
		else
			return "notupdated";
	}
	
	
	@Override
	public Object getModel() {
		return em;
	}
	public Model.EditMarks getEm() {
		return em;
	}
	public void setEm(Model.EditMarks em) {
		this.em = em;
	}


	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap=sessionMap;
		
	}

}
