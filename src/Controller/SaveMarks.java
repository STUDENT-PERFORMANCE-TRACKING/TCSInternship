package Controller;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.classic.Session;

import Model.EditMarks;

public class SaveMarks 
{
	public String save(ArrayList<Model.StudentOrSubject> r)
	{

		Session session = Database.getSessionFactory().openSession();
		
		try
		{
		  for(Model.StudentOrSubject s:r)
		  {
			session.beginTransaction();
			Query query = session.createSQLQuery
				("update studentresult set marks=:newMarks where rollno=:RollNo and subjectid="
			 + "(select subjectid from subject where subjectname=:name)");
			query.setParameter("newMarks",s.getObtainedMarks());
			query.setParameter("RollNo",s.getRollNo() );
			query.setParameter("name", s.getSubjectId());
			
			query.executeUpdate();
			session.getTransaction().commit();
			
		  }
		  
		  return "success";
		  
		}  
			
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return "error";
		}
			
		finally
		{
			session.close();
		}
		
	}

}
