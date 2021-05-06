package java28;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class ThreadGraphic extends JFrame{
	JLabel count, image, day;
	
	public void go() { //일반 메서드
		getContentPane().setBackground(Color.GREEN);
		setSize(800, 300);
		
		count = new JLabel("count: 500");
		count.setFont(new Font("Dialog", Font.BOLD, 55));
		getContentPane().add(count, BorderLayout.WEST);
		
		image = new JLabel();
		getContentPane().add(image, BorderLayout.CENTER);
		ImageIcon icon = new ImageIcon("1.png");
		image.setIcon(icon);
		
		day = new JLabel("day");
		day.setFont(new Font("Dialog", Font.BOLD, 40));
		getContentPane().add(day, BorderLayout.SOUTH);
		Date date = new Date();
		day.setText(date + "");
		
		//Count thread
		Count2 c = new Count2();
		Day2 d = new Day2();
		Image2 i = new Image2();
		c.start();
		d.start();
		i.start();
		
		setVisible(true);
	}
	public static void main(String[] args) {
		ThreadGraphic t = new ThreadGraphic();
		t.go();
//		Count c2 = new Count(t.count);
//		c2.start();
	} //main

	//변수를 공유해야하는 2클래스가 있다면, 클래스안에 클래스를 낄 수 있다.
	//inner class, 내부클래스
	//내부클래스는 독립적으로 쓸 수 없다.
	public class Count2 extends Thread {
		@Override
		public void run(){
			for (int i = 500; i >= 0; i--) {
				count.setText("count : " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					//인터럽트(방해, 중단) : esc, ctrl+c, power-off
				}//catch
			}//for
			
		}//run
	} //inner class
	
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
			int count = 0;
			for (int i = 0; i < list.length; i++) {
				count++;
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

	
} //class
