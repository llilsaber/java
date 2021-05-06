package java28;

import java.util.Iterator;

public class PlusMinusThreadMain{

	public static void main(String[] args) {
		Plus plus = new Plus();
		plus.start();
		Minus minus = new Minus();
		minus.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("mainmainmainmainmain=================");
			if(!plus.isAlive()) {
				System.out.println("plus thread status alive??: " + plus.isAlive());
				System.out.println("minus thread end.");
				minus.stop();
			}else {
				System.out.println("plus thread alive!");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
