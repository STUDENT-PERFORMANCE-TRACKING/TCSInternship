package Controller;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import Model.StudentResultView;


public class StudentResult 
{
	
	private ArrayList<Model.StudentResultView> studentresult=new ArrayList<Model.StudentResultView>();
	
	public Model.Result result(Model.Result res)
	{   
		//Student =new Model.Student();
		//studentresult = new ArrayList<Model.StudentResultView>();
		//StudentResultView c=new StudentResultView();
	    //int RollNo=1;
	    //studentresult= c.getStudentResultView(RollNo,Semester); 
	    //ParentName=(c.getParentName(RollNo));
	    //TotalMarks=c.getTotalMarks(studentresult);
		
		
	    
		res.setStudentresult(new Controller.StudentResultView().getStudentResultView(res.getStudent().getRollno(), res.getSemester()));
		res.setTotalMarks(new Controller.StudentResultView().getTotalMarks(res.getStudentresult()));
		
		studentresult = res.getStudentresult();
		
		for(StudentResultView StudentResult : studentresult)
		{
			System.out.println(StudentResult.getSubjectName()+"--"+StudentResult.getMaximumMarks()+"--"+StudentResult.getObtainedMarks());
		}
		
		System.out.println(res.getTotalMarks());
		
		res.setParentName(new Controller.StudentResultView().getParentName(res.getStudent().getRollno()));
		
		res.setMaximumMarks(new Controller.StudentResultView().getMaximumMarks(res.getStudentresult()));
		
	    return res;
	    
	  }
	
	
	
	
	
	public ArrayList<Model.StudentResultView> getStudentresult() {
		return studentresult;
	}
	public void setStudentresult(ArrayList<Model.StudentResultView> studentresult) {
		this.studentresult = studentresult;
	}
	
	
	
	
}
