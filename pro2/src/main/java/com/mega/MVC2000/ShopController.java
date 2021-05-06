package com.mega.MVC2000;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {
	
	@RequestMapping("writer.mega")
	public void insert(ShopVO bag, ShopDAO dao) throws Exception {
	//public void login(String id, String pw, String name, String tel) {
		dao.create(bag);	
	}
	
	@RequestMapping("delete.mega")
	public void delete(ShopVO bag, ShopDAO dao) throws Exception {
		//public void login(String id, String pw, String name, String tel) {
		dao.delete(bag);		
	}
}
