package com.kodewala.signup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController {
	@RequestMapping("signup")
	public ModelAndView signup() {
		System.out.println("SignupController.signup()");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signup");
		return mv;
	}

	@RequestMapping("login")
	public ModelAndView login()
	{
		System.out.println("SignupController.enclosing_method()");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}

}
