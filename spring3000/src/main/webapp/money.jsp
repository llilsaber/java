<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   String money = request.getParameter("money");
   String choice = request.getParameter("choice");
   double money2=Double.parseDouble(money);
   if (choice.equals("1")) {
      div.html("계좌이체, 금액: "+ money2 * 0.8 + "원");
   }
   else if (choice.equals("2")){
      div.html("카드결제, 금액: " + money2 * 0.9 +"원");
   }
   
   else if (choice.equals("3")){
      div.html("카드결제, 금액: " + money2 +"원");
   }
   else {
      div.html("정보를 다시 확인해주세요");
   }
%> 결제금액 계산해서 넘길 예정임!!!==> <%= (int)money2 %>원, 선택번호 <%= choice %>
