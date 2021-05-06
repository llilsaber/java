package 배열심화;

import java.util.Random;

public class 최대값찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[1000];
		Random r = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}
		int max = num[0];
		
		for (int i = 1; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);
	}

}
