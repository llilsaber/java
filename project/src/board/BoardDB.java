package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class BoardDB {
	public ArrayList<BoardVO> list() throws Exception {//리턴 값의 타입이 ArrayList<BoardVO>
		ArrayList<BoardVO> list = new ArrayList<>();//BoardVO형을 가진 ArrayList클래스의 list객체를 생성
		Class.forName("com.mysql.jdbc.Driver");/// jdbc까지가 pack, Driver가 class
		System.out.println("1. 커넥터 사용설정 성공.<br>");

		// 2.db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";// 연결할 주소
		// jsp에서의 자동 import: 클릭후, 컨트롤 쉬프트
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공.<br>");

		// 3.sql문을 만든다 =>해당부품을 써서 sql으로 인식하게 해야함, 해당 클래스를 사용해야 함.
		String sql = "select * from board";// ps.executeUpdate를 이용해 mysql로 전송
		PreparedStatement ps = con.prepareStatement(sql);// sql 부품
		System.out.println("3. SQL문을 만들기 성공.<br>");

		// 4.sql문을 mysql서버로 전송함.
		ResultSet rs = ps.executeQuery();// Result set은 테이블을 가져온다는 얘기,rs는 참조형
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");

		// 1.검색 결과가 있는지 체크해야한다.
		// System.out.println(rs.next());//true이면 있다는 얘기
		// 2. 만약에 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내주면 됨.

		while (rs.next()) {
			// 꺼내주는 방법은 2가지, 1)항목명, 2)항목의 인덱스
			
			BoardVO bag = new BoardVO();//BoardVO 객체 생성
			//BoardVO의 메서드를 통해 테이블 row 항목값을 저장함(주소가 있으면 메서드 사용 가능)
			bag.setId(rs.getString("id"));
			bag.setTitle(rs.getString("title"));
			bag.setContent(rs.getString("content"));
			bag.setWriter(rs.getString("writer"));
			bag.setDate(rs.getDate("birth"));
			bag.setClicks(rs.getString("clicks"));
			bag.setLocal(rs.getString("local"));
			bag.setDegree(rs.getString("degree"));
			//각각의 bag을 컨테이너에 넣음
			list.add(bag);
		}
		return list;
	}

	public void create(BoardVO bag) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");/// jdbc까지가 pack, Driver가 class
		System.out.println("1. 커넥터 사용설정 성공.<br>");

		// 2.db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";// 연결할 주소
		// jsp에서의 자동 import: 클릭후, 컨트롤 쉬프트
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공.<br>");

		// 3.sql문을 만든다 =>해당부품을 써서 sql으로 인식하게 해야함, 해당 클래스를 사용해야 함.
		String sql = "insert into board(title, content, writer, birth, local, degree) values(?, ?, ?,now(), ?,?)";// ps.executeUpdate를 이용해 mysql로 전송
		PreparedStatement ps = con.prepareStatement(sql);// sql 부품
		ps.setString(1, bag.getTitle());
		ps.setString(2, bag.getContent());
		ps.setString(3, bag.getWriter());
		ps.setString(4, bag.getLocal());
		ps.setString(5, bag.getDegree());
		System.out.println("3. SQL문을 만들기 성공.<br>");
		// 4.sql문을 mysql서버로 전송함.
		ps.executeUpdate();// 자바가 mysql로 전송만
		System.out.println("4.SQL문을 mySQL서버로 전송성공<br>");
	}

	public void update(BoardVO bag) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");/// jdbc까지가 pack, Driver가 class
		System.out.println("1. 커넥터 사용설정 성공.<br>");

		// 2.db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";// 연결할 주소
		// jsp에서의 자동 import: 클릭후, 컨트롤 쉬프트
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공.<br>");

		// 3.sql문을 만든다 =>해당부품을 써서 sql으로 인식하게 해야함, 해당 클래스를 사용해야 함.
		String sql = "update board set title =?, content =?, degree =?, local =? where id = ?";// ps.executeUpdate를 이용해 mysql로 전송
		PreparedStatement ps = con.prepareStatement(sql);// sql 부품
		ps.setString(1, bag.getTitle());
		ps.setString(2, bag.getContent());
		ps.setString(3, bag.getDegree());
		ps.setString(4, bag.getLocal());
		ps.setString(5, bag.getId());
		System.out.println("3. SQL문을 만들기 성공.<br>");
		// 4.sql문을 mysql서버로 전송함.
		ps.executeUpdate();// 자바가 mysql로 전송만
		System.out.println("4.SQL문을 mySQL서버로 전송성공<br>");
	}

	public void delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");/// jdbc까지가 pack, Driver가 class
		System.out.println("1. 커넥터 사용설정 성공.<br>");

		// 2.db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";// 연결할 주소
		// jsp에서의 자동 import: 클릭후, 컨트롤 쉬프트
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공.<br>");

		// 3.sql문을 만든다 =>해당부품을 써서 sql으로 인식하게 해야함, 해당 클래스를 사용해야 함.
		String sql = "delete from board where id = ?";// ps.executeUpdate를 이용해 mysql로 전송
		PreparedStatement ps = con.prepareStatement(sql);// sql 부품
		ps.setString(1, id);
		System.out.println("3. SQL문을 만들기 성공.<br>");
		// 4.sql문을 mysql서버로 전송함.
		ps.executeUpdate();// 자바가 mysql로 전송만
		System.out.println("4.SQL문을 mySQL서버로 전송성공<br>");
	}

	public BoardVO read(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");/// jdbc까지가 pack, Driver가 class
		System.out.println("1. 커넥터 사용설정 성공.<br>");

		// 2.db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";// 연결할 주소
		// jsp에서의 자동 import: 클릭후, 컨트롤 쉬프트
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공.<br>");

		// 3.sql문을 만든다 =>해당부품을 써서 sql으로 인식하게 해야함, 해당 클래스를 사용해야 함.
		String sql = "select * from board where id = ?";// ps.executeUpdate를 이용해 mysql로 전송
		String sql1 = "update board set clicks = clicks +1 where id =?";
		PreparedStatement ps = con.prepareStatement(sql);// sql 부품
		PreparedStatement ps1 = con.prepareStatement(sql1);
		ps.setString(1, id);
		ps1.setString(1, id);
		System.out.println("3. SQL문을 만들기 성공.<br>");

		// 4.sql문을 mysql서버로 전송함.
		ResultSet rs = ps.executeQuery();// Result set은 테이블을 가져온다는 얘기,rs는 참조형
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
		ps1.executeUpdate();
		// 1.검색 결과가 있는지 체크해야한다.
		// System.out.println(rs.next());//true이면 있다는 얘기
		// 2. 만약에 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내주면 됨.
		BoardVO bag = new BoardVO();
		if (rs.next()) {
			// 꺼내주는 방법은 2가지, 1)항목명, 2)항목의 인덱스

			String id2 = rs.getString("id");// "apple"
			String title2 = rs.getString("title");
			String content2 = rs.getString("content");
			String writer2 = rs.getString("writer");
			String local2 = rs.getString("local");
			String degree2 = rs.getString("degree");
			bag.setId(id2);
			bag.setTitle(title2);
			bag.setContent(content2);
			bag.setWriter(writer2);
			bag.setLocal(local2);
			bag.setDegree(degree2);
		}
		return bag;
	}

}