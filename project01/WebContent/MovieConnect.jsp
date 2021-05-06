<%@page import="newtrip.movieDB"%>
<%@page import="newtrip.movieVO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    
    	String title = request.getParameter("title");
    	String actor = request.getParameter("actor");
    	String director = request.getParameter("director");
    	String genre = request.getParameter("genre");
    
    	movieVO bag = new movieVO();
    	
    	bag.setTitle(title);
    	bag.setActor(actor);
    	bag.setDirector(director);
    	bag.setGenre(genre);
    
    	movieDB mdb = new movieDB();
    	mdb.create(bag);
    
    
    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
영화정보가 저장되었습니다
</body>
</html>