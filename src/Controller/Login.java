package Controller;

import java.util.ArrayList;
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
	
	
	public ArrayList<String> getStudentNames(Model.Parent parent)
	{
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		ArrayList<String> StudentNames=new ArrayList<String>(); 
		
		System.out.println(" parent'"+parent.toString());
		
		Query query = session.createSQLQuery("select FirstName,LastName  from student where ParentId= :parentId");
		query.setParameter("parentId",parent.getParentId());

		List<Object[]> obj= query.list();
		
		session.getTransaction().commit();
		   for(Object[] row : obj)
		    {
				
		    	System.out.println(row[0]+" " +row[1]);
	           
		    	String studentname=row[0]+" ";
		    	if(row[1]!=null)
		    		studentname=studentname+row[1];
		    	    	
		    	StudentNames.add(studentname);	    	
		    			
		    }
        
        return StudentNames;
		
	}
	
	

}
