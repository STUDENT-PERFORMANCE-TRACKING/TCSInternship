package Controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;

public class SelectSubject 
{
	
	public void sf3(Model.StudentOrSubject s,ArrayList<Model.StudentOrSubject> r)
	{
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		ArrayList<Integer> StudentRollNo=new ArrayList<Integer>();
		
		Query query = session.createSQLQuery
		("Select SubjectId, Marks, RollNo from studentresult where SubjectId=(select SubjectId from subject where SubjectName=:subject)");
		query.setParameter("subject",s.getStudentSubject());
		
		List<Object[]> row = query.list();
		
		for(Object[] r1 : row)
		{
			Model.StudentOrSubject s1=new Model.StudentOrSubject();
			s1.setSubjectId((int) r1[0]);
			s1.setRollNo((int) r1[2]);
			s1.setObtainedMarks((int) r1[1]);
			
			r.add(s1);
			
		}
		
		
	}
	
	
	public void getStudentList(Model.StudentOrSubject s,ArrayList<Model.StudentOrSubject> r)
	{
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		ArrayList<Integer> StudentRollNo=new ArrayList<Integer>();
		
		Query query = session.createSQLQuery
		("Select  RollNo from student");
		
		StudentRollNo = (ArrayList<Integer>) query.list();
		
		for(Integer r1 : StudentRollNo)
		{
			Model.StudentOrSubject s1=new Model.StudentOrSubject();
			s1.setRollNo((int) r1);
			s1.setStudentSubject(s.getStudentSubject());
			
			r.add(s1);
			
		}
		
		
	}

}
