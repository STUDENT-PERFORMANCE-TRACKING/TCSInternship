package Controller;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.classic.Session;


public class Login 
{
	
	public List<Model.Student> checkStudentLoginCredential(Model.Login login)
	{ 
		Session session = Database.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		List<Model.Student> student = null;
		Model.Student a= new Model.Student();
		
		String hql = "FROM Student  WHERE EmailId = :EmailId AND Password= :Password";
		
		Query query = session.createQuery(hql);
		query.setParameter("EmailId",login.getEmailId());
		query.setParameter("Password",login.getPassword());
		student = (List<Model.Student>)query.list();
		session.getTransaction().commit();
		
		System.out.println("sdfghjk-----------"+student.size());
		
		return student; 
	
	}
	
	

}
