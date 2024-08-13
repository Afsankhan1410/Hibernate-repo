package com.excelr.Hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.excelr.Hiber.entity.Student;

public class LoadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=MySessionFactory.getSessionFactory();
		Session session1=factory.openSession();
		Transaction tx=session1.beginTransaction();
		
		Student student1=session1.get(Student.class,1);
    	System.out.println(student1.getPer());

		Student student2=session1.get(Student.class,1);
    	System.out.println(student2.getSname());
    	
    	System.out.println(student1==student2);

	}

}
