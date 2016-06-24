package Business;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentResult extends ActionSupport implements ModelDriven ,SessionAware
{
	private Map<String, Object> sessionMap;
	private Model.Result result = new Model.Result();
	
	

	public String getSemesterResult()
	{
		if(new Controller.Session().getCurrentStudentSession(sessionMap)==null)
			return ERROR ;
		
		new Model.Logging().message("Semester", String.valueOf(result.getSemesterFirst()));
		getResult().setStudent(new Controller.Session().getCurrentStudentSession(sessionMap));
		result= new Controller.StudentResult().result(result);
		result.setResultType("Semester");
		return SUCCESS;
		
	}
	
	public String getYearResult()
	{
		if(new Controller.Session().getCurrentStudentSession(sessionMap)==null)
			return ERROR ;
		new Controller.StudentResult().setSemesterForYear(result);
		getResult().setStudent(new Controller.Session().getCurrentStudentSession(sessionMap));
		result= new Controller.StudentResult().result(result);
		result.getStudentresult().addAll(new Controller.StudentResultView().getStudentResultView(result.getStudent().getRollNo(), result.getSemesterSecond()));
		result.setResultType("Year");
		result.setSemesterFirst(result.getYear());
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
