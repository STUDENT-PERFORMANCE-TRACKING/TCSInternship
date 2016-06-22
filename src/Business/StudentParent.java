package Business;

import com.opensymphony.xwork2.ModelDriven;

public class StudentParent implements ModelDriven
{

	private Model.StudentParent sp =new Model.StudentParent();
	
	public String createNew()
	{
		System.out.println(sp.getParent().getEmailId()+"@@@@@@@@@@"+sp.getStudent().getEmailId());
		System.out.println(sp.getStudent().getBranchId()+"----------"+sp.getStudent().getEmailId());

		return new Controller.StudentParent().createNew(sp);
		
	}

	
	
	public Model.StudentParent getSp() {
		return sp;
	}

	public void setSp(Model.StudentParent sp) {
		this.sp = sp;
	}

	@Override
	public Object getModel() 
	{
		return sp;
	}
	
	
	
	
}
