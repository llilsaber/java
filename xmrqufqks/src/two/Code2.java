package two;

public class Code2 {

	public static void main(String[] args) {
		/* !!!!!!!!!!!!!!!!!!!!
		 * !!  우사의 스릴 놀이터  !!
		 * !!   참여자 제한 없음   !!
		 * !!!!!!!!!!!!!!!!!!!! */
		for (int x = 1; x < 10; x++) { // 1~9 까지 반복하는 x 생성
			for (int y = 1; y < 10; y++) { // 1~9 까지 반복하는 y 생성
				System.out.print(y + " * " + x + " = " + (x * y) + "\t"); // \t는 문단에 간격을 일정 간격 띄어준다 (tab과 비슷한 기능)
			}
			System.out.println(" ");
		}
	}

}
