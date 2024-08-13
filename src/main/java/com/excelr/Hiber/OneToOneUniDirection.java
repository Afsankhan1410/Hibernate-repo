package com.excelr.Hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.excelr.Hiber.entity.ChiefMinister;
import com.excelr.Hiber.entity.State;

public class OneToOneUniDirection {


	public static void main(String[] args) {
		SessionFactory factory=MySessionFactory.getSessionFactory();
		
		Session session1=factory.openSession();
		Transaction tx=session1.beginTransaction();

		State s1=new State();
		s1.setSname("Maharashtra");
		s1.setCapcity("Mumbai");
		
		State s2=new State();
		s1.setSname("Rajasthan");
		s1.setCapcity("Jaipur");
		
		ChiefMinister c1=new ChiefMinister();
		c1.setCmname("Shinde");
		c1.setAge(57);
		
		ChiefMinister c2=new ChiefMinister();
		c2.setCmname("Sharma");
		c2.setAge(55);
		
//		s1.setChiefminister(c1);
//		s2.setChiefminister(c2);
		
		c1.setState(s1);
		c2.setState(s2);
		
		session1.save(s1);
		session1.save(s2);
		session1.save(c1);
		session1.save(c2);
		
		tx.commit();
		session1.close();

		
	}
}