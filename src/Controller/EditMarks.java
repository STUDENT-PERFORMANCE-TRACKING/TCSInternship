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
			Query query = session.createSQLQuery("update studentresult set marks=:ObtainedMarks where rollno=:RollNo and subjectid=:SubjectId");
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

}