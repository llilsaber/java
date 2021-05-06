package java28;

public class Minus extends Thread {
	@Override
	public void run() {
		for (int i = 1000; i >= 0; i--) {
			System.out.println("감소 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
