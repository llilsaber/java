package com.mega.mvcProjectMedia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SportVideo2DAO {
	
	@Autowired
	  SqlSessionTemplate my;
	
	public List<SportVideo2VO> all() {
		return my.selectList("video.all");	
	}
	
	public List<SportVideo2VO> all3(SportVideo2VO bag) {
		return my.selectList("video.all3", bag);	
	}
	
	
	public SportVideo2VO read(SportVideo2VO bag) {
		SportVideo2VO vo = my.selectOne("video.select", bag);
		return vo;
	}
	
	public List<SportVideo2VO> all2(SportVideo2VO bag) {
		return my.selectList("video.all2", bag);	
	}
	
	public List<SportVideo2VO> future1(SportVideo2VO bag) {
		return my.selectList("video.future1", bag);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void create(SportVideo2VO bag) throws Exception {	
		
	my.insert("video.insert",bag);
	}

	
	public void delete(SportVideo2VO bag) throws Exception {	
		my.delete("video.delete",bag);

	}
	public void update(SportVideo2VO bag) throws Exception {	
		my.delete("video.update",bag);

	}
}
