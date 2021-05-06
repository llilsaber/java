<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- 서버에서 실행되는 코드가 필요 -->
<!-- 클라이언트가 입력한 정보를 받아주는 코드가 필요 -->
	<%
	
	//클라이언트가 입력한 정보를 서버에서 받아주는 클래스
	String id = request.getParameter("id");
	String tit = request.getParameter("tit");
	String con = request.getParameter("con");
	String wri = request.getParameter("wri");
	
	%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		id: <%= id%> <br>
		title: <%= tit%> <br>
		content: <%= con%> <br>
		writer: <%= wri%> <br>
	</body>
</html>