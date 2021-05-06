<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function plus() {
		x = parseInt(document.getElementById('num1').value)
		y = parseInt(document.getElementById('num2').value)
		sum = x + y
		/*alert(sum)*/
		result2.innerHTML = sum
	}
	function img() {
		name = document.getElementById('pic').value
		result.innerHTML = "<img src='resources/img/" + name + ".png'>"
	}
</script>
</head>
<body>
	<input type="text" id="num1">
	<input type="text" id="num2">
	<button onclick="plus()">plus</button>
	<br>
	<div id="result2"></div><br>
	
	<input type="text" id="pic">
	<button onclick="img()">picture</button><br><br>
	<div id="result"></div>
</body>
</html>