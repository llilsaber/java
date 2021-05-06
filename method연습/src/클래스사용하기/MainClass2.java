package 클래스사용하기;

import java.util.ArrayList;

import 클래스만들기.BbsVO;
import 클래스만들기.게시판;

public class MainClass2 {

	public static void main(String[] args) {
		게시판 bbs = new 게시판();
		String result1 = bbs.get("자바", "fun");
		System.out.println(result1);
		System.out.println("----------------------------------");
		
		String[] result2 = bbs.get();
		for (String s : result2) {
			System.out.println("받은 값: " + s);
		}
		System.out.println("----------------------------------");
		
		ArrayList<BbsVO> all = bbs.get(3);
		for (BbsVO bbsVO : all) {
			System.out.println(bbsVO);
		}
	}

}
