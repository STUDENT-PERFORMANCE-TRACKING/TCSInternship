package Controller;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.hibernate.PropertyAccessException;

public class Login 
{
	
	
	public Model.Student studentLogin(Model.Login login)
	{ 
		
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		Model.Student Student = null;
		
		String hql = "FROM Student  WHERE EmailId = :EmailId AND Password= :Password";
		
		Query query = session.createQuery(hql);
		query.setParameter("EmailId",login.getEmailId());
		query.setParameter("Password",login.getPassword());
		
		try
		{
			Student = (Model.Student)query.uniqueResult();
			session.getTransaction().commit();
		}
		
		catch(Exception exception)
		{   
			new Model.Logging().debug("Hibernate Exception", exception.getMessage());
			return Student;  
		}
		
		finally
		{
			session.close();
			return Student; 
		}
		
		
	
	}
	
	
	
	public Model.Parent parentLogin(Model.Login login)
	{ 
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		Model.Parent Parent = null;
				
		String hql = "FROM Parent  WHERE EmailId = :EmailId AND Password= :Password";
		
		Query query = session.createQuery(hql);
		query.setParameter("EmailId",login.getEmailId());
		query.setParameter("Password",login.getPassword());
		
		try
		{
			Parent = (Model.Parent)query.uniqueResult();
			session.getTransaction().commit();
		}
		
		catch(Exception exception)
		{   
			new Model.Logging().debug("Hibernate Exception", exception.getMessage());
			return Parent;  
		}
		
		finally
		{
			session.close();
			return Parent; 
		}
		
	
	}
	
	
	public Model.Faculty facultyLogin(Model.Login login)
	{ 
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		Model.Faculty Faculty = null;
		Model.Faculty a= new Model.Faculty();
		
		String hql = "FROM Faculty  WHERE EmailId = :EmailId AND Password= :Password";
		
		Query query = session.createQuery(hql);
		query.setParameter("EmailId",login.getEmailId());
		query.setParameter("Password",login.getPassword());
		
		try
		{
			Faculty = (Model.Faculty)query.uniqueResult();
			session.getTransaction().commit();
		}
		
		catch(Exception exception)
		{   
			new Model.Logging().debug("Hibernate Exception", exception.getMessage());
			return Faculty;  
		}
		
		finally
		{
			session.close();
			return Faculty; 
		}
		
		
	}
	
	

}
