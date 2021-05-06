package 파일저장;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class 크롤링 {

	public static void main(String[] args) throws IOException {
		JFrame f = new JFrame("로그인하는 화면");
		// static 변수: 객체생성하지 않아도 언제든 클래스이름으로 접근해서
		// 바로 그 변수의 값을 가져다 쓸 수 있는 변수
		// 그래픽 프로그램에서는 Font의 속성, Color의 값 등을
		// 자주 쓰므로 static변수로 만들어두어서 편하게
		// 언제든 쓸 수 있음.
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(350, 500);
		f.getContentPane().setLayout(null);
		Connection con = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn");
		Document doc = con.get();
		Elements anav = doc.select("a.title");
		
		JButton bookbtn = new JButton("웹툰 제목 출력");
		bookbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
					System.out.println(anav.size());
						try {
							FileWriter f = new FileWriter("d:\\limsh\\웹툰제목.txt");
							for (Element e : anav) {
							f.write(e.text() + "\n");
							textArea.append(e.text() + "\n");
							}
							f.close();
						} catch (IOException i) {
							System.out.println("파일로 저장 중 에러발생");
							System.out.println("에러 정보는 " + i.getMessage());
						}

			}
		});
		bookbtn.setFont(new Font("궁서", Font.PLAIN, 30));
		bookbtn.setBounds(12, 10, 310, 61);
		f.getContentPane().add(bookbtn);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 79, 310, 372);
		f.getContentPane().add(textArea);

		// 항상 마지막 줄.!!
		f.setVisible(true);

	}
}
