package java28;

public class Image extends Thread {
	@Override
	public void run() {
		String[] list = { "001.png", "002.png", "003.png", "004.png", "005.png" };
		for (int i = 0; i < list.length; i++) {
			System.out.println("이미지: " + list[i]);
			try {
				//초를 설정할 때는 밀리세컨즈, 1/1000설정.
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				//인터럽트(방해, 중단) : esc, ctrl+c, power-off
			}
		}
	}
}
