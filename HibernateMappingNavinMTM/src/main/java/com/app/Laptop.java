package com.app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lId;
	private String lName;
	
	@ManyToOne
	private Student student;
	

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	/**
	 * @return the lId
	 */
	public int getlId() {
		return lId;
	}
	/**
	 * @param lId the lId to set
	 */
	public void setlId(int lId) {
		this.lId = lId;
	}
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	

}
