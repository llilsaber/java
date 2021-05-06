<%@page import="trip.MemberDB"%>
<%@page import="trip.MemberVO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
        	//입력해서 전송된 데이터를 받아야 한다.
            String id = request.getParameter("id");
            String pw = request.getParameter("pw");
            String nickname = request.getParameter("nickname");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            
            //1. 가방 만들기
            //2. 가방에 넣기
            MemberVO bag = new MemberVO();
            bag.setId(id);
            bag.setPw(pw);
            bag.setNickname(nickname);
            bag.setPhone(phone);
            bag.setAddress(address);
            bag.setEmail(email);
            
            //db전담하는 부품에서 db에 넣어달라고 할 예정.
            MemberDB db = new MemberDB();
            db.update(bag);
        %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%= id %>님의 패스워드가 <%= pw %>,<br>
	<%= id %>님의 닉네임이 <%= nickname %>,<br>
	<%= id %>님의 전화번호가 <%= phone %>,<br>
	<%= id %>님의 주소가 <%= address %>,<br>
	<%= id %>님의 이메일이 <%= email %>,<br>
	로 변경되었습니다.
	
</body>
</html>