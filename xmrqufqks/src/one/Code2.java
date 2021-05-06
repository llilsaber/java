package one;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력해주세요: ");
		String str = sc.nextLine();
		String str2 = str.replace(",", ""); // 제거
		String[] array = str2.split(" "); // 분리
		int hum = 0;
		int hum1 = 0;
		int hum2 = 0;
		int hum3 = 0;
		int hum4 = 0;
		int don = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("사람")) 
				hum = hum + 1;
			else if (array[i].equals("나는")) 
				hum1 = hum1 + 1;
			else if (array[i].equals("너도")) 
				hum2 = hum2 + 1;
			else if (array[i].equals("우리도")) 
				hum3 = hum3 + 1;
			else if (array[i].equals("모두다")) 
				hum4 = hum4 + 1;
			else
				don = don + 1;
		}
		System.out.println("나는(" + hum1 + "), 너도(" + hum2 + "), 우리도(" + hum3 + "), 모두다(" + hum4 + "), 사람(" + hum + "), 몰라요(" + don + ")");
		sc.close();
	}
}
