package 클래스만들기;

public class 강아지 {
	//멤버변수 => 성질
	//객체생성할 때 마다 멤버변수는 복사가 된다.
	public String color;
	public String type;
	
	//멤버메서드 => 동작
	public void bark() {
		System.out.println("멍멍 짖다!");
	}
	public void walk() {
		System.out.println("산책 가다!");
	}
}
