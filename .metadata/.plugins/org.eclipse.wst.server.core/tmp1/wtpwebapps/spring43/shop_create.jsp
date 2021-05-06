<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쇼핑몰 상품 등록</title>
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
	margin: 10px;
	margin-left: 1050px;
}
</style>
</head>
<body style="text-align: center;">
	<p style="font-family: courier; font-weight: bold; font-size: 40px;">상품등록</p>
	<hr>
	<form action="shop_create_db.jsp">
						상품코드: <input name="code"> &nbsp;
						상품명: <input name="name">
					<hr>
						이미지<br>
						<input type="file" name="image1" /><br>
						<input type="file" name="image2" /><br>
						<input type="file" name="image3" /><br>
						<input type="file" name="image4" />
					<hr>
						관련 스포츠<br>
						<input type="radio" value="축구" name="category">축구 &nbsp;
						<input type="radio" value="야구" name="category">야구 &nbsp;
						<input type="radio" value="농구" name="category">농구
					<hr>
						관련 용품<br>
						<input type="radio" value="옷" name="ksc">옷 &nbsp;
						<input type="radio" value="모자" name="ksc">모자 &nbsp;
						<input type="radio" value="응원도구" name="ksc">응원도구
					<hr>
						가격: <input name="price">(단위: 원)
					<hr>
						상품 세부설명<br>
						<textarea rows="20" cols="97" name="content"></textarea>
					<hr>
						매장위치: 
						<select name="shopmap1">
								<option value="서울">서울</option>
								<option value="경기도">경기도</option>
								<option value="제주도">제주도</option>
								<option value="전라도">전라도</option>
						</select>
						<input name="shopmap2"><br>
		<input type="submit" style="float: right; text-align: right;" value="상품등록">
	</form>
</body>
</html>

