package 배열기본;

public class 배열만들기ex {

	public static void main(String[] args) {
		// 배열 : array
//		int[] num = new int[1000];
		
		int[] num2 = new int[5];
		//전체 변수가 몇 개 생겼나요? 7개
		// 각변수에는 무엇이 들어있을까요? num2 : 데이터들이 들어있는 주소, int[5] : 자동초기화된 값, 0으로 초기화, lenght : 읽기전용, 배열에 들어간 저장공간의 개수, 배열은 크기를 변경 불가능
		//첫번째 가르킬 때는 num2[0] 얼마가 들어있을까요?
		num2[1] = 300;
		System.out.println(num2[0]);
		System.out.println(num2[1]);
		System.out.println(num2);
		
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}
		
		//for-each 배열에서 하나씩 꺼내와서 처리
		for (int i : num2) {
			System.out.println(i);
		} 
	}

}
