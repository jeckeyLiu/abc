package com.abc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/module")
@Controller
public class ModuleController {

	@RequestMapping("/getAll")
	public String getALL(){
		
		return "module/getAll";
	}
}
