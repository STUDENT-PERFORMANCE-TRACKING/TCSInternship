package Model;

import java.util.ArrayList;

public class Result 
{
	
	private Model.Student student;
	private ArrayList<Model.StudentResultView> studentresult;
	private int TotalMarks;
	private int Semester;
	
	
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
	
	
	
}
