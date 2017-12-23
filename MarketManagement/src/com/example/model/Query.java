package com.example.model;
import java.sql.*;
import java.util.*;
public class Query 
{
	public ResultSet querySet(Connection con,String name)
	{
		
		
		
		try 
		{
			ResultSet rs=null;
			String sql="select * from commodity where commodity_name=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name);
			 rs=pstmt.executeQuery();
			
			 
			 
			 //while(rs.next())
			 //{
			//	 System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3));
			// }
			 return rs;
		} 
		
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Query error!");
			e.printStackTrace();
			return null;
		}
		
		
		
	}

}
