<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 서버에서 실행되는 코드가 필요 -->
<!-- 클라이언트가 입력한 정보를 받아주는 코드가 필요 -->
	<%
	
	//클라이언트가 입력한 정보를 서버에서 받아주는 클래스
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	
	%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>회원가입이 잘 되었습니다!!!</h3>
		<hr>
		당신이 입력한 id: <%= id%> <br>
		당신이 입력한 pw: <%= pw%> <br>
		당신이 입력한 name: <%= name%> <br>
		당신이 입력한 tel: <%= tel%> <br>
		<a href="member.html">회원가입화면으로</a>
	</body>
</html>