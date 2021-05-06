package com.mega.MVC2000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ShopDAO {
	public void create(ShopVO bag) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "insert into shop values (?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getCode());
		ps.setString(2, bag.getName());
		ps.setString(3, bag.getKsc());
		ps.setInt(4, bag.getPrice());
		ps.setInt(5, bag.getLkup());

		int result = ps.executeUpdate();
	}
	
	public void delete(ShopVO bag) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		
		String sql = "delete from shop where code = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getCode());
		
		int result = ps.executeUpdate();
	}
}
