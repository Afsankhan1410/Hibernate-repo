package com.excelr.Hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.excelr.Hiber.entity.Student;

public class SecondLevelCacheDemo {

	 public static void main( String[] args ) {
	  
	    	Configuration cfg=new Configuration();
	    	cfg.configure("hibernate.cfg.xml");
	    	SessionFactory factory=cfg.buildSessionFactory();
	    	
	    	Session session1=factory.openSession();
	    	Student studentofSession1= session1.get(Student.class,1);

	    	
	    	
	    	Session session2=factory.openSession();
	    	Student studentofSession2= session2.get(Student.class,1);
	    	
	    	session1.close();
	    	session2.close();
	 
	
	 }

}