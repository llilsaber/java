package 클래스만들기;

public class 거실 {

	public static void main(String[] args) {
		//int x = 100;
		//타입   변수명 = 값;
		//클래스명은 변수의 타입으로 사용할 수 있다.
		//클래스명   변수명(객체의 이름) = new 클래스명(); 
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		//tv1, tv2 객체의 멤버변수가 각자 저장되어야한다.
		//tv1, tv2 객체의 멤버변수를 저장할 공간이 필요
		//new할 때, 멤버변수가 복사된다.
		
		tv1.color = "빨간색";
		tv1.size = 50;
		
		tv2.color = "검정색";
		tv2.size = 42;
		
		System.out.println(tv1.color);
		System.out.println(tv1.size);
		System.out.println(tv2.color);
		System.out.println(tv2.size);
		
		tv1.on();
		tv1.off();
		
		tv2.on();
		tv2.ch();
	}

}
