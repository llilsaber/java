package �迭����;

public class ������������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"ȫ�浿", "��浿", "�۱浿", "�ڱ浿", "���浿"};
		int[] term1 = {77, 88, 99, 55, 70};
		int[] term2 = {99, 100, 88, 80, 70};
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count1 = count1 + 1;
			}
		}
		System.out.println("������ ���� �л� �� : " + count1);
		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count2 = count2 + 1;
			}
		}
		System.out.println("������ ������ �л� �� : " + count2);
	}

}
