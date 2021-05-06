package 클래스연습;

public class Phone {
	String color;
	String num;
	
	public void text(String x, String y, int z) {
		System.out.println(x + "에게 보낸 메시지 입니다 : " + y + "(보낸 시간 : " + z + "시)");
	}
	
	public void internet() {
		System.out.println("인터넷 하다");
	}
}
