package ���ǹ�;

import javax.swing.JOptionPane;

public class Massgi {

	public static void main(String[] args) {
		String food = JOptionPane.showInputDialog("�԰� ���� ���� �޴��� " );
		
		String result = "";
		if (food.equals("«��")) {
			result = "�߱�������";
			//JOptionPane.showMessageDialog(null, "�߱�������");
		} else {
			result = "������";
			//JOptionPane.showMessageDialog(null, "������");
		}
		
		JOptionPane.showMessageDialog(null, result);

	}

}
