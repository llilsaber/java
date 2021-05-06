package ¹è¿­±âº»;

import java.util.Random;

public class ·£´ý°ª»ç¿ëÇÏ±â {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random r = new Random(); //¾¾¾Ñ(seed)
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) +1;
		}
		for (int x : lotto) {
			System.out.println(x + " ");
		}
	}

}
