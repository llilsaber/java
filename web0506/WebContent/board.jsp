<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    session.setAttribute("id", "value");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>이메일 문의 게시판 화면입니다</h2>
	<hr color="red">
	<form action="check.jsp">
	 아이디: <input name="id" value="<%= session.getAttribute("id") %>" readonly="readonly"><br>
          이름: <input name="name"><br>
          연락처: <input name="tel"><br>
          이메일: <input name="email"><br>
       <br>
       <hr>
          제목: <input name="title"><br>
          내용: 
          <textarea rows="20" cols="100" name="content"></textarea>
      <br>   
       <button type="submit">서버로 전송</button>
	</form>
</body>
</html>