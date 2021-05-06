<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<script type="text/javascript">

function blankCheck(p){
	var id=p.id.value;
	id=id.trim();
	if(id.length<4){
		alert("아이디는 4글자 이상 입력해 주세요");
		return false;
	}//if end
	return true;
} //end

function pValue() {
	
	document.getElementById("userid").value = opener.document.join.id.value;
	
}

</script>

<meta charset="UTF-8">
<title>idCheck.jsp</title>
</head>
<body onload="pValue()">
	<div style="text-align: center;">
		<h3>* 아이디 중복확인 *</h3>
		<form method="post"
		      action=" idCheckProc.jsp"
		      onsubmit="return blankCheck(this)">				 
		아이디: <input type="text" name="id" id="userid" maxlength="10" autofocus>
		<input type="submit" value="중복확인">
		</form>
	</div>
</body>
</html>