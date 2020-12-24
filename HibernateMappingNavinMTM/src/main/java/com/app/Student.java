package com.app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;


@Entity
public class Student {
	@Id
	private int rollNo;
	private String name;
	private int marks;
	
	@OneToMany(mappedBy="student")
	private List<Laptop> laptop =new ArrayList<Laptop>();
	
	/**
	 * @return the laptop
	 */
	public List<Laptop> getLaptop() {
		return laptop;
	}
	/**
	 * @param laptop the laptop to set
	 */
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
