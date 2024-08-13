package com.excelr.Hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.excelr.Hiber.entity.Student;

public class RemoveDemo {

	public static void main(String[] args) {
	SessionFactory factory=MySessionFactory.getSessionFactory();
	Session session1=factory.openSession();
	Transaction tx=session1.beginTransaction();
	
	Student student1=session1.get(Student.class,2);
	session1.remove(student1);
	tx.commit();
	System.out.println(student1);
	session1.close();
	
}

}