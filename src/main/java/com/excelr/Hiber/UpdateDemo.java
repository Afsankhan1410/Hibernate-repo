package com.excelr.Hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.excelr.Hiber.entity.Student;

public class UpdateDemo {
	
	
	public static void main(String[] args) {

	SessionFactory factory=MySessionFactory.getSessionFactory();
	Session session1=factory.openSession();
	Transaction tx=session1.beginTransaction();
	
	Student student1=session1.get(Student.class, 1);
	
	student1.setRno(77);
	student1.setSname("Tom");
	student1.setPer(99.7);
//	session1.save(student1);
	tx.commit();
	}
}