package com.geeknews.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/")
	public String Index(){
		return "index";
	}
}
