package yesterday;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�б� ���� ü�� : ");
		int ath = sc.nextInt();
		System.out.print("1�б� ���� ���� : ");
		int mat = sc.nextInt();
		System.out.print("1�б� ���� ���� : ");
		int eng = sc.nextInt();
		System.out.print("1�б� ���� ���� : ");
		int kor = sc.nextInt();
		
		int sum = ath + mat + eng + kor;
		double avr = (double)sum / 4;
		
		System.out.println("��� ������ ���� : " + sum);
		System.out.println("��� ������ : " + avr);

	}

}
