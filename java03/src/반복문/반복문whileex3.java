package �ݺ���;

import javax.swing.JOptionPane;

public class �ݺ���whileex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			String data = JOptionPane.showInputDialog("0)������, 1)���缮, 2)�ڸ��, 3)����");
			if (data.equals("3")) {
				System.out.println("��ǥ �ý����� �����մϴ�");
				break;
			}
			
			switch (data) {
			case "0":
				System.out.println("������ �����Ͻ�");
				break;
			case "1":
				System.out.println("���缮 �����Ͻ�");
				break;
			case "2":
				System.out.println("�ڸ�� �����Ͻ�");
				break;
			default:
				System.out.println("�ش� �������� �����ϴ�");
				break;
			}
		}
	}

}
