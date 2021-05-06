package com.mega.mvc40;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComputerController {

@RequestMapping("computer")
public void computer(ComputerVO vo, Model model) {
	model.addAttribute("vo", vo);
}
}
