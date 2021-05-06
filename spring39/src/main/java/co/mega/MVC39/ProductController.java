package co.mega.MVC39;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //어노테이션, 표시
public class ProductController {
	
	@Autowired
	ProductDAO dao; //싱글톤으로 만들어진 객체의 주소를 넣어주세요.
	
	@RequestMapping("insert3")
	public void insert(ProductVO productVO) throws Exception {
		dao.create(productVO);
	}
	
	@RequestMapping("select3")
	public void select(ProductVO productVO, Model model) {
		ProductVO vo = dao.select(productVO);
		//views까지 검색된 정보를 가지고 가야한다.
		//model으로 속성으로만 등록하면 됨.
		model.addAttribute("vo3", vo);
	}
}
