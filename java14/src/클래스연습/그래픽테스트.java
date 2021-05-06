package 클래스연습;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 그래픽테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		JButton b = new JButton();
		b.setText("clik the me");
		b.setBackground(Color.red);
		f.add(b);
		
		Font font = new Font("궁서", 1, 20);
		b.setFont(font);
		
		f.setVisible(true);
	}

}
