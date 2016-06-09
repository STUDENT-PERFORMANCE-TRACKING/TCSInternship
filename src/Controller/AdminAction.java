package Controller;

import org.hibernate.classic.Session;

public class AdminAction {
	
	public void addStudent(Model.Student student)
	{
		Session session = Database.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		session.load(student,1);
		session.getTransaction().commit();
	}

}
