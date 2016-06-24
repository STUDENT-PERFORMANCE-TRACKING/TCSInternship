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
		
		
	    //res.getStudentresult().addAll(res.getStudentresult());
		res.setStudentresult(new Controller.StudentResultView().getStudentResultView(res.getStudent().getRollNo(), res.getSemesterFirst()));
		res.setTotalMarks(new Controller.StudentResultView().getTotalMarks(res.getStudentresult()));
		
		
		studentresult = res.getStudentresult();
		
		for(StudentResultView StudentResult : studentresult)
		{
			System.out.println(StudentResult.getSubjectName()+"--"+StudentResult.getMaximumMarks()+"--"+StudentResult.getObtainedMarks());
		}
		
		System.out.println(res.getTotalMarks());
		
		res.setParentName(new Controller.StudentResultView().getParentName(res.getStudent().getRollNo()));
		
		res.setMaximumMarks(new Controller.StudentResultView().getMaximumMarks(res.getStudentresult()));
		
	    return res;
	    
	  }
	
	public void setSemesterForYear(Model.Result result)
	{
		if(result.getYear()==1)
		{ 
			result.setSemesterFirst(1);
			result.setSemesterSecond(2);
		}
		
		else if(result.getYear()==2)
		{ 
			result.setSemesterFirst(3);
			result.setSemesterSecond(4);
		}
		
		else if(result.getYear()==3)
		{ 
			result.setSemesterFirst(5);
			result.setSemesterSecond(6);
		}
		
		else 
		{ 
			result.setSemesterFirst(7);
			result.setSemesterSecond(8);
		}
	}
	
	
	
	
	
	public ArrayList<Model.StudentResultView> getStudentresult() {
		return studentresult;
	}
	public void setStudentresult(ArrayList<Model.StudentResultView> studentresult) {
		this.studentresult = studentresult;
	}
	
	
	
	
}
