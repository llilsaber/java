package 조건문;

import javax.swing.JOptionPane;

public class Massgi {

	public static void main(String[] args) {
		String food = JOptionPane.showInputDialog("먹고 싶은 점심 메뉴는 " );
		
		String result = "";
		if (food.equals("짬뽕")) {
			result = "중국집으로";
			//JOptionPane.showMessageDialog(null, "중국집으로");
		} else {
			result = "집으로";
			//JOptionPane.showMessageDialog(null, "집으로");
		}
		
		JOptionPane.showMessageDialog(null, result);

	}

}
