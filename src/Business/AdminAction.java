package Business;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminAction extends ActionSupport implements ModelDriven{
	
	private Model.Login login = new Model.Login();
	private Model.Student student;
	private Model.Faculty faculty;
	private Model.Parent parent;

	
	public String checkAdminLogin()
	{
		if(login.getEmailId().equals("admin@admin.com")  && login.getPassword().equals("password"))
		{
			return SUCCESS;
		}
		
		else 
			return ERROR;
	}
	
	
	public String addStudent()
	{
	    Controller.AdminAction  a=new Controller.AdminAction();
	    System.out.println(student.getEmailId()+"!!!!!!!"+student.getPassword()+"@@@@@@@@@"+student.getBranchId());
	    a.addStudent(student);
	    return SUCCESS;
	}
	
	
	@Override
	public Object getModel() 
	{
		return login;
	}


	public Model.Student getStudent() {
		return student;
	}


	public void setStudent(Model.Student student) {
		this.student = student;
	}


	public Model.Faculty getFaculty() {
		return faculty;
	}


	public void setFaculty(Model.Faculty faculty) {
		this.faculty = faculty;
	}


	public Model.Parent getParent() {
		return parent;
	}


	public void setParent(Model.Parent parent) {
		this.parent = parent;
	}



}
