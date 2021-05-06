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
		$('#b1').click(function() {
			telVal = $('#tel').val()
			$.ajax({
				url: "text",
				data: {
					tel : telVal
				},
				success: function(x){
					$('#result').html('<h3>' + x + '</h3>')
				}
			})
		})
		
		$('#b2').click(function() {
			numVal = $('#num').val()
			num2Val = $('#result').text()
			if (numVal == num2Val)
				alert('message check clear!!!')
			else
				alert('message check false!!!')
		})
	})
</script>
</head>
<body>
get phone number: <input id="tel"><input id="b1" type="button" value="get number"><br>
set number check: <input id="num"><input id="b2" type="button" value="number check"><br>
<hr color="red">
<div id="result"></div>
</body>
</html>