package com.office;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String Id=req.getParameter("Id");
		String Password1=req.getParameter("Password1");
		try {
			PrintWriter pw=res.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","140120C@");
		    PreparedStatement ps=con.prepareStatement("select * from Database2 where Id=? and Password1=?");
		    ps.setString(1, Id);
		    ps.setString(2, Password1);
		    ResultSet rs= ps.executeQuery();
		    while(rs.next()) {
		    	if(rs.getString("Id").equals(Id)&&rs.getString("Password1").equals(Password1)) {
		    		RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
		    		rd.include(req, res);
		    		pw.write("Id=" +rs.getString("Id")+'\n' );
		    		pw.write("EName="+rs.getString("EName")+'\n' );
		    		pw.write("Phone="+rs.getString("Phone")+'\n' );
		    		pw.write("DOB="+rs.getString("DOB")+'\n' );
		    		pw.write("DateofJoin="+rs.getString("Dateofjoin")+'\n' );
		    		pw.write("ERole="+rs.getString("ERole") +'\n');
		    		break;
		    
		    		
		    	}
		    }
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
