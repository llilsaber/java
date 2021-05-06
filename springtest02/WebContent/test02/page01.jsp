<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>직원정보 등록하는 화면</h2>
<!-- from을 통해서 입력된 내용을 연결해서 db에 등록한다 --> 
		사원ID: <input name="pid"><br>
		이름: <input name="name"><br>
		직급: <input name="level"><br> 
		담당업무: <input name="work"><br>
		월급여: <input name="apy"><br>
		입사일자: <input name="indate"><br>
		<button>등록</button>
</body>
</html>