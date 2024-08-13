package com.excelr.Hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.excelr.Hiber.entity.Dept;

public class CascadeTypeDemo {


	public static void main(String[] args) {
		SessionFactory factory=MySessionFactory.getSessionFactory();
		
		Session session1=factory.openSession();
		Transaction tx=session1.beginTransaction();
	
		Dept dept=session1.get(Dept.class,2);
		session1.remove(dept);
	
		tx.commit();
		session1.close();
		}
	
}