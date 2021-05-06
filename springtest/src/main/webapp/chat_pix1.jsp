<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['구독자', 'views', 'revenue'],
          ['74.7K', 82700, 185257],
          ['105K', 15700, 159019],
          ['138K', 96900, 205238],
          ['144K', 65400, 104886],
          ['152K', 17800, 61887],
          ['162K', 48200, 69520],
          ['266K', 50700, 173496],
          ['447K', 197900, 590488],
          ['452K', 278900, 812889]
        ]);

        var options = {
          title: '픽셀스토어 구독자별 조회수와 수익',
          hAxis: {title: '구독자',  titleTextStyle: {color: '#333'}},
          vAxis: {minValue: 0}
        };

        var chart = new google.visualization.AreaChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    <div id="chart_div" style="width: 100%; height: 500px;"></div>
  </body>
</html>