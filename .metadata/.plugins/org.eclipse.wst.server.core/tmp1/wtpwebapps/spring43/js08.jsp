<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- js페이지에 무조건 있어야하는 태그 -->
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Dialog - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <!-- <link rel="stylesheet" href="/resources/demos/style.css"> -->
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  /* document.getElementById() => $(); */
  $( function() { 
    $( "#dialog" ).dialog();
  } );
  </script>
</head>
<body>
 
<div id="dialog" title="Basic dialog">
  <p>메세지 메세지 메세지</p>
</div>
 
 
</body>
</html>