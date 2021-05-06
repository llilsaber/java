<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>단풍나무의 어빌리티</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
   $(function() {
      $('#button1').click(function() {
    	  abil = $('input[name=abil]:checked').val()
         if (abil == "legen")
            alert('등급업 확률은 아직 공개되지 않았습니다!!' + abil)
         else if (abil == "alock") {
        	 one = $('select[name=one]').val()
        	 count = 0
        	  if(one == "boss"){
        		  while (true) {
         			 data = Math.random() * (3252 - 1 + 1) + 1
         	         data1 = data - data % 1
         	         if (data1 == 1536) {
         	        	 count = count + 1
         	             break
         	         }
         	         else
         	        	 count = count + 1
         		 }
        	 }
        	 if(one == "passive"){
       		  while (true) {
        			 data = Math.random() * (3252 - 1 + 1) + 1
        	         data1 = data - data % 1
        	         if (data1 == 316) {
        	        	 count = count + 1
        	             break
        	         }
        	         else
        	        	 count = count + 1
        		 }
       	 }
        	 if(one == "buff"){
       		  while (true) {
        			 data = Math.random() * (3252 - 1 + 1) + 1
        	         data1 = data - data % 1
        	         if (data1 == 1515) {
        	        	 count = count + 1
        	             break
        	         }
        	         else
        	        	 count = count + 1
        		 }
       	 }
        	 if(one == "skill"){
       		  while (true) {
        			 data = Math.random() * (3252 - 1 + 1) + 1
        	         data1 = data - data % 1
        	         if (data1 == 1698) {
        	        	 count = count + 1
        	             break
        	         }
        	         else
        	        	 count = count + 1
        		 }
       	 }
        	 div = $('div')
	         div.append(count + '회, ' + (count * 10100) + '명성치' + '<br>')
	         return data
         }
         else if (abil == "olock") {
         }
         else if (abil == "tlock") {
         }
      })
   })
</script>
</head>
<body>
   <input type="radio" name="abil" value="legen">레전더리 승급&nbsp;
   <input type="radio" name="abil" value="alock">등급 잠금&nbsp;
   <input type="radio" name="abil" value="olock">1줄 잠금&nbsp;
   <input type="radio" name="abil" value="tlock">2줄 잠금&nbsp;
   <button id="button1">Ability</button><br>
   !등급 잠금일 경우(첫줄)!&nbsp;
   <select name="one">
         <option value="boss">보공</option>
         <option value="passive">패시브</option>
         <option value="buff">버프지속시간</option>
         <option value="skill">스킬쿨타임</option>
      </select>
   <div></div>
   <a href="percentage.jsp">Main</a>
</body>
</html>