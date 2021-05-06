package java28;

import java.util.TimerTask;

public class Timer작동 extends TimerTask {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("tasktasktask================");
		}
		System.out.println("게임이 종료되었습니다.");
	}
}
