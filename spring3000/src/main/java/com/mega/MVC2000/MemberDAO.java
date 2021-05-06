package com.mega.MVC2000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
	@Autowired
	SqlSessionTemplate my;
	
	public void create(MemberVO bag) throws Exception {
		// Class.forName("com.mysql.jdbc.Driver");
//		Class.forName("oracle.jdbc.OracleDriver");

		// String url =
		// "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		Connection con = DriverManager.getConnection(url, "root", "1234");
//
//		String sql = "insert into member values (?, ?, ?, ?)";
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, bag.getId());
//		ps.setString(2, bag.getPw());
//		ps.setString(3, bag.getName());
//		ps.setString(4, bag.getTel());
//
//		int result = ps.executeUpdate();
//		con.commit();
//		con.close();
		my.insert("member.insert", bag);
	}
	
	public void delete(MemberVO bag) throws Exception {
//		Class.forName("oracle.jdbc.OracleDriver");

		// String url =
		// "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		Connection con = DriverManager.getConnection(url, "root", "1234");
//
//		String sql = "delete from member where id = ?";
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, bag.getId());
//
//		int result = ps.executeUpdate();
		my.delete("member.delete", bag);
	}
}
