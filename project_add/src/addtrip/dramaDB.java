package addtrip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class dramaDB {

	public ArrayList<dramaVO> list() throws Exception {
		ArrayList<dramaVO> list = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/newtrip";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "select * from drama";
		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			dramaVO bag3 = new dramaVO();

			bag3.setTitle(rs.getString("title"));
			bag3.setActor(rs.getString("actor"));
			bag3.setGenre(rs.getString("genre"));
			bag3.setCompany(rs.getString("company"));
			list.add(bag3);
		}
		return list;
	}

	public void create(dramaVO bag) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();

		String url = "jdbc:mysql://localhost:3306/newtrip";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "insert into drama values(?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getTitle());
		ps.setString(2, bag.getActor());
		ps.setString(3, bag.getGenre());
		ps.setString(4, bag.getCompany());

		ps.executeUpdate();

	}

	public void update(dramaVO bag) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/newtrip";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "update drama set actor = ?, genre = ? where title = ?";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, bag.getActor());
		ps.setString(2, bag.getGenre());
		ps.setString(3, bag.getTitle());

		ps.executeUpdate();

	}

	public void delete(String title) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();

		String url = "jdbc:mysql://localhost:3306/newtrip";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "delete from drama where title = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, title);

		ps.executeUpdate();

	}

	public dramaVO read(String title) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/newtrip";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "select * from drama where title = ?";

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, title);

		ResultSet rs = ps.executeQuery();

		dramaVO bag3 = new dramaVO();
		if (rs.next()) {

			String title2 = rs.getString("title");
			String actor2 = rs.getString("actor");
			String genre2 = rs.getString("genre");
			String company2 = rs.getString("company");

			bag3.setTitle(title2);
			bag3.setActor(actor2);
			bag3.setGenre(genre2);
			bag3.setCompany(company2);

		}
		System.out.println(bag3);
		return bag3;
	}

}
