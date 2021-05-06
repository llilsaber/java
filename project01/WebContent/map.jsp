<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Google Map</title>
</head>

<body>
    <div id="map" style="width: 100%; height: 100vh;"></div>
    <script async defer
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCxF9p0e18rdjf1MXyTVK3evaKUeRXmFG0&callback=initMap&region=kr"></script>
    <script>
        var map;

        function initMap() {
            
            
            comments = ['서울 중심',  '신촌역 이마트', '도봉산!']
            lats = [ 37.5642135, 37.560260, 37.689447 ]
            lngs = [ 127.0016985, 126.942149, 127.046558 ]
            
            map = new google.maps.Map(document.getElementById('map'), {
                zoom : 12,
                center : {
                        lat : 37.5642135,
                        lng : 127.0016985
                    }
            });
            
            for (var i = 0; i < 3; i++) {
                var site = {
                    lat : lats[i],
                    lng : lngs[i]
                };

                new google.maps.Marker({
                    position : site,
                    map : map,
                    label : comments[i]
                });
            }
        }
    </script>
</body>
</html>