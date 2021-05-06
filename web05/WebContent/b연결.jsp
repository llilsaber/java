<%@page import="shop.g연결"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

String id = request.getParameter("id");
String tit = request.getParameter("tit");
String cont = request.getParameter("cont");
String wri = request.getParameter("wri");


g연결 db = new g연결();
db.create(id, tit, cont, wri);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>