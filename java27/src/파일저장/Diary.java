package 파일저장;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Diary {
	private static JTextField t1;
	private static JTextField t2;

	public void open() {
		JFrame f = new JFrame("일기쓰는 화면");
		//static 변수: 객체생성하지 않아도 언제든 클래스이름으로 접근해서
		//            바로 그 변수의 값을 가져다 쓸 수 있는 변수
		//            그래픽 프로그램에서는 Font의 속성, Color의 값 등을
		//            자주 쓰므로 static변수로 만들어두어서 편하게
		//            언제든 쓸 수 있음.
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(460, 497);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 날짜");
		lblNewLabel_1.setBounds(38, 37, 150, 45);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("오늘의 제목");
		lblNewLabel_1_1.setBounds(38, 107, 150, 45);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBounds(217, 47, 215, 31);
		t1.setForeground(Color.BLUE);
		t1.setBackground(Color.GREEN);
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		
		t2 = new JTextField();
		t2.setBounds(217, 108, 215, 31);
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBackground(Color.GREEN);
		f.getContentPane().add(t2);
		
		JButton save = new JButton("파일에 일기 저장");
		save.setBackground(Color.RED);
		save.setFont(new Font("굴림", Font.BOLD, 30));
		save.setBounds(37, 341, 379, 93);
		save.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e2) {
				String s1 = t1.getText(); //날짜
				String s2 = t2.getText(); //제목
				String s3 = textArea.getText(); //내용
				
				try {
					// 스트림의 특징은 한방향!!
					FileWriter file = new FileWriter("c:\\data\\" + s1 + ".txt");
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					file.close(); // 스트림을 다 쓰고 나서는 반드시 자원해제!
					JOptionPane.showMessageDialog(f, "파일에 저장 성공");
				} catch (IOException e) {
					System.out.println("파일로 저장 중 에러발생");
					System.out.println("에러 정보는 " + e.getMessage());
				}
			}
		});
		f.getContentPane().add(save);
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("오늘의 내용");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(38, 181, 150, 45);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		textArea.setForeground(Color.BLUE);
		textArea.setBackground(Color.GREEN);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 20));
		textArea.setRows(5);
		textArea.setColumns(10);
		textArea.setBounds(217, 194, 215, 116);
		f.getContentPane().add(textArea);
		
		//항상 마지막 줄.!!
		f.setVisible(true);

	}
}
