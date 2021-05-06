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
			$.ajax({
				url: "computer",
				data: {
					cname: $('#cname').val(),
					mname: $('#mname').val(),
					ccash: $('#ccash').val(),
					mcash: $('#mcash').val()
				},
				success: function(x){
					$('div').html(x)
				}
			})
		})
	})
</script>
</head>
<body>
computer name: <input id="cname"><br>
computer cash: <input id="ccash"><br>
mouse name: <input id="mname"><br>
mouse cash: <input id="mcash"><br>
<input id="b1" type="button" value="move check">
<hr color="red">
<div id="result"></div>
</body>
</html>