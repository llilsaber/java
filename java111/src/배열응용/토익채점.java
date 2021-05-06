package 배열응용;

import java.util.Random;

public class 토익채점 {

	public static void main(String[] args) {
		// 문제990 답안, 내답
		// 코드 정리: 컨트롤+쉬프트+f
		Random r = new Random();

		int[] 답안 = new int[9900];
		int[] 내답 = new int[9900];
		// 1~4까지의 값을 두 배열에 넣어보세요.
		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4) + 1;// 1~4
			내답[i] = r.nextInt(4) + 1;
		}

		// 프린트
		System.out.println("번호  :   답안        내답");
		for (int i = 0; i < 내답.length; i++) {
			System.out.println(i + "   :   " + 답안[i] + "  <->  " + 내답[i]);
		}

		int count = 0;
		for (int i = 0; i < 내답.length; i++) {
			if (답안[i] == 내답[i]) {
				count++;
			}
		}
		System.out.println("점수는 " + count + "점");

	}

}
