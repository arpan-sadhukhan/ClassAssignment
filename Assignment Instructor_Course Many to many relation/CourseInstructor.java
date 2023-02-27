package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CourseInstructor {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Instructor i1=new Instructor();
		Instructor i2=new Instructor();
		Instructor i3=new Instructor();
		
		i1.setInstId(101);
		i2.setInstId(102);
		i3.setInstId(103);
		
		i1.setInstName("Arpan");
		i2.setInstName("Arpita");
		i3.setInstName("abcd");
		
		Course c1=new Course();
		Course c2=new Course();
		Course c3=new Course();
		Course c4=new Course();
		
		c1.setcId(11);
		c2.setcId(12);
		c3.setcId(13);
		c4.setcId(14);
		
		c1.setcName("java"); 
		c2.setcName("python"); 
		c3.setcName("c"); 
		c4.setcName("c++");
		
		List<Course> list1=new ArrayList<>();
		List<Course> list2=new ArrayList<>();
		List<Course> list3=new ArrayList<>();
		
		list1.add(c1);
		list1.add(c2);
		
		list2.add(c3);
		list2.add(c4);
		
		list3.add(c2);
		list3.add(c3);
		
		i1.setCourse(list1);
		i2.setCourse(list2);
		i3.setCourse(list3);
		
		session.save(i1);
		session.save(i2);
		session.save(i3);
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		
		tx.commit();
		session.close();
		factory.close();		

	}

}
