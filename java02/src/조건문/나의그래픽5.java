package 조건문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽5 {
	private static JTextField food;
	private static JTextField age;
	private static JTextField soc1;
	private static JTextField soc2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(600,600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uBA39\uACE0 \uC2F6\uC740 \uC74C\uC2DD");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(45, 20, 200, 54);
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uC5B4\uB514\uB85C \uAC08\uAE4C?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //어디로 갈까? 버튼에 대한 정의
				String fod = food.getText(); //작성된 글을 가져오기
				
				if (fod.equals("짬뽕")) { 
					JOptionPane.showMessageDialog(f, "중국집을 가자");
				} else {
					JOptionPane.showMessageDialog(f, "집을 가자");
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.setBounds(47, 84, 508, 54);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("\uB2F9\uC2E0\uC758 \uB098\uC774\uB294");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(45, 148, 200, 54);
		f.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("\uB098\uC758 \uB0B4\uB144\uB098\uC774\uB294?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //내년나이는? 버튼에 대한 정의
				String agge = age.getText();
				int year = Integer.parseInt(agge); //String을 int로 변환
				
				JOptionPane.showMessageDialog(f, "내년의 내 나이는 " + (year + (int) 1) + "세");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_1.setBounds(47, 212, 508, 54);
		f.getContentPane().add(btnNewButton_1);
		
		food = new JTextField();
		food.setBackground(Color.YELLOW);
		food.setBounds(286, 10, 267, 54);
		f.getContentPane().add(food);
		food.setColumns(10);
		
		age = new JTextField();
		age.setBackground(Color.PINK);
		age.setColumns(10);
		age.setBounds(286, 148, 267, 54);
		f.getContentPane().add(age);
		
		JButton btnNewButton_1_1 = new JButton("\uB450\uACFC\uBAA9 \uC810\uC218\uC758 \uD3C9\uADE0\uC740?");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //두과목의 평균 버튼에 대한 정의
				String socc1 = soc1.getText();
				int mat = Integer.parseInt(socc1);
				String socc2 = soc2.getText();
				int kor = Integer.parseInt(socc2);
				double avr = (mat + kor) / 2;
				
				JOptionPane.showMessageDialog(f, "두 과목의 평균 점수는 : " + avr + "점");
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_1_1.setBounds(47, 439, 508, 71);
		f.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uAD6D\uC5B4\uC810\uC218");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(47, 283, 200, 46);
		f.getContentPane().add(lblNewLabel_1_1);
		
		soc1 = new JTextField();
		soc1.setBackground(Color.CYAN);
		soc1.setColumns(10);
		soc1.setBounds(288, 286, 267, 54);
		f.getContentPane().add(soc1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\uC218\uD559\uC810\uC218");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(47, 357, 200, 46);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		soc2 = new JTextField();
		soc2.setBackground(Color.CYAN);
		soc2.setColumns(10);
		soc2.setBounds(288, 360, 267, 54);
		f.getContentPane().add(soc2);
		
		f.setVisible(true);

	}

}
