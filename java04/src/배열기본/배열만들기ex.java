package �迭�⺻;

public class �迭�����ex {

	public static void main(String[] args) {
		// �迭 : array
//		int[] num = new int[1000];
		
		int[] num2 = new int[5];
		//��ü ������ �� �� ���峪��? 7��
		// ���������� ������ ����������? num2 : �����͵��� ����ִ� �ּ�, int[5] : �ڵ��ʱ�ȭ�� ��, 0���� �ʱ�ȭ, lenght : �б�����, �迭�� �� ��������� ����, �迭�� ũ�⸦ ���� �Ұ���
		//ù��° ����ų ���� num2[0] �󸶰� ����������?
		num2[1] = 300;
		System.out.println(num2[0]);
		System.out.println(num2[1]);
		System.out.println(num2);
		
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}
		
		//for-each �迭���� �ϳ��� �����ͼ� ó��
		for (int i : num2) {
			System.out.println(i);
		} 
	}

}
