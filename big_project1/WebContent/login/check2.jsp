<%@page import="trip.MemberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 미리 객체를 생성해서 제공하고 있는 객체: 빌트인 객체(내장된 객체)
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    
    MemberDB db = new MemberDB();
    boolean result = db.check(id, pw);
    // 로그인이 성공한 경우, id를 사이트내 여러 페이지에서 쓸 수 있도록 설정
    // 세션이 유지되는 동안 쓸 수 있도록 해야함.
    if(result){
    	session.setAttribute("id", id);
    }
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 표현식  -->
<% if(result==true) { %> <%= session.getAttribute("id") %>님,
로그인 성공하셨습니다.
<br>
메인 페이지로 이동 : <a href="login2.jsp">메인 페이지</a>
<% } else { %>
입력된 아이디, 혹은 비밀번호가 일치하지 않습니다.
<br>
재 로그인 시도하기 : <a href="login2.jsp">로그인 페이지로</a>
<% } %>
</body>
</html>