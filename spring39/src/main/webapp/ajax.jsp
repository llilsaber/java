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
		alert('b1 button click!')
		$.ajax({
			url: "text.jsp",
			success: function(result) {
				alert("test page clear!!")
			},
			error: function() {
				alert("test pagr false!!")
			}
		})
	})
})
</script>

</head>
<body>
<button id="b1">ajax test</button>
</body>
</html>