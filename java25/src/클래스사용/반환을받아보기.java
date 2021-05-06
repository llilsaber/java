package 클래스사용;

import java.sql.DriverManager;
import java.util.Date;

public class 반환을받아보기 {

	public static void main(String[] args) {
		반환값연습 re = new 반환값연습();
		re.add2();
		// void인 메서드를 호출하는경우에는
		// 변수에 그 결과값을 넣을 수 없음.
		// 프린트도 안된다.

		// 메서드를 호출하고 나서 반환값이 있을 때만-
		// 변수에 그 결과값을 넣을 수도 있고
		// 출력할 수도 있다.
//		String rest = re.add2();
//		System.out.println(re.add2());
		int sum1 = re.add(200, 100);
		System.out.println(sum1);

		double sum2 = re.add(33.3, sum1);
		System.out.println(sum2);

		String sum3 = re.add("다음시간은 ", "점심시간");
		System.out.println(sum3);

		String sum4 = re.add(100, "은 나의 백넘버 ");
		System.out.println(sum4);

		int[] sum5 = re.add();
		for (int x : sum5) {
			System.out.println(x);
		}

		String s; // 일반클래스는 변수의 타입으로 사용할 수 있다.
		Date d = re.getDate();
		System.out.println(d);

		// DriverManager.getConnection(url, user, password)

	}

}
