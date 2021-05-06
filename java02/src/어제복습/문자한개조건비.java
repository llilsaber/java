package 어제복습;

public class 문자한개조건비 {

	public static void main(String[] args) {
		char pw1 = 'p';
		char pw2 = 'q';
		//비교연산자는 기본형만 쓸 수 있음
		if (pw1 == pw2) {
			System.out.println("PASS");
		} else {
			System.out.println("재입력");
		}
		
		double wei = 2.2;
		if (wei > 2) {
			System.out.println("오늘은 성공!");
		} else {
			System.out.println("내일 다시 도전");
		}
	

		if (pw1 == pw2 && wei > 2) {
			System.out.println("다이어트 성공!");
		} else {
			System.out.println("다음에 다시 도전");
		}
	
	}

}
