package com.mega.mvc38;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // BbsDAO dao = new BbsDAO(); 한개만 객체 생성!, 싱글톤!
public class CartDAO {
	
	@Autowired
	SqlSessionTemplate my;

	public void create(CartVO bag) throws Exception {
		my.insert("cart.insert", bag);
	}
}