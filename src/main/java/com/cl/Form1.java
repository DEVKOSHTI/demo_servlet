package com.cl;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Form1 extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		String name=req.getParameter("nm");
		resp.setContentType("text/html");
		RequestDispatcher rd = req.getRequestDispatcher("/Form2");
		
		PrintWriter out = resp.getWriter();
		out.println("Hello "+name+",welcome to my website");
		out.println("<h1><a href ='Form2'>Go to Servlet2 </a></h1>");
		
		Cookie c = new Cookie("uname",name);
		resp.addCookie(c);
//		out.println("<form action='Form2'><input type='hidden' name='user' value='"+name+"'><button type='submit'>Form2</button></form>");
	}
}
