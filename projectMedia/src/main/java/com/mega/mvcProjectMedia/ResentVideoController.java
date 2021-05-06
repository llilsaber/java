package com.mega.mvcProjectMedia;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResentVideoController {

	@Autowired
	SportVideoDAO dao;
	
	@Autowired
	ResentVideoDAO dao2;
	
//	@RequestMapping("VideoTest2")
//	public void VideoTest(Model model) throws Exception{
//		//String loginId = (String)session.getAttribute("userId");
//		//System.out.println(loginId);
//		//bag2.setUserid(loginId);
//		//UserInfoVO vo; // 추후 추가를 해줘야함.
//		List<SportVideoVO> list = dao.VideoTest();
//		model.addAttribute("list", list);
//	}
//	
//	@RequestMapping("VideoDetail2")
//	public void VideoDtail(SportVideoVO bag, ResentVideoVO bag2, Model model, HttpSession session) throws Exception{
//		SportVideoVO vo1 = dao.VideoDetail(bag);
//		System.out.println(vo1.getVideo_num());
//		model.addAttribute("vo1", vo1);
//		System.out.println(vo1.getVideo_img());
//		
//		String loginId = (String)session.getAttribute("userId");
//		System.out.println(loginId);
//		bag2.setVideonum(vo1.getVideo_num());
//		bag2.setRvid(loginId);
//		dao2.create(bag2);
//	}
//	
}
