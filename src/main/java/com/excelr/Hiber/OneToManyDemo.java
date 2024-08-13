package com.excelr.Hiber;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.excelr.Hiber.entity.Dept;
import com.excelr.Hiber.entity.Employee;

public class OneToManyDemo {


	public static void main(String[] args) {
		SessionFactory factory=MySessionFactory.getSessionFactory();
		
		Session session1=factory.openSession();
		Transaction tx=session1.beginTransaction();

		
		Dept d1=new Dept()	;
		d1.setDname("IT");
		d1.setCity("Pune");
		
		Dept d2=new Dept();
		d2.setDname("Robotics");
		d2.setCity("Delhi");
		
		Employee e1=new Employee();
		e1.setEname("Alice");
		e1.setSal(800);
		e1.setDept(d1);
		
		Employee e2=new Employee();
		e2.setEname("Ben");
		e2.setSal(900);
		e2.setDept(d1);
		
		Employee e3=new Employee();
		e3.setEname("Chris");
		e3.setSal(1000);
		e3.setDept(d2);
		
		
		Employee e4=new Employee();
		e4.setEname("David");
		e4.setSal(700);
		e4.setDept(d2);
		
		List<Employee> itEmployees=new ArrayList();
		itEmployees.add(e1);
		itEmployees.add(e2);
		
		List<Employee> roboEmployees=new ArrayList();
		roboEmployees.add(e3);
		roboEmployees.add(e4);
		
		d1.setEmployees(itEmployees);
		d2.setEmployees(roboEmployees);
		
		session1.save(d1);
		session1.save(d2);
		session1.save(e1);
		session1.save(e2);
		session1.save(e3);
		session1.save(e4);

		tx.commit();
		
	session1.close();
		
	}
}
