package com.waleed.kfh.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first")
public class MyFirstServlet extends HttpServlet {
	
//	@Override
//	public void init() throws ServletException {	
//		System.out.println("Servlet initialized...");
//	}
//	
//	@Override
//	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
//	}
//	
//	@Override
//	public void destroy() {
//		// TODO Auto-generated method stub
//		super.destroy();
//	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Servlet running.....");
//		System.out.println("Servlet running at : " + request.getServletPath());
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("userName");
		
//		out.println("Servlet running now at : <b>" + request.getServletPath() + "</b>");
		
		out.println("Welcome " + userName);
			
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	
	
}
