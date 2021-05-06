package 배열응용;

public class 주소비교 {

	public static void main(String[] args) {
		int[] n = { 1, 2, 3 };
		int[] n2 = { 1, 2, 3 };
		System.out.println(n == n2);
		//참조형에서 ==을 쓰면 주소를 비교!
		//주소가 가르키는 값을 비교하고 싶으면 그 부품에서 제공하는 명령어를 가지고 있음.
		//String이라면 equals()를 써야한다.
	}

}
