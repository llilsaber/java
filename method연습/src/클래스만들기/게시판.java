package 클래스만들기;

import java.util.ArrayList;

public class 게시판 {
	
	public String get(String title, String content) {
		return "제목은 " + title + ", 내용은 " + content;
	}

	public String[] get() {
		String[] array = { "자바", "스프링", "장고" };
		return array;
	}

	public ArrayList<BbsVO> get(int count) {
		ArrayList<BbsVO> all = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			// vo를 만들어 생성후, all에 넣어주세요.
			BbsVO vo = new BbsVO();
			vo.setId(i + "");
			vo.setTitle(i + "");
			vo.setContent(i + "");
			all.add(vo);
		}
		return all;
	}
}
