package Business;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ParentStudentResult extends ActionSupport implements ModelDriven ,SessionAware
{
	private Map<String, Object> sessionMap;
	private Model.Result result = new Model.Result();
	
	

	public String getParentStudentResultBySemester()
	{
		if(new Controller.Session().getCurrentParentSession(sessionMap)==null)
			return ERROR ;
		System.out.println("st name from jsp ="+result.getStudentName());
		new Model.Logging().message("Semester", String.valueOf(result.getSemesterFirst()));
		getResult().setParentName(new Controller.Session().getCurrentParentSession(sessionMap).getParentName());
		getResult().setStudent(new Controller.ParentStudentSelection().getStudent(result.getStudentName(), new Controller.Session().getCurrentParentSession(sessionMap).getParentId()));
		result= new Controller.StudentResult().result(result);
		return SUCCESS;
		
	}
	
	public String getParentStudentResultByYear()
	{
		if(new Controller.Session().getCurrentParentSession(sessionMap)==null)
			return ERROR ;
		
		
		System.out.println("st name from jsp ="+result.getStudentName());
		result.setResultType("Year");
		new Controller.StudentResult().setSemesterForYear(result);
		new Model.Logging().message("Semester", String.valueOf(result.getSemesterFirst()));
		getResult().setParentName(new Controller.Session().getCurrentParentSession(sessionMap).getParentName());
		getResult().setStudent(new Controller.ParentStudentSelection().getStudent(result.getStudentName(), new Controller.Session().getCurrentParentSession(sessionMap).getParentId()));
		result= new Controller.StudentResult().result(result);
		result.getStudentresult().addAll(new Controller.StudentResultView().getStudentResultView(result.getStudent().getRollNo(), result.getSemesterSecond()));
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
