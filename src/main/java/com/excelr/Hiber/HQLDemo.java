package com.excelr.Hiber;

import java.util.List;
import java.util.Scanner;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.excelr.Hiber.entity.Student;

public class HQLDemo {


	public static void main(String[] args) {
		SessionFactory factory=MySessionFactory.getSessionFactory();
		
		Session session1=factory.openSession();
		Transaction tx=session1.beginTransaction();
		
//		HQL Query Query address the entity by its classname "capital"
//		SQL QUERY SQLQuery address the entity by its tablename "ignore capital"
		
//		Query q1=session1.createQuery("from Student"); //select * from student
//		List<Student> students=q1.list();
//		
//		for(Student s:students)
//			System.out.println(s.getSname());
		
//		Query q1=session1.createQuery("from Student where rno=2");
//		q1.setCacheable(true);
//		Student student=(Student)q1.uniqueResult();
//		Student student2=(Student)q1.uniqueResult();
//		System.out.println(student.getSname());
//		System.out.println(student2.getSname());
	
//	
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter rno");
//		int rno=sc.nextInt();
//		
//		Query q1=session1.createQuery("from Student where rno= :x");
//		q1.setParameter("x", rno);
//		Student student=(Student)q1.uniqueResult();
//		System.out.println(student);

//		
//		Query q1=session1.createQuery("Select sname,per from Student");
//		List<Object[]> students=q1.list();
//		
//		for(Object[] student:students)
//		{
//		System.out.println(student[0]+" "+student[1]);
//
//		}

		SQLQuery q1=session1.createSQLQuery("Select * from Hiber where rollno=1");
		q1.addEntity(Student.class);
//		List<Student> students=q1.list();
		Student student=(Student)q1.uniqueResult();
		System.out.println(student);
		

		
	
	}
}