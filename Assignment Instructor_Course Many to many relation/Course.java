package com.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	
	@Id
	private int cId;
	private String cName;
	@ManyToMany
	private List<Instructor> instructor;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public List<Instructor> getInstructor() {
		return instructor;
	}
	public void setInstructor(List<Instructor> instructor) {
		this.instructor = instructor;
	}
	public Course(int cId, String cName, List<Instructor> instructor) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.instructor = instructor;
	}
	public Course() {
		super();
		
	}
	

}
