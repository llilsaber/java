package 형변환;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 기본형형변환4 {

	public static void main(String[] args) {
	man m = new man();
		
		wuman m2 = new man();
		m2 = new wuman();
		m2 = new superwuman();
	}

}
