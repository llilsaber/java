package 배열기본;

import java.util.Random;

public class 로또만들기 {

	public static void main(String[] args) {
		int[] cou = new int[4]; //cou 배열 4개 생성
		int[] num = new int[1000]; //num 배열 1000개 생성 
		
		Random r = new Random(); //r 명령어 지정
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000); //랜덤으로 숫자를 뽑아서 num에 순서대로 저장
		}
		for (int x : num) { //num에 숫자를 하나씩 뽑아서 검토 후 조건에 맞는 cou 배열에 숫자를 하나씩 울려주며 600 이상일 넘을 경우 프린트
			if (x > 600) {
				System.out.println(x + " ");
				cou[3] = cou[3] + 1;
			} else if (x >= 500) {
				cou[2] = cou[2] + 1;
			} else if (x >= 400) {
				cou[1] = cou[1] + 1;
			} else if (x >= 300) {
				cou[0] = cou[0] + 1;
			}
		}
		System.out.println("600이상의 개수 : " + cou[3]);
		System.out.println("300이상의 개수 : " + cou[0]);
		System.out.println("400이상의 개수 : " + cou[1]);
		System.out.println("500이상의 개수 : " + cou[2]);
	}

}
