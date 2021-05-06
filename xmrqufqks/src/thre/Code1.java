package thre;

import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) {
		/* !!!!!!!!!!!!!!!!!!!!
		 * !!  우사의 랜덤 주사위  !!
		 * !!  돈 넣고   돈 먹기    !!
		 * !!  문의 전화는 xxxx !!
		 * !!!!!!!!!!!!!!!!!!!! */
		while (true) {
			Scanner sc = new Scanner(System.in); // 입력 스캔
			System.out.print("입력해주세요: ");
			String spr = sc.nextLine();
			if (1 <= spr.length() && spr.length() <= 100) { // 글자수가 1~100자리 숫자가 맞는지 확인
				if ((spr.length() % 2) == 0) { // 글자수가 짝수일 경우
					String spr2 = spr.substring((spr.length() / 2 - 1), (spr.length() / 2 + 1));
					System.out.println(spr2);
					break;
				} else { // 글자수가 홀수일 경우
					String spr2 = spr.substring((spr.length() / 2 - 1), (spr.length() / 2));
					System.out.println(spr2);
					break;
				}
			} else { // 글자숫가 1~100 사이가 아닌 경우
				System.out.println("글자를 1~100자 사이로 적어주세요");
			}
			sc.close();
		}

	}

}
