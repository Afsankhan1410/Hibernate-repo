package com.excelr.Hiber;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.excelr.Hiber.entity.Dept;
import com.excelr.Hiber.entity.Employee;

public class FetchTypeDemo {

	public static void main(String[] args) {
		SessionFactory factory=MySessionFactory.getSessionFactory();
		
		Session session1=factory.openSession();
		Transaction tx=session1.beginTransaction();
	
		Dept dept=session1.get(Dept.class,1);
		System.out.println("hii");
		
		List<Employee> emps=dept.getEmployees();
		for(Employee e:emps)
			System.out.println(e.getEname());
		

		
		
		session1.close();
		}
	
}