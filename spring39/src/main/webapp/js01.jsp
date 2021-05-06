<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function web() {
		site = document.getElementById('site').value
		if (site == "네이버")
			location.href = 'http://www.naver.com/'
		else if (site == "구글")
			location.href = 'https://www.google.co.kr/'
		else if (site == "다음")
			location.href = 'https://www.daum.net/'
		else
			alert("사이트가 없습니다")
	}
	function pay() {
		com = document.getElementById('com').value
		money = parseInt(document.getElementById('money').value)
		choice = document.getElementById('choice').value
		if (choice == "계좌이체")
			sum = money + 0
		else if (choice == "신용카드")
			sum = money + 1000
		else if (choice == "휴대폰결제")
			sum = money + 500
		else
			alert("결제수단을 선택해주세요")
		result.innerHTML = com + "에서 " + sum + "원 " + choice + "로 구매하셨습니다"
	}
</script>
</head>
<body>
<input type="text" id="site">
	<button onclick="web()">site move</button><br>
	
	shop name : <input type="text" id="com">
	how money : <input type="text" id="money"><br>
	<input type="radio" id="choice" name="choice" value="계좌이체">bank
	<input type="radio" id="choice" name="choice" value="신용카드">cad
	<input type="radio" id="choice" name="choice" value="휴대폰결제">phone
	<button onclick="pay()">fin</button><br>
	<div id="result"></div>
</body>
</html>