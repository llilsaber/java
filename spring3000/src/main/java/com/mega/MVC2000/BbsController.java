package com.mega.MVC2000;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao;

   @RequestMapping("insert10")
   public void insert(BbsVO bbsVO) throws Exception {
      dao.create(bbsVO);
   }
}