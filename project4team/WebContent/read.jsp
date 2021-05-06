<%@page import="dao_vo.MemberVO"%>
<%@page import="dao_vo.MemberDB"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//입력해서 전송된 데이터를 받아야 한다.
        String id = (String)session.getAttribute("id");
        
        //db전담하는 부품에서 db에 넣어달라고 할 예정.
        MemberDB db = new MemberDB();
        MemberVO bag = db.read(id); //
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>더 조은 개인정보</title>
</head>
<body>
회원님의 개인 정보입니다
<hr> <!-- 표현식, expression -->
검색된 id: <%= bag.getId() %><br>
검색된 pw: <%= bag.getPw() %><br>
검색된 name: <%= bag.getName() %><br>
검색된 tel: <%= bag.getTel() %><br>
</body>
</html>