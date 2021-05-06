package co.mega.MVC39;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //어노테이션, 표시
public class MemberController {
	
	@Autowired
	MemberDAO dao; //싱글톤으로 만들어진 객체의 주소를 넣어주세요.
	
	@RequestMapping("all2")
	public void all(Model model) {
		List<MemberVO> list = dao.all();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("select2")
	public void select(MemberVO memberVO, Model model) {
		MemberVO vo = dao.select(memberVO);
		//views까지 검색된 정보를 가지고 가야한다.
		//model으로 속성으로만 등록하면 됨.
		model.addAttribute("vo2", vo);
	}
	
	@RequestMapping("insert.mega")
	public void insert(MemberVO memberVO) throws Exception {
		dao.create(memberVO);
	}
	
	@RequestMapping("login.mega")
	public String login(String id, String pw, String pw2) {
		System.out.println("내가 호출됨...!!");
		System.out.println("컨트롤하는 메서드");
		System.out.println("컨트롤러에서 받은 id: " + id);
		System.out.println("컨트롤러에서 받은 pw: " + pw);
		System.out.println("컨트롤러에서 받은 pw2: " + pw2);
		
		boolean result = false; //로그인이 안되었을 때
    	if(id.equals("root") && pw.equals("1234")){
    		result = true;
    	}
    	if(result) {
    		return "ok"; //views아래에 있는 ok.jsp를 호출함.
    	}else {
    		return "no";
    	}
	}
	
	@RequestMapping("login")
	public void login(MemberVO bag, HttpSession session) {
		MemberVO vo = dao.login(bag);
		if(vo != null) {
			session.setAttribute("userId", vo.getId());
			return "redirect:"
		}
	}
}
