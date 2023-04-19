package com.cl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class Form2  extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
//		String username = req.getParameter("name");
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		Cookie[] cookies=req.getCookies();
		
		boolean f=false;
		String name="";
		
		if(cookies==null) {
			out.println("<h1>you are new usre go to home page and submit your name</h1>");
			return;
		}else {
			for(Cookie c:cookies)
			{
				String tname=c.getName();
				if(tname.equals("uname")) {
					f=true;
					name = c.getValue();
					
				}
			}
		}
		if(f) {
			out.print("hello " +name+",welcome back to my website");
			out.println("<br>thank you");
		}else {
			out.println("<h1>you are new usre go to home page and submit your name</h1>");
		}
	

		
//		out.print("UserName = " +username);
	}
}