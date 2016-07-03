package Business;

import java.util.ArrayList;

import com.opensymphony.xwork2.ModelDriven;

import Model.StudentOrSubject;

public class EditMarks implements ModelDriven
{
	ArrayList<Model.StudentOrSubject> r=new ArrayList<Model.StudentOrSubject>() ;
	
	public void sf3()
	{
		
		new Controller.EditMarks().save(r);
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
	
	@Override
	public Object getModel()
	{
		return r;
	}
	public ArrayList<Model.StudentOrSubject> getR() {
		return r;
	}
	public void setR(ArrayList<Model.StudentOrSubject> r) {
		this.r = r;
	}

}
