package 배열심화;

import java.util.Arrays;
import java.util.Random;

public class 배열을정렬 {

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
		System.out.println("제일 큰수 : " + num[num.length - 1]);
		System.out.println("제일 작은 수 : " + num[0]);
	}

}
