<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(function() {
	$('#button1').click(function() { //버튼을 클릭했을때
	data = $('#data1').val()
	alert(data)
	})
	$('#button2').click(function() {
	data = $('#data2').val()
	alert(data)
	})
})
</script>
</head>
<body>
<input id="data1" value="go eat!!!">
<button id="button1">what are you?</button>
<hr>
<input id="data2" value="go syudy!!!">
<button id="button2">what are you?</button>
</body>
</html>