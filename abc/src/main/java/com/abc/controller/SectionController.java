package com.abc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abc.util.StringUtil;

@RequestMapping("/section")
@Controller
public class SectionController {

	@RequestMapping("/getByChapter")
	public String getByChapter(HttpServletRequest request,Model model){
		Long chapterId = StringUtil.isTrimEmpty(request.getParameter("chapterId"))?0l:Long.valueOf(request.getParameter("chapterId"));
		//TODO
		return "section/sectionList";
	}
}
