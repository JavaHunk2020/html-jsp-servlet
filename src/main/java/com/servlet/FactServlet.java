package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// - do not forget forward slash
@WebServlet("/fact")
public class FactServlet extends HttpServlet {
	
	/**
	 * Right your login in this fixed method
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String num=req.getParameter("num");
		int pnum = Integer.parseInt(num);
		int sum=1;
		for(int x=2;x<=pnum;x++) {
			sum=sum*x;
		}
		resp.getWriter().println("<h1>Hey result is  = "+sum+"</h1>");
	}

}
