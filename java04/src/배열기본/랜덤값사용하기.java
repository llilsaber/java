package �迭�⺻;

import java.util.Random;

public class ����������ϱ� {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random r = new Random(); //����(seed)
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) +1;
		}
		for (int x : lotto) {
			System.out.println(x + " ");
		}
	}

}
