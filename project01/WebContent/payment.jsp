<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
       int money = Integer.parseInt(request.getParameter("money"));
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
<script type="text/javascript">
var IMP = window.IMP; // 생략가능
IMP.init('iamport'); // 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
function pay() {
   IMP.request_pay({
       pg : 'inicis', // version 1.1.0부터 지원.
       pay_method : 'card',
       merchant_uid : 'merchant_' + new Date().getTime(),
       name : '주문명:결제테스트',
       amount : <%= money %>,
       buyer_email : 'admin@mega.co.kr' ,
       buyer_name : '구매자이름',
       buyer_tel : '010-1234-5678',
       buyer_addr : '서울특별시 강남구 삼성동',
       buyer_postcode : '123-456',
       m_redirect_url : 'https://www.yourdomain.com/payments/complete'
   }, function(rsp) {
       if ( rsp.success ) {
           var msg = '결제가 완료되었습니다.';
           msg += '고유ID : ' + rsp.imp_uid;
           msg += '상점 거래ID : ' + rsp.merchant_uid;
           msg += '결제 금액 : ' + rsp.paid_amount;
           msg += '카드 승인번호 : ' + rsp.apply_num;
          location.href="ok.jsp?id=<%= session.getAttribute("id")%>&money=" + money
       } else {
           var msg = '결제에 실패하였습니다.';
           msg += '에러내용 : ' + rsp.error_msg;
           location.href="http://www.daum.net"
       }
       alert(msg);
   });
}
</script></head><body><button type="button" onclick="pay()">결제하러가자.</button>
</body>
</html>