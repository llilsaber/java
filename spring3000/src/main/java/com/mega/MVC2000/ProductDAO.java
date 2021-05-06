package com.mega.MVC2000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Component;

@Component
public class ProductDAO {
	public void create(ProductVO bag) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "insert into PRODUCT values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getTitle());
		ps.setString(3, bag.getPrice());
		ps.setString(4, bag.getCompany());

		int result = ps.executeUpdate();
	}
}
