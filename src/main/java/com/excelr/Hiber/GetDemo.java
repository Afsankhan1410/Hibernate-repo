package com.excelr.Hiber;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excelr.Hiber.entity.Student;

public class GetDemo {

		 public static void main( String[] args ) {
		    {
		    	Configuration cfg=new Configuration();
		    	cfg.configure("hibernate.cfg.xml");
		    	SessionFactory factory=cfg.buildSessionFactory();
		    	
		    	Session session1=factory.openSession();
		    	Transaction tx=session1.beginTransaction();
		    	
		    	Student student1=session1.get(Student.class,1);
		    	System.out.println(student1);
		    	
		    	Student student2=session1.get(Student.class,1);
		    	System.out.println(student2);
		    	
		    	Student student3=session1.get(Student.class,1);
		    	System.out.println(student3);
		    	
		    	System.out.println(student2==student3);
		    	System.out.println(student1==student3);


		    	session1.close();
		    	
		     } 
	}

}
