package 스태틱;

public class 직원채용 {

	public static void main(String[] args) {
		직원 w1 = new 직원("홍길동", "남", 25);
		직원 w2 = new 직원("김길동", "여", 26);
		직원 w3 = new 직원("송길동", "남", 27);
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(직원.count);
		//System.out.println(직원.sum/(double)직원.count);
		직원.getAvg();

	}

}
