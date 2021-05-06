package com.mega.MVC2000;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAO dao;

   @RequestMapping("insert11")
   public void insert(ProductVO productVO) throws Exception {
      dao.create(productVO);
   }
}