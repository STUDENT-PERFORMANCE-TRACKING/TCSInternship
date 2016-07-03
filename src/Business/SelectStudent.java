package Business;

import java.util.ArrayList;

import com.opensymphony.xwork2.ModelDriven;

public class SelectStudent implements ModelDriven
{
	private Model.StudentOrSubject s=new Model.StudentOrSubject();
	ArrayList<Model.StudentOrSubject> r;
	
	public String sf2()
	{
		//r=new Controller.StudentOrSubject().sf2(s);
		r=new Controller.SelectStudent().sf2(s);
		System.out.println("semester : "+s.getResult().getSemesterFirst());
		System.out.println("branchid : "+s.getStudent().getBranchId());
		System.out.println("roll no : "+s.getStudent().getRollNo());
		for(Model.StudentOrSubject ss : r)
		{
			System.out.println("subject name : "+ss.getStudentSubject());
			System.out.println("subject id : "+ss.getSubjectId());
		}
		
		return "error";
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

}
