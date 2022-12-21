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

public class update extends HttpServlet {
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
			    PreparedStatement ps=con.prepareStatement("update Database2 set EName=?,Phone=?,DOB=?,Dateofjoin=?,ERole=?,Password1=?,ConfirmPassword=? where Id=?");
			       ps.setString(8, Id);
			       ps.setString(1, EName );
			       ps.setString(2, Phone );
			       ps.setString(3, DOB);
			       ps.setString(4, Dateofjoin );
			       ps.setString(5, ERole );
			       ps.setString(6, Password1 );
			       ps.setString(7, ConfirmPassword );
			       if(true) {
			       ps.executeUpdate();
			       res.setContentType("text/html");
			       pw.write("Succesfully Updated");
			       RequestDispatcher rd=req.getRequestDispatcher("update.jsp");
			       rd.include(req, res);
			       }
		    } catch (Exception  e) {
				e.printStackTrace();
			}
		   
	}

}
