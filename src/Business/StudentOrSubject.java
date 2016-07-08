package Business;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentOrSubject extends ActionSupport implements ModelDriven 
{
	private Model.StudentOrSubject s = new Model.StudentOrSubject();
	ArrayList<Integer> StudentRollNo = new ArrayList<Integer>();
	ArrayList<String> StudentSubjectList = new ArrayList<String>();

	
	



	public String sf1()
	{
		//System.out.println("Branchid : "+s.getStudent().getBranchId());
		if(s.getStudentSubject().equals("Student"))
		{
			StudentRollNo=new Controller.StudentOrSubject().sf1(s);
			for(Integer i : StudentRollNo)
				System.out.println(i);
			
			return "StudentWise";
		}
		else
		{
			StudentSubjectList=new Controller.StudentOrSubject().sf2(s);
			System.out.println("Subject list size ="+StudentSubjectList.size());
			for(String s:StudentSubjectList)
				 System.out.println("sub name="+s);
			
			return "SubjectWise";
			
		}
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



	public ArrayList<String> getStudentSubjectList() {
		return StudentSubjectList;
	}



	public void setStudentSubjectList(ArrayList<String> studentSubjectList) {
		StudentSubjectList = studentSubjectList;
	}

	
	

}
