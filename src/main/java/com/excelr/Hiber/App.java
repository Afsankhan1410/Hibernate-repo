package com.excelr.Hiber;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.excelr.Hiber.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session1=factory.openSession();
    	Transaction tx=session1.beginTransaction();
    	ArrayList<Student> students=new ArrayList();
    	students.add(new Student("Alice",78.5,"alice@gmail.com"));
    	students.add(new Student("Ben",88.5,"ben@gmail.com"));
    	students.add(new Student("Chris",98.5,"chris@gmail.com"));

    	for(Student s:students)
    		session1.save(s);
    	
    	tx.commit();
    	System.out.println("Record Inserted");
    	session1.close();
     } 
}

 