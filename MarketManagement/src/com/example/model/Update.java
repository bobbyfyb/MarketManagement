package com.example.model;
import java.sql.*;

public class Update 
{
	public ResultSet update(Connection con,String type,String name,String value)
	{
		String sql="update commodity set "+type+"=? where commodity_name=?";
		String qsql="select * from commodity";
		ResultSet rs=null;
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, value);
			pstmt.setString(2, name);
			pstmt.executeUpdate();
			
			Statement stmt=con.createStatement();
			rs=stmt.executeQuery(qsql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Update error!");
			e.printStackTrace();
		}
		
		return rs;
	}

}
