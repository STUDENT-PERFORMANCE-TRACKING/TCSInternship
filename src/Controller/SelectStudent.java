package Controller;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.classic.Session;

public class SelectStudent 
{
	ArrayList<Model.StudentOrSubject> r;	

	public ArrayList<Model.StudentOrSubject> sf2(Model.StudentOrSubject s)
	{
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		System.out.println("semseter : "+s.getResult().getSemesterFirst());
		
		Query query = session.createSQLQuery("SELECT Subjectname , subjectid FROM student_performance_tracking.`subject` where semester=:SemesterFirst");
		query.setParameter("SemesterFirst",s.getResult().getSemesterFirst());
		r=new ArrayList<Model.StudentOrSubject>();
		List<Object[]> row=query.list();
		for(Object[] i : row)
		{
			s =new Model.StudentOrSubject();
			s.setStudentSubject((String) i[0]);
			s.setSubjectId((int) i[1]);
			
			r.add(s);
		}
		System.out.println(r.size());
		
		
		return r;
		
	}

	
	

	public ArrayList<Model.StudentOrSubject> getR() {
		return r;
	}


	public void setR(ArrayList<Model.StudentOrSubject> r) {
		this.r = r;
	}

	
	
}
