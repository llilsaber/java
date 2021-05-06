package 형변환;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 기본형형변환3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		f.setLayout(new FlowLayout());
		JButton me = new JButton("click");
		f.add(me);
		
		f.setVisible(true);
	}

}
