package com.example.model;
import java.sql.*;
public class Sign 
{
	public boolean sign_in(Connection con,String username,String password)
	{
		String sql="insert into userinfo values(?,?)";
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

}
