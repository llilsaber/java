package 배열복습;

import java.util.Random;

//import 자동완성: 컨트롤+쉬프트+o(영문)
public class 배열사용1 {

	public static void main(String[] args) {
		// 배열을 사용하는 경우
		// 1. 배열을 만드는 순간 데이터를 모르는 경우
		//    공간을 만들어두었다가 나중에 넣는다.
		int[] num = new int[5];
		Random r = new Random(42);
		System.out.println(r);
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100); //0~99
		}
		
		// 2. 배열을 만드는 순간 데이터를 아는 경우
		//    배열생성할 때 바로 데이터를 넣는다.
		int[] num2 = {10, 20, 30, 40, 50};
		
		

	}

}
