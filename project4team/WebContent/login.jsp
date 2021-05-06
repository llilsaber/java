<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>더 조은 로그인</title>
</head>
<body>
<% if(session.getAttribute("id") == null) { %>
<form action="check.jsp">
아이디: <input type="text" name="id"><br>
패스워드: <input type="text" name="pw"><br>
<button type="submit">로그인</button>
</form>
<%}else { %>
<%= session.getAttribute("id") %>님 환영합니다
<a href="logout.jsp">로그아웃</a>
<%} %>
</body>
</html>