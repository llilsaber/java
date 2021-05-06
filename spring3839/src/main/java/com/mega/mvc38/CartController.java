package com.mega.mvc38;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	
	@Autowired
	CartDAO dao;

	@RequestMapping("Cart.mega")
	public void Cart(CartVO bag, CartDAO dao) throws Exception {
		dao.create(bag);
	}
}
