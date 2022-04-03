package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session =sf.openSession();
		Transaction tran = session.getTransaction();
		
		//Trainer record Insert
//		Trainer t = new Trainer();
//		t.setTid(2);
//		t.setTname("Raju");
//		t.setTech("Python");
//		tran.begin();
//			session.save(t);
//		tran.commit();
//		System.out.println("Trainer Recoded Saved...");
	
		//Student record Insert
//		Student s = new Student();
//		s.setSid(103);
//		s.setSname("Nikhil");
//		s.setAge(25);
//		s.setTsid(2);
//		tran.begin();
//			session.save(s);
//		tran.commit();
//		System.out.println("Student Record Saved..");

		//Trainer added with Student
//		Trainer t = new Trainer();
//		t.setTid(5);
//		t.setTname("Anvesh");
//		t.setTech("Testing");
//		
//		List<Student> listOfStd = new ArrayList<>();
//		Student s1 = new Student(104,"Shejal",26,4);
//		Student s2 = new Student(105,"Sagar",27,4);
//		
//		listOfStd.add(s1);
//		listOfStd.add(s2);
//		
//		t.setListOfStudent(listOfStd);
//		tran.begin();
//			session.save(t); 	//only save trainer
//		tran.commit();
//		System.out.println("Trainer Recoded Saved...");
	
		//join using sql
		Query qry = session.createNativeQuery("select t.tname,t.tech,s.sname from trainer t inner join studnet s on t.tid=s.tsid");
		List<Object[]> list = qry.list();
		Iterator<Object[]>li = list.iterator();
		while(li.hasNext()) {
			Object obj[] = li.next();
			System.out.println("Trainer name "+obj[0]+"Tech "+obj[1]+"Student Name "+obj[2]);
		}
	}

}
