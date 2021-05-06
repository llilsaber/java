package trip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDB {
	public void create(MemberVO bag) throws Exception {

		// 1. Ŀ���� ����� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");

		// 2. db���� trip, root, 1234
		String url = "jdbc:mysql://localhost:3306/trip";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db���� ����. <br>");

		// 3. SQL�� ����
		String sql = "insert into member values (?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getNickname());
		ps.setString(5, bag.getSocial_num());
		ps.setString(6, bag.getPhone());
		ps.setString(7, bag.getAddress());
		ps.setString(8, bag.getEmail());
		System.out.println("3. SQL�� ����� ����. <br>");

		// 4. SQL���� mySQL������ ������.
		ps.executeUpdate();
		System.out.println("4. SQL���� mySQL������ ���� ����. <br>");

	}

	public void delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");

		String url = "jdbc:mysql://localhost:3306/trip";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db���� ����. <br>");

		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. SQL�� ����� ����. <br>");

		ps.executeUpdate();
		System.out.println("4. SQL���� mySQL������ ���� ����. <br>");

	}

	public void update(MemberVO bag) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");

		String url = "jdbc:mysql://localhost:3306/trip";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db���� ����. <br>");

		String sql = "update member set pw = ?, nickname = ?, phone = ? , address = ?, email = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getPw());
		ps.setString(2, bag.getNickname());
		ps.setString(3, bag.getPhone());
		ps.setString(4, bag.getAddress());
		ps.setString(5, bag.getEmail());
		ps.setString(6, bag.getId());
		System.out.println("3. SQL�� ����� ����. <br>");

		// 4. SQL���� mySQL������ ������.
		ps.executeUpdate();
		System.out.println("4. SQL���� mySQL������ ���� ����. <br>");

	}

	public MemberVO read(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");

		String url = "jdbc:mysql://localhost:3306/trip";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db���� ����. <br>");

		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. SQL�� ����� ����. <br>");

		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL���� mySQL������ ���� ����. <br>");

		// 1. �˻������ �ִ��� üũ �ؾ���.
		// System.out.println(rs.next());
		// �� ����� true��, �����۵� < �˻���� ����.
		// 2. ���� ����� ������, ���̺��� ���ϴ� �������׸��� ������ �� ����.

		MemberVO bag = new MemberVO();
		if (rs.next()) {
			// �����ִ� ����� 2����, 1)�׸��, 2)�ε�����ȣ
			String id2 = rs.getString("id"); // �׽�Ʈ
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String nickname = rs.getString(4);
			String social_num = rs.getString(5);
			String phone = rs.getString(6);
			String address = rs.getString(7);
			String email = rs.getString(8);

			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setNickname(nickname);
			bag.setSocial_num(social_num);
			bag.setPhone(phone);
			bag.setAddress(address);
			bag.setEmail(email);
		}
		return bag;
	}

	public boolean check(String id, String pw) throws Exception {
		// 1. connector ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");

		// 2. db����
		String url = "jdbc:mysql://localhost:3306/trip";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. db���� ����. <br>");
		// 3. sql�� ����
		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. SQL���� ����� ����. <br>");

		// 4. SQL�� ����
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL���� mySQL������ ���� ����. <br>");

		boolean result = false; // �α��� ���� ���� ���¸� �ǹ�.
		if (rs.next()) { // �Էµ� ���(id,pw)�� �ִ��� üũ���ִ� �޼���
			System.out.println("�α��� ����");
			result = true;
		} else {
			System.out.println("�α��� ����");
		}
		return result;
	}

	public ArrayList<MemberVO> list() throws Exception {
		ArrayList<MemberVO> list = new ArrayList<>();

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");

		String url = "jdbc:mysql://localhost:3306/trip";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db���� ����. <br>");

		String sql = "select * from member";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL�� ����� ����. <br>");

		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL���� mySQL������ ���� ����. <br>");

		// 1. �˻������ �ִ��� üũ �ؾ���.
		// System.out.println(rs.next());
		// �� ����� true��, �����۵� < �˻���� ����.
		// 2. ���� ����� ������, ���̺��� ���ϴ� �������׸��� ������ �� ����.

		while (rs.next()) {
			// rs.next()�� ȣ���� ������ �� �྿ �������� �� ���� �ִ����� üũ: boolean
			// ������ true, ������ false
			// true�̸� �� �׸��� ������ �����־�� �Ѵ�.
			// �����ִ� ����� 2����, 1)�׸��, 2)�ε�����ȣ
			String id2 = rs.getString("id"); // �׽�Ʈ
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String nickname = rs.getString(4);
			String social_num = rs.getString(5);
			String phone = rs.getString(6);
			String address = rs.getString(7);
			String email = rs.getString(8);

			// ������ ���� ������ ������ ���濡 �ִ´�.
			MemberVO bag = new MemberVO();
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setNickname(nickname);
			bag.setSocial_num(social_num);
			bag.setPhone(phone);
			bag.setAddress(address);
			bag.setEmail(email);

			// ������� �����̳ʿ� �ϳ��� �־��ش�
			list.add(bag);
		}
		System.out.println(list.size() + "================");

		return list;
	}

	public int read(String id, String pw) throws Exception {
		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");

		String url = "jdbc:mysql://localhost:3306/trip";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. db���� ����. <br>");

		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. SQL���� ����� ����. <br>");

		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL���� mySQL������ ���� ����. <br>");

		// 1. �˻������ �ִ��� üũ�ؾ��Ѵ�.
		// System.out.println(rs.next());//true�̸� �ִٶ�� ���
		// 2. ���࿡ ����� ������, ���̺��� ���ϴ� �������׸��� �����ָ� ��.
		if (rs.next()) {
			result = 1;
		}
		return result;
	}

	public int duplecateID(String id) throws Exception {
		int cnt=0;
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");
		
		String url = "jdbc:mysql://localhost:3306/trip";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		
		System.out.println("2. db���� ����. <br>");
		
		String sql = "select count(id) as cnt from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		
		System.out.println("3. SQL�� ����� ����. <br>");
		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL���� mySQL������ ���� ����. <br>");
		if (rs.next()) {
			cnt=rs.getInt("cnt");
		}
		return cnt;
	}
}
