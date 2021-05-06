<%@page import="newtrip.locationDB"%>
<%@page import="newtrip.locationVO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    
    String add = request.getParameter("add");
	String cuisine = request.getParameter("cuisine");
	String hashtag = request.getParameter("hashtag");

	locationVO bag = new locationVO();
	
	bag.setAdd(add);
	bag.setCuisine(cuisine);
	bag.setHashtag(hashtag);

	locationDB ldb = new locationDB();
	ldb.create(bag);
    
    
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