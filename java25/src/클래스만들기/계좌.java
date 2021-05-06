package 클래스만들기;

public class 계좌 {
	public String name;
	public String field;
	public int money;

	public void 입금하다(String name, String field, int money) {
		System.out.println(name + " " + field + " " + money);
	}

	public void 입금하다(String name, int money) {
		System.out.println(name + " " + money);

	}
	public void 출금하다(int money) {
		System.out.println(money);
	}

	@Override
	public String toString() {
		return "계좌 [name=" + name + ", field=" + field + ", money=" + money + "]";
	}
	
	

}
