package com.example.model;

import java.sql.*;

public class Login 
{
	public Boolean login_in(Connection con,String username,String password)
	{
		String sql="select password from userinfo where username=?";
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.executeQuery();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		}
		
	}

}
