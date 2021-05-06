package 반복문;

import javax.swing.JOptionPane;

public class 반복문while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gt = 1;
		
		while (true) {
			String data = JOptionPane.showInputDialog("정답 입력란 : ");
			if (data.equals("55")) {
				JOptionPane.showMessageDialog(null, "O \n 정답입니다 \n 맞추기까지 횟수 : " + gt);
				break;
			} else {
				JOptionPane.showMessageDialog(null, "X \n 정답이 아닙니다");
				gt++;
			}
			
			int num = Integer.parseInt(data);
			
			if (num < 55) {
				JOptionPane.showMessageDialog(null, "힌트! \n정답보다 작은값입니다");
			} else {
				JOptionPane.showMessageDialog(null, "힌트! \n정답보다 큰값입니다");
			}
		}
	}

}
