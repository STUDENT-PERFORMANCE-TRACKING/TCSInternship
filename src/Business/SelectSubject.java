package Business;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;

public class SelectSubject implements ModelDriven,SessionAware
{
	private Model.StudentOrSubject s= new Model.StudentOrSubject();
	private Model.EditMarks em = new Model.EditMarks();
	private ArrayList<Model.StudentOrSubject> r= new ArrayList<Model.StudentOrSubject>();
	
	

	private Map<String, Object> sessionMap;
		
	public String sf3()
	{
		if(new Controller.Session().getCurrentFacultySession(sessionMap) == null)
			return "error";
		
		System.out.println(s.getResult().getSemesterFirst());
		System.out.println(s.getStudent().getBranchId());
		System.out.println(s.getStudentSubject());
		
		if(sessionMap.get("optionselected").equals("create"))
			new Controller.SelectSubject().getStudentList(s, r);
		else	
		     new Controller.SelectSubject().sf3(s,r);
		
		System.out.println("araaylist of StudentOrSubject size="+r.size());
		//System.out.println("list marks size="+em.getMarks().size());
		
		
		if(sessionMap.get("optionselected").equals("view"))
			  return "view";
			
			else  if(sessionMap.get("optionselected").equals("create"))
				  return "create";
			
			else  if(sessionMap.get("optionselected").equals("update"))
				  return "update";
			
			else
				return "delete";
	}
	
	
	public Model.StudentOrSubject getS() {
		return s;
	}
	public void setS(Model.StudentOrSubject s) {
		this.s = s;
	}
	@Override
	public Object getModel() {
		return s;
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
	
	public ArrayList<Model.StudentOrSubject> getR() {
		return r;
	}


	public void setR(ArrayList<Model.StudentOrSubject> r) {
		this.r = r;
	}


}
