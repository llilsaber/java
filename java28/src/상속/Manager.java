package 상속;

public class Manager extends Employee{
	//private은 접근제어자: 해당 클래스안에서만 접근 가능
	private int bonus = 100;
	public void test() {
		System.out.println(bonus + "만원 보너스 받으며 관리감독 하다.");
	}
}
