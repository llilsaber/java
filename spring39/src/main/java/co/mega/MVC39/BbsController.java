package co.mega.MVC39;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao;

	@RequestMapping("all")
	public void all(Model model) {
		List<BbsVO> list = dao.all();
		System.out.println("list sum: " + list.size());
		model.addAttribute("list", list);
	}
	
   @RequestMapping("insert10")
   public void insert(BbsVO bbsVO) throws Exception {
      dao.create(bbsVO);
   }
   
   @RequestMapping("select")
	public void select(BbsVO bbsVO, Model model) {
		BbsVO vo = dao.read(bbsVO);
		//views까지 검색된 정보를 가지고 가야한다.
		//model으로 속성으로만 등록하면 됨.
		model.addAttribute("vo", vo);
	}
}