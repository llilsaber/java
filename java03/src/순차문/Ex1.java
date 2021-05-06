package 순차문;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Ex1 {

	public static void main(String[] args) {
		String eng = JOptionPane.showInputDialog("토익 점수를 입력해주세요 : ");
		String jap = JOptionPane.showInputDialog("jpt 점수를 입력해주세요 : ");

		int engi = Integer.parseInt(eng);
		int japi = Integer.parseInt(jap);
		
		int ham_eng = engi / 3 * 2;
		int ham_jap = japi / 3;
		
		JOptionPane.showMessageDialog(null, "당신의 외국어 평가 점수는 : " + (ham_eng + ham_jap) + "점");
		
	}

}
