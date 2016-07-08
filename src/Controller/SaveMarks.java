package Controller;

import java.util.ArrayList;
import java.util.List;

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
	
	
	public String saveSubjectResult(ArrayList<Model.StudentOrSubject> r)
	{

		Session session = Database.getSessionFactory().openSession();
		
		System.out.println("e size in Controller.SaveMarks"+r.size()+"   subjectid"+r.get(0).getSubjectId());
		int sem= new Controller.SaveMarks().getSubjectSemester(r.get(0).getSubjectId());
		
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
				query.setParameter("RollNo", s.getRollNo());
				query.setParameter("SubjectId", s.getSubjectId());
				query.setParameter("Semester", sem);
				query.setParameter("Year", (sem+1)/2);
				
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
	
	
	public int getSubjectSemester(int subjectid)
	{

		Session session = Database.getSessionFactory().openSession();
		int sem;
		
		try
		{
				session.beginTransaction();
				Query query = session.createSQLQuery(" Select Semester from subject where  SubjectId=:subjectid ");
				query.setParameter("subjectid",subjectid);
				
				Object r=query.uniqueResult();
				session.getTransaction().commit();
				
				sem=(int)r;
				
			   
			  
		  
		  return sem;
		  
		}  
			
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return -1;
		}
			
		finally
		{
			session.close();
		}
		
	}

}
