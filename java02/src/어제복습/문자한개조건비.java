package ��������;

public class �����Ѱ����Ǻ� {

	public static void main(String[] args) {
		char pw1 = 'p';
		char pw2 = 'q';
		//�񱳿����ڴ� �⺻���� �� �� ����
		if (pw1 == pw2) {
			System.out.println("PASS");
		} else {
			System.out.println("���Է�");
		}
		
		double wei = 2.2;
		if (wei > 2) {
			System.out.println("������ ����!");
		} else {
			System.out.println("���� �ٽ� ����");
		}
	

		if (pw1 == pw2 && wei > 2) {
			System.out.println("���̾�Ʈ ����!");
		} else {
			System.out.println("������ �ٽ� ����");
		}
	
	}

}
