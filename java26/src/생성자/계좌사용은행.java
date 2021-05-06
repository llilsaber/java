package 생성자;

public class 계좌사용은행 {

	public static void main(String[] args) {
		계좌 a1 = new 계좌("홍길동", "정기예금", 10000);
		계좌 a2 = new 계좌("김길동", "정기적금", 20000);
		계좌 a3 = new 계좌("송길동", "정기예금특", 30000);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

	}

}
