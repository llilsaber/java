package com.mega.MVC2000;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao;
	
	@RequestMapping("insert.mega")
	public void insert(MemberVO bag) throws Exception {
	//public void login(String id, String pw, String name, String tel) {
		dao.create(bag);
		System.out.println("my call");
		System.out.println("controll mesud");
		System.out.println("id: " + bag.getId());
		System.out.println("pw: " + bag.getPw());
		System.out.println("pw: " + bag.getName());
		System.out.println("pw: " + bag.getTel());
		
	}
	
	@RequestMapping("delete.mega")
	public void delete(MemberVO bag) throws Exception {
	//public void login(String id, String pw, String name, String tel) {
		dao.delete(bag);
		
	}
	
	@RequestMapping("login.mega")
	public String login(String id, String pw) {
		System.out.println("my call");
		System.out.println("controll mesud");
		System.out.println("id: " + id);
		System.out.println("pw: " + pw);
		
		boolean result = false;
	   	if(id.equals("root") && pw.equals("1234"))
	   			result=true;
	   	if(result)
	   		return "ok";
	   	else
	   		return "no";
	}
	
}
