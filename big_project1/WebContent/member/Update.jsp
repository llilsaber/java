<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>회원 정보 수정화면입니다.</h2>
	<hr color="red">
	<!-- form태그는 값을 입력하고 싶을 때 사용 -->
	<!-- 입력값들은 모두 form들어가야 한다. -->
	<!-- action: 입력값을 받아서 처리하는 다음 페이지를 지정 -->
	<form action="수정db연결.jsp">
	    
		아이디: <input name="id"><br> 
		변경할 비밀번호: <input name="pw"><br>
		변경할 닉네임: <input name="nickname"><br>
		변경할 전화번호: <input name="phone"><br>
		변경할 주소: <input name="address"><br>
		변경할 이메일: <input name="email"><br>
		
		<button>회원 정보 수정 완료</button>

	</form>
</body>
</html>