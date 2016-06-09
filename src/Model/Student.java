package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	private int Rollno;
	private int BranchId;
	private int ParentId;
	private String FirstName;
	private String LastName;
	private String Password;
	private String EmailId;
		
	
	@Id
	@GeneratedValue
	@Column(name="RollNo")
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	
	@Column(name="BranchId")
	public int getBranchId() {
		return BranchId;
	}
	public void setBranchId(int branchId) {
		BranchId = branchId;
	}
	
	@Column(name="ParentId")
	public int getParentId() {
		return ParentId;
	}
	public void setParentId(int parentId) {
		ParentId = parentId;
	}
	
	@Column(name="FirstName")
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	@Column(name="LastName")
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	@Column(name="Password")
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	@Column(name="EmailId")
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	
	
}
