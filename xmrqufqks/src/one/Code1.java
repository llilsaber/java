package one;

import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력 스캔
		System.out.print("입력해주세요: ");
		String spr = sc.nextLine();
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < spr.length(); i++) {
			String spr2 = spr.substring(i, i + 1);
			if (spr2.equals("a")) {
				a = a + 1;
			}
			if (spr2.equals("b")) {
				b = b + 1;
			}
			if (spr2.equals("c")) {
				c = c + 1;
			}

		}

		System.out.println("a(" + a + "), b(" + b + "), c(" + c + ")");
		sc.close();
	}
}
