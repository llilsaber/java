package ���ǹ�;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String rnao, vip;
		int mon;
		
		System.out.print("�����׸� : ");
		rnao = sc.next();
		System.out.print("���űݾ� : ");
		mon = sc.nextInt();
		System.out.println("����� vip�Դϱ�? (yes/no) ");
		vip = sc.next();
		
		if (rnao.equals("����")) {
			System.out.println("����̱���!");
		} else if (rnao.equals("���")) {
			System.out.println("�����̱���!");
		} else {
			System.out.println("������ �򱺿�");
		}

		if (vip.equals("yes")) {
			System.out.println("���űݾ��� : " + (mon - (int) 1000));
		} else {
			System.out.println("���űݾ��� : " + mon);
		}
	
	}

}
