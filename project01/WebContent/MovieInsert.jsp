<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>영화정보입력화면입니다.</h2>
	<hr color="#333399">
	<!-- form태그는 값을 입력하고 싶을 때 사용 -->
	<!-- 입력값들은 모두 form들어가야 한다. -->
	<!-- action: 입력값을 받아서 처리하는 다음 페이지를 지정 -->
	<form action="MovieConnect.jsp">
		제목: <input name="title"><br> 
		주연: <input name="actor"><br>
		감독: <input name="director"><br> 
		장르: <input name="genre"><br>
		<button>서버로 전송</button>
	</form>
</body>
</html>