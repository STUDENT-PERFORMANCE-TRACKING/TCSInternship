package Controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;

public class ParentStudentSelection {
	
	public ArrayList<String> getStudentNames(Model.Parent parent)
	{
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		ArrayList<String> StudentName=new ArrayList<String>(); 
		
		Query query = session.createSQLQuery("select FirstName,LastName  from Student where ParentId= :parentId");
		query.setParameter("parentId",parent.getParentId());

		StudentName=(ArrayList<String>) query.list();
		
		session.getTransaction().commit();
        for(String Student : StudentName)
	    {
			
	    	System.out.println(" parent's student name"+Student);
	    			
	    }
        
        return StudentName;
		
	}
	
	public Model.Student getStudent(String StudentName,int ParentId)
	{
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		Model.Student Student = null;
		String name=StudentName.substring(0, StudentName.indexOf(" "));
		
		
		String hql = "FROM Student  WHERE FirstName = :name AND ParentId= :ParentId";
		
		Query query = session.createQuery(hql);
		query.setParameter("name",name);
		query.setParameter("ParentId",ParentId);
		
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

}
