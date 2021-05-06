package co.mega.MVC39;

public class DataController {

	   @RequestMapping("typeSelect")
	   public void select(TypeVO typeVO, Model model) throws Exception {
	   
	      dao.select(typeVO);
	      
	      System.out.println("받은 id: " + typeVO.getTid());
	      System.out.println("받은 원하는음주: " + typeVO.getDringking());
	      System.out.println("받은 원하는흡연: " + typeVO.getSmoking());
	      System.out.println("받은 종교: " + typeVO.getReligion());
	      System.out.println("받은 키: " + typeVO.getHeight());
	      System.out.println("받은 장소: " + typeVO.getPlace());
	      System.out.println("받은 연락수단: " + typeVO.getContact());
	      System.out.println("받은 원하는나이: " + typeVO.getWage());
	      
	      //views까지 검색된 정보를 가지고 가야한다.
	      //model속성으로만 등록하면됨
	      model.addAttribute("vo", typeVO);
	      
	   }
}
