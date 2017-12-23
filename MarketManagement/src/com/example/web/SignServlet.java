package com.example.web;

import java.io.IOException;
import java.sql.Connection;
import com.example.model.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Connection con=(Connection)getServletContext().getAttribute("con");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Sign sign=new Sign();
		Boolean s=sign.sign_in(con,username,password);
		if(s)
			response.sendRedirect("commodity.html");
		else
			response.sendRedirect("login_error.html");
	}

}
