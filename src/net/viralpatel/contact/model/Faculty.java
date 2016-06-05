package net.viralpatel.contact.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculty")
public class Faculty {
	
	private int FacultyId;
	private String FacultyName;
	private String EmailId;
	private String Password;
	
	@Id
	@GeneratedValue
	@Column(name="FacultyId")
	public int getFacultyId() {
		return FacultyId;
	}
	public void setFacultyId(int facultyId) {
		FacultyId = facultyId;
	}
	
	@Column(name="FacultyName")
	public String getFacultyName() {
		return FacultyName;
	}
	public void setFacultyName(String facultyName) {
		FacultyName = facultyName;
	}
	
	@Column(name="EmailId")
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	
	@Column(name="Password")
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	

}
