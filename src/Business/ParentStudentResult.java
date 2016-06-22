package Business;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ParentStudentResult extends ActionSupport implements ModelDriven ,SessionAware
{
	private Map<String, Object> sessionMap;
	private Model.Result result = new Model.Result();
	
	

	public String getParentStudentResult()
	{
		if(new Controller.Session().getCurrentParentSession(sessionMap)==null)
			return ERROR ;
		
		new Model.Logging().message("Semester", String.valueOf(result.getSemester()));
		getResult().setParentName(new Controller.Session().getCurrentParentSession(sessionMap).getParentName());
		getResult().setStudent(new Controller.Session().getCurrentStudentSession(sessionMap));
		result= new Controller.StudentResult().result(result);
		return SUCCESS;
		
	}
	
	
	@Override
	public Object getModel() 
	{
		return result;
	}
	


	public Model.Result getResult() {
		return result;
	}


	public void setResult(Model.Result result) {
		this.result = result;
	}
	
	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;		
	}

}
