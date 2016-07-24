package com.abc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/chapter")
@Controller
public class ChapterController {

	@RequestMapping("/getAll")
	public String getALL(){
		
		return "chapter/getAll";
	}
}
