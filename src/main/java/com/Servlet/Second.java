package com.Servlet;
import javax.servlet.*;
import java.io.*;

public class Second extends GenericServlet {

	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h1>this is my second servlet using generic servlet</h>");
	}
}
