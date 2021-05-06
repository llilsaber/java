<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
session.setAttribute("writer", "apple");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<form action="board_create_db.jsp">
<div class="container">
	<div class="row">
		<table class="table table-striped" style="text-align: center; width: 800px; margin-top: 10px; margin-left:200px; border: 1px solid #dddddd">
			<thead>
			<tr>
				<th colspan="3" style="background-color:#eeee; text-align:center;">게시판 글 쓰기</th>
			</tr>
		</thead>	
		<tbody>
		    <tr>
	            <td style="width:20%;">대륙</td>
				<td colspan="2">
			<select name="local">
		 	<option value="europe">유럽</option>
		 	<option value="africa">아프리카</option>
		 	<option value="asia">아시아</option>
		 	<option value="northamerica">북아메리카</option>
		 	<option value="southamerica">남아메리카</option> </td>
			</tr>
	        <tr>
	            <td>글 제목</td>
				<td colspan="2"><input type="text" size="90"> </td>
			</tr>
			<tr>
	            <td>만족도</td>
				<td colspan="2">
				<input type="radio" value= "good" name="degree">좋음
				<input type="radio" value= "soso" name="degree">보통
		 		<input type="radio" value= "bad" name="degree">나쁨</td>
			</tr>
			<tr>
	            <td>작성자</td>
				<td colspan="2"><input name="writer"value="<%=session.getAttribute("writer") %>"readonly="readonly"> </td>
			</tr>
			<tr>
	            <td>본문</td>
				<td colspan="2" style="display:inline-block; height: 500px; text-align: left;"><textarea rows="33" cols="93" name="content"></textarea></td>
			</tr>
			
		</tbody>
		</table>
	</div>
</div>
<button>서버로전송</button>
	</form>
</body>
</html>