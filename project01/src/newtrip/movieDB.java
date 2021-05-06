package newtrip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class movieDB {

	public ArrayList<movieVO> list() throws Exception {
		ArrayList<movieVO> list = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/thejo";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "select * from movie";
		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			movieVO bag2 = new movieVO();

			bag2.setTitle(rs.getString("title"));
			bag2.setActor(rs.getString("actor"));
			bag2.setDirector(rs.getString("director"));
			bag2.setGenre(rs.getString("genre"));
			list.add(bag2);
		}
		return list;
	}

	public void create(movieVO bag) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();

		String url = "jdbc:mysql://localhost:3306/thejo";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "insert into movie values(?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getTitle());
		ps.setString(2, bag.getActor());
		ps.setString(3, bag.getDirector());
		ps.setString(4, bag.getGenre());

		ps.executeUpdate();

	}

	public void update(movieVO bag) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/shop";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "update movie set actor = ?, director = ? where title = ?";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, bag.getActor());
		ps.setString(2, bag.getDirector());
		ps.setString(3, bag.getTitle());

		ps.executeUpdate();

	}

	public void delete(String title) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();

		String url = "jdbc:mysql://localhost:3306/shop";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "delete from movie where title = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, title);

		ps.executeUpdate();

	}

	public movieVO read(String title) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/newtrip";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "select * from movie where title = ?";

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, title);

		ResultSet rs = ps.executeQuery();

		movieVO bag2 = new movieVO();
		if (rs.next()) {

			String title2 = rs.getString("title");
			String actor2 = rs.getString("actor");
			String director2 = rs.getString("director");
			String genre2 = rs.getString("genre");

			bag2.setTitle(title2);
			bag2.setActor(actor2);
			bag2.setDirector(director2);
			bag2.setGenre(genre2);

		}
		System.out.println(bag2);
		return bag2;
	}

}
