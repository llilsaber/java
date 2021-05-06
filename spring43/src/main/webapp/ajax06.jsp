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
          url: "resources/data/dataset2.xml",
          success: function(xml) {
             alert('xml연결 성공.!!!')
             list = $(xml).find('record')
//             console.log('레코드의 개수=> ' + list.length)
//             console.log($(list[0]).find('id').text())
//             console.log($(list[0]).find('last_name').text())
//             console.log($(list[0]).find('gender').text())
//            console.log($(list[0]).find('phone').text())
             //last_name, gender, phone
             $(list).each(function(index, record) {
            	 console.log(index + ":" + $(record).find('car_make').text() + "-" + $(record).find('car_model').text() + "-" + $(record).find('car_year').text() + "-" + $(record).find('car_vin').text() + "-" + $(record).find('car_color').text() + "-" + $(record).find('car_price').text() + "-" + $(record).find('car_bool').text() + "-" + $(record).find('car_owner').text())
             })
          } //success
       }) //ajax
    })//b1
    $('#b2').click(function() {
        $.ajax({
           url: "resources/data/MOCK_DATA2.json",
           success: function(json) {
              alert('json연결 성공.!!!==>  '+ json.length)
              //alert(json[0].id)
              $(json).each(function(index, person) { //파라메터 이름 마음대로
                 car_make = person.car_make
                 car_model = person.car_model
                 car_year = person.car_year
                 car_vin = person.car_vin
                 car_color = person.car_color
                 car_price = person.car_price
                 car_bool = person.car_bool
                 car_owner = person.car_owner
                 console.log(car_make, car_model, car_year, car_vin, car_color, car_price, car_bool, car_owner)
              })
           } //success
        }) //ajax
     })//b2
     $('#b3').click(function() {
         $.ajax({
            type: 'POST',
            beforeSend : function(xhr){
                  xhr.setRequestHeader("Authorization", "KakaoAK f911fd3a7ce5dac905b265e249825abe");
                  xhr.setRequestHeader("Content-type","multipart/form-data");
              },
            url: "https://dapi.kakao.com/v2/vision/text/ocr",
            data: {
               image_url: "https://lh3.googleusercontent.com/proxy/1HwewgqNKjoEk-HkQqRHtg5Per7M9JyP_-MlXA46OEIgZ6Ft-3FVh5xAO62Tv_vl92-JHBdJzhImtr8X-wAP-me6SojG-Aq2Xr4QqYwMO9M8z8Z8tgxGq6pQNkk"
            },
            success: function(x) {
               alert('kakao연결 성공.!!! ' + x.result.label_kr)
            } //success
         }) //ajax
      })//b3
 })//$fun

</script>
</head>
<body>
<button id="b1">get xml</button>
<button id="b2">get json</button>
<button id="b3">get xhr</button>
</body>
</html>