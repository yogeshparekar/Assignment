package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//System.out.println("Welcome to Web Application");  //this output display on server console.
		
		response.setContentType("text/html");
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
	
		PrintWriter pw = response.getWriter();
//		if(name.equals("Yogesh") && pass.equals("123")) {
//			pw.println("Successfully Login");
//		} else {
//			pw.println("Failure try again");
//		}
	//JDBC code to check emailid and pass
		
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2 = request.getRequestDispatcher("index.html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database", "root", "Yogesh@01");
		PreparedStatement pstmt = con.prepareStatement("select * from login where emailid = ? and password = ?");
		pstmt.setString(1, emailid);
		pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				pw.println("Login SuccessFully");
				rd1.forward(request, response);		//we can see only output of target page.
				
			} else {
				pw.println("Invalid email or password");
				rd2.include(request, response); 	// we see source error msg+index page display is a one page.
			}
		} catch (Exception e) {
			pw.println(e);
		}
		//pw.println("<font color=red><h1>Welcome client to web application</h1></font>"+	name + pass);	//this output display 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
	
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher rd2 = request.getRequestDispatcher("index.html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database", "root", "Yogesh@01");
		PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?)");
		pstmt.setString(1, emailid);
		pstmt.setString(2, password);
			int res = pstmt.executeUpdate();
			if(res>0) {
				pw.println("Account Created Successfully");
				rd2.include(request, response);
			
			} 
		} catch (Exception e) {
			pw.println(e);
			rd2.include(request, response);
			
		}
	}

}
