package Business;

import java.util.ArrayList;

import com.opensymphony.xwork2.ModelDriven;

public class SaveMarks implements ModelDriven
{
	private Model.EditMarks em = new Model.EditMarks();
	private ArrayList<Model.StudentOrSubject> r= new ArrayList<Model.StudentOrSubject>();
	
	public String save()
	{
		if(new Controller.SaveMarks().save(r).equals("success"))
		  return "updated";
		else
			return "notupdated";
	}
	
	
	@Override
	public Object getModel() {
		return em;
	}
	public Model.EditMarks getEm() {
		return em;
	}
	public void setEm(Model.EditMarks em) {
		this.em = em;
	}

}
