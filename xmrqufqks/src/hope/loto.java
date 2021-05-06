package hope;

import java.util.Arrays;

public class loto {

	public static void main(String[] args) {
		int randombox; // 랜덤 클래스 사용
int x;
		int[] lotto = new int[6]; // lotto 변수형 배열 생성
		while (true) { // 무한 반복
			if (lotto[5] > 0) {
				Arrays.parallelSort(lotto); // 오름차순으로 정렬
				System.out.println(Arrays.toString(lotto)); // lotto 배열 출력
				break; // 반복문 중지
			} else {
				for (int i = 0; i < lotto.length; i++) {
					randombox = (int) (Math.random() * (45 - 1 + 1) + 1);
					x = randombox;
					if (lotto[0] == x || lotto[1] == x || lotto[2] == x || lotto[3] == x || lotto[4] == x
							|| lotto[5] == x) { // 같은 숫자가 있는지 확인
						i = i - 1; // 배열에 같은 번호가 발견될 시 자리수 낮추어서 다시 번호를 생성하게 함
					} else
						lotto[i] = x; // 같은 번호가 없을 경우 배열에 번호를 들록함
				}
			}
		}
	}
}