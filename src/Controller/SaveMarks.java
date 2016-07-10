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
				("update studentresult set Marks=:newMarks where RollNo=:RollNo and SubjectId="
			 + "(select SubjectId from subject where SubjectName=:name)");
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
		
		//System.out.println("e size in Controller.SaveMarks"+r.size()+"   subject name="+r.get(0).getStudentSubject());
		new Controller.SaveMarks().getSubjectSemester(r);
		
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
				query.setParameter("SubjectId", r.get(0).getSubjectId());
				query.setParameter("Semester", r.get(0).getSemester());
				query.setParameter("Year", ( r.get(0).getSemester()+1)/2);
				
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
	
	
	public void getSubjectSemester(ArrayList<Model.StudentOrSubject> r)
	{

		Session session = Database.getSessionFactory().openSession();
		
		try
		{
				session.beginTransaction();
				Query query = session.createSQLQuery(" Select Semester ,SubjectId from subject where  SubjectName=:subjectname ");
				query.setParameter("subjectname",r.get(0).getStudentSubject());
				
				List<Object[]> r1=query.list();
				session.getTransaction().commit();
				
				for(Object[] m:r1)
				{
				   r.get(0).setSemester((int) m[0]);
				   r.get(0).setSubjectId((int) m[1]);
				}
		
		}  
			
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
			
		finally
		{
			session.close();
		}
		
	}

}
