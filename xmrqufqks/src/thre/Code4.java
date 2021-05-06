package thre;

import java.util.Scanner;

public class Code4 {

	public static void main(String[] args) {
		/* !!!!!!!!!!!!!!!!!!!!
		 * !!  우사의 랜덤 주사위  !!
		 * !!  돈 넣고   돈 먹기    !!
		 * !!  문의 전화는 xxxx !!
		 * !!!!!!!!!!!!!!!!!!!! */
		while (true) {
			Scanner sc = new Scanner(System.in); // 입력 스캔
			System.out.print("a 값을 입력해주세요: ");
			int a = sc.nextInt();//a값을 받는다
			System.out.print("b 값을 입력해주세요: ");
			int b = sc.nextInt();//b값을 받는다
			int sum = 0;
			if (-10000000 <= a && a <= 10000000 && -10000000 <= b && b <= 10000000) { // -10,000,000 이상 10,000,000 이하의 숫자가 맞는지 확인
				System.out.print("a값은 : " + a + ", b값은 : " + b);
				if (a < b) { //b가 a보다 클 경우
					for (; a <= b; a++) {
						sum = sum + a;
					}
				}
				else if (a > b) { //a가 b보다 클 경우
					for (; b <= a; b++) {
						sum = sum + b;
					}
				}
				else { // 둘이 같을 경우
					sum = a;
				}
				System.out.println(", 총합은 : " + sum);
				break;
			}
			else {
				System.out.println("숫자는 -10,000,000 이상, 10,000,000 이하의 숫자만 입력이 가능합니다");
			}
			sc.close();
		}

	}
}
