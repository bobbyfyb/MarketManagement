package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.*;

import com.example.model.*;
import java.sql.*;
/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		String number=request.getParameter("number");
		Insert is=new Insert();
		Connection con=(Connection)getServletContext().getAttribute("con");
		ResultSet rs=is.insertValue(con,id,name,price,number);
		request.setAttribute("rs", rs);
		RequestDispatcher view=request.getRequestDispatcher("insert.jsp");
		view.forward(request, response);
		
		
		/*response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try {
			while(rs.next())
				out.println("<br>"+rs.getString(1)+""+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

}
