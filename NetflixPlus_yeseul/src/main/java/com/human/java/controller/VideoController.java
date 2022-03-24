package com.human.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.human.java.domain.VideoVO;
import com.human.java.service.VideoServiceImpl;

@Controller
@RequestMapping("/video")
public class VideoController {
	
	@Autowired
	VideoServiceImpl videoService;

	@RequestMapping("/{path}.do")
	public String userJoin(@PathVariable String path) {
		return "/video/"+path;
	}

	@RequestMapping("/goSearch.do")
	public ModelAndView getSearchContent(VideoVO vo) {
		
		ModelAndView mav = new ModelAndView("/video/search");
		mav.addObject("searchList",videoService.search(vo));
		
		return mav;
	}
	
	 @RequestMapping("/interested.do")
	 public ModelAndView getInterested() {
	 
		 ModelAndView mav = new ModelAndView("/video/interested");
		 mav.addObject("intList", videoService.interested());
	 
		 return mav; 
	 }
	 
}
