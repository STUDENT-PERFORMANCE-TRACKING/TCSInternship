package Model;

import java.util.ArrayList;

public class EditMarks 
{
	private int BranchId;
	private int SemesterFirst;
	private int RollNo;
	private ArrayList<String> studentSubject = new ArrayList<String>();
	private ArrayList<Integer> SubjectId = new ArrayList<Integer>();
	private ArrayList<Integer> Marks = new ArrayList<Integer>();
	ArrayList<Integer> StudentRollNo =new ArrayList<Integer>();
	private ArrayList<Boolean> Check = new ArrayList<Boolean>();
	
	public ArrayList<Boolean> getCheck() {
		return Check;
	}
	public void setCheck(ArrayList<Boolean> check) {
		Check = check;
	}
	public int getSemesterFirst() {
		return SemesterFirst;
	}
	public void setSemesterFirst(int semesterFirst) {
		SemesterFirst = semesterFirst;
	}
	public ArrayList<String> getStudentSubject() {
		return studentSubject;
	}
	public void setStudentSubject(ArrayList<String> studentSubject) {
		this.studentSubject = studentSubject;
	}
	public ArrayList<Integer> getSubjectId() {
		return SubjectId;
	}
	public void setSubjectId(ArrayList<Integer> subjectId) {
		SubjectId = subjectId;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public int getBranchId() {
		return BranchId;
	}
	public void setBranchId(int branchId) {
		BranchId = branchId;
	}
	public ArrayList<Integer> getMarks() {
		return Marks;
	}
	public void setMarks(ArrayList<Integer> marks) {
		Marks = marks;
	}
	public ArrayList<Integer> getStudentRollNo() {
		return StudentRollNo;
	}
	public void setStudentRollNo(ArrayList<Integer> studentRollNo) {
		StudentRollNo = studentRollNo;
	}
	

}
