package 클래스연습;

import java.util.Arrays;

public class bank {
	
	public void human(String x, String y, String z) {
		String[][] member = {{"은행", "예금예명", "금액"}, {x, y, z}};
		System.out.println(Arrays.toString(member));
	}
}
