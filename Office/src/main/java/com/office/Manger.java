package com.office;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Manger extends HttpServlet {
	private static final long serialVersionUID = 1L;  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String s="Chandru";
		String s1="1401@";
		String Name=request.getParameter("Name");
		String Password=request.getParameter("Password");
		if(request.getParameter("Name").equals(s)&&request.getParameter("Password").equals(s1)) {
			RequestDispatcher rd=request.getRequestDispatcher("Manager1.jsp");
			rd.include(request, response);
		}
		else {
			PrintWriter pw=response.getWriter();
			pw.write("invalid Password or Name");
		}
	}

}
