<%@page import="dao_vo.MemberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

MemberDB db = new MemberDB();
boolean result = db.check(id, pw);
//세션이 유지되는 동안 쓸 수 있도록 해야함
if(result){
session.setAttribute("id", id);
}

response.sendRedirect("mainpage.jsp");
%>