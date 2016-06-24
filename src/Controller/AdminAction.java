package Controller;

import org.hibernate.classic.Session;

public class AdminAction {
	
	public String addStudentParent(Model.AdminStudentParentForm adminform)
	{
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		try
		{
			session.save(adminform.getParent());
			adminform.getStudent().setParentId(adminform.getParent().getParentId());
			session.save(adminform.getStudent());
			session.getTransaction().commit();
			
			return "inserted";
		}
		
		catch(Exception e)
		{
			session.getTransaction().rollback();
			new Model.Logging().error("Hibernate Exception", e.getMessage());
			e.printStackTrace();
			
			return "notinserted";
		}
		
		finally
		{
			session.close();
		}
	}
	
	public String addFaculty(Model.AdminStudentParentForm adminform)
	{
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		try
		{
			session.save(adminform.getFaculty());
			session.getTransaction().commit();
			
			return "inserted";
		}
		
		catch(Exception e)
		{
			session.getTransaction().rollback();
			new Model.Logging().error("Hibernate Exception", e.getMessage());
			e.printStackTrace();
			
			return "notinserted";
		}
		
		finally
		{
			session.close();
		}
	}


}
