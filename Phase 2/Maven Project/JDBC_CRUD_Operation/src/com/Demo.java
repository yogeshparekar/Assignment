package com;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded sucessfully");
		} catch(Exception e) {
			System.out.println(e);

		}
	}

}
