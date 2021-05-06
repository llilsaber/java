package two;

import java.util.Scanner;

public class Code6 {

	public static void main(String[] args) {
		/* !!!!!!!!!!!!!!!!!!!!
		 * !!  우사의 스릴 놀이터  !!
		 * !!   참여자 제한 없음   !!
		 * !!!!!!!!!!!!!!!!!!!! */
		Scanner sc = new Scanner(System.in);
		System.out.print("A값을 입력해주세요 : ");
		int A = sc.nextInt();// A값 입력 받기
		System.out.print("B값을 입력해주세요 : ");
		int B = sc.nextInt();// B값 입력 받기
		System.out.print("C값을 입력해주세요 : ");
		int C = sc.nextInt();// C값 입력 받기

		int sum = A * B * C; // 3값의 곱한값
		int count = 0;
		String sum2 = Integer.toString(sum); // int값을 String값으로 변경
		// String값을 변경하기 싫다면 Math.log10+1을 사용해서 int의 자릿수를 구할 수도 있다
		// log()함수는 숫자의 승수를 구해준다
		for (int x = 0; x < 10; x++) {// 0~9까지 반복
			for (int y = 0; y < sum2.length(); y++) {// 0에서 자릿수 만큼 반복
				int num = Integer.parseInt(sum2.substring(y, y + 1));// y번째 글자를 int로 저장한다
				if (num == x) {
					count = count + 1; // y번째 자리 숫자가 x와 같은때 카운트를 센다
				}
			}
			if (0 < count) { // 사용하지 않은 숫자는 출력되지 않는다
				if (x < 9)
					System.out.print(x + "이 " + count + "번, ");
				else
					System.out.print(x + "이 " + count + "번"); // 마지막 출력은 ,를 뺐다
				count = 0; // 사용한 카운트 숫자는 다시 0으로 초기화한다
			}
		}
		sc.close();
	}
}
