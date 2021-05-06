package newtrip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class locationDB {
	
	public ArrayList<locationVO> list() throws Exception {
		ArrayList<locationVO> list = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/thejo";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		
		String sql = "select * from location";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
			
			locationVO bag = new locationVO();
			
			bag.setAdd(rs.getString("add"));
			bag.setCuisine(rs.getString("cuisine"));
			bag.setHashtag(rs.getString("hashtag"));
			list.add(bag);
		}
		return list;
	}
	

	public void create(locationVO bag) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		//PrintWriter out = new PrintWriter();
		
		String url = "jdbc:mysql://localhost:3306/thejo";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		
		String sql = "insert into location values(?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getAdd());
		ps.setString(2, bag.getCuisine());
		ps.setString(3, bag.getHashtag());
		
		ps.executeUpdate();
		
		
	}

	public void update(locationVO bag) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
			
		String url = "jdbc:mysql://localhost:3306/thejo";
		Connection con = DriverManager.getConnection(url, "root", "1234");
			
		String sql = "update location set cuisine = ?, hashtag = ? where add = ?";
		PreparedStatement ps = con.prepareStatement(sql);
			
		ps.setString(1, bag.getAdd());
		ps.setString(2, bag.getCuisine());
		ps.setString(3, bag.getHashtag());
			
		ps.executeUpdate();
			
			
		}
		
		
	

	public void delete(String add) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		//PrintWriter out = new PrintWriter();
				
		String url = "jdbc:mysql://localhost:3306/thejo";
		Connection con = DriverManager.getConnection(url, "root", "1234");
				
		String sql = "delete from location where add = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, add);
					
		ps.executeUpdate();
				
				
			}		
	public locationVO read(String add) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/thejo";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		
		String sql = "select * from location where add = ?";
		String sql1 = "update location set clicks = clicks +1 where add =?";
		PreparedStatement ps = con.prepareStatement(sql);
		PreparedStatement ps1 = con.prepareStatement(sql1);
		ps.setString(1, add);
		ps1.setString(1, add);
		
		ResultSet rs = ps.executeQuery();
		ps1.executeUpdate();
		
		locationVO bag = new locationVO();
		if (rs.next()) {

			String add2 = rs.getString("add");
			String cuisine2 = rs.getString("cuisine");
			String hashtag2 = rs.getString("hashtag");
			
			bag.setAdd(add2);
			bag.setCuisine(cuisine2);
			bag.setHashtag(hashtag2);
			
		}
		return bag;
	}
	
	
}
