package 클래스연습;

public class 전화기 {
	public static void main(String[] args) {
		Phone hp1 = new Phone();
			hp1.color = "하늘색";
			hp1.num = "01099314548";
			
			hp1.text("철수", "굿모닝", 10);
			System.out.println(hp1.color);
			
		Phone hp2 = new Phone();
			hp2.color = "검정색";
			hp2.num = "01013998454";					
			
			hp2.internet();
			System.out.println(hp2.num);
	}
}
