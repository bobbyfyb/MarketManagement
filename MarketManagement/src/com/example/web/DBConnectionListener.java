package com.example.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.*;

public class DBConnectionListener implements ServletContextListener
{
	public void contextInitialized(ServletContextEvent event)
	{
		Connection con=null;
		ServletContext sc=event.getServletContext();
		try {
		Class.forName(sc.getInitParameter("DRIVER"));
		con=DriverManager.getConnection(sc.getInitParameter("URL"));
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		//con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=market;integratedSecurity=true;");
		System.out.println("create connection success");
		}
		catch(Exception e)
		{
			// System.out.print("create connection error!");  
	          e.printStackTrace();  
		}
		sc.setAttribute("con", con);
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent event)
	{
		// TODO Auto-generated method stub
		
	}

}
