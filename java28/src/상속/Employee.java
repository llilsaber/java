package 상속;

public class Employee {
	public String name;
	String address;
	protected int salary;
	private int rrn; //주민번호
	
	private void al() {
		System.out.println("우리 회사만의 암호화알고리즘");
	}
	@Override
	public String toString() {
		al();
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
	
}
