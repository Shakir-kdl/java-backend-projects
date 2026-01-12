package com.kodewala.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
	@RequestMapping("registration")
	public ModelAndView doRegistration() {
		System.out.println("RegistrationController.doRegistration()");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registration");
		return mv;
	}
}
