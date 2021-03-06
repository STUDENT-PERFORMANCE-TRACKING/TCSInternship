package Controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.opensymphony.xwork2.ModelDriven;

public class StudentOrSubject 
{
	ArrayList<Integer> StudentRollNo;
	
	public ArrayList<Integer> sf1(Model.StudentOrSubject s)
	{
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		StudentRollNo=new ArrayList<Integer>(); 
		
		Query query = session.createSQLQuery("select RollNo from student where BranchId=:branchId");
		query.setParameter("branchId",s.getStudent().getBranchId());
		StudentRollNo=(ArrayList<Integer>) query.list();
				
		return StudentRollNo;
	}
	
	
	public ArrayList<String> sf2(Model.StudentOrSubject s)
	{
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		Model.EditMarks em= new Model.EditMarks();
		ArrayList<Integer> id = new ArrayList<Integer>();
		ArrayList<String> subject = new ArrayList<String>();
		
		Query query = session.createSQLQuery
				("select Semester, SubjectName, SubjectId from"
			+ " (select a.BranchId, b.Semester, b.SubjectName, b.SubjectId from coursesubject a, subject b where a.SubjectId=b.SubjectId)"
			+ " as a where Semester=:semester and BranchId=:branchId");
		query.setParameter("semester",s.getResult().getSemesterFirst());
		query.setParameter("branchId",s.getStudent().getBranchId());
		
		List<Object[]> row =query.list();
		
		for(Object[] r : row)
		{
			id.add((Integer) r[2]);
			subject.add((String) r[1]);
		}
		
		return subject;
	}
	
	
	public ArrayList<Integer> getStudentRollNo() {
		return StudentRollNo;
	}
	
	public void setStudentRollNo(ArrayList<Integer> studentRollNo) {
		StudentRollNo = studentRollNo;
	}

}
