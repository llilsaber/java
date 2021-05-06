package 배열복습;

import java.util.Random;

public class 배열사용1 {

	public static void main(String[] args) {
		// 배열을 만드는 순간 데이터를 모르는 경우
		// 배열을 만드는 순간 데이터를 아는 경우
		int[] num = new int[5];
		Random r = new Random(42);
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000); // 0~99
		}
		
//		int[] num2 = {10, 20, 30, 40, 50};
//		for (int i = 0; i < num2.length; i++) {
//			System.out.println(num2[i] + " ");
//		}
//		
//		for (int s : num2) {
//			System.out.print(s + " ");
//		}
		// 지역변수는 이 지역안에서 만들어지는 변수는 지역밖에서는 인식 불과
		//변수는 만들어지는 위치 지역안에서만 사용 가능!
		//변수가 언제만들어지는가? 타입 변수명; (선언)
	}

}
