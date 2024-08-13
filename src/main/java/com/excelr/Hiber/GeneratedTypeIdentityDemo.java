package com.excelr.Hiber;


import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.excelr.Hiber.entity.Student;

public class GeneratedTypeIdentityDemo {

	public static void main(String[] args) {
		SessionFactory factory=MySessionFactory.getSessionFactory();
		
		Session session1=factory.openSession();
		Transaction tx=session1.beginTransaction();
		
		ArrayList<Student> students=new ArrayList();
		//students.add(new Student("Frank", 78.5,"aaa@gmail.com"));
		students.add(new Student("JackSparr", 88.5,"ggg43@gmail.com"));

		for(Student s:students)
			session1.save(s);
		
		tx.commit();
		System.out.println("Records Inserted");
		
		session1.close();
		

	}

}
