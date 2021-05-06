package 조건문;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String rnao, vip;
		int mon;
		
		System.out.print("구매항목 : ");
		rnao = sc.next();
		System.out.print("구매금액 : ");
		mon = sc.nextInt();
		System.out.println("당신은 vip입니까? (yes/no) ");
		vip = sc.next();
		
		if (rnao.equals("과자")) {
			System.out.println("어린아이군요!");
		} else if (rnao.equals("라면")) {
			System.out.println("성인이군요!");
		} else {
			System.out.println("뭔가를 샀군요");
		}

		if (vip.equals("yes")) {
			System.out.println("구매금액은 : " + (mon - (int) 1000));
		} else {
			System.out.println("구매금액은 : " + mon);
		}
	
	}

}
