package Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

public class StudentResultView {

	
	public ArrayList<Model.StudentResultView> getStudentResultView(int rollno, int semester)
	{  
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		 
		ArrayList<Model.StudentResultView> studentresultview =new ArrayList<Model.StudentResultView>();
		
		Query query = session.createSQLQuery("select  s.Marks , a.SubjectName ,a.MaximumMarks from StudentResult s, Subject a "
				+ "where a.SubjectId=s.SubjectId "
				+ "and s.RollNo=:rollno and a.Semester= :semester and s.Visible=1 ");
		query.setParameter("rollno",rollno);
		query.setParameter("semester",semester);
	    
		List<Object[]> rows = query.list();
		
		session.getTransaction().commit();

	    Model.StudentResultView studentresult;
	    for(Object[] row : rows)
	    {
			
	    	System.out.println(row[0]+" " +row[1] +" "+row[2]);
           
	    	studentresult= new Model.StudentResultView();	
	    	studentresult.setObtainedMarks((int) row[0]);
	    	studentresult.setSubjectName((String) row[1]);
	    	studentresult.setMaximumMarks((int) row[2]);
	    	    	
	    	studentresultview.add(studentresult);	    	
	    			
	    }
	    	
	    session.close();
	    return studentresultview;
	
	}
	
	
	
	
	
	public String getParentName(int RollNo)
	{ 
		
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		 
		Query query = session.createSQLQuery("select  ParentName from Parents where ParentId= (select ParentId from student "
				+ " where RollNo= :rollno)");
		query.setParameter("rollno",RollNo);
		Object row = query.uniqueResult();
		session.getTransaction().commit();
        
		String ParentName= row.toString();
		System.out.println(" 111111111"+ParentName);
		
		session.close();
		return ParentName;
	}
	
	
	
	
   public int getTotalMarks(ArrayList<Model.StudentResultView> studentresultview)	
   
   {  
	   int TotalMarks=0;
	   
	   for(Model.StudentResultView studentresult:studentresultview)
	   {
		   TotalMarks+=studentresult.getObtainedMarks();
	   }
      
	   return TotalMarks;
   }
   
   
public int getMaximumMarks(ArrayList<Model.StudentResultView> studentresultview)	
   
   {  
	   int MaximumMarks=0;
	   
	   for(Model.StudentResultView studentresult:studentresultview)
	   {
		   MaximumMarks+=studentresult.getMaximumMarks();
	   }
      
	   return MaximumMarks;
   }
	
}
