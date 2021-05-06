package 배열복습;

public class 배열사용2 {

	public static void main(String[] args) {
		//내가 알고 있는 경우
		String[] name = {"홍길동", "박길동", "정길동", "이길동"};
		char[] gender = {'남','여','남','여'};
		boolean[] food = {true, false, true, true};
		double[] eye = {0.2, 0.5, 1.2, 2.0};
		int[] age = {100, 80, 30, 40};
		System.out.println("이름" + "  " + "성별" + "  " + "아침" + "  " + "시력" + "  " + "나이");
		System.out.println("-------------------");
		for (int i = 0; i < age.length; i++) {
			System.out.println(name[i] + " " + gender[i] + " " + food[i] + " " + eye[i] + " " + age[i]);
		}
		
		System.out.println();
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		for (String s : name) { //for-each
			System.out.print(s + " ");
		}
		System.out.println();
		
		//char 성별넣고, 출력
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		for (char c : gender) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		//boolean 아침먹었나넣고, 출력
		for (int i = 0; i < food.length; i++) {
			System.out.print(food[i] + " ");
		}
		System.out.println();
		for (boolean b : food) {
			System.out.print(b + " ");
		}
		System.out.println();
		
		//double 시력넣고, 출력
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}
		System.out.println();
		for (double d : eye) {
			System.out.print(d + " ");
		}
		System.out.println();
		
		//int 나이넣고, 출력
		
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}//지역변수
		//이 지역안에서 만들어지는 변수는 지역밖에서는 인식 불가
		//변수는 만들어지는 위치 지역안에서만 사용 가능!
		//변수는 언제만들어지는가? 타입 변수명;(선언)
		//System.out.println(test);
		//1. 오타! 해당 변수가 존재하는 확인
		//2. 특정한 범위안에서 쓸 수 있는 지역변수가 아닌지 확인
		//3. 사용하려고 하는 라인보다 아래에서 만들어진 것은 아닌지 확인
		//test는 사용불가 58라인에서는 아직 test가 아직 만들어지지 않음.
		
		int test = 100; //59라인에서 생성됨
		System.out.println();
		for (int i : age) {
			System.out.print(i + " ");
			System.out.println(test);
		}
		
	}

}
