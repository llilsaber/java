<%@page import="trip.MemberVO"%>
<%@page import="trip.MemberDB"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//입력해서 전송된 데이터를 받아야 한다.
        String id = request.getParameter("id");
        
        //db전담하는 부품에서 db에 넣어달라고 할 예정.
        MemberDB db = new MemberDB();
        //1.bag변수 미리 만들어두었다가
        //2.read한 결과를 만들어두었던 bag에 넣음.
        MemberVO bag = db.read(id);
        
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원 정보 조회가 완료되었습니다.
<hr> <!-- 표현식, expression -->
검색된 id: <%= bag.getId() %><br>
검색된 pw: <%= bag.getPw() %><br>
검색된 name: <%= bag.getName() %><br>
검색된 nickname: <%= bag.getNickname() %><br>
검색된 social_num: <%= bag.getSocial_num() %><br>
검색된 phone: <%= bag.getPhone() %><br>
검색된 address: <%= bag.getAddress() %><br>
검색된 email: <%= bag.getEmail() %><br>

</body>
</html>