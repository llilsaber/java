package java28;

public class Plus extends Thread {
	//멤버변수
	
	//멤버메서드
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("증가 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
