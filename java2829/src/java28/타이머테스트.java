package java28;

import java.util.Date;
import java.util.Timer;

public class 타이머테스트 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		Timer작동 작동 = new Timer작동();
		System.out.println("5초동안 게임을 할 수 있습니다.");
		timer.schedule(작동, 5000);
		System.out.println("5초가 count되는 중입니다..");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ">> mainmainmain================");
			Date date = new Date();
			System.out.println(date.getSeconds());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
