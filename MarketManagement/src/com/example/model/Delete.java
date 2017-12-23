package com.example.model;
import java.sql.*;
public class Delete 
{
	public ResultSet deleteValue(Connection con,String name)
	{
		ResultSet rs=null;
		try {
			String sql="delete from commodity where commodity_name=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.executeUpdate();
			
			String dsql="select * from commodity";
			Statement stmt=con.createStatement();
			rs=stmt.executeQuery(dsql);
			
		}catch(SQLException e) {
			System.out.println("delete error!");
			e.printStackTrace();
		}
		
		return rs;
	}

}
