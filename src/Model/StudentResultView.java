package Model;

public class StudentResultView {
	
	private int ObtainedMarks;
	private int MaximumMarks;
	private String SubjectName;
	private String Status="";
	
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getObtainedMarks() {
		return ObtainedMarks;
	}
	public void setObtainedMarks(int obtainedMarks) {
		ObtainedMarks = obtainedMarks;
	}
	public int getMaximumMarks() {
		return MaximumMarks;
	}
	public void setMaximumMarks(int maximumMarks) {
		MaximumMarks = maximumMarks;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
		
	
	
}
