package 배열복습;

import javax.swing.JOptionPane;

public class 입력하여배열에넣자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = new String[3];
		String[] n = new String[3];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = JOptionPane.showInputDialog("작년에 가고 싶었던 곳을 입력하세요");
		}
		
		for (int i = 0; i < n.length; i++) {
			n[i] = JOptionPane.showInputDialog("올해에 가고 싶었던 곳을 입력하세요");
		}
		
		for (int i = 0; i < n.length; i++) {
			if (s[i].equals(n[i])) {
				System.out.print(s[i] + " ");
			}
		}
	}

}
