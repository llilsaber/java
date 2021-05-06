package 클래스사용;

import 클래스만들기.계좌;

public class 계좌사용 {

	public static void main(String[] args) {
		계좌 a1 = new 계좌();
		a1.name = "박길동";
		a1.field = "적금";
		a1.money = 1000;
		System.out.println(a1);
		a1.입금하다("김길동", 2000);
		a1.입금하다("정길동", "적금" , 3000);
		a1.출금하다(2000);
	}

}
