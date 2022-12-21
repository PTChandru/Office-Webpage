package com.office;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Manage1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter pw=response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","140120C@");
			PreparedStatement ps=con.prepareStatement("select * from Database2");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				pw.write("Id=" +rs.getString("Id")+'\n' );
	    		pw.write("EName="+rs.getString("EName")+'\n' );
	    		pw.write("Phone="+rs.getString("Phone")+'\n' );
	    		pw.write("DOB="+rs.getString("DOB")+'\n' );
	    		pw.write("DateofJoin="+rs.getString("Dateofjoin")+'\n' );
	    		pw.write("ERole="+rs.getString("ERole") +'\n');
	    		pw.write("\n");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
