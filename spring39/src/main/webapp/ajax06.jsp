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
			url: "resources/data/dataset.xml",
		})
	})
	success: function(xml) {
		alert('sml success')
		list = $(xml).find('record')
		console.log('recod num => ' + list.length)
		console.log(list)
	}
})
</script>
</head>
<body>
<button id="b1">get xml</button>
<button id="b2">get json</button>
</body>
</html>