package 조건문;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽3 {
	private static JTextField p1;
	private static JTextField p2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		p1 = new JTextField();
		p1.setFont(new Font("굴림", Font.PLAIN, 40));
		p1.setForeground(Color.BLUE);
		p1.setBounds(206, 37, 307, 57);
		f.getContentPane().add(p1);
		p1.setColumns(10);
		
		p2 = new JTextField();
		p2.setForeground(Color.BLUE);
		p2.setFont(new Font("굴림", Font.PLAIN, 40));
		p2.setColumns(10);
		p2.setBounds(206, 121, 307, 57);
		f.getContentPane().add(p2);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = p1.getText();
				String s2 = p2.getText();
				
				if (s1.equals("root") && s2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 50));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(97, 207, 396, 77);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC544 \uC774 \uB514 : ");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(12, 37, 154, 57);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC : ");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(12, 125, 154, 57);
		f.getContentPane().add(lblNewLabel_1);
		f.setSize(600, 600);
		
		f.setVisible(true);

	}
}
