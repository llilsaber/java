<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //session.removeAttribute("id"); 아이디만 끊김
    session.invalidate();
    
    response.sendRedirect("login.jsp");
    %>