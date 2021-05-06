package java28;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic2 extends JFrame {
	JLabel count, image, day;

	public void open() { // 기본 생성자
		setSize(800, 300);

count = new JLabel("counter");
image = new JLabel("image");
day = new JLabel("day");

add(count, BorderLayout.WEST);
add(image, BorderLayout.EAST);
add(day, BorderLayout.SOUTH);

Font font = new Font("궁서", Font.BOLD, 50);
count.setFont(font);
day.setFont(font);
	}

}
