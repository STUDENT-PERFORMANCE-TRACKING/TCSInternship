package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.opensymphony.xwork2.ActionSupport;

public class StudentParent extends ActionSupport
{

	public String createNew(Model.StudentParent sp)
	{
		
		PreparedStatement preparedstatement=null;
		PreparedStatement preparedstatementCheck=null;
		Connection connection = null;
	    Statement statement = null;
	    ResultSet resultset = null;
	    String  queryToInsert;
	    
		try 
		{
		    
			connection = MysqlDatabase.createConnection();
		    
			queryToInsert="insert into parents(ParentName, EmailId, Password) values(?,?,?)";
			
  	  		preparedstatement =(PreparedStatement)connection.prepareStatement(queryToInsert, Statement.RETURN_GENERATED_KEYS);	
  	  		preparedstatement.setString(1, sp.getParent().getParentName());
  	  		preparedstatement.setString(2, sp.getParent().getEmailId());
 	  		preparedstatement.setString(3, sp.getParent().getPassword());
 	  		
 	  		preparedstatement.executeUpdate();  
 	  		
 	  		ResultSet keys = preparedstatement.getGeneratedKeys();    
 	  		keys.next();  
 	  		int parentid = keys.getInt(1);
 	  		
 	  		preparedstatement=null;
 	  		
 	  		 		
 	  		
 	  		queryToInsert="insert into student(FirstName, LastName, EmailId, Password, ParentId, BranchId, RollNo) values(?,?,?,?,?,?,?)";
 	  		
  	  		preparedstatement =(PreparedStatement)connection.prepareStatement(queryToInsert, Statement.RETURN_GENERATED_KEYS);	
  
 	  		preparedstatement.setString(1, sp.getStudent().getFirstName());
 	  		preparedstatement.setString(2, sp.getStudent().getLastName());
 	  		preparedstatement.setString(3, sp.getStudent().getEmailId());
 	  		preparedstatement.setString(4, sp.getStudent().getPassword());
 	  		preparedstatement.setInt(5, parentid);
 	  		preparedstatement.setInt(6, sp.getStudent().getBranchId());
 	  		preparedstatement.setInt(7, sp.getStudent().getRollNo());
 	  		
 	  		preparedstatement.executeUpdate();
 	  		
 	  		return SUCCESS;

		}
		
		catch(Exception e)
		{
			 System.out.println(e.getMessage());
			 e.printStackTrace();
			 return ERROR;
		}
		/*
		
		Session session = Database.getSessionFactory().openSession();
		session.beginTransaction();
		
		
		
		try
		{
			session.save(sp.getParent());
			System.out.println("auto inc vzlue"+sp.getParent().getParentId());
			sp.getStudent().setParentId(sp.getParent().getParentId());
			sp.getStudent().setBranchId(1);
			session.save(sp.getStudent());
			session.getTransaction().commit();
			
			return "success";
		}
		
		catch(Exception exception)
		{   
			new Model.Logging().debug("Hibernate Exception", exception.toString());
			exception.printStackTrace();
			return "error";
		}
		
		finally
		{
			session.close();
			
		}
		*/
		
	}
	
}
