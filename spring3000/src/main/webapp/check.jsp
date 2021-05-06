<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //1. id, pw를 받기
   	String id = request.getParameter("id");
   	String pw = request.getParameter("pw");
   	
   	boolean result = false;
   	if(id.equals("root") && pw.equals("1234"))
   			result=true;
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(result)
	out.print("login clear");
else
	out.print("login fail");
%>
</body>
</html>