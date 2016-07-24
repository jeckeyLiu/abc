package com.abc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abc.model.Consumer;
import com.abc.service.ConsumerService;

@Controller
@RequestMapping("/consumer")
public class ConsumerController {

	@Resource
	private ConsumerService consumerService;
	
	@RequestMapping("/get")
	public String get(HttpServletRequest request,Model model){
		Long id = request.getParameter("id")!=null && request.getParameter("id")!=""?Long.valueOf(request.getParameter("id")):0l;
		Consumer consumer = consumerService.get(id);
		model.addAttribute("consumer", consumer);
		return "consumer";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Model model){
		Long id = request.getParameter("id")!=null && request.getParameter("id")!=""?Long.valueOf(request.getParameter("id")):0l;
		Consumer consumer = consumerService.get(id);
		model.addAttribute("consumer", consumer);
		return "consumer";
	}
	
	@RequestMapping("/regist")
	public String regist(HttpServletRequest request,Model model){
		Long id = request.getParameter("id")!=null && request.getParameter("id")!=""?Long.valueOf(request.getParameter("id")):0l;
		Consumer consumer = consumerService.get(id);
		model.addAttribute("consumer", consumer);
		return "consumer";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request,Model model){
		Long id = request.getParameter("id")!=null && request.getParameter("id")!=""?Long.valueOf(request.getParameter("id")):0l;
		Consumer consumer = consumerService.get(id);
		model.addAttribute("consumer", consumer);
		return "consumer";
	}
}
