package 배열심화;

import java.util.Arrays;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String all = "국어, 영어, 수학, 컴퓨터";
		// 스트링 배열로 바꾸어보세요 (공백포함시 공백을 모두 제거 후에 다시 배열에 넣어주세요
		String [] all2 = all.split(", "); //split로 나누어 배열로 저장하면서 공백도 같이 포함해서 제거한다
//		for (int i = 0; i < all2.length; i++) {
//			System.out.println(all2[i]);
//		}
		//과목수는?
		System.out.println("과목수는? " + all2.length);
		//컴퓨터 위치는?
		System.out.println("컴퓨터 위치는? " + Arrays.binarySearch(all2, "컴퓨터"));
		for (int i = 0; i < all2.length; i++) {
			if(all2[i].contentEquals("컴퓨터")) {
				System.out.println("컴퓨터의 위치는 인덱스>> " + i);
			}
		}
		//과목명이 3글자 미만인 과목수는?
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].length() < 3) { //3글자 미만일 경우 실행
				count++; // 카운트 갯수 증가
			}
		}
		System.out.println("3글자 미만인 과목수는? " + count);
	}

}
