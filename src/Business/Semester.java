package Business;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Semester extends ActionSupport implements ModelDriven
{
	
	private Model.Result result = new Model.Result();
	
	
	public String semester()
	{
		
		new Model.Logging().message("Semester", String.valueOf(result.getSemester()));
		new Business.StudentResult().result(result.getSemester());
		return SUCCESS;
		
	}
	
	
	@Override
	public Object getModel() 
	{
		return result;
	}
	

}
