package two;

import java.util.Scanner;

public class Code5 {

	public static void main(String[] args) {
		/* !!!!!!!!!!!!!!!!!!!!
		 * !!  우사의 스릴 놀이터  !!
		 * !!   참여자 제한 없음   !!
		 * !!!!!!!!!!!!!!!!!!!! */
		Scanner sc = new Scanner(System.in);
		int x = 0;

		while (x < 2) { // 조건을 만족할때까지 반복
			System.out.print("반복 횟수와 입력한 단어를 적어주세요 -> ");
			String spr = sc.nextLine(); // 입력받음
			String[] array = spr.split(" "); // 배열로 분리
			int rpl = Integer.parseInt(array[0]); // 첫번째 숫자를 인트값으로 저장
			String val = array[1]; // 두번짜 문자열을 스트링으로 저장
			if (1 <= rpl && rpl <= 8) // 반복횟수가 1~8 사이가 맞는지 확인
				x = x + 1;
			else {
				System.out.println("반복 횟수는 1번에서 8번까지 가능합니다");
				x = 0;
			}
			if (1 <= val.length() && val.length() <= 20) { // 문자의 갯수가 1~20개 사이가 맞는 확인
				x = x + 1;
			} else {
				System.out.println("단어는 1글자에서 20글자까지 가능합니다");
				System.out.println("다시 입력해 주세요");
				x = 0;
			}
			if (x == 2) { // 조건에 맞으면 실행
				for (int i = 0; i < val.length(); i++) { // 문자의 갯수만큼 반복
					for (int l = 0; l < rpl; l++) { // 정해준 반복 횟수만큼 반복
						System.out.print(val.substring(i, i + 1)); // 한글자씩 출력
					}

				}
			}
		}
		sc.close();
	}
}
