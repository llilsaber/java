package yesterday;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1학기 성적 체육 : ");
		int ath = sc.nextInt();
		System.out.print("1학기 성적 수학 : ");
		int mat = sc.nextInt();
		System.out.print("1학기 성적 영어 : ");
		int eng = sc.nextInt();
		System.out.print("1학기 성적 국어 : ");
		int kor = sc.nextInt();
		
		int sum = ath + mat + eng + kor;
		double avr = (double)sum / 4;
		
		System.out.println("모든 점수의 합은 : " + sum);
		System.out.println("평균 점수는 : " + avr);

	}

}
