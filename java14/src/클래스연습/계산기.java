package 클래스연습;

public class 계산기 {
	//매소드에 입력되는 값이 타임과 수에 따라 변수를 만들어 줘야 한다.
	//메소드 사용한 처리 값을 다시 가져온다. 매서드 호출(call)
	 public void add(int x, int y) {
	      //메서드안에서 선언된 변수는 메서드 안에서만 사용 가능
	      //메서드 범위 지역안에서만 사용 가능
	      //지역변수, 로컬변수<-->전역변수, 글로벌변수
	      //자동초기화X         자동초기화O
	      int result = x + y;
	      System.out.println(result);
	   }

	   public void minus(int x, int y) {
	      int result = x - y;
	      System.out.println(result);
	   }

	   public int mul(int x, int y) {
	      int result = x * y;
	      System.out.println(result);
	      return result;
	   }

	   public void div(int x, int y) {
	      int result = x / y;
	      System.out.println(result);
	   }

	}
