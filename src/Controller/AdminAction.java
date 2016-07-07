package Controller;

import org.hibernate.Query;
import org.hibernate.classic.Session;

public class AdminAction {
	
	public String addStudentParent(Model.AdminStudentParentForm adminform)
	{
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		try
		{
			int t=new Controller.AdminAction().getParentId(adminform.getParent());
			if(t == -1)
			{
				session.save(adminform.getParent());	
				adminform.getStudent().setParentId(adminform.getParent().getParentId());
			}
			
			else
				adminform.getStudent().setParentId(t);
				
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
	
	public int getParentId(Model.Parent parent )
	{ 
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		Model.Parent Parent = null;
				
		String hql = "FROM Parent  WHERE EmailId = :EmailId ";
		
		Query query = session.createQuery(hql);
		query.setParameter("EmailId",parent.getEmailId());
		
		try
		{
			Parent = (Model.Parent)query.uniqueResult();
			session.getTransaction().commit();
		}
		
		catch(Exception exception)
		{   
			new Model.Logging().debug("Hibernate Exception", exception.getMessage());
		
		}
		
		finally
		{
			session.close();
			
			if(Parent == null)
				return -1;
			else
				return (Parent.getParentId());
				
		}
		
	
	}


}
