package Model;

import java.util.ArrayList;

public class StudentOrSubject 
{
	private Model.Student Student = new Model.Student();
	private Model.Result Result = new Model.Result();
	private String studentSubject;
	private Integer SubjectId;
	
	public Model.Student getStudent() {
		return Student;
	}
	public void setStudent(Model.Student Student) {
		this.Student = Student;
	}
	public Model.Result getResult() {
		return Result;
	}
	public void setResult(Model.Result Result) {
		this.Result = Result;
	}
	public String getStudentSubject() {
		return studentSubject;
	}
	public void setStudentSubject(String studentSubject) {
		this.studentSubject = studentSubject;
	}
	public Integer getSubjectId() {
		return SubjectId;
	}
	public void setSubjectId(Integer subjectId) {
		SubjectId = subjectId;
	}

}
