package com.cl;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
		
		String email = req.getParameter("em");
		String pass = req.getParameter("ps");
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		RequestDispatcher rd =req.getRequestDispatcher("/Servlet2");
		out.println("welcome to Servlet1" +email+ " " +pass);
		out.println("<a href = 'Servlet2'> Servlet2 </a>");
	}
}