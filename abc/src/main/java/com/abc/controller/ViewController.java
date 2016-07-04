package com.abc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/view")
@Controller
public class ViewController {
	
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}

}
