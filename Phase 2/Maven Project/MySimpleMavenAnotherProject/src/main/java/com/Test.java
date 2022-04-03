package com;

import java.sql.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded sucessfully");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database", "root", "Yogesh@01");
			System.out.println("Database connected....");
		
		Statement stmt = con.createStatement();
		//Insert Records 
//		int res = stmt.executeUpdate("insert into employee values(1,'Yogesh',26000),(2,'Vikas',30000),(3,'Mahesh',24000),(4,'Nikhil',24000)");
//		if(res>0) {
//			System.out.println("Record inserted successfully");
//		}
			
		//Delete Records
//		int res = stmt.executeUpdate("delete from employee where id=5");
//		if(res>0) {
//			System.out.println("Record deleted successfully...");
//		} else {
//			System.out.println("Record Not Present...");
//		}
		
		//Update Records
//		int res = stmt.executeUpdate("Update employee set salary = 25000 where id=4");
//		if(res>0) {
//		System.out.println("Record updated successfully...");
//		} else {
//		System.out.println("Record Not Present...");
//		}
		
		//Retrieve Query
		ResultSet rs =stmt.executeQuery("Select * from employee");
		while(rs.next()) {
			System.out.println("id is "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
		}
		
		} catch(Exception e) {
			System.out.println(e);

		}
	}

}
