package java28;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic3 extends JFrame {
	// JFrame이 가지고 있던 메서드, 멤버변수 다 가지고 태어남.
	// ThreadGraphic3에서 JFrame의 것을 다 쓸 수 있음.
	JLabel count, image, day;

	public ThreadGraphic3() {
		setSize(800, 300);
		
		count = new JLabel("counter들어갈 부분");
		image = new JLabel("이미지 들어가는 라벨 부분");
		day = new JLabel("타이머 들어가는 라벨 부분");
		
		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);
		
		//Font font = new Font("궁서", Font.BOLD, 50);
		count.setFont(new Font("궁서", Font.BOLD, 50));
		day.setFont(new Font("궁서", Font.BOLD, 45));
		
		Count2 count2 = new Count2();
		count2.start();
		
		Day2 day2 = new Day2();
		day2.start();
		
		Image2 image2 = new Image2();
		image2.start();
		
		setVisible(true);
	} //method
	// 파라메터 생성자, 생성자 오버로딩

	//클래스안에 전역변수를 공유할 목적으로 내부에 끼워 넣는 클래스: 내부 클래스
	//inner class
	public class Count2 extends Thread {

		@Override
		public void run(){
			for (int i = 500; i >= 0; i--) {
				count.setText("count : " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					//인터럽트(방해, 중단) : esc, ctrl+c, power-off
				}
			}
		}
	}
	public class Day2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				day.setText("날짜: " + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					//인터럽트(방해, 중단) : esc, ctrl+c, power-off
				}
			}
		}
	}
	
	public class Image2 extends Thread {
		@Override
		public void run() {
			String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					//초를 설정할 때는 밀리세컨즈, 1/1000설정.
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					//인터럽트(방해, 중단) : esc, ctrl+c, power-off
				}
			}
		}
	}

}
