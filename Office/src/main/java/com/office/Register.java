package com.office;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    String Id=req.getParameter("Id");
    String EName=req.getParameter("EName");
    String Phone=req.getParameter("Phone");
    String DOB=req.getParameter("DOB");
    String Dateofjoin=req.getParameter("Dateofjoin");
    String ERole=req.getParameter("ERole");
    String Password1=req.getParameter("Password1");
    String ConfirmPassword=req.getParameter("ConfirmPassword");
   
    
    try {
    	PrintWriter pw=res.getWriter();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","140120C@");
        PreparedStatement ps=con.prepareStatement("insert into Database2 values(?,?,?,?,?,?,?,?)");
       ps.setString(1, Id );
       ps.setString(2, EName );
       ps.setString(3, Phone );
       ps.setString(4, DOB);
       ps.setString(5, Dateofjoin );
       ps.setString(6, ERole );
       ps.setString(7, Password1 );
       ps.setString(8, ConfirmPassword );
       if(true) {
       ps.executeUpdate();
       res.setContentType("text/html");
       pw.write("Succesfully Registerd");
       RequestDispatcher rd=req.getRequestDispatcher("Register.jsp");
       rd.include(req, res);
       }
        
    } catch (Exception e) {
		e.printStackTrace();
	}
	

}
}
