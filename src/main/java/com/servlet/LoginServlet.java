package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		if("jack".equalsIgnoreCase(username) && "jill".equalsIgnoreCase(password)) {
			//Go to success.htm
			///this line is sending you from this servlet to success.htm page
			req.getRequestDispatcher("success.htm").forward(req, resp);
		}else {
			//Go to fail.htm
			///this line is sending you from this servlet to fail.htm page
			req.getRequestDispatcher("fail.htm").forward(req, resp);
		}
	}
}
