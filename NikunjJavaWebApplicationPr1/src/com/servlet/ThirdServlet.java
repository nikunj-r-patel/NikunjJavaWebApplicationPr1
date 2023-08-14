package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class ThirdServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("this is Servlet using Generic Servlet ");
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		out.println("<h1>This is my third servlet</h1>");
		out.println("<h1>In generic servlet we have to over ride only service()</h1>");
		out.println("<h1>todays Date and time are:"+new Date() +"</h1>");	
	}
}
