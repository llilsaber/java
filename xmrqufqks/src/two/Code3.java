package two;

public class Code3 {

	public static void main(String[] args) {
		/* !!!!!!!!!!!!!!!!!!!!
		 * !!  우사의 스릴 놀이터  !!
		 * !!   참여자 제한 없음   !!
		 * !!!!!!!!!!!!!!!!!!!! */
		int x = 3;
			for (int y = 1; y < 10; y++) { //1~9 까지 반복하는 y 생성
				if (x * y % 4 > 0) // 4의 배수가 아닐 경우 아래 명령을 실행한다
					System.out.println(x + " * " + y + " = " + (x * y));				
			}
		}

}
