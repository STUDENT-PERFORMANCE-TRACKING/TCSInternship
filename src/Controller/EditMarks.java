package Controller;

import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.classic.Session;

public class EditMarks 
{
	public String save(ArrayList<Model.StudentOrSubject> r, Model.StudentOrSubject ss)
	{
		
		Session session = Database.getSessionFactory().openSession();
		
		try
		{
		  for(Model.StudentOrSubject s:r)
		  {
			
			session.beginTransaction();
			Query query = session.createSQLQuery("update studentresult set Marks=:ObtainedMarks where RollNo=:RollNo and SubjectId=:SubjectId");
			query.setParameter("ObtainedMarks",s.getObtainedMarks());
			query.setParameter("RollNo", ss.getStudent().getRollNo());
			query.setParameter("SubjectId", s.getSubjectId());
			
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
	
	
	public String createResult(ArrayList<Model.StudentOrSubject> r, Model.StudentOrSubject ss)
	{
		
		Session session = Database.getSessionFactory().openSession();
		
		try
		{
		  for(Model.StudentOrSubject s:r)
		  {
			if(s.getObtainedMarks() != null)
			{
			session.beginTransaction();
			Query query = session.createSQLQuery("insert into studentresult(Marks,Rollno,SubjectId,Semester,Year) values (:ObtainedMarks,:RollNo, :SubjectId,"
					+ " :Semester ,:Year )");
			query.setParameter("ObtainedMarks",s.getObtainedMarks());
			query.setParameter("RollNo", ss.getStudent().getRollNo());
			query.setParameter("SubjectId", s.getSubjectId());
			query.setParameter("Semester", s.getSemester());
			query.setParameter("Year", (s.getSemester()+1)/2);
			
			query.executeUpdate();
			session.getTransaction().commit();
			
		   }
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
