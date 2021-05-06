package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class g연결 {
   public void create(String id, String tit, String cont, String wri) throws Exception  {
      Class.forName("com.mysql.jdbc.Driver");
      String url = "jdbc:mysql://localhost:3306/shop";
      Connection con = DriverManager.getConnection(url, "root", "1234");

      String sql = "insert into board values (?, ?, ?, ?)";
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setString(1, id);
      ps.setString(2, tit);
      ps.setString(3, cont);
      ps.setString(4, wri);
      ps.executeUpdate();
   }
//   public void update(String id, String pw, String tel) throws Exception  {
//      Class.forName("com.mysql.jdbc.Driver");
//      System.out.println("1. 커넥터 사용 설정 성공. <br>");
//     
//      String url = "jdbc:mysql://localhost:3306/shop";
//      Connection con = DriverManager.getConnection(url, "root", "1234");
//      
//      System.out.println("2. db연결 성공. <br>");
//      String sql = "update member set pw = ?, tel = ? where id = ?";
//      PreparedStatement ps = con.prepareStatement(sql);
//      ps.setString(1, pw);
//      ps.setString(2, tel);
//      ps.setString(3, id);
//      System.out.println("3. SQL문을 만들기 성공. <br>");
//      
//      ps.executeUpdate();
//      System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
//   }
   
   public void delete(String tit) throws Exception  {
      Class.forName("com.mysql.jdbc.Driver");
      String url = "jdbc:mysql://localhost:3306/shop";
      Connection con = DriverManager.getConnection(url, "root", "1234");
      String sql = "delete from board where title = ?";
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setString(1, tit);

      ps.executeUpdate();
   }
}