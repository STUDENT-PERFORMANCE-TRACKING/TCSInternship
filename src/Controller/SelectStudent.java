package Controller;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.classic.Session;

public class SelectStudent 
{
	ArrayList<Model.StudentOrSubject> r;	

	public ArrayList<Model.StudentOrSubject> sf2(Model.StudentOrSubject s)
	{
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		System.out.println("semseter : "+s.getResult().getSemesterFirst());
		
		//Query query = session.createSQLQuery("SELECT Subjectname , subjectid FROM student_performance_tracking.`subject` where semester=:SemesterFirst");
		
		Query query = session.createSQLQuery
				("select * from(select a.SubjectName, b.SubjectId, b.RollNo, b.Marks, b.Semester from subject a, studentresult b where a.SubjectId=b.SubjectId) as x where Semester=:SemesterFirst and RollNo=:RollNo");
		query.setParameter("SemesterFirst",s.getResult().getSemesterFirst());
		query.setParameter("RollNo",s.getStudent().getRollNo());

		r=new ArrayList<Model.StudentOrSubject>();
		List<Object[]> row=query.list();
		for(Object[] i : row)
		{
			s =new Model.StudentOrSubject();
			s.setStudentSubject((String) i[0]);
			s.setSubjectId((int) i[1]);
			s.setObtainedMarks((int) i[3]);
						
			r.add(s);
		}
		System.out.println(r.size());
		
		return r;
		
	}
	
	
	public ArrayList<Model.StudentOrSubject> getSubjectList(Model.StudentOrSubject s)
	{
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		System.out.println("semseter : "+s.getResult().getSemesterFirst());
		
		//Query query = session.createSQLQuery("SELECT Subjectname , subjectid FROM student_performance_tracking.`subject` where semester=:SemesterFirst");
		
		Query query = session.createSQLQuery
				("select SubjectName , SubjectId , Semester from  subject");

		r=new ArrayList<Model.StudentOrSubject>();
		List<Object[]> row=query.list();
		for(Object[] i : row)
		{
			s =new Model.StudentOrSubject();
			s.setStudentSubject((String) i[0]);
			s.setSubjectId((int) i[1]);
			s.setSemester((int) i[2]);
						
			r.add(s);
		}
		System.out.println(r.size());
		
		return r;
		
	}

	
	

	public ArrayList<Model.StudentOrSubject> getR() {
		return r;
	}


	public void setR(ArrayList<Model.StudentOrSubject> r) {
		this.r = r;
	}

	
	
}
