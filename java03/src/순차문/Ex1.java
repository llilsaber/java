package ������;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Ex1 {

	public static void main(String[] args) {
		String eng = JOptionPane.showInputDialog("���� ������ �Է����ּ��� : ");
		String jap = JOptionPane.showInputDialog("jpt ������ �Է����ּ��� : ");

		int engi = Integer.parseInt(eng);
		int japi = Integer.parseInt(jap);
		
		int ham_eng = engi / 3 * 2;
		int ham_jap = japi / 3;
		
		JOptionPane.showMessageDialog(null, "����� �ܱ��� �� ������ : " + (ham_eng + ham_jap) + "��");
		
	}

}
