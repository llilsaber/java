package 배열응용;

import javax.swing.JOptionPane;

public class 입력하여배열에넣자 {

	public static void main(String[] args) {
		String[] s = new String[3]; //{null, null, null}
		
		//입력받아 넣음
		for (int i = 0; i < s.length; i++) {
			s[i] = JOptionPane.showInputDialog("가고 싶은 장소 입력");
		}
		//넣은 값 하나씩 꺼내서 출력
		for (String x : s) {
			System.out.print(x + " ");
		}
		//배열안에 제주도가 있는지 확인하고 싶음
		for (int i = 0; i < s.length; i++) {
			if(s[i].equals("제주도")) {
				System.out.println("제주도가 있음.");
				System.out.println("위치는 " + i);
			}
		}
		
	}

}
