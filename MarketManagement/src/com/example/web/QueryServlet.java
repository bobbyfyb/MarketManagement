package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.model.*;
import java.sql.*;
/**
 * Servlet implementation class QueryServlet
 */
@WebServlet("/QueryServlet")
public class QueryServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		String name=request.getParameter("name");
		Query q=new Query();
		Connection con=(Connection)getServletContext().getAttribute("con");
		ResultSet rs=q.querySet(con,name);
		request.setAttribute("rs", rs);
		
		RequestDispatcher view=request.getRequestDispatcher("query.jsp");
		view.forward(request, response);

	
		
		
		
		
		

	
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		doPost(request,response);
	}

}
