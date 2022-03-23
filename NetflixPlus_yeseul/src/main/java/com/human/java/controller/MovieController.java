package com.human.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.human.java.domain.VideoVO;
import com.human.java.service.VideoServiceImpl;

@Controller
@RequestMapping("/video/movie")
public class MovieController {

	@Autowired
	VideoServiceImpl videoService;

	@RequestMapping("/{path}.do")
	public String moviePageFind(@PathVariable String path) {
		return "/video/movie/" + path;
	}

	@RequestMapping("/actionNadventure.do")
	public ModelAndView getActionNadventure() {
		 ModelAndView mav = new ModelAndView("/video/movie/actionNadventure");
		 mav.addObject("aNaList", videoService.getActionNadventure());
		 return mav;
	}

	@RequestMapping("/animation.do")
	public ModelAndView getAnimation() {
		 ModelAndView mav = new ModelAndView("/video/movie/animation");
		 mav.addObject("animeList", videoService.getAnimation());
		 return mav;
	}

	@RequestMapping("/family.do")
	public ModelAndView getFamily() {
		 ModelAndView mav = new ModelAndView("/video/movie/family");
		 mav.addObject("famList", videoService.getFamily());
		 return mav;
	}
	
	@RequestMapping("/drama.do")
	public ModelAndView getDrama() {
		 ModelAndView mav = new ModelAndView("/video/movie/drama");
		 mav.addObject("dramaList", videoService.getDrama());
		 return mav;
	}

	@RequestMapping("/disney.do")
	public ModelAndView getDisney() {
		 ModelAndView mav = new ModelAndView("/video/movie/disney");
		 mav.addObject("disneyList", videoService.getDisney());
		 return mav;
	}

	@RequestMapping("/marvel.do")
	public ModelAndView getMarvel() {
		 ModelAndView mav = new ModelAndView("/video/movie/marvel");
		 mav.addObject("marvelList", videoService.getMarvel());
		 return mav;
	}

	@RequestMapping("/pixar.do")
	public ModelAndView getPixar() {
		 ModelAndView mav = new ModelAndView("/video/movie/pixar");
		 mav.addObject("pixarList", videoService.getPixar());
		 return mav;
	}

	@RequestMapping("/movie.do")
	public ModelAndView getAll() {
		 ModelAndView mav = new ModelAndView("/video/movie/movie");
		 mav.addObject("allList", videoService.getAll());
		 return mav;
	}

	@RequestMapping("/kids.do")
	public ModelAndView getKids() {
		 ModelAndView mav = new ModelAndView("/video/movie/kids");
		 mav.addObject("kidsList", videoService.getKids());
		 return mav;
	}

}
