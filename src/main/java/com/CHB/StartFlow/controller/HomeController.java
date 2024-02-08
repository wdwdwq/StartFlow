package com.CHB.StartFlow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/sf/home/main")
	public String Main() {
		
		return "StarFlow";
	}
}