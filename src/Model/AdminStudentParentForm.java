package Model;

public class AdminStudentParentForm {
	
	private Model.Faculty Faculty;
	private Model.Student Student;
	private Model.Parent Parent;
	private String insertstatus;
	private String AdminSelect;

	
	
	public Model.Faculty getFaculty() {
		return Faculty;
	}
	public void setFaculty(Model.Faculty faculty) {
		Faculty = faculty;
	}
	public Model.Student getStudent() {
		return Student;
	}
	public void setStudent(Model.Student student) {
		Student = student;
	}
	public Model.Parent getParent() {
		return Parent;
	}
	public void setParent(Model.Parent parent) {
		Parent = parent;
	}
	public String getInsertstatus() {
		return insertstatus;
	}
	public void setInsertstatus(String insertstatus) {
		this.insertstatus = insertstatus;
	}
	public String getAdminSelect() {
		return AdminSelect;
	}
	public void setAdminSelect(String AdminSelect) {
		this.AdminSelect = AdminSelect;
	}
	
	

}
