<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    //설정된 여러 세션값들 중 하나만 제거하는 경우
    //session.removeAttribute("id");
    //세션 자체를 끊어버리는 경우
    session.invalidate();
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

로그아웃 되었습니다.<br>
다시 로그인 하시려면, 아래 로그인 페이지 버튼을 클릭해주세요.
<a href="login2.jsp">로그인</a>

</body>
</html>