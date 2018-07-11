package com.monami.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContext
 */
public class ServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;

  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");

        // I am using 2nd way to create Context object
        javax.servlet.ServletContext context= this.getServletContext();

        String s1=context.getInitParameter("n1");
        String s2=context.getInitParameter("n2");

        pw.println("n1 value is " +s1+ " and n2 is " +s2);

       pw.close();    
	}

}
