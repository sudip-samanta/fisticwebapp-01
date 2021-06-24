package com.fistic.fisticwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LandingPageController {
	
	@RequestMapping("/")
	public ModelAndView getLandingPage(ModelAndView mv) {
		mv.setViewName("loginpage");
		return mv;
	}

}
