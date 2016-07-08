package Business;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;

public class SelectStudent implements ModelDriven,SessionAware
{
	private Model.StudentOrSubject s=new Model.StudentOrSubject();
	ArrayList<Model.StudentOrSubject> r;
	
	private Map<String, Object> sessionMap;
	
	public String sf2()
	{
		if(new Controller.Session().getCurrentFacultySession(sessionMap) == null)
			return "error";
		
		if(sessionMap.get("optionselected").equals("create"))
			r= new Controller.SelectStudent().getSubjectList(s);
		else
		    r=new Controller.SelectStudent().sf2(s);
		
		System.out.println(" in Business.SelectStudent semester : "+s.getResult().getSemesterFirst());
		System.out.println("branchid : "+s.getStudent().getBranchId());
		System.out.println("roll no : "+s.getStudent().getRollNo());
		System.out.println("sessionmap key contain"+sessionMap.get("optionselected"));
		for(Model.StudentOrSubject ss : r)
		{
			System.out.println("subject name : "+ss.getStudentSubject());
			System.out.println("subject id : "+ss.getSubjectId());
			System.out.println("marks : "+ss.getObtainedMarks());
			System.out.println("semester : "+ss.getSemester());

		}
		
		if(sessionMap.get("optionselected").equals("view"))
		  return "view";
		
		else  if(sessionMap.get("optionselected").equals("create"))
			  return "create";
		
		else  if(sessionMap.get("optionselected").equals("update"))
			  return "update";
		
		else
			return "delete";
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


	public ArrayList<Model.StudentOrSubject> getR() {
		return r;
	}


	public void setR(ArrayList<Model.StudentOrSubject> r) {
		this.r = r;
	}


	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap=sessionMap;
		
	}

}
