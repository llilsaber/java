package 클래스만들기;

import java.util.ArrayList;

//틀 => 눈에 보이는 부품으로 사용해야함.
public class 계산기 {
	//객체 => 부품조립식
	//기능때문에 이 계산기를 사용함.
	//기능은 메서드(함수)로 구현
	//메서드 정의, 함수 정의
	//정의한다고 해서 사용되지 않음.
	//동적처리
	public int add(int x, int y) { //300, 200
		return x + y;
	}
	
	public int[] minus() {
		int[] array = {1,2,3,4,5};
		return array;
	}
	
	public Bag mul() {
		Bag bag = new Bag();
		bag.setName("홍길동");
		bag.setAge(100);
		bag.setWeight(100.5);
		return bag;		
	}
	public ArrayList<Bag> div() {
		ArrayList<Bag> list = new ArrayList<Bag>();
		for (int i = 0; i < 100; i++) {
			Bag bag = new Bag();
			bag.setName("홍길동" + i);
			bag.setAge(i);
			bag.setWeight(i);
			list.add(bag);
		}
		return list;
	}
}








