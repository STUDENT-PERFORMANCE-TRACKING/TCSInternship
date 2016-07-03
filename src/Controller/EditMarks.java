package Controller;

import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.classic.Session;

public class EditMarks 
{
	public void save(ArrayList<Model.StudentOrSubject> r)
	{
		
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		Query query = session.createSQLQuery("select RollNo from Student where BranchId=:branchId");
		query.setParameter("branchId","jhfh");
				
	}

}
