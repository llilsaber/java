package 배열복습;

public class 성적변동문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"홍길동", "김길동", "송길동", "박길동", "정길동"};
		int[] term1 = {77, 88, 99, 55, 70};
		int[] term2 = {99, 100, 88, 80, 70};
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count1 = count1 + 1;
			}
		}
		System.out.println("성적이 향상된 학생 수 : " + count1);
		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count2 = count2 + 1;
			}
		}
		System.out.println("성적이 동일한 학생 수 : " + count2);
	}

}
