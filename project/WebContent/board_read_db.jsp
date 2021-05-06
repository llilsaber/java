<%@page import="board.BoardVO"%>
<%@page import="board.BoardDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//입력해서 전송된 데이터를 받아야 한다.
String id = request.getParameter("id");

//db전담하는 부품에서 db에 넣어달라고 할 예정.
BoardDB db = new BoardDB();
BoardVO bag = db.read(id);
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

.button {
	background-color: #dddddddd;
	border: 1px;
	color: black;
	padding: 10px 20px;
	text-align: center;
	display: inline-block;
	font-size: 12px;
	/* margin: 10px;
	margin-left: 1200px; */
}
</style>
</head>
<body>
	<p style="margin-left: 950px; font-family: courier; font-size: 40px;">여행 후기</p>
	<div class="container">
		<div class="row">
			<table class="table table-striped"
				style="text-align: center; width: 800px; height: 100px; margin: auto; text-align: center border: 1px solid #dddddd">
				<thead>
					<tr>
						<th colspan="3"
							style="background-color: #eeee; text-align: left; font-size: 30px;"><%=bag.getTitle()%></th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td style="width: 20%;">대륙</td>
						<td><%=bag.getLocal()%></td>
					</tr>
					<tr>
						<td>만족도</td>
						<td><%=bag.getDegree()%></td>
					</tr>
					<tr>
						<td>작성자</td>
						<td><%=bag.getWriter()%></td>
					</tr>
					<tr>
						<td>본문</td>
						<td	 style="text-align: left; display: inline-block; height: 400px;"><%=bag.getContent()%>
						</td>
					</tr>
					
					<tr>
						<td colspan="2">
							<%
								String writer = "root";
							//String id = (String)session.getAttribute("id");
							String id2 = "root";

							if (writer.equals(id2)) {
							%> <a href="board_update.jsp?id=30">
								<button type="button" class="button">수정</button>
						</a> <a href="board_delete_db.jsp?id=30">
								<button type="button" class="button">삭제</button>
						</a> <%
 	}
 %>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>



