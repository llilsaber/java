package �迭�⺻;

public class �迭����� {

	public static void main(String[] args) {
		int[] num = new int[5];
		int x = 10;

		for (int i = 0; i < num.length; i++) {
			num[i] = x;
			x = x + 10;
		}
		
		System.out.println(num[0] + num[2]);
		
		String[] pro = new String[3];
		
		pro[0] = "�ڹ�";
		pro[1] = "������";
		pro[2] = "JSF";
		
		System.out.println(pro[0] + " ���ٴ� " + pro[1]);
	}//\t ������ ���ݸ�ŭ �ٿ��

}
