package Model;

import java.util.ArrayList;

public class EditMarks 
{
	private ArrayList<Model.StudentOrSubject> r;
	private Model.Student student;
	private int SemesterFirst;
	
	
	
	public int getSemesterFirst() {
		return SemesterFirst;
	}

	public void setSemesterFirst(int semesterFirst) {
		SemesterFirst = semesterFirst;
	}

	public Model.Student getStudent() {
		return student;
	}

	public void setS(Model.Student student) {
		this.student = student;
	}

	public ArrayList<Model.StudentOrSubject> getR() {
		return r;
	}

	public void setR(ArrayList<Model.StudentOrSubject> r) {
		this.r = r;
	}



}
