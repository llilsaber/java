package 생성자;

public class 계좌 {
	String name;
	String field;
	int money;
	String todo;
	
	//new 계좌()=> 사용불가
	public 계좌(String name, String field, int money) {
		this.name = name;
		this.field = field;
		this.money = money;
	}

	@Override
	public String toString() {
		return "계좌 [name=" + name + ", field=" + field + ", money=" + money + "]";
	}
	
	

	
}
