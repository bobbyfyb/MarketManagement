package com.example.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.model.*;
import java.sql.*;

public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Connection con=(Connection)getServletContext().getAttribute("con");
		String type=request.getParameter("type");
		String name=request.getParameter("name");
		String value=request.getParameter("value");
		
		Update u=new Update();
		ResultSet rs=u.update(con,type,name,value);
		
		request.setAttribute("rs", rs);
		
		RequestDispatcher view=request.getRequestDispatcher("update.jsp");
		view.forward(request, response);

	}

}
