<%@page import="shop.DB전담" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");
String company = request.getParameter("company");
String tel = request.getParameter("tel");
String gender = request.getParameter("gender");
String word = request.getParameter("word");
String[] hobby = request.getParameterValues("hobby");

String result = "";
for (String x: hobby) {
	result = result + x + " ";
}
%>
<%
	DB전담 db = new DB전담();
db.create();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>당신의 회원정보를 확인해주세요</h3>
	<hr color="red">
	당신이 입력한 id: <%=id%> <br>
	당신이 입력한 pw: <%=pw%> <br>
	당신이 입력한 name: <%=name%> <br>
	당신이 입력한 tel: <%= company%><%=tel%> <br>
	당신이 입력한 gender: <%= gender%> <br>
	당신이 입력한 word: <%= word%> <br>
	당신이 입력한 hobby: <%= result%> <br>
</body>
</html>