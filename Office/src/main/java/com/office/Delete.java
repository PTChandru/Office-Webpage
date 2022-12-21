package com.office;

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

import com.mysql.cj.protocol.Resultset;

public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Id=request.getParameter("Id");
		try {
			PrintWriter pw=response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","140120C@");
			/*PreparedStatement ps=con.prepareStatement("select * from Database2");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
	    		pw.write("EName="+rs.getString("EName")+'\n' );
	    		pw.write("Phone="+rs.getString("Phone")+'\n' );
	    		pw.write("DOB="+rs.getString("DOB")+'\n' );
	    		pw.write("DateofJoin="+rs.getString("Dateofjoin")+'\n' );
	    		pw.write("ERole="+rs.getString("ERole") +'\n');
	    		pw.write("Password1="+rs.getString("Password1")+'\n');
	    		pw.write("ConfirmPassword1="+rs.getString("ConfirmPassword1")+'\n');
				
			}*/
			PreparedStatement pr=con.prepareStatement("delete from Database2 where Id=?");
			pr.setString(1, Id);
			if(true) {
				pr.executeUpdate();
				response.setContentType("text/html");
				pw.write("Successfully Deleted");
				RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
				rd.include(request, response);
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

}
 