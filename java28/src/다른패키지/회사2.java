package 다른패키지;

import 상속.Employee;
import 상속.Manager;

public class 회사2 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name  ="홍길동";
//		e.address = "강남구";
//		e.salary= 300;
		//e.rrn = 20000201;
		System.out.println(e);
		
		Manager m = new Manager();
		m.name  ="김길동";
//		m.address = "영등포구";
//		m.salary= 500;
		//m.rrn = 19980201;
		//m.bonus = 200; //외부 다른 클래스에서 안보이게 할 수 있음.
		System.out.println(m);
		m.test();
		
		과장 m2 = new 과장();
		m2.name  ="홍길동";
//		m2.address = "강남구";
//		m2.salary= 300;
		System.out.println(m2);
	}
}
