<%@page import="dao_vo.BookVO"%>
<%@page import="dao_vo.BookDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
String title = request.getParameter("title");

BookDB db = new BookDB();
BookVO bag = db.read(title);
%>

</head>
<body>
	<h1>상세 페이지</h1>
	<table border="1">
		<tr>
			<th colspan="2">소설정보</th>
		</tr>

		<tr>
			<td><img src="pic/<%= bag.getTitle() %>_pic.jpg" width=300 height="300"></td>
			<td><img src="pic/<%= bag.getTitle() %>_pic2.jpg" width=300 height="300"></td>
		</tr>
		<tr>
			<td rowspan="2">공간1</td>
			<td>공간2</td>
		</tr>
		<tr>
			<td>공간3</td>
		</tr>
	</table>
</body>
</html>