package Model;

import java.util.ArrayList;

public class Result 
{
	
	private Model.Student student;
	private ArrayList<Model.StudentResultView> studentresult;
	private int TotalMarks;
	private int SemesterFirst;
	private int SemesterSecond;
	private int MaximumMarks;
	private String ParentName;
	private String StudentName;
	private int Year;
	private String ResultType;
	
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
	public int getYear() {
		return Year;
	}
	public int getSemesterFirst() {
		return SemesterFirst;
	}
	public void setSemesterFirst(int semesterFirst) {
		SemesterFirst = semesterFirst;
	}
	public int getSemesterSecond() {
		return SemesterSecond;
	}
	public void setSemesterSecond(int semesterSecond) {
		SemesterSecond = semesterSecond;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getResultType() {
		return ResultType;
	}
	public void setResultType(String resultType) {
		ResultType = resultType;
	}
	
	
	
}
