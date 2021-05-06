package 배열복습;

public class 지수 {

	public static void main(String[] args) {
		// 내가 알고 있는 경우
		String[] name = { "홍길동", "박길동", "정길동", "이길동" };
//      for (int i = 0; i < name.length; i++) {
//         System.out.print(name[i] + " ");  //index의 i
//      }
//      System.out.println();
		for (String s : name) { // for-each
			System.out.print(s + " ");
		}

		// char 성별 넣고, 출력
		// boolean 아침먹었는지 넣고 출력,
		// double 시력 넣고 출력,
		// int 나이 넣고, 출력
		char[] gender = { '남', '여', '남', '여' };
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
		} // index의 i
			// 지역변수
			// 이 지역안에서 만들어지는 변수는 지역 밖에서는 인식 불가
			// 변수는 만들어지는 위치 지역안에서만 사용 가능
			// 변수는 언제 만들어지는가? 선언할때 => 타입 변수명;

		int test = 100; // 46라인에서 생성됨
		System.out.println();
		
	}//main

} //class








