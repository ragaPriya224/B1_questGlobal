package com.questGlobal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {

	@RequestMapping("/add")
	public void add() {
		System.out.println("hellow");
//		return "display.jsp";
	}
}