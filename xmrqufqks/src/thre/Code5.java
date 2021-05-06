package thre;

import java.util.Random;

public class Code5 {

	public static void main(String[] args) {
		/* !!!!!!!!!!!!!!!!!!!!
		 * !!  우사의 랜덤 주사위  !!
		 * !!  돈 넣고   돈 먹기    !!
		 * !!  문의 전화는 xxxx !!
		 * !!!!!!!!!!!!!!!!!!!! */
		Random r = new Random(); // 랜덤 클래스 사용

		int N = r.nextInt(10000); // 10,000 이하의 숫자를 부여
		String[] str = new String[N]; // 10,000 이하의 자리 배열 생성
		for (int i = 0; i < str.length; i++) {//첫번째 수 다음 박을 순서대로 넣는다
			if (i % 2 == 0)
				str[i] = "수";
			else
				str[i] = "박";
			System.out.print(str[i]);
		}
	}

}