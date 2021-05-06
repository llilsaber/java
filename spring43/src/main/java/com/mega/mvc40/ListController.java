package com.mega.mvc40;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {

@RequestMapping("fruit")
public void fruit(Model model) {
	ArrayList<String> fruit = new ArrayList<String>();
	fruit.add("apple");
	fruit.add("banana");
	fruit.add("melon");
	fruit.add("strawberry");
	model.addAttribute("fruit", fruit);
}
@RequestMapping("tour")
public void tour(Model model) {
	ArrayList<String> tour = new ArrayList<String>();
	tour.add("seoul");
	tour.add("japen");
	tour.add("jeju");
	tour.add("china");
	tour.add("usa");
	model.addAttribute("tour", tour);
}
}
