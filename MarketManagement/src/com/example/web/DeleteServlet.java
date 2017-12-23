package com.example.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.*;
import java.sql.*;
import java.io.*;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name=request.getParameter("name");
		Delete d=new Delete();
		Connection con=(Connection)getServletContext().getAttribute("con");
		ResultSet rs=d.deleteValue(con,name);
		request.setAttribute("rs", rs);
		RequestDispatcher view=request.getRequestDispatcher("delete.jsp");
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
