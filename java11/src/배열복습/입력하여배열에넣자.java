package �迭����;

import javax.swing.JOptionPane;

public class �Է��Ͽ��迭������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = new String[3];
		String[] n = new String[3];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = JOptionPane.showInputDialog("�۳⿡ ���� �;��� ���� �Է��ϼ���");
		}
		
		for (int i = 0; i < n.length; i++) {
			n[i] = JOptionPane.showInputDialog("���ؿ� ���� �;��� ���� �Է��ϼ���");
		}
		
		for (int i = 0; i < n.length; i++) {
			if (s[i].equals(n[i])) {
				System.out.print(s[i] + " ");
			}
		}
	}

}
