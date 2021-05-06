<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String nameStr = request.getParameter("name");
	String cash = request.getParameter("cash");
	int cashInt = Integer.parseInt(cash);
%>move name: <%= nameStr %> is <%= cashInt %> won