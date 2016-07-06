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
		
		r=new Controller.SelectStudent().sf2(s);
		
		System.out.println(" in Business.SelectStudent semester : "+s.getResult().getSemesterFirst());
		System.out.println("branchid : "+s.getStudent().getBranchId());
		System.out.println("roll no : "+s.getStudent().getRollNo());
		for(Model.StudentOrSubject ss : r)
		{
			System.out.println("subject name : "+ss.getStudentSubject());
			System.out.println("subject id : "+ss.getSubjectId());
			System.out.println("marks : "+ss.getObtainedMarks());
		}
		
		
		System.out.println("session map contain== "+sessionMap.get("optionselected"));
		
		if(sessionMap.get("optionselected").equals("Update")  ||  sessionMap.get("optionselected").equals("View"))
		  return "updatemarks";
		
		else if(sessionMap.get("optionselected").equals("Delete"))
			  return "deletemarks";
		
		else 
			  return "createmarks";
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
