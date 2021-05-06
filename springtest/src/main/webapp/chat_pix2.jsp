<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['bar']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
    	  var data = google.visualization.arrayToDataTable([
    	        ['Team', 'member1', 'member2', 'member3', 'member4',
    	         'member5', 'member6', 'member7', { role: 'annotation' } ],
    	        ['PIXEL', 47.7, 15.2, 16.2, 45.2, 67.1, 14.2, 22.3, ''],
    	        ['SANDBOX', 101, 15.8, 177, 242, 30.3, 18.2, 51.2, ''],
    	        ['SWAMP', 23.1, 18.9, 44.4, 32, 10.8, 12.1, 41.6, ''],
    	        ['LOLQ', 2.4, 76.1, 33.6, 23.5, 34.5, 8.06, 5.27, '']
    	      ]);

    	      var options = {
    	    	title: '팀별(7명까지) 구독자 수(단위:M)',
    	        width: 600,
    	        height: 400,
    	        legend: { position: 'top', maxLines: 3 },
    	        bar: { groupWidth: '75%' },
    	        isStacked: true,
    	      };

        var chart = new google.charts.Bar(document.getElementById('columnchart_material'));

        chart.draw(data, google.charts.Bar.convertOptions(options));
      }
    </script>
  </head>
  <body>
    <div id="columnchart_material" style="width: 800px; height: 500px;"></div>
  </body>
</html>