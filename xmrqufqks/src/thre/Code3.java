package thre;

import java.util.Arrays;
import java.util.Random;

public class Code3 {

	public static void main(String[] args) {
		/* !!!!!!!!!!!!!!!!!!!!
		 * !!  우사의 랜덤 주사위  !!
		 * !!  돈 넣고   돈 먹기    !!
		 * !!  문의 전화는 xxxx !!
		 * !!!!!!!!!!!!!!!!!!!! */
		Random r = new Random(); // 랜덤 클래스 사용

		int N = r.nextInt(1000000); // 1,000,000 이하의 숫자를 부여
		int[] arr = new int[N]; // 100,000,000 이하의 자리 배열 생성
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10); // 0~9사이에 숫자를 배열에 순차적으로 추가
		}
		System.out.println(Arrays.toString(arr)); // 완성된 배열 출력
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] == arr[x - 1]) { // 현재 자리가 앞자리와 같을 경우
				if (x == arr.length) { // 현재 자리가 마지막 자리일 경우
					arr = Arrays.copyOf(arr, arr.length - 1); // 마지막 배열 칸을 줄인다
				} else { // 현재 판별하는 자리가 마지막 자리가 아닐 경우
					for (int y = x; y < arr.length - 1; y++) {
						arr[y] = arr[y + 1]; // 현재 자리에 뒤에 자리를 입력한다
					}
					arr = Arrays.copyOf(arr, arr.length - 1); // 마지막 배열 칸을 줄인다
				}
				x = x - 1; // 바뀐 자리를 다시 검사한다
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}