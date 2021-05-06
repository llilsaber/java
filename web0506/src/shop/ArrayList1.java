package shop;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MemberVO> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			MemberVO bag = new MemberVO();
			
			bag.setId(String.valueOf(i));
			bag.setPw(i + "");
			bag.setName(i + "");
			bag.setTel(i + "");
			
			list.add(bag);
		}
		System.out.println("list bag = " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			MemberVO bag2 = list.get(i);
			System.out.println("bag out id : " + bag2.getId());
			System.out.println("bag out pw : " + bag2.getPw());
			System.out.println("bag out name : " + bag2.getName());
			System.out.println("bag out tel : " + bag2.getTel());
		}
	}

}
