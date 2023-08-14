package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import com.sun.org.apache.xml.internal.security.Init;
public class SecondServlet implements Servlet{
	//servlet life cycle  methods
	ServletConfig conf;
	public void init(ServletConfig conf) {
		this.conf=conf;
		System.out.println("creating servlet........");
	}
	public void service(ServletRequest req,ServletResponse resp)  throws ServletException,IOException {		
		System.out.println("Servicing........");
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
		out.println("<h1>this is my output from servlet method </h1>");
		out.println("<h1>todays date and time is: " +new Date().toString() +"</h1>");
	} 
	public void destroy() {
		System.out.println("Destroing servlet object..");
	}
	// servlet non life cycle methods
	public ServletConfig getServletConfig()  {
		return conf;
	}
	public String getServletInfo() {
		return "this is second servlet created by nikunj";	
	}	
}
