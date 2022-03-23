package com.human.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/video/detail")
public class DetailController {
	
	@RequestMapping("/{path}.do")
	public String getDetailPage(@PathVariable String path){
		return "/video/"+path;
	}
}
