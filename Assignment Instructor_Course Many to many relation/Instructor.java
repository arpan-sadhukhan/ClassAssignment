package com.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Instructor {

	@Id
	private int instId;
	private String instName;
	@ManyToMany
	private List<Course> course;
	public int getInstId() {
		return instId;
	}
	public void setInstId(int instId) {
		this.instId = instId;
	}
	public String getInstName() {
		return instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public Instructor(int instId, String instName, List<Course> course) {
		super();
		this.instId = instId;
		this.instName = instName;
		this.course = course;
	}
	public Instructor() {
		super();
		
	}
	
}
