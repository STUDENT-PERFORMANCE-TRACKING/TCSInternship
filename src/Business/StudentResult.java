package Business;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import Model.StudentResultView;


public class StudentResult extends ActionSupport 
{
	
	private ArrayList<Model.StudentResultView> studentresult=new ArrayList<Model.StudentResultView>();
	private Model.Result result = new Model.Result();
	
	public Model.Result result(Model.Result res)
	{   
		//Student =new Model.Student();
		//studentresult = new ArrayList<Model.StudentResultView>();
		//StudentResultView c=new StudentResultView();
	    //int RollNo=1;
	    //studentresult= c.getStudentResultView(RollNo,Semester); 
	    //ParentName=(c.getParentName(RollNo));
	    //TotalMarks=c.getTotalMarks(studentresult);
		
		

        result=res;
	    
		result.setStudentresult(new Controller.StudentResultView().getStudentResultView(result.getStudent().getRollno(), result.getSemester()));
		result.setTotalMarks(new Controller.StudentResultView().getTotalMarks(result.getStudentresult()));
		
		studentresult = result.getStudentresult();
		
		for(StudentResultView StudentResult : studentresult)
		{
			System.out.println(StudentResult.getSubjectName()+"--"+StudentResult.getMaximumMarks()+"--"+StudentResult.getObtainedMarks());
		}
		
		System.out.println(result.getTotalMarks());
		
	    return res;
	    
	  }
	
	
	
	
	
	public ArrayList<Model.StudentResultView> getStudentresult() {
		return studentresult;
	}
	public void setStudentresult(ArrayList<Model.StudentResultView> studentresult) {
		this.studentresult = studentresult;
	}
	public Model.Result getResult() {
		return result;
	}
	public void setResult(Model.Result result) {
		this.result = result;
	}

	
	
	
	
	
}
