package �迭�⺻;

import java.util.Random;

public class �ζǸ���� {

	public static void main(String[] args) {
		int[] cou = new int[4]; //cou �迭 4�� ����
		int[] num = new int[1000]; //num �迭 1000�� ���� 
		
		Random r = new Random(); //r ��ɾ� ����
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000); //�������� ���ڸ� �̾Ƽ� num�� ������� ����
		}
		for (int x : num) { //num�� ���ڸ� �ϳ��� �̾Ƽ� ���� �� ���ǿ� �´� cou �迭�� ���ڸ� �ϳ��� ����ָ� 600 �̻��� ���� ��� ����Ʈ
			if (x > 600) {
				System.out.println(x + " ");
				cou[3] = cou[3] + 1;
			} else if (x >= 500) {
				cou[2] = cou[2] + 1;
			} else if (x >= 400) {
				cou[1] = cou[1] + 1;
			} else if (x >= 300) {
				cou[0] = cou[0] + 1;
			}
		}
		System.out.println("600�̻��� ���� : " + cou[3]);
		System.out.println("300�̻��� ���� : " + cou[0]);
		System.out.println("400�̻��� ���� : " + cou[1]);
		System.out.println("500�̻��� ���� : " + cou[2]);
	}

}
