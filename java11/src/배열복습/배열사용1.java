package �迭����;

import java.util.Random;

public class �迭���1 {

	public static void main(String[] args) {
		// �迭�� ����� ���� �����͸� �𸣴� ���
		// �迭�� ����� ���� �����͸� �ƴ� ���
		int[] num = new int[5];
		Random r = new Random(42);
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000); // 0~99
		}
		
//		int[] num2 = {10, 20, 30, 40, 50};
//		for (int i = 0; i < num2.length; i++) {
//			System.out.println(num2[i] + " ");
//		}
//		
//		for (int s : num2) {
//			System.out.print(s + " ");
//		}
		// ���������� �� �����ȿ��� ��������� ������ �����ۿ����� �ν� �Ұ�
		//������ ��������� ��ġ �����ȿ����� ��� ����!
		//������ ������������°�? Ÿ�� ������; (����)
	}

}
