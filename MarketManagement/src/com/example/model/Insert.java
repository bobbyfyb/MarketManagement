package com.example.model;
import java.sql.*;
public class Insert
{
	
	public ResultSet insertValue(Connection con,String id,String name,String price,String number)
	{
		String sql="insert into commodity values(?,?,?,?)";
		String qsql="select * from commodity";
		ResultSet rs=null;
		try {
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, name);
		pstmt.setFloat(3, Float.parseFloat(price));
		pstmt.setInt(4, Integer.parseInt(number));
		pstmt.executeUpdate();
		
		Statement stmt=con.createStatement();
		rs=stmt.executeQuery(qsql);
		
		}catch(SQLException e){
		System.out.println("Insert error!");
		e.printStackTrace();
		}
		
		return rs;
	}

}
