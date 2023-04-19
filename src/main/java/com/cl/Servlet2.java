package com.cl;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet2 extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
		
		String email = req.getParameter("em");
		String pass = req.getParameter("ps");
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		RequestDispatcher rd =req.getRequestDispatcher("/Servlet1");
		out.print("welcome to Servlet2" +email+ " " +pass);
	}
}
