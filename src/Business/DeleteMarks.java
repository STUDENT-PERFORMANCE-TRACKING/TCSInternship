package Business;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;

import Model.StudentOrSubject;

public class DeleteMarks implements SessionAware
{
	
	private Model.StudentOrSubject s=new Model.StudentOrSubject();
	ArrayList<Model.StudentOrSubject> r;
	private String OperationStatus;
	
	

	private Map<String, Object> sessionMap;
	
	public String deleteStudentMarks()
	{
		if(new Controller.Session().getCurrentFacultySession(sessionMap) == null)
			return "error";
		
		System.out.println("delete marks class----");
		
		System.out.println("semester : "+s.getResult().getSemesterFirst());
		System.out.println("branchid : "+s.getStudent().getBranchId());
		System.out.println("roll no : "+s.getStudent().getRollNo());
		System.out.println("roll no : "+s.getCheck());
		
		System.out.println("size : "+r.size());
		
		for(Model.StudentOrSubject a : r)
			System.out.println("subject name : "+a.getStudentSubject());
			
		//for(int sss : s.getSubjectId())
		//	System.out.println("subjectid : "+sss);
	
		
		if(new Controller.DeleteMarks().softDeleteStudent(r,s)=="success")
		   return "updated";
		
		else
		{ OperationStatus="Marks Cannot be Deleted";
		  return "notupdated";	
		}
		
		/*
		System.out.println("kadhgkahk--");
		for(Model.StudentOrSubject ss : r)
			System.out.println("kashdgiahsdguiehiurbgv"+ss.getStudentSubject());
		for(Model.StudentOrSubject ss : r)
		{
			System.out.println("semester : "+ss.getResult().getSemesterFirst());
			System.out.println("branchid : "+ss.getStudent().getBranchId());
			System.out.println("roll no: "+ss.getStudent().getRollNo());
			
		}
		*/
	}
	
	
	
	public String deleteSubjectMarks()
	{
		if(new Controller.Session().getCurrentFacultySession(sessionMap) == null)
			return "error";
		
		System.out.println("delete marks class----");
		
		System.out.println("semester : "+s.getResult().getSemesterFirst());
		System.out.println("branchid : "+s.getStudent().getBranchId());
		System.out.println("roll no : "+s.getStudent().getRollNo());
		System.out.println("roll no : "+s.getCheck());
		
		System.out.println("size : "+r.size());
		
		for(Model.StudentOrSubject a : r)
			System.out.println("subject name : "+a.getStudentSubject());
			
		//for(int sss : s.getSubjectId())
		//	System.out.println("subjectid : "+sss);
	
		
		if(new Controller.DeleteMarks().softDeleteSubject(r,s)=="success")
		   return "updated";
		
		else
		  return "notupdated";	
		
		/*
		System.out.println("kadhgkahk--");
		for(Model.StudentOrSubject ss : r)
			System.out.println("kashdgiahsdguiehiurbgv"+ss.getStudentSubject());
		for(Model.StudentOrSubject ss : r)
		{
			System.out.println("semester : "+ss.getResult().getSemesterFirst());
			System.out.println("branchid : "+ss.getStudent().getBranchId());
			System.out.println("roll no: "+ss.getStudent().getRollNo());
			
		}
		*/
	}
	
	
	public ArrayList<Model.StudentOrSubject> getR() {
		return r;
	}

	public void setR(ArrayList<Model.StudentOrSubject> r) {
		this.r = r;
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
	
	public String getOperationStatus() {
		return OperationStatus;
	}



	public void setOperationStatus(String operationStatus) {
		OperationStatus = operationStatus;
	}

	


}

