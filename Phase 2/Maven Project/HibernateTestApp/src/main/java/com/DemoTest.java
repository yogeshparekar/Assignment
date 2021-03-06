package com;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		System.out.println("File Loaded Succesfully");
		
		//load the driver, connected the database
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		
		//Insert Operation
//		Employee emp = new Employee();
//		emp.setId(6);
//		emp.setName("Mahesh");
//		emp.setSalary(25000);
//		tran.begin();
//			session.save(emp);		//insert query
//		tran.commit();
//		System.out.println("Recoded Inserted Successfully");
//		
		//Delete Opearion
//	Employee emp =session.get(Employee.class, 1); 
//	if(emp==null) {
//		System.out.println("Record not found");
//	}else {
//		tran.begin();
//			session.delete(emp);
//		tran.commit();
//		System.out.println("Record deleted succesfully");
//	}
		
		//Update Recoded
//		Employee emp =session.get(Employee.class, 2); 
//		if(emp==null) {
//			System.out.println("Record not found");
//		}else {
//			tran.begin();
//				emp.setSalary(30000);
//				session.update(emp);
//			tran.commit();
//			System.out.println("Record Updated succesfully");
//		}	 	
	
		//Retrieve all or more than one records
		Query qry = session.createQuery("select emp from Employee emp");
		List<Employee> listOfEmp = qry.list();
		System.out.println("Number of records are "+listOfEmp.size());
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			System.out.println(emp);
		}
		
	}

}
