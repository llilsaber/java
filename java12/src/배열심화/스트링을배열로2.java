package �迭��ȭ;

import java.util.Arrays;

public class ��Ʈ�����迭��2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String all = "����, ����, ����, ��ǻ��";
		// ��Ʈ�� �迭�� �ٲپ���� (�������Խ� ������ ��� ���� �Ŀ� �ٽ� �迭�� �־��ּ���
		String [] all2 = all.split(", "); //split�� ������ �迭�� �����ϸ鼭 ���鵵 ���� �����ؼ� �����Ѵ�
//		for (int i = 0; i < all2.length; i++) {
//			System.out.println(all2[i]);
//		}
		//�������?
		System.out.println("�������? " + all2.length);
		//��ǻ�� ��ġ��?
		System.out.println("��ǻ�� ��ġ��? " + Arrays.binarySearch(all2, "��ǻ��"));
		for (int i = 0; i < all2.length; i++) {
			if(all2[i].contentEquals("��ǻ��")) {
				System.out.println("��ǻ���� ��ġ�� �ε���>> " + i);
			}
		}
		//������� 3���� �̸��� �������?
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].length() < 3) { //3���� �̸��� ��� ����
				count++; // ī��Ʈ ���� ����
			}
		}
		System.out.println("3���� �̸��� �������? " + count);
	}

}
