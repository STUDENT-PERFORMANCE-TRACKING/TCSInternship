package Model;

import java.util.ArrayList;

public class StudentOrSubject 
{
	private Model.Student Student = new Model.Student();
	private Model.Result Result = new Model.Result();
	private String studentSubject;
	private Integer SubjectId;
	private Integer ObtainedMarks;
	private Boolean Check;
	private int RollNo;
	private int Semester;
	
	
	public int getSemester() {
		return Semester;
	}
	public void setSemester(int semester) {
		Semester = semester;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public Boolean getCheck() {
		return Check;
	}
	public void setCheck(Boolean check) {
		Check = check;
	}
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
	public Integer getObtainedMarks() {
		return ObtainedMarks;
	}
	public void setObtainedMarks(Integer obtainedMarks) {
		ObtainedMarks = obtainedMarks;
	}
	
}
