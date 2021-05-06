package com.mega.mvc40;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //어노테이션, 표시
public class MemberController {
	
	@Autowired
	MemberDAO dao; //싱글톤으로 만들어진 객체의 주소를 넣어주세요.
	
	@RequestMapping("insert.mega")
	public void insert(MemberVO bag) throws Exception {
		dao.create(bag);
	}
	
	@RequestMapping("login")
	public String login(MemberVO bag, HttpSession session) {
		 MemberVO vo = dao.login(bag);
		 System.out.println("=============" + vo);
		 if(vo != null) {
			 System.out.println("해당 id/pw가 있음.");
			 session.setAttribute("userId", vo.getId());
			 return "redirect:login.jsp";
//			 return "ok";
		 }else {
			 System.out.println("해당 id/pw가 없음.");
			 return "no";
		 }
	}
	
	@RequestMapping("sunday")
	public void sunday() {
	}
	
	@RequestMapping("all2")
	   @ResponseBody
	   public List<MemberVO> all() {
		System.out.println("clear!");
		List<MemberVO> all2 = dao.all2();
		return all2;
	}

}
