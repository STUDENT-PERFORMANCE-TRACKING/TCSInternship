package Controller;

import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.classic.Session;

public class DeleteMarks 
{
	public String softDeleteStudent(ArrayList<Model.StudentOrSubject> r, Model.StudentOrSubject ss)
	{
		
		Session session = Database.getSessionFactory().openSession();
		
		try
		{
		  for(Model.StudentOrSubject s:r)
		  {
			if(s.getCheck() == true)
			{	
			session.beginTransaction();
			Query query = session.createSQLQuery("update studentresult set Visible=:visible where rollno=:RollNo and subjectid=:SubjectId");
			query.setParameter("visible",0);
			query.setParameter("RollNo", ss.getStudent().getRollNo());
			query.setParameter("SubjectId", s.getSubjectId());
			
			query.executeUpdate();
			session.getTransaction().commit();
			}
			
		 }
		  
		  return "success";
		}  
			
			
		catch(Exception e)
			{
			    session.getTransaction().rollback();
				System.out.println(e.getMessage());
				return "error";
				
			}
			
		finally
		{
			session.close();
		}
		
			
	}
	
	
	
	public String softDeleteSubject(ArrayList<Model.StudentOrSubject> r, Model.StudentOrSubject ss)
	{
		
		Session session = Database.getSessionFactory().openSession();
		
		try
		{
		  for(Model.StudentOrSubject s:r)
		  {
			if(s.getCheck() == true)
			{	
			session.beginTransaction();
			Query query = session.createSQLQuery("update studentresult set Visible=:visible where rollno=:RollNo and subjectid=:SubjectId");
			query.setParameter("visible",0);
			query.setParameter("RollNo", s.getRollNo());
			query.setParameter("SubjectId", s.getSubjectId());
			
			query.executeUpdate();
			session.getTransaction().commit();
			}
			
		 }
		  
		  return "success";
		}  
			
			
		catch(Exception e)
			{
			    session.getTransaction().rollback();
				System.out.println(e.getMessage());
				return "error";
				
			}
			
		finally
		{
			session.close();
		}
		
			
	}

}
