package 연습용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();

		int[] lotto = new int[6];
		while(true) {
			if (lotto[5] > 0) {
				//---Arrays.parallelSort(lotto);
				System.out.println(Arrays.toString(lotto));
				break;
			} else {
				for (int i = 0; i < lotto.length; i++) {
					int x = r.nextInt(45) + 1;
					if (lotto[0] == x || lotto[1] == x || lotto[2] == x || lotto[3] == x || lotto[4] == x || lotto[5] == x) {
						i = i - 1;
					} else {
					lotto[i] = x;
					}
				}
			}
		}
	}

}
