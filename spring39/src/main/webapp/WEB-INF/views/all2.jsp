<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="vo" items="${list}">
	user id: ${vo.id}<br>
user pw: ${vo.pw}<br>
user name: ${vo.name}<br>
user tle: ${vo.tel}<br><br>
	</c:forEach>
</body>
</html>