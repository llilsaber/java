package �迭��ȭ;

import java.util.Arrays;
import java.util.Random;

public class �迭������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[100];
		Random r = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100);
		}
		Arrays.sort(num);
		
		for (int x : num) {
			System.out.println(x);
		}
		System.out.println("���� ū�� : " + num[num.length - 1]);
		System.out.println("���� ���� �� : " + num[0]);
	}

}
