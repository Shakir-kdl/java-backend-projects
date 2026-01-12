package com.kodewala.register.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@RequestMapping("register")
	public ModelAndView doRegister() {
		System.out.println("RegisterController.doRegister()");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register");
		return mv;
	}
}
