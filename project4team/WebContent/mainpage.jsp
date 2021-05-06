<%@page import="dao_vo.MovieDB"%>
<%@page import="dao_vo.MovieVO"%>
<%@page import="dao_vo.DramaDB"%>
<%@page import="dao_vo.DramaVO"%>
<%@page import="dao_vo.BookDB"%>
<%@page import="dao_vo.BookVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	MovieDB mdb = new MovieDB(); //영화db
	ArrayList<MovieVO> mlist = mdb.list();
	DramaDB ddb = new DramaDB(); //드라마db
	ArrayList<DramaVO> dlist = ddb.list();
	BookDB bdb = new BookDB(); //소설db
	ArrayList<BookVO> blist = bdb.list();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>더 조은 관광지</title>
		<link rel="stylesheet" type="text/css" href="design.css">
	</head>
	<body>
	<% if(session.getAttribute("id") == null) { %>
		<div id="ip"><a href="member_login.jsp">로그인</a> / <a href="member_joinform.jsp">회원가입</a>
		</div>
		<%}else { session.getAttribute("id"); %>
		<div id="ip"><a href="member_mypage.jsp">개인정보</a> / <a href="member_logout.jsp">로그아웃</a>
		</div>
		<%} %>
		<div>
			<form action="search.jsp"> <!-- 검색창 연결 -->
			<input type="text" name="search" style="text-align:center; width:800px; height:50px; font-size:30px;"> <!-- 검색창 사이즈 설정 -->
			<button style="text-align:center; width:80px; height:50px; font-size:20px;">검색</button> <br><br></form> <!-- 검색 버튼 -->
			<div id="tit"><a href="movie_main.jsp">영화</a> <a href="drama_main.jsp">드라마</a> <a href="book_main.jsp">소설</a> <a href="board_main.jsp">후기게시판</a>
			</div></div>
			영화 목록<br>
			<% //영화 db에서 뒤에서 부터 순서대로 불러옴
for (int i = 0; i < mlist.size(); i++) {
	int ii = mlist.size() - 1 - i;
   MovieVO bag2 = mlist.get(ii);
%>
			<a href="page.jsp?title=<%=bag2.getTitle() %>" title="<%= bag2.getTitle() %>"><img src="pic/<%= bag2.getTitle() %>_pic.jpg" width=300 height="300"></a>

<% } %>
			<br>드라마 목록<br>
			<%
for (int i = 0; i < dlist.size(); i++) {
	int ii = dlist.size() - 1 - i;
   DramaVO bag2 = dlist.get(ii);
%>
			<a href="page.jsp?title=<%=bag2.getTitle() %>" title="<%= bag2.getTitle() %>"><img src="pic/<%= bag2.getTitle() %>_pic.jpg" width=300 height="300"></a>

<% } %>
			<br>소설 목록<br>
			<%
for (int i = 0; i < blist.size(); i++) {
	int ii = blist.size() - 1 - i;
   BookVO bag2 = blist.get(ii);
%>
			<a href="page.jsp?title=<%=bag2.getTitle() %>" title="<%= bag2.getTitle() %>"><img src="pic/<%= bag2.getTitle() %>_pic.jpg" width=300 height="300"></a>

<% } %>
			
			
			
			
			
			<div>
			<div id="cs">cs senter 1579-1234
			</div>
		</div>
	</body>
</html>