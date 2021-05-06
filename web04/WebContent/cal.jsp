<%@page import="javax.swing.text.Document"%>
<%@page import="shop.계산기"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- cont + shift + / : 자동주석 -->
    <!-- n1, n2 값을 받아주어야 함. -->
    <!-- n1, n2를 int로 바꾸어 주어야 함. -->
    <!-- 계산기한테 두 개를 더 해달라고 해야함. -->
    <!-- 더한 반환값을 받아와서 클라이언트에 전송(html만든후 전송 -->
    <%
    
    String n1 = request.getParameter("n1"); //"200"
    String n2 = request.getParameter("n2"); //"100"
    String res = request.getParameter("res"); //"100"
    int s1 = Integer.parseInt(n1);
    int s2 = Integer.parseInt(n2);
   	계산기 cal = new 계산기();
   	int result = cal.add(s1, s2);
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- html에 내용을 그대로 가져와서 결과만 나오고 끝나지 않고 계속해서 덧샘이 가능해진다  -->
<h3>더하기를 만들어보자</h3>
<hr>
<form action="cal.jsp">
숫자1 : <input value=<%= n1 %> name="n1"><br>
숫자2 : <input value=<%= n2 %> name="n2"><br>
결과 :  <%= result %> <br>
<button type="submit">서버로 전송</button>
</form>
</body>
</html>