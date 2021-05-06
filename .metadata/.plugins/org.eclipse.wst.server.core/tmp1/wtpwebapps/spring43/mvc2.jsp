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
				url: "move.jsp",
				data: {
					name: $('#name').val(),
					cash: $('#cash').val()
				},
				success: function(result){
					$('div').html(result)
				}
			})
		})
	})
</script>
</head>
<body>
move name: <input id="name"><br>
move cash: <input id="cash"><br>
<input id="b1" type="button" value="move check">
<hr color="red">
<div></div>
</body>
</html>