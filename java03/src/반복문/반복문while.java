package �ݺ���;

import javax.swing.JOptionPane;

public class �ݺ���while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gt = 1;
		
		while (true) {
			String data = JOptionPane.showInputDialog("���� �Է¶� : ");
			if (data.equals("55")) {
				JOptionPane.showMessageDialog(null, "O \n �����Դϴ� \n ���߱���� Ƚ�� : " + gt);
				break;
			} else {
				JOptionPane.showMessageDialog(null, "X \n ������ �ƴմϴ�");
				gt++;
			}
			
			int num = Integer.parseInt(data);
			
			if (num < 55) {
				JOptionPane.showMessageDialog(null, "��Ʈ! \n���亸�� �������Դϴ�");
			} else {
				JOptionPane.showMessageDialog(null, "��Ʈ! \n���亸�� ū���Դϴ�");
			}
		}
	}

}
