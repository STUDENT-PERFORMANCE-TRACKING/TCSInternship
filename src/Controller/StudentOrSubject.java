package Controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.opensymphony.xwork2.ModelDriven;

public class StudentOrSubject 
{
	ArrayList<Integer> StudentRollNo;
	
	public ArrayList<Integer> sf1(Model.StudentOrSubject s)
	{
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		StudentRollNo=new ArrayList<Integer>(); 
		
		Query query = session.createSQLQuery("select RollNo from student where BranchId=:branchId");
		query.setParameter("branchId",s.getStudent().getBranchId());
		StudentRollNo=(ArrayList<Integer>) query.list();
				
		return StudentRollNo;
	}
	
	
	public ArrayList<Integer> getStudentRollNo() {
		return StudentRollNo;
	}
	
	public void setStudentRollNo(ArrayList<Integer> studentRollNo) {
		StudentRollNo = studentRollNo;
	}

}
