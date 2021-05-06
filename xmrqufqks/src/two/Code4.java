package two;

import java.util.Random;

public class Code4 {

	public static void main(String[] args) {
		/* !!!!!!!!!!!!!!!!!!!!
		 * !!  우사의 스릴 놀이터  !!
		 * !!   참여자 제한 없음   !!
		 * !!!!!!!!!!!!!!!!!!!! */
		Random r = new Random(); // 랜덤 클래스 사용

		int N = r.nextInt(100) + 1; // 1~100 중 랜덤으로 N에 부여
		int[] num = new int[N]; // N개의 배열을 받도록 입력
		int x = r.nextInt(9) + 1; // 1~9 중 랜덤으로 x에 부여
		int sum = 0;

		System.out.println("숫자의 갯수는 : " + N);
		for (int i = 0; i < num.length; i++) {
			num[i] = x; // x값을 배열 i자리에 저장한다
			System.out.print(num[i]);
			sum = sum + x;
			x = r.nextInt(10); // 0~9 중 랜덤으로 x값을 다시 받아 온다
		}
		System.out.println(" ");
		System.out.println("숫자의 총 합은 : " + sum);
	}
}
