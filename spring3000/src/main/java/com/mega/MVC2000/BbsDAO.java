package com.mega.MVC2000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BbsDAO {
	@Autowired
	SqlSessionTemplate my;
	
	public void create(BbsVO bag) throws Exception {
		my.insert("bbs.insert", bag);
	}
}
