package �迭����;

public class ���� {

	public static void main(String[] args) {
		// ���� �˰� �ִ� ���
		String[] name = { "ȫ�浿", "�ڱ浿", "���浿", "�̱浿" };
//      for (int i = 0; i < name.length; i++) {
//         System.out.print(name[i] + " ");  //index�� i
//      }
//      System.out.println();
		for (String s : name) { // for-each
			System.out.print(s + " ");
		}

		// char ���� �ְ�, ���
		// boolean ��ħ�Ծ����� �ְ� ���,
		// double �÷� �ְ� ���,
		// int ���� �ְ�, ���
		char[] gender = { '��', '��', '��', '��' };
		boolean[] food = { true, true, true, false };
		double[] eye = { 1.0, 0.6, 1.2, 1.0 };
		int[] age = { 23, 58, 41, 38 };

		System.out.println();
		for (char c : gender) { // for-each
			System.out.print(c + " ");
		}
		System.out.println();
		for (boolean b : food) { // for-each
			System.out.print(b + " ");
		}
		System.out.println();
		for (double d : eye) { // for-each
			System.out.print(d + " ");
		}
		System.out.println();
		for (int i : age) { // for-each
			System.out.print(i + " ");
		} // int i

		System.out.println();
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		} // index�� i
			// ��������
			// �� �����ȿ��� ��������� ������ ���� �ۿ����� �ν� �Ұ�
			// ������ ��������� ��ġ �����ȿ����� ��� ����
			// ������ ���� ��������°�? �����Ҷ� => Ÿ�� ������;

		int test = 100; // 46���ο��� ������
		System.out.println();
		
	}//main

} //class








