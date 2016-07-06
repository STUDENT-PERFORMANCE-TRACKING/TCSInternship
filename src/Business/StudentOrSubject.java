package Business;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentOrSubject extends ActionSupport implements ModelDriven ,SessionAware
{
	private Model.StudentOrSubject s = new Model.StudentOrSubject();
	ArrayList<Integer> StudentRollNo;
	private Map<String, Object> sessionMap;
	
	public String sf1()
	{
		if(new Controller.Session().getCurrentFacultySession(sessionMap) == null)
			return ERROR;
		
		
		//System.out.println("Branchid : "+s.getStudent().getBranchId());
		if(s.getStudentSubject().equals("Student"))
		{
			StudentRollNo=new Controller.StudentOrSubject().sf1(s);
			for(Integer i : StudentRollNo)
				System.out.println(i);
			
			return "studentoption";
		}
		else
			return "good";
	}

	
	
	public ArrayList<Integer> getStudentRollNo() {
		return StudentRollNo;
	}

	public void setStudentRollNo(ArrayList<Integer> studentRollNo) {
		StudentRollNo = studentRollNo;
	}

	@Override
	public Object getModel() 
	{
		return s;
	}

	
	public Model.StudentOrSubject getS() {
		return s;
	}

	public void setS(Model.StudentOrSubject s) {
		this.s = s;
	}



	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap=sessionMap;
		
	}

}
