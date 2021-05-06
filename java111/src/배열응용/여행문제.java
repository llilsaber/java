package 배열응용;

import javax.swing.JOptionPane;

public class 여행문제 {

	public static void main(String[] args) {
		String[] last = new String[3]; //{"제주도", "부산", "양양"}
		String[] year = new String[3]; //{"제주도", "속초", "울산"}
		for (int i = 0; i < year.length; i++) {
			last[i] = JOptionPane.showInputDialog("작년에 가고 싶었던 곳");
			year[i] = JOptionPane.showInputDialog("올해에 가고 싶었던 곳");
		}
		for (int i = 0; i < year.length; i++) {
			System.out.println(last[i] + " " + year[i]);
		}
		int count = 0;
		for (int i = 0; i < year.length; i++) {
			if(last[i].equals(year[i])) {
				count++;
				System.out.println("같은 위치는 "+ i);
			}
		}
		System.out.println("같은 위치의 개수는 " + count);

	}

}
