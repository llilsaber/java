package 상속;

public class 회사 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name  ="홍길동";
		e.address = "강남구";
		e.salary= 300;
		//e.rrn = 20000201;
		System.out.println(e);
		
		Manager m = new Manager();
		m.name  ="김길동";
		m.address = "영등포구";
		m.salary= 500;
		//m.rrn = 19980201;
		//m.bonus = 200; //외부 다른 클래스에서 안보이게 할 수 있음.
		System.out.println(m);
		m.test();
		
	}

}
