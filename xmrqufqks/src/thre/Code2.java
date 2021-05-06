package thre;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		/* !!!!!!!!!!!!!!!!!!!!
		 * !!  우사의 랜덤 주사위  !!
		 * !!  돈 넣고   돈 먹기    !!
		 * !!  문의 전화는 xxxx !!
		 * !!!!!!!!!!!!!!!!!!!! */

			Scanner sc = new Scanner(System.in); // 입력 스캔
			System.out.print("입력해주세요: ");
			int num = sc.nextInt();
			if (num <= 100000000) { // 100,000,000 이하의 숫자가 맞는지 확인
				int sum = 0;
				for (; num > 0;) {
					int num3 = num % 10; // 첫번째 자리수 값
					num = num / 10;// 첫번째 자리수를 빼고 남은 값
					sum = sum + num3;// 각 자리수의 값을 다 더한 값
				}
				System.out.println("총합은 : " + sum);
				return num;
			} else { // 숫자가 100,000,000 이하가 아닌 경우
				System.out.println("100,000,000 이하의 숫자로 적어주세요");
			}
			sc.close();
		}


}
