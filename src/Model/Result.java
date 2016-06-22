package Model;

import java.util.ArrayList;

public class Result 
{
	
	private Model.Student student;
	private ArrayList<Model.StudentResultView> studentresult;
	private int TotalMarks;
	private int Semester;
	private int MaximumMarks;
	private String ParentName;
	private String StudentName;
	
	public Model.Student getStudent() {
		return student;
	}
	public void setStudent(Model.Student student) {
		this.student = student;
	}
	public ArrayList<Model.StudentResultView> getStudentresult() {
		return studentresult;
	}
	public void setStudentresult(ArrayList<Model.StudentResultView> studentresult) {
		this.studentresult = studentresult;
	}
	public int getTotalMarks() {
		return TotalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		TotalMarks = totalMarks;
	}
	public int getSemester() {
		return Semester;
	}
	public void setSemester(int semester) {
		Semester = semester;
	}
	public int getMaximumMarks() {
		return MaximumMarks;
	}
	public void setMaximumMarks(int maximumMarks) {
		MaximumMarks = maximumMarks;
	}
	public String getParentName() {
		return ParentName;
	}
	public void setParentName(String parentName) {
		ParentName = parentName;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	
	
	
}
