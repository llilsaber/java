package 클래스연습;

import java.awt.Color;
import java.awt.Font;

import javax.print.attribute.IntegerSyntax;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class 계사기기프호그램 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(350, 400);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(12, 10, 100, 43);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setBounds(111, 10, 211, 43);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(12, 57, 100, 43);
		f.getContentPane().add(lblNewLabel_1);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(111, 57, 211, 43);
		f.getContentPane().add(t2);

		JButton btnNewButton = new JButton("더하기");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);

				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				
				계산기 cal = new 계산기();
				cal.add(i1, i2);
			}
		});
		btnNewButton.setBounds(12, 210, 74, 141);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);

				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				
				계산기 cal = new 계산기();
				cal.minus(i1, i2);
				}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(90, 210, 74, 141);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("곱하기");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();//String으로 받아서 저장
				String s2 = t2.getText();
				System.out.println(s1);//저장된 값 확인
				System.out.println(s2);

				int i1 = Integer.parseInt(s1);//저장된 String 값을 int로 변환
				int i2 = Integer.parseInt(s2);
				
				계산기 cal = new 계산기();//계산 클래스에서 끌어오기
				int result = cal.mul(i1, i2);//계산기 클래스에서 mul 명령어 사용
				t3.setText("곱한 결과 값은" + result);
			}
		});
		btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1.setBounds(172, 210, 74, 141);
		f.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("나누기");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);

				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				
				계산기 cal = new 계산기();
				cal.div(i1, i2);
			}
		});
		btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2.setBounds(248, 210, 74, 141);
		f.getContentPane().add(btnNewButton_1_2);
		
		t3 = new JTextField();
		t3.setBounds(27, 127, 280, 49);
		f.getContentPane().add(t3);
		t3.setColumns(10);

		f.setVisible(true);
	}
}
