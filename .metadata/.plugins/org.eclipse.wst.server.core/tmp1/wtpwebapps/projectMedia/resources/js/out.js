/**
 * 
 */
// 동적으로처리할 기능을 정의
// 기능 정의 ==> function(함수), 메서드
// 브라우저에서 처리함 


function add(x, y){ // 매개변수, 파라메터
	sum = x + y // x=300, y=200, sum=500
	alert(sum+' 최종 지불 금액을 더하는 처리를 함.')
	return sum
}

function minus(z){ //z에 sum의 값 500이 들어옴
	if(z>=500){
		z = z - 100
	}
	alert(z + '원 최종 지불 금액을 빼주는 처리를 함.')
}