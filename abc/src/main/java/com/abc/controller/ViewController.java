package com.abc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/view")
@Controller
public class ViewController {
	
	@RequestMapping("/hello")
	public String hello(HttpServletRequest request,Model model){
		model.addAttribute("content", "hello world !!!");
		return "hello";
	}
}
